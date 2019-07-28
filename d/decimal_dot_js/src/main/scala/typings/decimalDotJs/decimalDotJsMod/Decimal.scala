package typings.decimalDotJs.decimalDotJsMod

import typings.decimalDotJs.decimalDotJsMod.DecimalNs.Config
import typings.decimalDotJs.decimalDotJsMod.DecimalNs.Constructor
import typings.decimalDotJs.decimalDotJsMod.DecimalNs.Modulo
import typings.decimalDotJs.decimalDotJsMod.DecimalNs.Rounding
import typings.decimalDotJs.decimalDotJsMod.DecimalNs.Value
import typings.decimalDotJs.decimalDotJsNumbers.`0`
import typings.decimalDotJs.decimalDotJsNumbers.`1`
import typings.decimalDotJs.decimalDotJsNumbers.`2`
import typings.decimalDotJs.decimalDotJsNumbers.`3`
import typings.decimalDotJs.decimalDotJsNumbers.`4`
import typings.decimalDotJs.decimalDotJsNumbers.`5`
import typings.decimalDotJs.decimalDotJsNumbers.`6`
import typings.decimalDotJs.decimalDotJsNumbers.`7`
import typings.decimalDotJs.decimalDotJsNumbers.`8`
import typings.decimalDotJs.decimalDotJsNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decimal.js", "Decimal")
@js.native
class Decimal protected () extends js.Object {
  def this(n: Value) = this()
  val d: js.Array[Double] = js.native
  val e: Double = js.native
  val name: String = js.native
  val s: Double = js.native
  def abs(): Decimal = js.native
  def absoluteValue(): Decimal = js.native
  def acos(): Decimal = js.native
  def acosh(): Decimal = js.native
  def add(n: Value): Decimal = js.native
  def asin(): Decimal = js.native
  def asinh(): Decimal = js.native
  def atan(): Decimal = js.native
  def atanh(): Decimal = js.native
  def cbrt(): Decimal = js.native
  def ceil(): Decimal = js.native
  def cmp(n: Value): Double = js.native
  def comparedTo(n: Value): Double = js.native
  def cos(): Decimal = js.native
  def cosh(): Decimal = js.native
  def cosine(): Decimal = js.native
  def cubeRoot(): Decimal = js.native
  def decimalPlaces(): Double = js.native
  def div(n: Value): Decimal = js.native
  def divToInt(n: Value): Decimal = js.native
  def dividedBy(n: Value): Decimal = js.native
  def dividedToIntegerBy(n: Value): Decimal = js.native
  def dp(): Double = js.native
  def eq(n: Value): Boolean = js.native
  def equals(n: Value): Boolean = js.native
  def exp(): Decimal = js.native
  def floor(): Decimal = js.native
  def greaterThan(n: Value): Boolean = js.native
  def greaterThanOrEqualTo(n: Value): Boolean = js.native
  def gt(n: Value): Boolean = js.native
  def gte(n: Value): Boolean = js.native
  def hyperbolicCosine(): Decimal = js.native
  def hyperbolicSine(): Decimal = js.native
  def hyperbolicTangent(): Decimal = js.native
  def inverseCosine(): Decimal = js.native
  def inverseHyperbolicCosine(): Decimal = js.native
  def inverseHyperbolicSine(): Decimal = js.native
  def inverseHyperbolicTangent(): Decimal = js.native
  def inverseSine(): Decimal = js.native
  def inverseTangent(): Decimal = js.native
  def isFinite(): Boolean = js.native
  def isInt(): Boolean = js.native
  def isInteger(): Boolean = js.native
  def isNaN(): Boolean = js.native
  def isNeg(): Boolean = js.native
  def isNegative(): Boolean = js.native
  def isPos(): Boolean = js.native
  def isPositive(): Boolean = js.native
  def isZero(): Boolean = js.native
  def lessThan(n: Value): Boolean = js.native
  def lessThanOrEqualTo(n: Value): Boolean = js.native
  def ln(): Decimal = js.native
  def log(): Decimal = js.native
  def log(n: Value): Decimal = js.native
  def logarithm(): Decimal = js.native
  def logarithm(n: Value): Decimal = js.native
  def lt(n: Value): Boolean = js.native
  def lte(n: Value): Boolean = js.native
  def minus(n: Value): Decimal = js.native
  def mod(n: Value): Decimal = js.native
  def modulo(n: Value): Decimal = js.native
  def mul(n: Value): Decimal = js.native
  def naturalExponential(): Decimal = js.native
  def naturalLogarithm(): Decimal = js.native
  def neg(): Decimal = js.native
  def negated(): Decimal = js.native
  def plus(n: Value): Decimal = js.native
  def pow(n: Value): Decimal = js.native
  def precision(): Double = js.native
  def precision(includeZeros: Boolean): Double = js.native
  def round(): Decimal = js.native
  def sd(): Double = js.native
  def sd(includeZeros: Boolean): Double = js.native
  def sin(): Decimal = js.native
  def sine(): Decimal = js.native
  def sinh(): Decimal = js.native
  def sqrt(): Decimal = js.native
  def squareRoot(): Decimal = js.native
  def sub(n: Value): Decimal = js.native
  def tan(): Decimal = js.native
  def tangent(): Decimal = js.native
  def tanh(): Decimal = js.native
  def times(n: Value): Decimal = js.native
  def toBinary(): String = js.native
  def toBinary(significantDigits: Double): String = js.native
  def toBinary(significantDigits: Double, rounding: Rounding): String = js.native
  def toDP(): Decimal = js.native
  def toDP(decimalPlaces: Double): Decimal = js.native
  def toDP(decimalPlaces: Double, rounding: Rounding): Decimal = js.native
  def toDecimalPlaces(): Decimal = js.native
  def toDecimalPlaces(decimalPlaces: Double): Decimal = js.native
  def toDecimalPlaces(decimalPlaces: Double, rounding: Rounding): Decimal = js.native
  def toExponential(): String = js.native
  def toExponential(decimalPlaces: Double): String = js.native
  def toExponential(decimalPlaces: Double, rounding: Rounding): String = js.native
  def toFixed(): String = js.native
  def toFixed(decimalPlaces: Double): String = js.native
  def toFixed(decimalPlaces: Double, rounding: Rounding): String = js.native
  def toFraction(): js.Array[Decimal] = js.native
  def toFraction(max_denominator: Value): js.Array[Decimal] = js.native
  def toHex(): String = js.native
  def toHex(significantDigits: Double): String = js.native
  def toHex(significantDigits: Double, rounding: Rounding): String = js.native
  def toHexadecimal(): String = js.native
  def toHexadecimal(significantDigits: Double): String = js.native
  def toHexadecimal(significantDigits: Double, rounding: Rounding): String = js.native
  def toJSON(): String = js.native
  def toNearest(n: Value): Decimal = js.native
  def toNearest(n: Value, rounding: Rounding): Decimal = js.native
  def toNumber(): Double = js.native
  def toOctal(): String = js.native
  def toOctal(significantDigits: Double): String = js.native
  def toOctal(significantDigits: Double, rounding: Rounding): String = js.native
  def toPower(n: Value): Decimal = js.native
  def toPrecision(): String = js.native
  def toPrecision(significantDigits: Double): String = js.native
  def toPrecision(significantDigits: Double, rounding: Rounding): String = js.native
  def toSD(): Decimal = js.native
  def toSD(significantDigits: Double): Decimal = js.native
  def toSD(significantDigits: Double, rounding: Rounding): Decimal = js.native
  def toSignificantDigits(): Decimal = js.native
  def toSignificantDigits(significantDigits: Double): Decimal = js.native
  def toSignificantDigits(significantDigits: Double, rounding: Rounding): Decimal = js.native
  def trunc(): Decimal = js.native
  def truncated(): Decimal = js.native
}

/* static members */
@JSImport("decimal.js", "Decimal")
@js.native
object Decimal extends js.Object {
  val Decimal: js.UndefOr[Constructor] = js.native
  val EUCLID: `9` = js.native
  val ROUND_CEIL: `2` = js.native
  val ROUND_DOWN: `1` = js.native
  val ROUND_FLOOR: `3` = js.native
  val ROUND_HALF_CEIL: `7` = js.native
  val ROUND_HALF_DOWN: `5` = js.native
  val ROUND_HALF_EVEN: `6` = js.native
  val ROUND_HALF_FLOOR: `8` = js.native
  val ROUND_HALF_UP: `4` = js.native
  val ROUND_UP: `0` = js.native
  val crypto: Boolean = js.native
  val default: js.UndefOr[Constructor] = js.native
  val maxE: Double = js.native
  val minE: Double = js.native
  val modulo: Modulo = js.native
  val precision: Double = js.native
  val rounding: Rounding = js.native
  val toExpNeg: Double = js.native
  val toExpPos: Double = js.native
  def abs(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def acos(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def acosh(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def add(x: Value, y: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def asin(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def asinh(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def atan(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def atan2(y: Value, x: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def atanh(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def cbrt(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def ceil(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def clone(`object`: Config): Constructor = js.native
  def config(`object`: Config): Constructor = js.native
  def cos(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def cosh(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def div(x: Value, y: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def exp(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def floor(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def hypot(n: Value*): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def isDecimal(`object`: js.Any): Boolean = js.native
  def ln(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def log(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def log(n: Value, base: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def log10(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def log2(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def max(n: Value*): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def min(n: Value*): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def mod(x: Value, y: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def mul(x: Value, y: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def noConflict(): Constructor = js.native
     // Browser only
  def pow(base: Value, exponent: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def random(): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def random(significantDigits: Double): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def round(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def set(`object`: Config): Constructor = js.native
  def sign(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def sin(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def sinh(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def sqrt(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def sub(x: Value, y: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def tan(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def tanh(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
  def trunc(n: Value): typings.decimalDotJs.decimalDotJsMod.Decimal = js.native
}

