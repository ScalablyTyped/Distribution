package typings.csstoolsCssColorParser

import typings.csstoolsCssColorParser.csstoolsCssColorParserBooleans.`false`
import typings.csstoolsCssColorParser.distColorDataMod.ColorData
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFunctionsHexMod {
  
  @JSImport("@csstools/css-color-parser/dist/functions/hex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hex(hexToken: TokenHash): ColorData | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("hex")(hexToken.asInstanceOf[js.Any]).asInstanceOf[ColorData | `false`]
}
