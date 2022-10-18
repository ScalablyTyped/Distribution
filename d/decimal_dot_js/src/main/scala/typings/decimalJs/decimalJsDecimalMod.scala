package typings.decimalJs

import typings.decimalJs.decimalJsInts.`0`
import typings.decimalJs.decimalJsInts.`1`
import typings.decimalJs.decimalJsInts.`2`
import typings.decimalJs.decimalJsInts.`3`
import typings.decimalJs.decimalJsInts.`4`
import typings.decimalJs.decimalJsInts.`5`
import typings.decimalJs.decimalJsInts.`6`
import typings.decimalJs.decimalJsInts.`7`
import typings.decimalJs.decimalJsInts.`8`
import typings.decimalJs.decimalJsInts.`9`
import typings.decimalJs.mod.Decimal.Config
import typings.decimalJs.mod.Decimal.Constructor
import typings.decimalJs.mod.Decimal.Modulo
import typings.decimalJs.mod.Decimal.Rounding
import typings.decimalJs.mod.Decimal.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object decimalJsDecimalMod {
  
  @JSImport("decimal/js/decimal", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.decimalJs.mod.default {
    def this(n: Value) = this()
  }
  /* static members */
  object default {
    
    @JSImport("decimal/js/decimal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    @JSImport("decimal/js/decimal", "default.default")
    @js.native
    val default: js.UndefOr[Constructor] = js.native
    
    @JSImport("decimal/js/decimal", "default.Decimal")
    @js.native
    val Decimal: js.UndefOr[Constructor] = js.native
    
    @JSImport("decimal/js/decimal", "default.EUCLID")
    @js.native
    val EUCLID: `9` = js.native
    
    @JSImport("decimal/js/decimal", "default.ROUND_CEIL")
    @js.native
    val ROUND_CEIL: `2` = js.native
    
    @JSImport("decimal/js/decimal", "default.ROUND_DOWN")
    @js.native
    val ROUND_DOWN: `1` = js.native
    
    @JSImport("decimal/js/decimal", "default.ROUND_FLOOR")
    @js.native
    val ROUND_FLOOR: `3` = js.native
    
    @JSImport("decimal/js/decimal", "default.ROUND_HALF_CEIL")
    @js.native
    val ROUND_HALF_CEIL: `7` = js.native
    
    @JSImport("decimal/js/decimal", "default.ROUND_HALF_DOWN")
    @js.native
    val ROUND_HALF_DOWN: `5` = js.native
    
    @JSImport("decimal/js/decimal", "default.ROUND_HALF_EVEN")
    @js.native
    val ROUND_HALF_EVEN: `6` = js.native
    
    @JSImport("decimal/js/decimal", "default.ROUND_HALF_FLOOR")
    @js.native
    val ROUND_HALF_FLOOR: `8` = js.native
    
    @JSImport("decimal/js/decimal", "default.ROUND_HALF_UP")
    @js.native
    val ROUND_HALF_UP: `4` = js.native
    
    @JSImport("decimal/js/decimal", "default.ROUND_UP")
    @js.native
    val ROUND_UP: `0` = js.native
    
    inline def abs(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def acos(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("acos")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def acosh(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("acosh")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def add(x: Value, y: Value): typings.decimalJs.mod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def asin(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("asin")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def asinh(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("asinh")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def atan(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("atan")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def atan2(y: Value, x: Value): typings.decimalJs.mod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("atan2")(y.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def atanh(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("atanh")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def cbrt(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("cbrt")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def ceil(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("ceil")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def clamp(n: Value, min: Value, max: Value): typings.decimalJs.mod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(n.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def clone(`object`: Config): Constructor = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(`object`.asInstanceOf[js.Any]).asInstanceOf[Constructor]
    
    inline def config(`object`: Config): Constructor = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(`object`.asInstanceOf[js.Any]).asInstanceOf[Constructor]
    
    inline def cos(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("cos")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def cosh(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("cosh")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    @JSImport("decimal/js/decimal", "default.crypto")
    @js.native
    val crypto: Boolean = js.native
    
    inline def div(x: Value, y: Value): typings.decimalJs.mod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def exp(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("exp")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def floor(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("floor")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def hypot(n: Value*): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("hypot")(n.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def isDecimal(`object`: Any): /* is decimal.js.decimal.js.Decimal */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecimal")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is decimal.js.decimal.js.Decimal */ Boolean]
    
    inline def ln(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("ln")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def log(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    inline def log(n: Value, base: Value): typings.decimalJs.mod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(n.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def log10(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("log10")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def log2(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("log2")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def max(n: Value*): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(n.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    @JSImport("decimal/js/decimal", "default.maxE")
    @js.native
    val maxE: Double = js.native
    
    inline def min(n: Value*): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(n.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    @JSImport("decimal/js/decimal", "default.minE")
    @js.native
    val minE: Double = js.native
    
    inline def mod(x: Value, y: Value): typings.decimalJs.mod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    @JSImport("decimal/js/decimal", "default.modulo")
    @js.native
    val modulo: Modulo = js.native
    
    inline def mul(x: Value, y: Value): typings.decimalJs.mod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def noConflict(): Constructor = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[Constructor]
    
    // Browser only
    inline def pow(base: Value, exponent: Value): typings.decimalJs.mod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(base.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    @JSImport("decimal/js/decimal", "default.precision")
    @js.native
    val precision: Double = js.native
    
    inline def random(): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[typings.decimalJs.mod.Decimal]
    inline def random(significantDigits: Double): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(significantDigits.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def round(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    @JSImport("decimal/js/decimal", "default.rounding")
    @js.native
    val rounding: Rounding = js.native
    
    inline def set(`object`: Config): Constructor = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(`object`.asInstanceOf[js.Any]).asInstanceOf[Constructor]
    
    inline def sign(n: Value): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def sin(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("sin")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def sinh(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("sinh")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def sqrt(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("sqrt")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def sub(x: Value, y: Value): typings.decimalJs.mod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def sum(n: Value*): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(n.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def tan(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("tan")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def tanh(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("tanh")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    @JSImport("decimal/js/decimal", "default.toExpNeg")
    @js.native
    val toExpNeg: Double = js.native
    
    @JSImport("decimal/js/decimal", "default.toExpPos")
    @js.native
    val toExpPos: Double = js.native
    
    inline def trunc(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("trunc")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
  }
  
  @JSImport("decimal/js/decimal", "Decimal")
  @js.native
  open class Decimal protected ()
    extends typings.decimalJs.mod.Decimal {
    def this(n: Value) = this()
  }
  /* static members */
  object Decimal {
    
    @JSImport("decimal/js/decimal", "Decimal")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("decimal/js/decimal", "Decimal.default")
    @js.native
    val default: js.UndefOr[Constructor] = js.native
    
    @JSImport("decimal/js/decimal", "Decimal.Decimal")
    @js.native
    val Decimal: js.UndefOr[Constructor] = js.native
    
    @JSImport("decimal/js/decimal", "Decimal.EUCLID")
    @js.native
    val EUCLID: `9` = js.native
    
    @JSImport("decimal/js/decimal", "Decimal.ROUND_CEIL")
    @js.native
    val ROUND_CEIL: `2` = js.native
    
    @JSImport("decimal/js/decimal", "Decimal.ROUND_DOWN")
    @js.native
    val ROUND_DOWN: `1` = js.native
    
    @JSImport("decimal/js/decimal", "Decimal.ROUND_FLOOR")
    @js.native
    val ROUND_FLOOR: `3` = js.native
    
    @JSImport("decimal/js/decimal", "Decimal.ROUND_HALF_CEIL")
    @js.native
    val ROUND_HALF_CEIL: `7` = js.native
    
    @JSImport("decimal/js/decimal", "Decimal.ROUND_HALF_DOWN")
    @js.native
    val ROUND_HALF_DOWN: `5` = js.native
    
    @JSImport("decimal/js/decimal", "Decimal.ROUND_HALF_EVEN")
    @js.native
    val ROUND_HALF_EVEN: `6` = js.native
    
    @JSImport("decimal/js/decimal", "Decimal.ROUND_HALF_FLOOR")
    @js.native
    val ROUND_HALF_FLOOR: `8` = js.native
    
    @JSImport("decimal/js/decimal", "Decimal.ROUND_HALF_UP")
    @js.native
    val ROUND_HALF_UP: `4` = js.native
    
    @JSImport("decimal/js/decimal", "Decimal.ROUND_UP")
    @js.native
    val ROUND_UP: `0` = js.native
    
    inline def abs(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def acos(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("acos")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def acosh(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("acosh")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def add(x: Value, y: Value): typings.decimalJs.mod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def asin(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("asin")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def asinh(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("asinh")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def atan(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("atan")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def atan2(y: Value, x: Value): typings.decimalJs.mod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("atan2")(y.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def atanh(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("atanh")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def cbrt(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("cbrt")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def ceil(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("ceil")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def clamp(n: Value, min: Value, max: Value): typings.decimalJs.mod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(n.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def clone(`object`: Config): Constructor = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(`object`.asInstanceOf[js.Any]).asInstanceOf[Constructor]
    
    inline def config(`object`: Config): Constructor = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(`object`.asInstanceOf[js.Any]).asInstanceOf[Constructor]
    
    inline def cos(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("cos")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def cosh(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("cosh")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    @JSImport("decimal/js/decimal", "Decimal.crypto")
    @js.native
    val crypto: Boolean = js.native
    
    inline def div(x: Value, y: Value): typings.decimalJs.mod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def exp(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("exp")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def floor(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("floor")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def hypot(n: Value*): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("hypot")(n.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def isDecimal(`object`: Any): /* is decimal.js.decimal.js.Decimal */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecimal")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is decimal.js.decimal.js.Decimal */ Boolean]
    
    inline def ln(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("ln")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def log(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    inline def log(n: Value, base: Value): typings.decimalJs.mod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(n.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def log10(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("log10")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def log2(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("log2")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def max(n: Value*): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(n.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    @JSImport("decimal/js/decimal", "Decimal.maxE")
    @js.native
    val maxE: Double = js.native
    
    inline def min(n: Value*): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(n.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    @JSImport("decimal/js/decimal", "Decimal.minE")
    @js.native
    val minE: Double = js.native
    
    inline def mod(x: Value, y: Value): typings.decimalJs.mod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    @JSImport("decimal/js/decimal", "Decimal.modulo")
    @js.native
    val modulo: Modulo = js.native
    
    inline def mul(x: Value, y: Value): typings.decimalJs.mod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def noConflict(): Constructor = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[Constructor]
    
    // Browser only
    inline def pow(base: Value, exponent: Value): typings.decimalJs.mod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(base.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    @JSImport("decimal/js/decimal", "Decimal.precision")
    @js.native
    val precision: Double = js.native
    
    inline def random(): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[typings.decimalJs.mod.Decimal]
    inline def random(significantDigits: Double): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(significantDigits.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def round(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    @JSImport("decimal/js/decimal", "Decimal.rounding")
    @js.native
    val rounding: Rounding = js.native
    
    inline def set(`object`: Config): Constructor = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(`object`.asInstanceOf[js.Any]).asInstanceOf[Constructor]
    
    inline def sign(n: Value): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def sin(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("sin")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def sinh(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("sinh")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def sqrt(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("sqrt")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def sub(x: Value, y: Value): typings.decimalJs.mod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def sum(n: Value*): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(n.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def tan(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("tan")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def tanh(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("tanh")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    @JSImport("decimal/js/decimal", "Decimal.toExpNeg")
    @js.native
    val toExpNeg: Double = js.native
    
    @JSImport("decimal/js/decimal", "Decimal.toExpPos")
    @js.native
    val toExpPos: Double = js.native
    
    inline def trunc(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("trunc")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
  }
}
