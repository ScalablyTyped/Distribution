package typings.csstoolsCssColorParser

import typings.csstoolsCssColorParser.csstoolsCssColorParserBooleans.`false`
import typings.csstoolsCssColorParser.distColorDataMod.ColorData
import typings.csstoolsCssColorParser.distColorParserMod.ColorParser
import typings.csstoolsCssParserAlgorithms.mod.FunctionNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFunctionsOklabMod {
  
  @JSImport("@csstools/css-color-parser/dist/functions/oklab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def oklab(oklabNode: FunctionNode, colorParser: ColorParser): ColorData | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("oklab")(oklabNode.asInstanceOf[js.Any], colorParser.asInstanceOf[js.Any])).asInstanceOf[ColorData | `false`]
}
