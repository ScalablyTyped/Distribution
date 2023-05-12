package typings.decimalJs

import org.scalablytyped.runtime.Instantiable1
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

object mod {
  
  @JSImport("decimal.js", JSImport.Default)
  @js.native
  open class default protected () extends Decimal {
    def this(n: Value) = this()
  }
  /* static members */
  object default {
    
    @JSImport("decimal.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    @JSImport("decimal.js", "default.default")
    @js.native
    val default: js.UndefOr[Constructor] = js.native
    
    @JSImport("decimal.js", "default.Decimal")
    @js.native
    val Decimal: js.UndefOr[Constructor] = js.native
    
    @JSImport("decimal.js", "default.EUCLID")
    @js.native
    val EUCLID: `9` = js.native
    
    @JSImport("decimal.js", "default.ROUND_CEIL")
    @js.native
    val ROUND_CEIL: `2` = js.native
    
    @JSImport("decimal.js", "default.ROUND_DOWN")
    @js.native
    val ROUND_DOWN: `1` = js.native
    
    @JSImport("decimal.js", "default.ROUND_FLOOR")
    @js.native
    val ROUND_FLOOR: `3` = js.native
    
    @JSImport("decimal.js", "default.ROUND_HALF_CEIL")
    @js.native
    val ROUND_HALF_CEIL: `7` = js.native
    
    @JSImport("decimal.js", "default.ROUND_HALF_DOWN")
    @js.native
    val ROUND_HALF_DOWN: `5` = js.native
    
    @JSImport("decimal.js", "default.ROUND_HALF_EVEN")
    @js.native
    val ROUND_HALF_EVEN: `6` = js.native
    
    @JSImport("decimal.js", "default.ROUND_HALF_FLOOR")
    @js.native
    val ROUND_HALF_FLOOR: `8` = js.native
    
    @JSImport("decimal.js", "default.ROUND_HALF_UP")
    @js.native
    val ROUND_HALF_UP: `4` = js.native
    
    @JSImport("decimal.js", "default.ROUND_UP")
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
    
    @JSImport("decimal.js", "default.crypto")
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
    
    @JSImport("decimal.js", "default.maxE")
    @js.native
    val maxE: Double = js.native
    
    inline def min(n: Value*): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(n.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    @JSImport("decimal.js", "default.minE")
    @js.native
    val minE: Double = js.native
    
    inline def mod(x: Value, y: Value): typings.decimalJs.mod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    @JSImport("decimal.js", "default.modulo")
    @js.native
    val modulo: Modulo = js.native
    
    inline def mul(x: Value, y: Value): typings.decimalJs.mod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def noConflict(): Constructor = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[Constructor]
    
    // Browser only
    inline def pow(base: Value, exponent: Value): typings.decimalJs.mod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(base.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    @JSImport("decimal.js", "default.precision")
    @js.native
    val precision: Double = js.native
    
    inline def random(): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[typings.decimalJs.mod.Decimal]
    inline def random(significantDigits: Double): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(significantDigits.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def round(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    @JSImport("decimal.js", "default.rounding")
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
    
    @JSImport("decimal.js", "default.toExpNeg")
    @js.native
    val toExpNeg: Double = js.native
    
    @JSImport("decimal.js", "default.toExpPos")
    @js.native
    val toExpPos: Double = js.native
    
    inline def trunc(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("trunc")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
  }
  
  @JSImport("decimal.js", "Decimal")
  @js.native
  open class Decimal protected () extends StObject {
    def this(n: Value) = this()
    
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
    
    def clamp(min: Value, max: Value): Decimal = js.native
    
    def clampedTo(min: Value, max: Value): Decimal = js.native
    
    def cmp(n: Value): Double = js.native
    
    def comparedTo(n: Value): Double = js.native
    
    def cos(): Decimal = js.native
    
    def cosh(): Decimal = js.native
    
    def cosine(): Decimal = js.native
    
    def cubeRoot(): Decimal = js.native
    
    val d: js.Array[Double] = js.native
    
    def decimalPlaces(): Double = js.native
    
    def div(n: Value): Decimal = js.native
    
    def divToInt(n: Value): Decimal = js.native
    
    def dividedBy(n: Value): Decimal = js.native
    
    def dividedToIntegerBy(n: Value): Decimal = js.native
    
    def dp(): Double = js.native
    
    val e: Double = js.native
    
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
    
    val s: Double = js.native
    
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
  object Decimal {
    
    @JSImport("decimal.js", "Decimal")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("decimal.js", "Decimal.default")
    @js.native
    val default: js.UndefOr[Constructor] = js.native
    
    @JSImport("decimal.js", "Decimal.Decimal")
    @js.native
    val Decimal: js.UndefOr[Constructor] = js.native
    
    @JSImport("decimal.js", "Decimal.EUCLID")
    @js.native
    val EUCLID: `9` = js.native
    
    @JSImport("decimal.js", "Decimal.ROUND_CEIL")
    @js.native
    val ROUND_CEIL: `2` = js.native
    
    @JSImport("decimal.js", "Decimal.ROUND_DOWN")
    @js.native
    val ROUND_DOWN: `1` = js.native
    
    @JSImport("decimal.js", "Decimal.ROUND_FLOOR")
    @js.native
    val ROUND_FLOOR: `3` = js.native
    
    @JSImport("decimal.js", "Decimal.ROUND_HALF_CEIL")
    @js.native
    val ROUND_HALF_CEIL: `7` = js.native
    
    @JSImport("decimal.js", "Decimal.ROUND_HALF_DOWN")
    @js.native
    val ROUND_HALF_DOWN: `5` = js.native
    
    @JSImport("decimal.js", "Decimal.ROUND_HALF_EVEN")
    @js.native
    val ROUND_HALF_EVEN: `6` = js.native
    
    @JSImport("decimal.js", "Decimal.ROUND_HALF_FLOOR")
    @js.native
    val ROUND_HALF_FLOOR: `8` = js.native
    
    @JSImport("decimal.js", "Decimal.ROUND_HALF_UP")
    @js.native
    val ROUND_HALF_UP: `4` = js.native
    
    @JSImport("decimal.js", "Decimal.ROUND_UP")
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
    
    @JSImport("decimal.js", "Decimal.crypto")
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
    
    @JSImport("decimal.js", "Decimal.maxE")
    @js.native
    val maxE: Double = js.native
    
    inline def min(n: Value*): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(n.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    @JSImport("decimal.js", "Decimal.minE")
    @js.native
    val minE: Double = js.native
    
    inline def mod(x: Value, y: Value): typings.decimalJs.mod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    @JSImport("decimal.js", "Decimal.modulo")
    @js.native
    val modulo: Modulo = js.native
    
    inline def mul(x: Value, y: Value): typings.decimalJs.mod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def noConflict(): Constructor = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[Constructor]
    
    // Browser only
    inline def pow(base: Value, exponent: Value): typings.decimalJs.mod.Decimal = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(base.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    @JSImport("decimal.js", "Decimal.precision")
    @js.native
    val precision: Double = js.native
    
    inline def random(): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[typings.decimalJs.mod.Decimal]
    inline def random(significantDigits: Double): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(significantDigits.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    inline def round(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    @JSImport("decimal.js", "Decimal.rounding")
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
    
    @JSImport("decimal.js", "Decimal.toExpNeg")
    @js.native
    val toExpNeg: Double = js.native
    
    @JSImport("decimal.js", "Decimal.toExpPos")
    @js.native
    val toExpPos: Double = js.native
    
    inline def trunc(n: Value): typings.decimalJs.mod.Decimal = ^.asInstanceOf[js.Dynamic].applyDynamic("trunc")(n.asInstanceOf[js.Any]).asInstanceOf[typings.decimalJs.mod.Decimal]
    
    trait Config extends StObject {
      
      var crypto: js.UndefOr[Boolean] = js.undefined
      
      var defaults: js.UndefOr[Boolean] = js.undefined
      
      var maxE: js.UndefOr[Double] = js.undefined
      
      var minE: js.UndefOr[Double] = js.undefined
      
      var modulo: js.UndefOr[Modulo] = js.undefined
      
      var precision: js.UndefOr[Double] = js.undefined
      
      var rounding: js.UndefOr[Rounding] = js.undefined
      
      var toExpNeg: js.UndefOr[Double] = js.undefined
      
      var toExpPos: js.UndefOr[Double] = js.undefined
    }
    object Config {
      
      inline def apply(): Config = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Config]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
        
        inline def setCrypto(value: Boolean): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
        
        inline def setCryptoUndefined: Self = StObject.set(x, "crypto", js.undefined)
        
        inline def setDefaults(value: Boolean): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
        
        inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
        
        inline def setMaxE(value: Double): Self = StObject.set(x, "maxE", value.asInstanceOf[js.Any])
        
        inline def setMaxEUndefined: Self = StObject.set(x, "maxE", js.undefined)
        
        inline def setMinE(value: Double): Self = StObject.set(x, "minE", value.asInstanceOf[js.Any])
        
        inline def setMinEUndefined: Self = StObject.set(x, "minE", js.undefined)
        
        inline def setModulo(value: Modulo): Self = StObject.set(x, "modulo", value.asInstanceOf[js.Any])
        
        inline def setModuloUndefined: Self = StObject.set(x, "modulo", js.undefined)
        
        inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
        
        inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
        
        inline def setRounding(value: Rounding): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
        
        inline def setRoundingUndefined: Self = StObject.set(x, "rounding", js.undefined)
        
        inline def setToExpNeg(value: Double): Self = StObject.set(x, "toExpNeg", value.asInstanceOf[js.Any])
        
        inline def setToExpNegUndefined: Self = StObject.set(x, "toExpNeg", js.undefined)
        
        inline def setToExpPos(value: Double): Self = StObject.set(x, "toExpPos", value.asInstanceOf[js.Any])
        
        inline def setToExpPosUndefined: Self = StObject.set(x, "toExpPos", js.undefined)
      }
    }
    
    @js.native
    trait Constructor
      extends StObject
         with Instantiable1[/* n */ Value, typings.decimalJs.mod.Decimal] {
      
      val default: js.UndefOr[Constructor] = js.native
      
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
      
      def abs(n: Value): typings.decimalJs.mod.Decimal = js.native
      
      def acos(n: Value): typings.decimalJs.mod.Decimal = js.native
      
      def acosh(n: Value): typings.decimalJs.mod.Decimal = js.native
      
      def add(x: Value, y: Value): typings.decimalJs.mod.Decimal = js.native
      
      def asin(n: Value): typings.decimalJs.mod.Decimal = js.native
      
      def asinh(n: Value): typings.decimalJs.mod.Decimal = js.native
      
      def atan(n: Value): typings.decimalJs.mod.Decimal = js.native
      
      def atan2(y: Value, x: Value): typings.decimalJs.mod.Decimal = js.native
      
      def atanh(n: Value): typings.decimalJs.mod.Decimal = js.native
      
      def cbrt(n: Value): typings.decimalJs.mod.Decimal = js.native
      
      def ceil(n: Value): typings.decimalJs.mod.Decimal = js.native
      
      def clamp(n: Value, min: Value, max: Value): typings.decimalJs.mod.Decimal = js.native
      
      def clone(`object`: Config): Constructor = js.native
      
      def config(`object`: Config): Constructor = js.native
      
      def cos(n: Value): typings.decimalJs.mod.Decimal = js.native
      
      def cosh(n: Value): typings.decimalJs.mod.Decimal = js.native
      
      val crypto: Boolean = js.native
      
      def div(x: Value, y: Value): typings.decimalJs.mod.Decimal = js.native
      
      def exp(n: Value): typings.decimalJs.mod.Decimal = js.native
      
      def floor(n: Value): typings.decimalJs.mod.Decimal = js.native
      
      def hypot(n: Value*): typings.decimalJs.mod.Decimal = js.native
      
      def isDecimal(`object`: Any): /* is decimal.js.decimal.js.Decimal */ Boolean = js.native
      
      def ln(n: Value): typings.decimalJs.mod.Decimal = js.native
      
      def log(n: Value): typings.decimalJs.mod.Decimal = js.native
      def log(n: Value, base: Value): typings.decimalJs.mod.Decimal = js.native
      
      def log10(n: Value): typings.decimalJs.mod.Decimal = js.native
      
      def log2(n: Value): typings.decimalJs.mod.Decimal = js.native
      
      def max(n: Value*): typings.decimalJs.mod.Decimal = js.native
      
      val maxE: Double = js.native
      
      def min(n: Value*): typings.decimalJs.mod.Decimal = js.native
      
      val minE: Double = js.native
      
      def mod(x: Value, y: Value): typings.decimalJs.mod.Decimal = js.native
      
      val modulo: Modulo = js.native
      
      def mul(x: Value, y: Value): typings.decimalJs.mod.Decimal = js.native
      
      def noConflict(): Constructor = js.native
      
      // Browser only
      def pow(base: Value, exponent: Value): typings.decimalJs.mod.Decimal = js.native
      
      val precision: Double = js.native
      
      def random(): typings.decimalJs.mod.Decimal = js.native
      def random(significantDigits: Double): typings.decimalJs.mod.Decimal = js.native
      
      def round(n: Value): typings.decimalJs.mod.Decimal = js.native
      
      val rounding: Rounding = js.native
      
      def set(`object`: Config): Constructor = js.native
      
      def sign(n: Value): Double = js.native
      
      def sin(n: Value): typings.decimalJs.mod.Decimal = js.native
      
      def sinh(n: Value): typings.decimalJs.mod.Decimal = js.native
      
      def sqrt(n: Value): typings.decimalJs.mod.Decimal = js.native
      
      def sub(x: Value, y: Value): typings.decimalJs.mod.Decimal = js.native
      
      def sum(n: Value*): typings.decimalJs.mod.Decimal = js.native
      
      def tan(n: Value): typings.decimalJs.mod.Decimal = js.native
      
      def tanh(n: Value): typings.decimalJs.mod.Decimal = js.native
      
      val toExpNeg: Double = js.native
      
      val toExpPos: Double = js.native
      
      def trunc(n: Value): typings.decimalJs.mod.Decimal = js.native
    }
    
    type Instance = typings.decimalJs.mod.Decimal
    
    /* Rewritten from type alias, can be one of: 
      - typings.decimalJs.decimalJsInts.`9`
      - typings.decimalJs.decimalJsInts.`0`
      - typings.decimalJs.decimalJsInts.`1`
      - typings.decimalJs.decimalJsInts.`2`
      - typings.decimalJs.decimalJsInts.`3`
      - typings.decimalJs.decimalJsInts.`4`
      - typings.decimalJs.decimalJsInts.`5`
      - typings.decimalJs.decimalJsInts.`6`
      - typings.decimalJs.decimalJsInts.`7`
      - typings.decimalJs.decimalJsInts.`8`
    */
    trait Modulo extends StObject
    object Modulo {
      
      inline def `0`: typings.decimalJs.decimalJsInts.`0` = 0.asInstanceOf[typings.decimalJs.decimalJsInts.`0`]
      
      inline def `1`: typings.decimalJs.decimalJsInts.`1` = 1.asInstanceOf[typings.decimalJs.decimalJsInts.`1`]
      
      inline def `2`: typings.decimalJs.decimalJsInts.`2` = 2.asInstanceOf[typings.decimalJs.decimalJsInts.`2`]
      
      inline def `3`: typings.decimalJs.decimalJsInts.`3` = 3.asInstanceOf[typings.decimalJs.decimalJsInts.`3`]
      
      inline def `4`: typings.decimalJs.decimalJsInts.`4` = 4.asInstanceOf[typings.decimalJs.decimalJsInts.`4`]
      
      inline def `5`: typings.decimalJs.decimalJsInts.`5` = 5.asInstanceOf[typings.decimalJs.decimalJsInts.`5`]
      
      inline def `6`: typings.decimalJs.decimalJsInts.`6` = 6.asInstanceOf[typings.decimalJs.decimalJsInts.`6`]
      
      inline def `7`: typings.decimalJs.decimalJsInts.`7` = 7.asInstanceOf[typings.decimalJs.decimalJsInts.`7`]
      
      inline def `8`: typings.decimalJs.decimalJsInts.`8` = 8.asInstanceOf[typings.decimalJs.decimalJsInts.`8`]
      
      inline def `9`: typings.decimalJs.decimalJsInts.`9` = 9.asInstanceOf[typings.decimalJs.decimalJsInts.`9`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.decimalJs.decimalJsInts.`0`
      - typings.decimalJs.decimalJsInts.`1`
      - typings.decimalJs.decimalJsInts.`2`
      - typings.decimalJs.decimalJsInts.`3`
      - typings.decimalJs.decimalJsInts.`4`
      - typings.decimalJs.decimalJsInts.`5`
      - typings.decimalJs.decimalJsInts.`6`
      - typings.decimalJs.decimalJsInts.`7`
      - typings.decimalJs.decimalJsInts.`8`
    */
    trait Rounding extends StObject
    object Rounding {
      
      inline def `0`: typings.decimalJs.decimalJsInts.`0` = 0.asInstanceOf[typings.decimalJs.decimalJsInts.`0`]
      
      inline def `1`: typings.decimalJs.decimalJsInts.`1` = 1.asInstanceOf[typings.decimalJs.decimalJsInts.`1`]
      
      inline def `2`: typings.decimalJs.decimalJsInts.`2` = 2.asInstanceOf[typings.decimalJs.decimalJsInts.`2`]
      
      inline def `3`: typings.decimalJs.decimalJsInts.`3` = 3.asInstanceOf[typings.decimalJs.decimalJsInts.`3`]
      
      inline def `4`: typings.decimalJs.decimalJsInts.`4` = 4.asInstanceOf[typings.decimalJs.decimalJsInts.`4`]
      
      inline def `5`: typings.decimalJs.decimalJsInts.`5` = 5.asInstanceOf[typings.decimalJs.decimalJsInts.`5`]
      
      inline def `6`: typings.decimalJs.decimalJsInts.`6` = 6.asInstanceOf[typings.decimalJs.decimalJsInts.`6`]
      
      inline def `7`: typings.decimalJs.decimalJsInts.`7` = 7.asInstanceOf[typings.decimalJs.decimalJsInts.`7`]
      
      inline def `8`: typings.decimalJs.decimalJsInts.`8` = 8.asInstanceOf[typings.decimalJs.decimalJsInts.`8`]
    }
    
    type Value = String | Double | typings.decimalJs.mod.Decimal
  }
}
