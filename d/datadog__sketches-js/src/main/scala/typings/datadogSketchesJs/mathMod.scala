package typings.datadogSketchesJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathMod {
  
  @JSImport("@datadog/sketches-js/dist/ddsketch/math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def frexp(value: Double): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("frexp")(value.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def ldexp(mantissa: Double, exponent: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ldexp")(mantissa.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[Double]
}
