package typings.csstoolsPostcssColorFunction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConvertRec2020ToSrgbMod {
  
  @JSImport("@csstools/postcss-color-function/dist/convert-rec2020-to-srgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rec2020ToSRgb(rec: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("rec2020ToSRgb")(rec.asInstanceOf[js.Any]).asInstanceOf[color]
  
  type color = js.Tuple3[Double, Double, Double]
}
