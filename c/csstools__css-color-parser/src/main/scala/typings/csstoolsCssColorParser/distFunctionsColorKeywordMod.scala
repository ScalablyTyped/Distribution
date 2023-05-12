package typings.csstoolsCssColorParser

import typings.csstoolsCssColorParser.csstoolsCssColorParserBooleans.`false`
import typings.csstoolsCssColorParser.distColorDataMod.ColorData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFunctionsColorKeywordMod {
  
  @JSImport("@csstools/css-color-parser/dist/functions/color-keyword", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def colorKeyword(name: String): ColorData | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("colorKeyword")(name.asInstanceOf[js.Any]).asInstanceOf[ColorData | `false`]
}
