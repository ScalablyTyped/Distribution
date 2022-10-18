package typings.csstoolsPostcssColorFunction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConvertProphotoRgbToSrgbMod {
  
  @JSImport("@csstools/postcss-color-function/dist/convert-prophoto-rgb-to-srgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prophotoRgbToSRgb(prophoto: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("prophotoRgbToSRgb")(prophoto.asInstanceOf[js.Any]).asInstanceOf[color]
  
  type color = js.Tuple3[Double, Double, Double]
}
