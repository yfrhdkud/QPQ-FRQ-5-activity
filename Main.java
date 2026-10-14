import java.util.Scanner;

public class Main {
    public boolean isSorted(int[] arr){
        for(int i = 1; i < arr.length; i++){

            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter the number of elements: ");
            int n = scan.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter the elements: ");
            for(int i = 0; i < n; i++){
                arr[i] = scan.nextInt();
            } 

            Main obj = new Main();

            boolean result = obj.isSorted(arr);

            if (result) {
                System.out.println("The array is sorted");
            }   else{
                System.out.println("The array is not sorted");
            }
        }
    }
}
