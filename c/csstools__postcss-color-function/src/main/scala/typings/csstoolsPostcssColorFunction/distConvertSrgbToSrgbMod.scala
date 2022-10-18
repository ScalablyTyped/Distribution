package typings.csstoolsPostcssColorFunction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConvertSrgbToSrgbMod {
  
  @JSImport("@csstools/postcss-color-function/dist/convert-srgb-to-srgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sRgbToSRgb(sRgb: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("sRgbToSRgb")(sRgb.asInstanceOf[js.Any]).asInstanceOf[color]
  
  type color = js.Tuple3[Double, Double, Double]
}
