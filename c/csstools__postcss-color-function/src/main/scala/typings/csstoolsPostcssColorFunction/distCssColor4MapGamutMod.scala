package typings.csstoolsPostcssColorFunction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCssColor4MapGamutMod {
  
  @JSImport("@csstools/postcss-color-function/dist/css-color-4/map-gamut", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clip(color: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("clip")(color.asInstanceOf[js.Any]).asInstanceOf[color]
  
  inline def inGamut(x: color): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inGamut")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def mapGamut(
    startOKLCH: color,
    toDestination: js.Function1[/* x */ color, color],
    fromDestination: js.Function1[/* x */ color, color]
  ): color = (^.asInstanceOf[js.Dynamic].applyDynamic("mapGamut")(startOKLCH.asInstanceOf[js.Any], toDestination.asInstanceOf[js.Any], fromDestination.asInstanceOf[js.Any])).asInstanceOf[color]
  
  type color = js.Tuple3[Double, Double, Double]
}
