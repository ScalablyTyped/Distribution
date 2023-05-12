package typings.csstoolsCssColorParser

import typings.csstoolsCssColorParser.csstoolsCssColorParserBooleans.`false`
import typings.csstoolsCssColorParser.distColorDataMod.ColorData
import typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssParserAlgorithms.mod.FunctionNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@csstools/css-color-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@csstools/css-color-parser", "ColorNotation")
  @js.native
  object ColorNotation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation & String] = js.native
    
    /* "a98-rgb" */ val A98_RGB: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.A98_RGB & String = js.native
    
    /* "display-p3" */ val Display_P3: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.Display_P3 & String = js.native
    
    /* "hex" */ val HEX: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.HEX & String = js.native
    
    /* "hsl" */ val HSL: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.HSL & String = js.native
    
    /* "hwb" */ val HWB: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.HWB & String = js.native
    
    /* "lch" */ val LCH: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.LCH & String = js.native
    
    /* "lab" */ val Lab: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.Lab & String = js.native
    
    /* "srgb-linear" */ val Linear_RGB: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.Linear_RGB & String = js.native
    
    /* "oklch" */ val OKLCH: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.OKLCH & String = js.native
    
    /* "oklab" */ val OKLab: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.OKLab & String = js.native
    
    /* "prophoto-rgb" */ val ProPhoto_RGB: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.ProPhoto_RGB & String = js.native
    
    /* "rgb" */ val RGB: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.RGB & String = js.native
    
    /* "rec2020" */ val Rec2020: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.Rec2020 & String = js.native
    
    /* "xyz-d50" */ val XYZ_D50: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.XYZ_D50 & String = js.native
    
    /* "xyz-d65" */ val XYZ_D65: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.XYZ_D65 & String = js.native
  }
  
  @JSImport("@csstools/css-color-parser", "SyntaxFlag")
  @js.native
  object SyntaxFlag extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag & String] = js.native
    
    /* "color-keyword" */ val ColorKeyword: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.ColorKeyword & String = js.native
    
    /* "color-mix" */ val ColorMix: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.ColorMix & String = js.native
    
    /* "has-alpha" */ val HasAlpha: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.HasAlpha & String = js.native
    
    /* "has-dimension-values" */ val HasDimensionValues: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.HasDimensionValues & String = js.native
    
    /* "has-none-keywords" */ val HasNoneKeywords: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.HasNoneKeywords & String = js.native
    
    /* "has-number-values" */ val HasNumberValues: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.HasNumberValues & String = js.native
    
    /* "has-percentage-alpha" */ val HasPercentageAlpha: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.HasPercentageAlpha & String = js.native
    
    /* "has-percentage-values" */ val HasPercentageValues: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.HasPercentageValues & String = js.native
    
    /* "has-variable-alpha" */ val HasVariableAlpha: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.HasVariableAlpha & String = js.native
    
    /* "hex" */ val Hex: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.Hex & String = js.native
    
    /* "legacy-hsl" */ val LegacyHSL: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.LegacyHSL & String = js.native
    
    /* "legacy-rgb" */ val LegacyRGB: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.LegacyRGB & String = js.native
    
    /* "named-color" */ val NamedColor: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.NamedColor & String = js.native
    
    /* "relative-color-syntax" */ val RelativeColorSyntax: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.RelativeColorSyntax & String = js.native
  }
  
  inline def color(colorNode: ComponentValue): ColorData | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(colorNode.asInstanceOf[js.Any]).asInstanceOf[ColorData | `false`]
  
  inline def colorDataFitsRGBGamut(x: ColorData): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("colorDataFitsRGB_Gamut")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def colorDataTo(colorData: ColorData, toNotation: ColorNotation): ColorData = (^.asInstanceOf[js.Dynamic].applyDynamic("colorDataTo")(colorData.asInstanceOf[js.Any], toNotation.asInstanceOf[js.Any])).asInstanceOf[ColorData]
  
  inline def serializeP3(color: ColorData): FunctionNode = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeP3")(color.asInstanceOf[js.Any]).asInstanceOf[FunctionNode]
  inline def serializeP3(color: ColorData, gamutMapping: Boolean): FunctionNode = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeP3")(color.asInstanceOf[js.Any], gamutMapping.asInstanceOf[js.Any])).asInstanceOf[FunctionNode]
  
  inline def serializeRGB(color: ColorData): FunctionNode = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeRGB")(color.asInstanceOf[js.Any]).asInstanceOf[FunctionNode]
  inline def serializeRGB(color: ColorData, gamutMapping: Boolean): FunctionNode = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeRGB")(color.asInstanceOf[js.Any], gamutMapping.asInstanceOf[js.Any])).asInstanceOf[FunctionNode]
}
