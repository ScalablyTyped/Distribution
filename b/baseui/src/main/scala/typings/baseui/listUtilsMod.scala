package typings.baseui

import typings.baseui.baseuiNumbers.`16`
import typings.baseui.baseuiNumbers.`24`
import typings.baseui.baseuiNumbers.`36`
import typings.baseui.listTypesMod.ArtworkSizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listUtilsMod {
  
  @JSImport("baseui/list/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def artworkSizeToValue(artworkSize: ArtworkSizes, isSublist: Boolean): `16` | `24` | `36` = (^.asInstanceOf[js.Dynamic].applyDynamic("artworkSizeToValue")(artworkSize.asInstanceOf[js.Any], isSublist.asInstanceOf[js.Any])).asInstanceOf[`16` | `24` | `36`]
}
