package typings.culori

import typings.culori.anon.OmitLabmode
import typings.culori.culoriStrings.dlch
import typings.culori.culoriStrings.lch
import typings.culori.culoriStrings.lch65
import typings.culori.culoriStrings.oklch
import typings.culori.srcCommonMod.Color
import typings.culori.srcCommonMod.FindColorByMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLchConvertLabToLchMod {
  
  @JSImport("culori/src/lch/convertLabToLch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[M /* <: dlch | lch65 | oklch | lch */](color: OmitLabmode): FindColorByMode[M, Color] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[FindColorByMode[M, Color]]
  inline def default[M /* <: dlch | lch65 | oklch | lch */](color: OmitLabmode, mode: M): FindColorByMode[M, Color] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[FindColorByMode[M, Color]]
}
