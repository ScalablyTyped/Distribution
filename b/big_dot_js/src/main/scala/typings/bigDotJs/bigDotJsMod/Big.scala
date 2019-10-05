package typings.bigDotJs.bigDotJsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Big extends js.Object {
  /**
    * Returns an array of single digits
    */
  var c: js.Array[Double] = js.native
  /**
    * Returns the exponent, Integer, -1e+6 to 1e+6 inclusive
    */
  var e: Double = js.native
  /**
    * Returns the sign, -1 or 1
    */
  var s: Double = js.native
  /** Returns a Big number whose value is the absolute value, i.e. the magnitude, of this Big number. */
  def abs(): Big = js.native
  /**
    * Returns a Big number whose value is the value of this Big number plus n - alias for .plus().
    *
    * @throws `NaN` if n is invalid.
    */
  def add(n: BigSource): Big = js.native
  /**
    * Compare the values.
    *
    * @throws `NaN` if n is invalid.
    */
  def cmp(n: BigSource): Comparison = js.native
  /**
    * Returns a Big number whose value is the value of this Big number divided by n.
    *
    * If the result has more fraction digits than is specified by Big.DP, it will be rounded to Big.DP decimal places using rounding mode Big.RM.
    *
    * @throws `NaN` if n is invalid.
    * @throws `±Infinity` on division by zero.
    * @throws `NaN` on division of zero by zero.
    */
  def div(n: BigSource): Big = js.native
  /**
    * Returns true if the value of this Big equals the value of n, otherwise returns false.
    *
    * @throws `NaN` if n is invalid.
    */
  def eq(n: BigSource): Boolean = js.native
  /**
    * Returns true if the value of this Big is greater than the value of n, otherwise returns false.
    *
    * @throws `NaN` if n is invalid.
    */
  def gt(n: BigSource): Boolean = js.native
  /**
    * Returns true if the value of this Big is greater than or equal to the value of n, otherwise returns false.
    *
    * @throws `NaN` if n is invalid.
    */
  def gte(n: BigSource): Boolean = js.native
  /**
    * Returns true if the value of this Big is less than the value of n, otherwise returns false.
    *
    * @throws `NaN` if n is invalid.
    */
  def lt(n: BigSource): Boolean = js.native
  /**
    * Returns true if the value of this Big is less than or equal to the value of n, otherwise returns false.
    *
    * @throws `NaN` if n is invalid.
    */
  def lte(n: BigSource): Boolean = js.native
  /**
    * Returns a Big number whose value is the value of this Big number minus n.
    *
    * @throws `NaN` if n is invalid.
    */
  def minus(n: BigSource): Big = js.native
  /**
    * Returns a Big number whose value is the value of this Big number modulo n, i.e. the integer remainder of dividing this Big number by n.
    *
    * The result will have the same sign as this Big number, and it will match that of Javascript's % operator (within the limits of its precision) and BigDecimal's remainder method.
    *
    * @throws `NaN` if n is negative or otherwise invalid.
    */
  def mod(n: BigSource): Big = js.native
  /**
    * Returns a Big number whose value is the value of this Big number times n - alias for .times().
    *
    * @throws `NaN` if n is invalid.
    */
  def mul(n: BigSource): Big = js.native
  /**
    * Returns a Big number whose value is the value of this Big number plus n.
    *
    * @throws `NaN` if n is invalid.
    */
  def plus(n: BigSource): Big = js.native
  /**
    * Returns a Big number whose value is the value of this Big number raised to the power exp.
    *
    * If exp is negative and the result has more fraction digits than is specified by Big.DP, it will be rounded to Big.DP decimal places using rounding mode Big.RM.
    *
    * @param exp The power to raise the number to, -1e+6 to 1e+6 inclusive
    * @throws `!pow!` if exp is invalid.
    *
    * Note: High value exponents may cause this method to be slow to return.
    */
  def pow(exp: Double): Big = js.native
  /**
    * Returns a Big number whose value is the value of this Big number rounded using rounding mode rm to a maximum of dp decimal places.
    *
    * @param dp Decimal places, 0 to 1e+6 inclusive
    * @param rm The rounding mode, one of the RoundingMode enumeration values
    * @throws `!round!` if dp is invalid.
    * @throws `!Big.RM!` if rm is invalid.
    */
  def round(): Big = js.native
  def round(dp: Double): Big = js.native
  def round(dp: Double, rm: RoundingMode): Big = js.native
  /**
    * Returns a Big number whose value is the square root of this Big number.
    *
    * If the result has more fraction digits than is specified by Big.DP, it will be rounded to Big.DP decimal places using rounding mode Big.RM.
    *
    * @throws `NaN` if this Big number is negative.
    */
  def sqrt(): Big = js.native
  /**
    * Returns a Big number whose value is the value of this Big number minus n - alias for .minus().
    *
    * @throws `NaN` if n is invalid.
    */
  def sub(n: BigSource): Big = js.native
  /**
    * Returns a Big number whose value is the value of this Big number times n.
    *
    * @throws `NaN` if n is invalid.
    */
  def times(n: BigSource): Big = js.native
  /**
    * Returns a string representing the value of this Big number in exponential notation to a fixed number of decimal places dp.
    *
    * If the value of this Big number in exponential notation has more digits to the right of the decimal point than is specified by dp,
    * the return value will be rounded to dp decimal places using rounding mode Big.RM.
    *
    * If the value of this Big number in exponential notation has fewer digits to the right of the decimal point than is specified by dp, the return value will be appended with zeros accordingly.
    *
    * If dp is omitted, or is null or undefined, the number of digits after the decimal point defaults to the minimum number of digits necessary to represent the value exactly.
    *
    * @param dp Decimal places, 0 to 1e+6 inclusive
    * @throws `!toFix!` if dp is invalid.
    */
  def toExponential(): String = js.native
  def toExponential(dp: Double): String = js.native
  /**
    * Returns a string representing the value of this Big number in normal notation to a fixed number of decimal places dp.
    *
    * If the value of this Big number in normal notation has more digits to the right of the decimal point than is specified by dp,
    * the return value will be rounded to dp decimal places using rounding mode Big.RM.
    *
    * If the value of this Big number in normal notation has fewer fraction digits then is specified by dp, the return value will be appended with zeros accordingly.
    *
    * Unlike Number.prototype.toFixed, which returns exponential notation if a number is greater or equal to 1021, this method will always return normal notation.
    *
    * If dp is omitted, or is null or undefined, then the return value is simply the value in normal notation.
    * This is also unlike Number.prototype.toFixed, which returns the value to zero decimal places.
    *
    * @param dp Decimal places, 0 to 1e+6 inclusive
    * @throws `!toFix!` if dp is invalid.
    */
  def toFixed(): String = js.native
  def toFixed(dp: Double): String = js.native
  /**
    * Returns a string representing the value of this Big number.
    *
    * If this Big number has a positive exponent that is equal to or greater than 21, or a negative exponent equal to or less than -7, then exponential notation is returned.
    *
    * The point at which toString returns exponential rather than normal notation can be adjusted by changing
    * the value of Big.E_POS and Big.E_NEG. By default, Big numbers correspond to Javascript's number type in this regard.
    */
  def toJSON(): String = js.native
  /**
    * Returns a string representing the value of this Big number to the specified number of significant digits sd.
    *
    * If the value of this Big number has more digits than is specified by sd, the return value will be rounded to sd significant digits using rounding mode Big.RM.
    *
    * If the value of this Big number has fewer digits than is specified by sd, the return value will be appended with zeros accordingly.
    *
    * If sd is less than the number of digits necessary to represent the integer part of the value in normal notation, then exponential notation is used.
    *
    * If sd is omitted, or is null or undefined, then the return value is the same as .toString().
    *
    * @param sd Significant digits, 1 to 1e+6 inclusive
    * @throws `!toPre!` if sd is invalid.
    */
  def toPrecision(): String = js.native
  def toPrecision(sd: Double): String = js.native
}

@JSImport("big.js", "Big")
@js.native
object Big extends TopLevel[BigConstructor]

