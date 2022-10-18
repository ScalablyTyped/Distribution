package typings.csstoolsPostcssOklabFunction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConvertOklabToSrgbMod {
  
  @JSImport("@csstools/postcss-oklab-function/dist/convert-oklab-to-srgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def oklabToSRgb(oklabRaw: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("oklabToSRgb")(oklabRaw.asInstanceOf[js.Any]).asInstanceOf[color]
  
  type color = js.Tuple3[Double, Double, Double]
}
