package typings.csstoolsPostcssColorFunction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConvertCieXyz50ToSrgbMod {
  
  @JSImport("@csstools/postcss-color-function/dist/convert-cie-xyz-50-to-srgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cieXyz50ToSRgb(xyz: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("cieXyz50ToSRgb")(xyz.asInstanceOf[js.Any]).asInstanceOf[color]
  
  type color = js.Tuple3[Double, Double, Double]
}
