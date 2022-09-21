package typings.csstoolsPostcssColorFunction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertCieXyz65ToSrgbMod {
  
  @JSImport("@csstools/postcss-color-function/dist/convert-cie-xyz-65-to-srgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cieXyz65ToSRgb(xyz: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("cieXyz65ToSRgb")(xyz.asInstanceOf[js.Any]).asInstanceOf[color]
  
  type color = js.Tuple3[Double, Double, Double]
}
