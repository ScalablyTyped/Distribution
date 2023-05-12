package typings.culori

import typings.culori.srcCommonMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRgbParseHexMod {
  
  @JSImport("culori/src/rgb/parseHex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(color: String): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[Color]
}
