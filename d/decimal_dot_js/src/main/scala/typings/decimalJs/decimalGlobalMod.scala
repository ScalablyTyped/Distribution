package typings.decimalJs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.decimalJs.decimalJsNumbers.`0`
import typings.decimalJs.decimalJsNumbers.`1`
import typings.decimalJs.decimalJsNumbers.`2`
import typings.decimalJs.decimalJsNumbers.`3`
import typings.decimalJs.decimalJsNumbers.`4`
import typings.decimalJs.decimalJsNumbers.`5`
import typings.decimalJs.decimalJsNumbers.`6`
import typings.decimalJs.decimalJsNumbers.`7`
import typings.decimalJs.decimalJsNumbers.`8`
import typings.decimalJs.decimalJsNumbers.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decimalGlobalMod {
  
  @JSImport("decimal.js/decimal.global", JSImport.Default)
  @js.native
  class default protected () extends Decimal {
    def this(n: DecimalValue) = this()
  }
  /* static members */
  object default {
    
    @JSImport("decimal.js/decimal.global", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    @JSImport("decimal.js/decimal.global", "default.default")
    @js.native
    val default: js.UndefOr[DecimalConstructor] = js.native
    
    @JSImport("decimal.js/decimal.global", "default.Decimal")
    @js.native
    val Decimal: js.UndefOr[DecimalConstructor] = js.native
    
    @JSImport("decimal.js/decimal.global", "default.EUCLID")
    @js.native
    val EUCLID: `9` = js.native
    
    @JSImport("decimal.js/decimal.global", "default.ROUND_CEIL")
    @js.native
    val ROUND_CEIL: `2` = js.native
    
    @JSImport("decimal.js/decimal.global", "default.ROUND_DOWN")
    @js.native
    val ROUND_DOWN: `1` = js.native
    
    @JSImport("decimal.js/decimal.global", "default.ROUND_FLOOR")
    @js.native
    val ROUND_FLOOR: `3` = js.native
    
    @JSImport("decimal.js/decimal.global", "default.ROUND_HALF_CEIL")
    @js.native
    val ROUND_HALF_CEIL: `7` = js.native
    
    @JSImport("decimal.js/decimal.global", "default.ROUND_HALF_DOWN")
    @js.native
    val ROUND_HALF_DOWN: `5` = js.native
    
    @JSImport("decimal.js/decimal.global", "default.ROUND_HALF_EVEN")
    @js.native
    val ROUND_HALF_EVEN: `6` = js.native
    
    @JSImport("decimal.js/decimal.global", "default.ROUND_HALF_FLOOR")
    @js.native
    val ROUND_HALF_FLOOR: `8` = js.native
    
    @JSImport("decimal.js/decimal.global", "default.ROUND_HALF_UP")
    @js.native
    val ROUND_HALF_UP: `4` = js.native
    
    @JSImport("decimal.js/decimal.global", "default.ROUND_UP")
    @js.native
    val ROUND_UP: `0` = js.native
    
    inline def abs(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def acos(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("acos")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def acosh(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("acosh")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def add(x: DecimalValue, y: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def asin(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("asin")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def asinh(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("asinh")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def atan(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("atan")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def atan2(y: DecimalValue, x: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("atan2")(y.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def atanh(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("atanh")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def cbrt(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("cbrt")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def ceil(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("ceil")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def clone(`object`: DecimalConfig): DecimalConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(`object`.asInstanceOf[js.Any]).asInstanceOf[DecimalConstructor]
    
    inline def config(`object`: DecimalConfig): DecimalConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(`object`.asInstanceOf[js.Any]).asInstanceOf[DecimalConstructor]
    
    inline def cos(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("cos")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def cosh(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("cosh")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    @JSImport("decimal.js/decimal.global", "default.crypto")
    @js.native
    val crypto: Boolean = js.native
    
    inline def div(x: DecimalValue, y: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def exp(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("exp")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def floor(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("floor")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def hypot(n: DecimalValue*): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("hypot")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def isDecimal(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecimal")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def ln(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("ln")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def log(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    inline def log(n: DecimalValue, base: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(n.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def log10(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("log10")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def log2(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("log2")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def max(n: DecimalValue*): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    @JSImport("decimal.js/decimal.global", "default.maxE")
    @js.native
    val maxE: Double = js.native
    
    inline def min(n: DecimalValue*): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    @JSImport("decimal.js/decimal.global", "default.minE")
    @js.native
    val minE: Double = js.native
    
    inline def mod(x: DecimalValue, y: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    @JSImport("decimal.js/decimal.global", "default.modulo")
    @js.native
    val modulo: DecimalModulo = js.native
    
    inline def mul(x: DecimalValue, y: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def noConflict(): DecimalConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[DecimalConstructor]
    
    // Browser only
    inline def pow(base: DecimalValue, exponent: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(base.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    @JSImport("decimal.js/decimal.global", "default.precision")
    @js.native
    val precision: Double = js.native
    
    inline def random(): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    inline def random(significantDigits: Double): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(significantDigits.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def round(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    @JSImport("decimal.js/decimal.global", "default.rounding")
    @js.native
    val rounding: DecimalRounding = js.native
    
    inline def set(`object`: DecimalConfig): DecimalConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(`object`.asInstanceOf[js.Any]).asInstanceOf[DecimalConstructor]
    
    inline def sign(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def sin(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("sin")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def sinh(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("sinh")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def sqrt(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("sqrt")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def sub(x: DecimalValue, y: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def tan(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("tan")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def tanh(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("tanh")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    @JSImport("decimal.js/decimal.global", "default.toExpNeg")
    @js.native
    val toExpNeg: Double = js.native
    
    @JSImport("decimal.js/decimal.global", "default.toExpPos")
    @js.native
    val toExpPos: Double = js.native
    
    inline def trunc(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("trunc")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
  }
  
  @JSImport("decimal.js/decimal.global", "Decimal")
  @js.native
  class Decimal protected () extends StObject {
    def this(n: DecimalValue) = this()
    
    def abs(): Decimal = js.native
    
    def absoluteValue(): Decimal = js.native
    
    def acos(): Decimal = js.native
    
    def acosh(): Decimal = js.native
    
    def add(n: DecimalValue): Decimal = js.native
    
    def asin(): Decimal = js.native
    
    def asinh(): Decimal = js.native
    
    def atan(): Decimal = js.native
    
    def atanh(): Decimal = js.native
    
    def cbrt(): Decimal = js.native
    
    def ceil(): Decimal = js.native
    
    def cmp(n: DecimalValue): Double = js.native
    
    def comparedTo(n: DecimalValue): Double = js.native
    
    def cos(): Decimal = js.native
    
    def cosh(): Decimal = js.native
    
    def cosine(): Decimal = js.native
    
    def cubeRoot(): Decimal = js.native
    
    val d: js.Array[Double] = js.native
    
    def decimalPlaces(): Double = js.native
    
    def div(n: DecimalValue): Decimal = js.native
    
    def divToInt(n: DecimalValue): Decimal = js.native
    
    def dividedBy(n: DecimalValue): Decimal = js.native
    
    def dividedToIntegerBy(n: DecimalValue): Decimal = js.native
    
    def dp(): Double = js.native
    
    val e: Double = js.native
    
    def exp(): Decimal = js.native
    
    def floor(): Decimal = js.native
    
    def greaterThan(n: DecimalValue): Boolean = js.native
    
    def greaterThanOrEqualTo(n: DecimalValue): Boolean = js.native
    
    def gt(n: DecimalValue): Boolean = js.native
    
    def gte(n: DecimalValue): Boolean = js.native
    
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
    
    def lessThan(n: DecimalValue): Boolean = js.native
    
    def lessThanOrEqualTo(n: DecimalValue): Boolean = js.native
    
    def ln(): Decimal = js.native
    
    def log(): Decimal = js.native
    def log(n: DecimalValue): Decimal = js.native
    
    def logarithm(): Decimal = js.native
    def logarithm(n: DecimalValue): Decimal = js.native
    
    def lt(n: DecimalValue): Boolean = js.native
    
    def lte(n: DecimalValue): Boolean = js.native
    
    def minus(n: DecimalValue): Decimal = js.native
    
    def mod(n: DecimalValue): Decimal = js.native
    
    def modulo(n: DecimalValue): Decimal = js.native
    
    def mul(n: DecimalValue): Decimal = js.native
    
    /* private */ val name: String = js.native
    
    def naturalExponential(): Decimal = js.native
    
    def naturalLogarithm(): Decimal = js.native
    
    def neg(): Decimal = js.native
    
    def negated(): Decimal = js.native
    
    def plus(n: DecimalValue): Decimal = js.native
    
    def pow(n: DecimalValue): Decimal = js.native
    
    def precision(): Double = js.native
    def precision(includeZeros: Boolean): Double = js.native
    
    def round(): Decimal = js.native
    
    val s: Double = js.native
    
    def sd(): Double = js.native
    def sd(includeZeros: Boolean): Double = js.native
    
    def sin(): Decimal = js.native
    
    def sine(): Decimal = js.native
    
    def sinh(): Decimal = js.native
    
    def sqrt(): Decimal = js.native
    
    def squareRoot(): Decimal = js.native
    
    def sub(n: DecimalValue): Decimal = js.native
    
    def tan(): Decimal = js.native
    
    def tangent(): Decimal = js.native
    
    def tanh(): Decimal = js.native
    
    def times(n: DecimalValue): Decimal = js.native
    
    def toBinary(): String = js.native
    def toBinary(significantDigits: Double): String = js.native
    def toBinary(significantDigits: Double, rounding: DecimalRounding): String = js.native
    
    def toDP(): Decimal = js.native
    def toDP(decimalPlaces: Double): Decimal = js.native
    def toDP(decimalPlaces: Double, rounding: DecimalRounding): Decimal = js.native
    
    def toDecimalPlaces(): Decimal = js.native
    def toDecimalPlaces(decimalPlaces: Double): Decimal = js.native
    def toDecimalPlaces(decimalPlaces: Double, rounding: DecimalRounding): Decimal = js.native
    
    def toExponential(): String = js.native
    def toExponential(decimalPlaces: Double): String = js.native
    def toExponential(decimalPlaces: Double, rounding: DecimalRounding): String = js.native
    
    def toFixed(): String = js.native
    def toFixed(decimalPlaces: Double): String = js.native
    def toFixed(decimalPlaces: Double, rounding: DecimalRounding): String = js.native
    
    def toFraction(): js.Array[Decimal] = js.native
    def toFraction(max_denominator: DecimalValue): js.Array[Decimal] = js.native
    
    def toHex(): String = js.native
    def toHex(significantDigits: Double): String = js.native
    def toHex(significantDigits: Double, rounding: DecimalRounding): String = js.native
    
    def toHexadecimal(): String = js.native
    def toHexadecimal(significantDigits: Double): String = js.native
    def toHexadecimal(significantDigits: Double, rounding: DecimalRounding): String = js.native
    
    def toJSON(): String = js.native
    
    def toNearest(n: DecimalValue): Decimal = js.native
    def toNearest(n: DecimalValue, rounding: DecimalRounding): Decimal = js.native
    
    def toNumber(): Double = js.native
    
    def toOctal(): String = js.native
    def toOctal(significantDigits: Double): String = js.native
    def toOctal(significantDigits: Double, rounding: DecimalRounding): String = js.native
    
    def toPower(n: DecimalValue): Decimal = js.native
    
    def toPrecision(): String = js.native
    def toPrecision(significantDigits: Double): String = js.native
    def toPrecision(significantDigits: Double, rounding: DecimalRounding): String = js.native
    
    def toSD(): Decimal = js.native
    def toSD(significantDigits: Double): Decimal = js.native
    def toSD(significantDigits: Double, rounding: DecimalRounding): Decimal = js.native
    
    def toSignificantDigits(): Decimal = js.native
    def toSignificantDigits(significantDigits: Double): Decimal = js.native
    def toSignificantDigits(significantDigits: Double, rounding: DecimalRounding): Decimal = js.native
    
    def trunc(): Decimal = js.native
    
    def truncated(): Decimal = js.native
  }
  /* static members */
  object Decimal {
    
    @JSImport("decimal.js/decimal.global", "Decimal")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("decimal.js/decimal.global", "Decimal.default")
    @js.native
    val default: js.UndefOr[DecimalConstructor] = js.native
    
    @JSImport("decimal.js/decimal.global", "Decimal.Decimal")
    @js.native
    val Decimal: js.UndefOr[DecimalConstructor] = js.native
    
    @JSImport("decimal.js/decimal.global", "Decimal.EUCLID")
    @js.native
    val EUCLID: `9` = js.native
    
    @JSImport("decimal.js/decimal.global", "Decimal.ROUND_CEIL")
    @js.native
    val ROUND_CEIL: `2` = js.native
    
    @JSImport("decimal.js/decimal.global", "Decimal.ROUND_DOWN")
    @js.native
    val ROUND_DOWN: `1` = js.native
    
    @JSImport("decimal.js/decimal.global", "Decimal.ROUND_FLOOR")
    @js.native
    val ROUND_FLOOR: `3` = js.native
    
    @JSImport("decimal.js/decimal.global", "Decimal.ROUND_HALF_CEIL")
    @js.native
    val ROUND_HALF_CEIL: `7` = js.native
    
    @JSImport("decimal.js/decimal.global", "Decimal.ROUND_HALF_DOWN")
    @js.native
    val ROUND_HALF_DOWN: `5` = js.native
    
    @JSImport("decimal.js/decimal.global", "Decimal.ROUND_HALF_EVEN")
    @js.native
    val ROUND_HALF_EVEN: `6` = js.native
    
    @JSImport("decimal.js/decimal.global", "Decimal.ROUND_HALF_FLOOR")
    @js.native
    val ROUND_HALF_FLOOR: `8` = js.native
    
    @JSImport("decimal.js/decimal.global", "Decimal.ROUND_HALF_UP")
    @js.native
    val ROUND_HALF_UP: `4` = js.native
    
    @JSImport("decimal.js/decimal.global", "Decimal.ROUND_UP")
    @js.native
    val ROUND_UP: `0` = js.native
    
    inline def abs(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def acos(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("acos")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def acosh(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("acosh")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def add(x: DecimalValue, y: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def asin(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("asin")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def asinh(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("asinh")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def atan(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("atan")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def atan2(y: DecimalValue, x: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("atan2")(y.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def atanh(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("atanh")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def cbrt(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("cbrt")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def ceil(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("ceil")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def clone(`object`: DecimalConfig): DecimalConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(`object`.asInstanceOf[js.Any]).asInstanceOf[DecimalConstructor]
    
    inline def config(`object`: DecimalConfig): DecimalConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(`object`.asInstanceOf[js.Any]).asInstanceOf[DecimalConstructor]
    
    inline def cos(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("cos")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def cosh(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("cosh")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    @JSImport("decimal.js/decimal.global", "Decimal.crypto")
    @js.native
    val crypto: Boolean = js.native
    
    inline def div(x: DecimalValue, y: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def exp(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("exp")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def floor(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("floor")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def hypot(n: DecimalValue*): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("hypot")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def isDecimal(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecimal")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def ln(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("ln")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def log(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    inline def log(n: DecimalValue, base: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(n.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def log10(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("log10")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def log2(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("log2")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def max(n: DecimalValue*): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    @JSImport("decimal.js/decimal.global", "Decimal.maxE")
    @js.native
    val maxE: Double = js.native
    
    inline def min(n: DecimalValue*): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    @JSImport("decimal.js/decimal.global", "Decimal.minE")
    @js.native
    val minE: Double = js.native
    
    inline def mod(x: DecimalValue, y: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    @JSImport("decimal.js/decimal.global", "Decimal.modulo")
    @js.native
    val modulo: DecimalModulo = js.native
    
    inline def mul(x: DecimalValue, y: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def noConflict(): DecimalConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[DecimalConstructor]
    
    // Browser only
    inline def pow(base: DecimalValue, exponent: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(base.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    @JSImport("decimal.js/decimal.global", "Decimal.precision")
    @js.native
    val precision: Double = js.native
    
    inline def random(): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    inline def random(significantDigits: Double): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(significantDigits.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def round(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    @JSImport("decimal.js/decimal.global", "Decimal.rounding")
    @js.native
    val rounding: DecimalRounding = js.native
    
    inline def set(`object`: DecimalConfig): DecimalConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(`object`.asInstanceOf[js.Any]).asInstanceOf[DecimalConstructor]
    
    inline def sign(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def sin(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("sin")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def sinh(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("sinh")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def sqrt(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("sqrt")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def sub(x: DecimalValue, y: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def tan(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("tan")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    inline def tanh(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("tanh")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    @JSImport("decimal.js/decimal.global", "Decimal.toExpNeg")
    @js.native
    val toExpNeg: Double = js.native
    
    @JSImport("decimal.js/decimal.global", "Decimal.toExpPos")
    @js.native
    val toExpPos: Double = js.native
    
    inline def trunc(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("trunc")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.decimalGlobalMod.Decimal]
    
    type Config = DecimalConfig
    
    type Constructor = DecimalConstructor
    
    type Instance = DecimalInstance
    
    type Modulo = DecimalModulo
    
    type Rounding = DecimalRounding
    
    type Value = DecimalValue
  }
  
  object global {
    
    object Decimal extends Shortcut {
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("Decimal")
      @js.native
      class ^ protected ()
        extends typings.decimalJs.decimalGlobalMod.Decimal {
        def this(n: DecimalValue) = this()
      }
      
      @JSGlobal("Decimal")
      @js.native
      val ^ : DecimalConstructor = js.native
      
      type Config = DecimalConfig
      
      type Constructor = DecimalConstructor
      
      type Instance = DecimalInstance
      
      type Modulo = DecimalModulo
      
      type Rounding = DecimalRounding
      
      type Value = DecimalValue
      
      type _To = DecimalConstructor
      
      /* This means you don't have to write `^`, but can instead just say `Decimal.foo` */
      override def _to: DecimalConstructor = ^
    }
    type Decimal = DecimalInstance
  }
  
  // http://mikemcl.github.io/decimal.js/#constructor-properties
  trait DecimalConfig extends StObject {
    
    var crypto: js.UndefOr[Boolean] = js.undefined
    
    var defaults: js.UndefOr[Boolean] = js.undefined
    
    var maxE: js.UndefOr[Double] = js.undefined
    
    var minE: js.UndefOr[Double] = js.undefined
    
    var modulo: js.UndefOr[DecimalModulo] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var rounding: js.UndefOr[DecimalRounding] = js.undefined
    
    var toExpNeg: js.UndefOr[Double] = js.undefined
    
    var toExpPos: js.UndefOr[Double] = js.undefined
  }
  object DecimalConfig {
    
    inline def apply(): DecimalConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecimalConfig]
    }
    
    extension [Self <: DecimalConfig](x: Self) {
      
      inline def setCrypto(value: Boolean): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
      
      inline def setCryptoUndefined: Self = StObject.set(x, "crypto", js.undefined)
      
      inline def setDefaults(value: Boolean): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setMaxE(value: Double): Self = StObject.set(x, "maxE", value.asInstanceOf[js.Any])
      
      inline def setMaxEUndefined: Self = StObject.set(x, "maxE", js.undefined)
      
      inline def setMinE(value: Double): Self = StObject.set(x, "minE", value.asInstanceOf[js.Any])
      
      inline def setMinEUndefined: Self = StObject.set(x, "minE", js.undefined)
      
      inline def setModulo(value: DecimalModulo): Self = StObject.set(x, "modulo", value.asInstanceOf[js.Any])
      
      inline def setModuloUndefined: Self = StObject.set(x, "modulo", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setRounding(value: DecimalRounding): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
      
      inline def setRoundingUndefined: Self = StObject.set(x, "rounding", js.undefined)
      
      inline def setToExpNeg(value: Double): Self = StObject.set(x, "toExpNeg", value.asInstanceOf[js.Any])
      
      inline def setToExpNegUndefined: Self = StObject.set(x, "toExpNeg", js.undefined)
      
      inline def setToExpPos(value: Double): Self = StObject.set(x, "toExpPos", value.asInstanceOf[js.Any])
      
      inline def setToExpPosUndefined: Self = StObject.set(x, "toExpPos", js.undefined)
    }
  }
  
  @js.native
  trait DecimalConstructor
    extends StObject
       with Instantiable1[/* n */ DecimalValue, typings.decimalJs.decimalGlobalMod.Decimal] {
    
    val default: js.UndefOr[DecimalConstructor] = js.native
    
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
    
    def abs(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def acos(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def acosh(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def add(x: DecimalValue, y: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def asin(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def asinh(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def atan(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def atan2(y: DecimalValue, x: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def atanh(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def cbrt(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def ceil(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def clone(`object`: DecimalConfig): DecimalConstructor = js.native
    
    def config(`object`: DecimalConfig): DecimalConstructor = js.native
    
    def cos(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def cosh(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    val crypto: Boolean = js.native
    
    def div(x: DecimalValue, y: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def exp(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def floor(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def hypot(n: DecimalValue*): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def isDecimal(`object`: js.Any): Boolean = js.native
    
    def ln(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def log(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    def log(n: DecimalValue, base: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def log10(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def log2(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def max(n: DecimalValue*): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    val maxE: Double = js.native
    
    def min(n: DecimalValue*): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    val minE: Double = js.native
    
    def mod(x: DecimalValue, y: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    val modulo: DecimalModulo = js.native
    
    def mul(x: DecimalValue, y: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def noConflict(): DecimalConstructor = js.native
    
    // Browser only
    def pow(base: DecimalValue, exponent: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    val precision: Double = js.native
    
    def random(): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    def random(significantDigits: Double): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def round(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    val rounding: DecimalRounding = js.native
    
    def set(`object`: DecimalConfig): DecimalConstructor = js.native
    
    def sign(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def sin(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def sinh(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def sqrt(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def sub(x: DecimalValue, y: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def tan(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    def tanh(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
    
    val toExpNeg: Double = js.native
    
    val toExpPos: Double = js.native
    
    def trunc(n: DecimalValue): typings.decimalJs.decimalGlobalMod.Decimal = js.native
  }
  
  type DecimalInstance = Decimal
  
  /* Rewritten from type alias, can be one of: 
    - typings.decimalJs.decimalJsNumbers.`9`
    - typings.decimalJs.decimalJsNumbers.`0`
    - typings.decimalJs.decimalJsNumbers.`1`
    - typings.decimalJs.decimalJsNumbers.`2`
    - typings.decimalJs.decimalJsNumbers.`3`
    - typings.decimalJs.decimalJsNumbers.`4`
    - typings.decimalJs.decimalJsNumbers.`5`
    - typings.decimalJs.decimalJsNumbers.`6`
    - typings.decimalJs.decimalJsNumbers.`7`
    - typings.decimalJs.decimalJsNumbers.`8`
  */
  trait DecimalModulo extends StObject
  object DecimalModulo {
    
    inline def `0`: typings.decimalJs.decimalJsNumbers.`0` = 0.asInstanceOf[typings.decimalJs.decimalJsNumbers.`0`]
    
    inline def `1`: typings.decimalJs.decimalJsNumbers.`1` = 1.asInstanceOf[typings.decimalJs.decimalJsNumbers.`1`]
    
    inline def `2`: typings.decimalJs.decimalJsNumbers.`2` = 2.asInstanceOf[typings.decimalJs.decimalJsNumbers.`2`]
    
    inline def `3`: typings.decimalJs.decimalJsNumbers.`3` = 3.asInstanceOf[typings.decimalJs.decimalJsNumbers.`3`]
    
    inline def `4`: typings.decimalJs.decimalJsNumbers.`4` = 4.asInstanceOf[typings.decimalJs.decimalJsNumbers.`4`]
    
    inline def `5`: typings.decimalJs.decimalJsNumbers.`5` = 5.asInstanceOf[typings.decimalJs.decimalJsNumbers.`5`]
    
    inline def `6`: typings.decimalJs.decimalJsNumbers.`6` = 6.asInstanceOf[typings.decimalJs.decimalJsNumbers.`6`]
    
    inline def `7`: typings.decimalJs.decimalJsNumbers.`7` = 7.asInstanceOf[typings.decimalJs.decimalJsNumbers.`7`]
    
    inline def `8`: typings.decimalJs.decimalJsNumbers.`8` = 8.asInstanceOf[typings.decimalJs.decimalJsNumbers.`8`]
    
    inline def `9`: typings.decimalJs.decimalJsNumbers.`9` = 9.asInstanceOf[typings.decimalJs.decimalJsNumbers.`9`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.decimalJs.decimalJsNumbers.`0`
    - typings.decimalJs.decimalJsNumbers.`1`
    - typings.decimalJs.decimalJsNumbers.`2`
    - typings.decimalJs.decimalJsNumbers.`3`
    - typings.decimalJs.decimalJsNumbers.`4`
    - typings.decimalJs.decimalJsNumbers.`5`
    - typings.decimalJs.decimalJsNumbers.`6`
    - typings.decimalJs.decimalJsNumbers.`7`
    - typings.decimalJs.decimalJsNumbers.`8`
  */
  trait DecimalRounding extends StObject
  object DecimalRounding {
    
    inline def `0`: typings.decimalJs.decimalJsNumbers.`0` = 0.asInstanceOf[typings.decimalJs.decimalJsNumbers.`0`]
    
    inline def `1`: typings.decimalJs.decimalJsNumbers.`1` = 1.asInstanceOf[typings.decimalJs.decimalJsNumbers.`1`]
    
    inline def `2`: typings.decimalJs.decimalJsNumbers.`2` = 2.asInstanceOf[typings.decimalJs.decimalJsNumbers.`2`]
    
    inline def `3`: typings.decimalJs.decimalJsNumbers.`3` = 3.asInstanceOf[typings.decimalJs.decimalJsNumbers.`3`]
    
    inline def `4`: typings.decimalJs.decimalJsNumbers.`4` = 4.asInstanceOf[typings.decimalJs.decimalJsNumbers.`4`]
    
    inline def `5`: typings.decimalJs.decimalJsNumbers.`5` = 5.asInstanceOf[typings.decimalJs.decimalJsNumbers.`5`]
    
    inline def `6`: typings.decimalJs.decimalJsNumbers.`6` = 6.asInstanceOf[typings.decimalJs.decimalJsNumbers.`6`]
    
    inline def `7`: typings.decimalJs.decimalJsNumbers.`7` = 7.asInstanceOf[typings.decimalJs.decimalJsNumbers.`7`]
    
    inline def `8`: typings.decimalJs.decimalJsNumbers.`8` = 8.asInstanceOf[typings.decimalJs.decimalJsNumbers.`8`]
  }
  
  type DecimalValue = String | Double | Decimal
}
