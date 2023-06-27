package typings.csstoolsCssColorParser

import typings.csstoolsCssColorParser.distColorDataMod.ColorData
import typings.csstoolsCssParserAlgorithms.mod.FunctionNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSerializeP3Mod {
  
  @JSImport("@csstools/css-color-parser/dist/serialize/p3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def serializeP3(color: ColorData): FunctionNode = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeP3")(color.asInstanceOf[js.Any]).asInstanceOf[FunctionNode]
  inline def serializeP3(color: ColorData, gamutMapping: Boolean): FunctionNode = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeP3")(color.asInstanceOf[js.Any], gamutMapping.asInstanceOf[js.Any])).asInstanceOf[FunctionNode]
}
