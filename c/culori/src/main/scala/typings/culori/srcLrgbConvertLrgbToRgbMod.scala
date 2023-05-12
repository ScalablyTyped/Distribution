package typings.culori

import typings.culori.anon.OmitLrgbmode
import typings.culori.srcCommonMod.Color
import typings.culori.srcCommonMod.FindColorByMode
import typings.culori.srcCommonMod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLrgbConvertLrgbToRgbMod {
  
  @JSImport("culori/src/lrgb/convertLrgbToRgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[M /* <: Mode */](color: OmitLrgbmode): FindColorByMode[M, Color] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[FindColorByMode[M, Color]]
  inline def default[M /* <: Mode */](color: OmitLrgbmode, mode: M): FindColorByMode[M, Color] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[FindColorByMode[M, Color]]
}
