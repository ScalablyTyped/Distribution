package typings.csstoolsPostcssOklabFunction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConvertOklchToSrgbMod {
  
  @JSImport("@csstools/postcss-oklab-function/dist/convert-oklch-to-srgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def oklchToSRgb(oklchRaw: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("oklchToSRgb")(oklchRaw.asInstanceOf[js.Any]).asInstanceOf[color]
  
  type color = js.Tuple3[Double, Double, Double]
}
