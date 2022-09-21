package typings.csstoolsPostcssColorFunction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertDisplayP3ToSrgbMod {
  
  @JSImport("@csstools/postcss-color-function/dist/convert-display-p3-to-srgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def displayP3ToSRgb(displayP3: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("displayP3ToSRgb")(displayP3.asInstanceOf[js.Any]).asInstanceOf[color]
  
  type color = js.Tuple3[Double, Double, Double]
}
