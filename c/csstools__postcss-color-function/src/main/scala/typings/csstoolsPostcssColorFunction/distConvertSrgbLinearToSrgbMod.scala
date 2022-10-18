package typings.csstoolsPostcssColorFunction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConvertSrgbLinearToSrgbMod {
  
  @JSImport("@csstools/postcss-color-function/dist/convert-srgb-linear-to-srgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sRgbLinearToSRgb(linearSRgb: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("sRgbLinearToSRgb")(linearSRgb.asInstanceOf[js.Any]).asInstanceOf[color]
  
  type color = js.Tuple3[Double, Double, Double]
}
