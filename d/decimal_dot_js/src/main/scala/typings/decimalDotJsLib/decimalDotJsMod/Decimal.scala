package typings
package decimalDotJsLib.decimalDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decimal.js", "Decimal")
@js.native
class Decimal protected () extends js.Object {
  def this(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value) = this()
  val d: js.Array[scala.Double] = js.native
  val e: scala.Double = js.native
  val name: java.lang.String = js.native
  val s: scala.Double = js.native
  def abs(): Decimal = js.native
  def absoluteValue(): Decimal = js.native
  def acos(): Decimal = js.native
  def acosh(): Decimal = js.native
  def add(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): Decimal = js.native
  def asin(): Decimal = js.native
  def asinh(): Decimal = js.native
  def atan(): Decimal = js.native
  def atanh(): Decimal = js.native
  def cbrt(): Decimal = js.native
  def ceil(): Decimal = js.native
  def cmp(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): scala.Double = js.native
  def comparedTo(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): scala.Double = js.native
  def cos(): Decimal = js.native
  def cosh(): Decimal = js.native
  def cosine(): Decimal = js.native
  def cubeRoot(): Decimal = js.native
  def decimalPlaces(): scala.Double = js.native
  def div(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): Decimal = js.native
  def divToInt(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): Decimal = js.native
  def dividedBy(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): Decimal = js.native
  def dividedToIntegerBy(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): Decimal = js.native
  def dp(): scala.Double = js.native
  def eq(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): scala.Boolean = js.native
  def equals(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): scala.Boolean = js.native
  def exp(): Decimal = js.native
  def floor(): Decimal = js.native
  def greaterThan(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): scala.Boolean = js.native
  def greaterThanOrEqualTo(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): scala.Boolean = js.native
  def gt(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): scala.Boolean = js.native
  def gte(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): scala.Boolean = js.native
  def hyperbolicCosine(): Decimal = js.native
  def hyperbolicSine(): Decimal = js.native
  def hyperbolicTangent(): Decimal = js.native
  def inverseCosine(): Decimal = js.native
  def inverseHyperbolicCosine(): Decimal = js.native
  def inverseHyperbolicSine(): Decimal = js.native
  def inverseHyperbolicTangent(): Decimal = js.native
  def inverseSine(): Decimal = js.native
  def inverseTangent(): Decimal = js.native
  def isFinite(): scala.Boolean = js.native
  def isInt(): scala.Boolean = js.native
  def isInteger(): scala.Boolean = js.native
  def isNaN(): scala.Boolean = js.native
  def isNeg(): scala.Boolean = js.native
  def isNegative(): scala.Boolean = js.native
  def isPos(): scala.Boolean = js.native
  def isPositive(): scala.Boolean = js.native
  def isZero(): scala.Boolean = js.native
  def lessThan(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): scala.Boolean = js.native
  def lessThanOrEqualTo(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): scala.Boolean = js.native
  def ln(): Decimal = js.native
  def log(): Decimal = js.native
  def log(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): Decimal = js.native
  def logarithm(): Decimal = js.native
  def logarithm(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): Decimal = js.native
  def lt(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): scala.Boolean = js.native
  def lte(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): scala.Boolean = js.native
  def minus(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): Decimal = js.native
  def mod(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): Decimal = js.native
  def modulo(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): Decimal = js.native
  def mul(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): Decimal = js.native
  def naturalExponential(): Decimal = js.native
  def naturalLogarithm(): Decimal = js.native
  def neg(): Decimal = js.native
  def negated(): Decimal = js.native
  def plus(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): Decimal = js.native
  def pow(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): Decimal = js.native
  def precision(): scala.Double = js.native
  def precision(includeZeros: scala.Boolean): scala.Double = js.native
  def round(): Decimal = js.native
  def sd(): scala.Double = js.native
  def sd(includeZeros: scala.Boolean): scala.Double = js.native
  def sin(): Decimal = js.native
  def sine(): Decimal = js.native
  def sinh(): Decimal = js.native
  def sqrt(): Decimal = js.native
  def squareRoot(): Decimal = js.native
  def sub(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): Decimal = js.native
  def tan(): Decimal = js.native
  def tangent(): Decimal = js.native
  def tanh(): Decimal = js.native
  def times(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): Decimal = js.native
  def toBinary(): java.lang.String = js.native
  def toBinary(significantDigits: scala.Double): java.lang.String = js.native
  def toBinary(significantDigits: scala.Double, rounding: decimalDotJsLib.decimalDotJsMod.DecimalNs.Rounding): java.lang.String = js.native
  def toDP(): Decimal = js.native
  def toDP(decimalPlaces: scala.Double): Decimal = js.native
  def toDP(decimalPlaces: scala.Double, rounding: decimalDotJsLib.decimalDotJsMod.DecimalNs.Rounding): Decimal = js.native
  def toDecimalPlaces(): Decimal = js.native
  def toDecimalPlaces(decimalPlaces: scala.Double): Decimal = js.native
  def toDecimalPlaces(decimalPlaces: scala.Double, rounding: decimalDotJsLib.decimalDotJsMod.DecimalNs.Rounding): Decimal = js.native
  def toExponential(): java.lang.String = js.native
  def toExponential(decimalPlaces: scala.Double): java.lang.String = js.native
  def toExponential(decimalPlaces: scala.Double, rounding: decimalDotJsLib.decimalDotJsMod.DecimalNs.Rounding): java.lang.String = js.native
  def toFixed(): java.lang.String = js.native
  def toFixed(decimalPlaces: scala.Double): java.lang.String = js.native
  def toFixed(decimalPlaces: scala.Double, rounding: decimalDotJsLib.decimalDotJsMod.DecimalNs.Rounding): java.lang.String = js.native
  def toFraction(): js.Array[Decimal] = js.native
  def toFraction(max_denominator: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): js.Array[Decimal] = js.native
  def toHex(): java.lang.String = js.native
  def toHex(significantDigits: scala.Double): java.lang.String = js.native
  def toHex(significantDigits: scala.Double, rounding: decimalDotJsLib.decimalDotJsMod.DecimalNs.Rounding): java.lang.String = js.native
  def toHexadecimal(): java.lang.String = js.native
  def toHexadecimal(significantDigits: scala.Double): java.lang.String = js.native
  def toHexadecimal(significantDigits: scala.Double, rounding: decimalDotJsLib.decimalDotJsMod.DecimalNs.Rounding): java.lang.String = js.native
  def toJSON(): java.lang.String = js.native
  def toNearest(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): Decimal = js.native
  def toNearest(
    n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value,
    rounding: decimalDotJsLib.decimalDotJsMod.DecimalNs.Rounding
  ): Decimal = js.native
  def toNumber(): scala.Double = js.native
  def toOctal(): java.lang.String = js.native
  def toOctal(significantDigits: scala.Double): java.lang.String = js.native
  def toOctal(significantDigits: scala.Double, rounding: decimalDotJsLib.decimalDotJsMod.DecimalNs.Rounding): java.lang.String = js.native
  def toPower(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): Decimal = js.native
  def toPrecision(): java.lang.String = js.native
  def toPrecision(significantDigits: scala.Double): java.lang.String = js.native
  def toPrecision(significantDigits: scala.Double, rounding: decimalDotJsLib.decimalDotJsMod.DecimalNs.Rounding): java.lang.String = js.native
  def toSD(): Decimal = js.native
  def toSD(significantDigits: scala.Double): Decimal = js.native
  def toSD(significantDigits: scala.Double, rounding: decimalDotJsLib.decimalDotJsMod.DecimalNs.Rounding): Decimal = js.native
  def toSignificantDigits(): Decimal = js.native
  def toSignificantDigits(significantDigits: scala.Double): Decimal = js.native
  def toSignificantDigits(significantDigits: scala.Double, rounding: decimalDotJsLib.decimalDotJsMod.DecimalNs.Rounding): Decimal = js.native
  def trunc(): Decimal = js.native
  def truncated(): Decimal = js.native
}

@JSImport("decimal.js", "Decimal")
@js.native
object Decimal extends js.Object {
  val Decimal: js.UndefOr[decimalDotJsLib.decimalDotJsMod.DecimalNs.Constructor] = js.native
  val EUCLID: decimalDotJsLib.decimalDotJsLibNumbers.`9` = js.native
  val ROUND_CEIL: decimalDotJsLib.decimalDotJsLibNumbers.`2` = js.native
  val ROUND_DOWN: decimalDotJsLib.decimalDotJsLibNumbers.`1` = js.native
  val ROUND_FLOOR: decimalDotJsLib.decimalDotJsLibNumbers.`3` = js.native
  val ROUND_HALF_CEIL: decimalDotJsLib.decimalDotJsLibNumbers.`7` = js.native
  val ROUND_HALF_DOWN: decimalDotJsLib.decimalDotJsLibNumbers.`5` = js.native
  val ROUND_HALF_EVEN: decimalDotJsLib.decimalDotJsLibNumbers.`6` = js.native
  val ROUND_HALF_FLOOR: decimalDotJsLib.decimalDotJsLibNumbers.`8` = js.native
  val ROUND_HALF_UP: decimalDotJsLib.decimalDotJsLibNumbers.`4` = js.native
  val ROUND_UP: decimalDotJsLib.decimalDotJsLibNumbers.`0` = js.native
  val crypto: scala.Boolean = js.native
  val default: js.UndefOr[decimalDotJsLib.decimalDotJsMod.DecimalNs.Constructor] = js.native
  val maxE: scala.Double = js.native
  val minE: scala.Double = js.native
  val modulo: decimalDotJsLib.decimalDotJsMod.DecimalNs.Modulo = js.native
  val precision: scala.Double = js.native
  val rounding: decimalDotJsLib.decimalDotJsMod.DecimalNs.Rounding = js.native
  val toExpNeg: scala.Double = js.native
  val toExpPos: scala.Double = js.native
  def abs(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def acos(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def acosh(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def add(
    x: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value,
    y: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value
  ): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def asin(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def asinh(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def atan(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def atan2(
    y: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value,
    x: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value
  ): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def atanh(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def cbrt(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def ceil(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def clone(`object`: decimalDotJsLib.decimalDotJsMod.DecimalNs.Config): decimalDotJsLib.decimalDotJsMod.DecimalNs.Constructor = js.native
  def config(`object`: decimalDotJsLib.decimalDotJsMod.DecimalNs.Config): decimalDotJsLib.decimalDotJsMod.DecimalNs.Constructor = js.native
  def cos(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def cosh(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def div(
    x: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value,
    y: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value
  ): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def exp(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def floor(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def hypot(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value*): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def isDecimal(`object`: js.Any): scala.Boolean = js.native
  def ln(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def log(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def log(
    n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value,
    base: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value
  ): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def log10(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def log2(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def max(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value*): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def min(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value*): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def mod(
    x: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value,
    y: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value
  ): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def mul(
    x: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value,
    y: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value
  ): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def noConflict(): decimalDotJsLib.decimalDotJsMod.DecimalNs.Constructor = js.native
     // Browser only
  def pow(
    base: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value,
    exponent: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value
  ): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def random(): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def random(significantDigits: scala.Double): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def round(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def set(`object`: decimalDotJsLib.decimalDotJsMod.DecimalNs.Config): decimalDotJsLib.decimalDotJsMod.DecimalNs.Constructor = js.native
  def sign(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def sin(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def sinh(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def sqrt(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def sub(
    x: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value,
    y: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value
  ): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def tan(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def tanh(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
  def trunc(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value): decimalDotJsLib.decimalDotJsMod.Decimal = js.native
}

