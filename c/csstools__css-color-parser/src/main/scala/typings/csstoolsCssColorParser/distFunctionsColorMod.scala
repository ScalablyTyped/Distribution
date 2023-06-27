package typings.csstoolsCssColorParser

import typings.csstoolsCssColorParser.csstoolsCssColorParserBooleans.`false`
import typings.csstoolsCssColorParser.distColorDataMod.ColorData
import typings.csstoolsCssColorParser.distColorParserMod.ColorParser
import typings.csstoolsCssParserAlgorithms.mod.FunctionNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFunctionsColorMod {
  
  @JSImport("@csstools/css-color-parser/dist/functions/color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def color(colorFunctionNode: FunctionNode, colorParser: ColorParser): ColorData | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("color")(colorFunctionNode.asInstanceOf[js.Any], colorParser.asInstanceOf[js.Any])).asInstanceOf[ColorData | `false`]
}
