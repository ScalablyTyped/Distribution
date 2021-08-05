package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof core.Number` */
object libraryFnNumberMod {
  
  @JSImport("core-js/library/fn/number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("core-js/library/fn/number", "EPSILON")
  @js.native
  def EPSILON: Double = js.native
  inline def EPSILON_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPSILON")(x.asInstanceOf[js.Any])
  
  @JSImport("core-js/library/fn/number", "MAX_SAFE_INTEGER")
  @js.native
  def MAX_SAFE_INTEGER: Double = js.native
  inline def MAX_SAFE_INTEGER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SAFE_INTEGER")(x.asInstanceOf[js.Any])
  
  @JSImport("core-js/library/fn/number", "MIN_SAFE_INTEGER")
  @js.native
  def MIN_SAFE_INTEGER: Double = js.native
  inline def MIN_SAFE_INTEGER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_SAFE_INTEGER")(x.asInstanceOf[js.Any])
  
  inline def acosh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("acosh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def asinh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asinh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def atanh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("atanh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def cbrt(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cbrt")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def clz32(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("clz32")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def cosh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cosh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def expm1(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("expm1")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fround(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fround")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hypot(values: Double*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hypot")(values.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def imul(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("imul")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isFinite(number: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFinite")(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInteger(number: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNaN(number: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNaN")(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSafeInteger(number: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSafeInteger")(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def log10(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log10")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def log1p(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log1p")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def log2(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log2")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def parseFloat(string: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFloat")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def parseInt(string: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseInt")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def parseInt(string: java.lang.String, radix: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseInt")(string.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def random(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[Double]
  inline def random(lim: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(lim.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sign(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sinh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sinh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def tanh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tanh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def trunc(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("trunc")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
}
