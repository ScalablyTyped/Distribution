package typings.csstoolsCssColorParser

import typings.csstoolsCssColorParser.csstoolsCssColorParserBooleans.`false`
import typings.csstoolsCssColorParser.distColorDataMod.ColorData
import typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag
import typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation
import typings.csstoolsCssColorParser.distFunctionsNormalizeChannelValuesMod.normalizeChannelValuesFn
import typings.csstoolsCssParserAlgorithms.mod.FunctionNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFunctionsThreeChannelLegacySyntaxMod {
  
  @JSImport("@csstools/css-color-parser/dist/functions/three-channel-legacy-syntax", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def threeChannelLegacySyntax(
    colorFunctionNode: FunctionNode,
    normalizeChannelValues: normalizeChannelValuesFn,
    colorNotation: ColorNotation,
    syntaxFlags: js.Array[SyntaxFlag]
  ): ColorData | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("threeChannelLegacySyntax")(colorFunctionNode.asInstanceOf[js.Any], normalizeChannelValues.asInstanceOf[js.Any], colorNotation.asInstanceOf[js.Any], syntaxFlags.asInstanceOf[js.Any])).asInstanceOf[ColorData | `false`]
}
