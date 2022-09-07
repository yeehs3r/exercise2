import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.IOException  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int a = scanner.nextInt();
        int c = a+1;
        int d = a-1;
        if (a<1000) {

            System.out.println("The next number for the number "+a+  " is "  + c);
            System.out.println("The previous number for the number "+a+  " is "  + d);
        }  else {

            System.out.print("Число должно быть меньше 1000");
        }}

}
