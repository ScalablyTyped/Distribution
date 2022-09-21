package typings.csstoolsPostcssColorFunction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertA98RgbToSrgbMod {
  
  @JSImport("@csstools/postcss-color-function/dist/convert-a98-rgb-to-srgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def a98RgbToSRgb(a98: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("a98RgbToSRgb")(a98.asInstanceOf[js.Any]).asInstanceOf[color]
  
  type color = js.Tuple3[Double, Double, Double]
}
