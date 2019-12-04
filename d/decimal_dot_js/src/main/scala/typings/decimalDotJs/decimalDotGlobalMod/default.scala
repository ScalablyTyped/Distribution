package typings.decimalDotJs.decimalDotGlobalMod

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

@JSImport("decimal.js/decimal.global", JSImport.Default)
@js.native
class default protected () extends Decimal {
  def this(n: DecimalValue) = this()
}

/* static members */
@JSImport("decimal.js/decimal.global", JSImport.Default)
@js.native
object default extends js.Object {
  val Decimal: js.UndefOr[DecimalConstructor] = js.native
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
  val default: js.UndefOr[DecimalConstructor] = js.native
  val maxE: Double = js.native
  val minE: Double = js.native
  val modulo: DecimalModulo = js.native
  val precision: Double = js.native
  val rounding: DecimalRounding = js.native
  val toExpNeg: Double = js.native
  val toExpPos: Double = js.native
  def abs(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def acos(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def acosh(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def add(x: DecimalValue, y: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def asin(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def asinh(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def atan(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def atan2(y: DecimalValue, x: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def atanh(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def cbrt(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def ceil(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def clone(`object`: DecimalConfig): DecimalConstructor = js.native
  def config(`object`: DecimalConfig): DecimalConstructor = js.native
  def cos(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def cosh(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def div(x: DecimalValue, y: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def exp(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def floor(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def hypot(n: DecimalValue*): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def isDecimal(`object`: js.Any): Boolean = js.native
  def ln(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def log(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def log(n: DecimalValue, base: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def log10(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def log2(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def max(n: DecimalValue*): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def min(n: DecimalValue*): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def mod(x: DecimalValue, y: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def mul(x: DecimalValue, y: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def noConflict(): DecimalConstructor = js.native
     // Browser only
  def pow(base: DecimalValue, exponent: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def random(): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def random(significantDigits: Double): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def round(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def set(`object`: DecimalConfig): DecimalConstructor = js.native
  def sign(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def sin(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def sinh(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def sqrt(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def sub(x: DecimalValue, y: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def tan(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def tanh(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
  def trunc(n: DecimalValue): typings.decimalDotJs.decimalDotGlobalMod.Decimal = js.native
}

