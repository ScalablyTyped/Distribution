package typings.csstoolsCssColorParser

import typings.csstoolsCssColorParser.csstoolsCssColorParserBooleans.`false`
import typings.csstoolsCssColorParser.distColorDataMod.ColorData
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFunctionsRgbNormalizeChannelValuesMod {
  
  @JSImport("@csstools/css-color-parser/dist/functions/rgb-normalize-channel-values", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeLegacySRGBChannelValues(tokens: js.Array[CSSToken], colorData: ColorData): js.Array[TokenNumber] | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize_legacy_sRGB_ChannelValues")(tokens.asInstanceOf[js.Any], colorData.asInstanceOf[js.Any])).asInstanceOf[js.Array[TokenNumber] | `false`]
  
  inline def normalizeModernSRGBChannelValues(tokens: js.Array[CSSToken], colorData: ColorData): js.Array[TokenNumber] | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize_modern_sRGB_ChannelValues")(tokens.asInstanceOf[js.Any], colorData.asInstanceOf[js.Any])).asInstanceOf[js.Array[TokenNumber] | `false`]
}
