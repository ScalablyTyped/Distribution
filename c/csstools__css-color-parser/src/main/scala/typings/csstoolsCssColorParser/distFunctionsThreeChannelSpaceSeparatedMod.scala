package typings.csstoolsCssColorParser

import typings.csstoolsCssColorParser.csstoolsCssColorParserBooleans.`false`
import typings.csstoolsCssColorParser.distColorDataMod.ColorData
import typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag
import typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation
import typings.csstoolsCssColorParser.distColorParserMod.ColorParser
import typings.csstoolsCssColorParser.distFunctionsNormalizeChannelValuesMod.normalizeChannelValuesFn
import typings.csstoolsCssParserAlgorithms.mod.FunctionNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFunctionsThreeChannelSpaceSeparatedMod {
  
  @JSImport("@csstools/css-color-parser/dist/functions/three-channel-space-separated", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def threeChannelSpaceSeparated(
    colorFunctionNode: FunctionNode,
    normalizeChannelValues: normalizeChannelValuesFn,
    colorNotation: ColorNotation,
    syntaxFlags: js.Array[SyntaxFlag],
    colorParser: ColorParser
  ): ColorData | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("threeChannelSpaceSeparated")(colorFunctionNode.asInstanceOf[js.Any], normalizeChannelValues.asInstanceOf[js.Any], colorNotation.asInstanceOf[js.Any], syntaxFlags.asInstanceOf[js.Any], colorParser.asInstanceOf[js.Any])).asInstanceOf[ColorData | `false`]
}
