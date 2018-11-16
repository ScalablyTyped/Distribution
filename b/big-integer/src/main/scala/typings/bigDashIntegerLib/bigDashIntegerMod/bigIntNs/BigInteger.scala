package typings
package bigDashIntegerLib.bigDashIntegerMod.bigIntNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BigInteger extends js.Object {
  /**
           * Returns the absolute value of a bigInt.
           */
  def abs(): BigInteger = js.native
  /**
           * Performs addition.
           */
  def add(number: BigNumber): BigInteger = js.native
  /**
           * Performs the bitwise AND operation.
           */
  def and(number: BigNumber): BigInteger = js.native
  /**
           * Returns the number of digits required to represent a bigInt in binary.
           */
  def bitLength(): BigInteger = js.native
  /**
           * Performs a comparison between two numbers. If the numbers are equal, it returns 0.
           * If the first number is greater, it returns 1. If the first number is lesser, it returns -1.
           */
  def compare(number: BigNumber): scala.Double = js.native
  /**
           * Performs a comparison between the absolute value of two numbers.
           */
  def compareAbs(number: BigNumber): scala.Double = js.native
  /**
           * Alias for the compare method.
           */
  def compareTo(number: BigNumber): scala.Double = js.native
  /**
           * Performs integer division, disregarding the remainder.
           */
  def divide(number: BigNumber): BigInteger = js.native
  /**
           * Performs division and returns an object with two properties: quotient and remainder.
           * The sign of the remainder will match the sign of the dividend.
           */
  def divmod(number: BigNumber): bigDashIntegerLib.Anon_Remainder = js.native
  /**
           * Alias for the equals method.
           */
  def eq(number: BigNumber): scala.Boolean = js.native
  /**
           * Checks if two numbers are equal.
           */
  def equals(number: BigNumber): scala.Boolean = js.native
  /**
           * Alias for the greaterOrEquals method.
           */
  def geq(number: BigNumber): scala.Boolean = js.native
  /**
           * Checks if the first number is greater than the second.
           */
  def greater(number: BigNumber): scala.Boolean = js.native
  /**
           * Checks if the first number is greater than or equal to the second.
           */
  def greaterOrEquals(number: BigNumber): scala.Boolean = js.native
  /**
           * Alias for the greater method.
           */
  def gt(number: BigNumber): scala.Boolean = js.native
  /**
           * Returns true if the first number is divisible by the second number, false otherwise.
           */
  def isDivisibleBy(number: BigNumber): scala.Boolean = js.native
  /**
           * Returns true if the number is even, false otherwise.
           */
  def isEven(): scala.Boolean = js.native
  /**
           * Returns true if the number is negative, false otherwise.
           * Returns false for 0 and true for -0.
           */
  def isNegative(): scala.Boolean = js.native
  /**
           * Returns true if the number is odd, false otherwise.
           */
  def isOdd(): scala.Boolean = js.native
  /**
           * Return true if the number is positive, false otherwise.
           * Returns true for 0 and false for -0.
           */
  def isPositive(): scala.Boolean = js.native
  /**
           * Returns true if the number is prime, false otherwise.
           */
  def isPrime(): scala.Boolean = js.native
  /**
           * Returns true if the number is very likely to be prime, false otherwise.
           */
  def isProbablePrime(): scala.Boolean = js.native
  /**
           * Returns true if the number is very likely to be prime, false otherwise.
           */
  def isProbablePrime(iterations: scala.Double): scala.Boolean = js.native
  /**
           * Returns true if the number is 1 or -1, false otherwise.
           */
  def isUnit(): scala.Boolean = js.native
  /**
           * Return true if the number is 0 or -0, false otherwise.
           */
  def isZero(): scala.Boolean = js.native
  /**
           * Alias for the lesserOrEquals method.
           */
  def leq(number: BigNumber): scala.Boolean = js.native
  /**
           * Checks if the first number is lesser than the second.
           */
  def lesser(number: BigNumber): scala.Boolean = js.native
  /**
           * Checks if the first number is less than or equal to the second.
           */
  def lesserOrEquals(number: BigNumber): scala.Boolean = js.native
  /**
           * Alias for the lesser method.
           */
  def lt(number: BigNumber): scala.Boolean = js.native
  /**
           * Alias for the subtract method.
           */
  def minus(number: BigNumber): BigInteger = js.native
  /**
           * Performs division and returns the remainder, disregarding the quotient.
           * The sign of the remainder will match the sign of the dividend.
           */
  def mod(number: BigNumber): BigInteger = js.native
  /**
           * Finds the multiplicative inverse of the number modulo mod.
           */
  def modInv(number: BigNumber): BigInteger = js.native
  /**
           * Takes the number to the power exp modulo mod.
           */
  def modPow(exp: BigNumber, mod: BigNumber): BigInteger = js.native
  /**
           * Performs multiplication.
           */
  def multiply(number: BigNumber): BigInteger = js.native
  /**
           * Reverses the sign of the number.
           */
  def negate(): BigInteger = js.native
  /**
           * Alias for the notEquals method.
           */
  def neq(number: BigNumber): scala.Boolean = js.native
  /**
           * Adds one to the number.
           */
  def next(): BigInteger = js.native
  /**
           * Performs the bitwise NOT operation.
           */
  def not(): BigInteger = js.native
  /**
           * Checks if two numbers are not equal.
           */
  def notEquals(number: BigNumber): scala.Boolean = js.native
  /**
           * Performs the bitwise OR operation.
           */
  def or(number: BigNumber): BigInteger = js.native
  /**
           * Alias for the divide method.
           */
  def over(number: BigNumber): BigInteger = js.native
  /**
           * Alias for the add method.
           */
  def plus(number: BigNumber): BigInteger = js.native
  /**
           * Performs exponentiation. If the exponent is less than 0, pow returns 0.
           * bigInt.zero.pow(0) returns 1.
           */
  def pow(number: BigNumber): BigInteger = js.native
  /**
           * Subtracts one from the number.
           */
  def prev(): BigInteger = js.native
  /**
           * Alias for the mod method.
           */
  def remainder(number: BigNumber): BigInteger = js.native
  /**
           * Shifts the number left by n places in its binary representation.
           * If a negative number is provided, it will shift right.
           *
           * Throws an error if number is outside of the range [-9007199254740992, 9007199254740992].
           */
  def shiftLeft(number: BigNumber): BigInteger = js.native
  /**
           * Shifts the number right by n places in its binary representation.
           * If a negative number is provided, it will shift left.
           *
           * Throws an error if number is outside of the range [-9007199254740992, 9007199254740992].
           */
  def shiftRight(number: BigNumber): BigInteger = js.native
  /**
           * Squares the number.
           */
  def square(): BigInteger = js.native
  /**
           * Performs subtraction.
           */
  def subtract(number: BigNumber): BigInteger = js.native
  /**
           * Alias for the multiply method.
           */
  def times(number: BigNumber): BigInteger = js.native
  /**
           *
           * Converts a bigInt to an object representing it as an array of integers module the given radix.
           */
  def toArray(radix: scala.Double): BaseArray = js.native
  /**
           * Converts a bigInt into a native Javascript number. Loses precision for numbers outside the range.
           */
  def toJSNumber(): scala.Double = js.native
  /**
           * Converts a bigInt to a string. This method is called behind the scenes in JSON.stringify.
           */
  def toJSON(): java.lang.String = js.native
  /**
           * Converts a bigInt to a string.
           */
  def toString(radix: scala.Double): java.lang.String = js.native
  /**
           * Performs the bitwise XOR operation.
           */
  def xor(number: BigNumber): BigInteger = js.native
}

