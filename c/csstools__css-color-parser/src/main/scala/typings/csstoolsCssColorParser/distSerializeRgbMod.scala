package typings.csstoolsCssColorParser

import typings.csstoolsColorHelpers.distTypesColorMod.Color
import typings.csstoolsCssColorParser.distColorDataMod.ColorData
import typings.csstoolsCssParserAlgorithms.mod.FunctionNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSerializeRgbMod {
  
  @JSImport("@csstools/css-color-parser/dist/serialize/rgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def XYZD50ToSRGBGamut(color: Color): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("XYZ_D50_to_sRGB_Gamut")(color.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  inline def serializeRGB(color: ColorData): FunctionNode = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeRGB")(color.asInstanceOf[js.Any]).asInstanceOf[FunctionNode]
  inline def serializeRGB(color: ColorData, gamutMapping: Boolean): FunctionNode = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeRGB")(color.asInstanceOf[js.Any], gamutMapping.asInstanceOf[js.Any])).asInstanceOf[FunctionNode]
}
