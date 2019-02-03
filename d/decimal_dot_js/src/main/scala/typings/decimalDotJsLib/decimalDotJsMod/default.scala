package typings
package decimalDotJsLib.decimalDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decimal.js", JSImport.Default)
@js.native
class default protected () extends Decimal {
  def this(n: decimalDotJsLib.decimalDotJsMod.DecimalNs.Value) = this()
}

/* static members */
@JSImport("decimal.js", JSImport.Default)
@js.native
object default extends js.Object {
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

