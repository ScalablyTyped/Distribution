package typings.csstoolsPostcssColorFunction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deltaEOKMod {
  
  @JSImport("@csstools/postcss-color-function/dist/css-color-4/deltaEOK", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deltaEOK(reference: color, sample: color): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("deltaEOK")(reference.asInstanceOf[js.Any], sample.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  type color = js.Tuple3[Double, Double, Double]
}
