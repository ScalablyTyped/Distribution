package typings.csstoolsCssColorParser

import typings.csstoolsCssColorParser.csstoolsCssColorParserBooleans.`false`
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFunctionsHueNormalizeChannelValueMod {
  
  @JSImport("@csstools/css-color-parser/dist/functions/hue-normalize-channel-value", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeHue(token: CSSToken): TokenNumber | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeHue")(token.asInstanceOf[js.Any]).asInstanceOf[TokenNumber | `false`]
}
