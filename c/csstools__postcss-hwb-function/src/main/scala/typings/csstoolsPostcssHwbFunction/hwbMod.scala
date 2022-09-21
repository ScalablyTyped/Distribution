package typings.csstoolsPostcssHwbFunction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hwbMod {
  
  @JSImport("@csstools/postcss-hwb-function/dist/hwb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hwbToRgb(hwb: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("hwbToRgb")(hwb.asInstanceOf[js.Any]).asInstanceOf[color]
  
  type color = js.Tuple3[Double, Double, Double]
}
