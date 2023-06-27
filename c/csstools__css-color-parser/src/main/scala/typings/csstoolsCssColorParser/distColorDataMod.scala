package typings.csstoolsCssColorParser

import typings.csstoolsColorHelpers.distTypesColorMod.Color
import typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation
import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenDimension
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenNumber
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.TokenPercentage
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distColorDataMod {
  
  @JSImport("@csstools/css-color-parser/dist/color-data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait SyntaxFlag extends StObject
  @JSImport("@csstools/css-color-parser/dist/color-data", "SyntaxFlag")
  @js.native
  object SyntaxFlag extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SyntaxFlag & String] = js.native
    
    @js.native
    sealed trait ColorKeyword
      extends StObject
         with SyntaxFlag
    /* "color-keyword" */ val ColorKeyword: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.ColorKeyword & String = js.native
    
    @js.native
    sealed trait ColorMix
      extends StObject
         with SyntaxFlag
    /* "color-mix" */ val ColorMix: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.ColorMix & String = js.native
    
    @js.native
    sealed trait HasAlpha
      extends StObject
         with SyntaxFlag
    /* "has-alpha" */ val HasAlpha: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.HasAlpha & String = js.native
    
    @js.native
    sealed trait HasDimensionValues
      extends StObject
         with SyntaxFlag
    /* "has-dimension-values" */ val HasDimensionValues: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.HasDimensionValues & String = js.native
    
    @js.native
    sealed trait HasNoneKeywords
      extends StObject
         with SyntaxFlag
    /* "has-none-keywords" */ val HasNoneKeywords: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.HasNoneKeywords & String = js.native
    
    @js.native
    sealed trait HasNumberValues
      extends StObject
         with SyntaxFlag
    /* "has-number-values" */ val HasNumberValues: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.HasNumberValues & String = js.native
    
    @js.native
    sealed trait HasPercentageAlpha
      extends StObject
         with SyntaxFlag
    /* "has-percentage-alpha" */ val HasPercentageAlpha: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.HasPercentageAlpha & String = js.native
    
    @js.native
    sealed trait HasPercentageValues
      extends StObject
         with SyntaxFlag
    /* "has-percentage-values" */ val HasPercentageValues: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.HasPercentageValues & String = js.native
    
    @js.native
    sealed trait HasVariableAlpha
      extends StObject
         with SyntaxFlag
    /* "has-variable-alpha" */ val HasVariableAlpha: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.HasVariableAlpha & String = js.native
    
    @js.native
    sealed trait Hex
      extends StObject
         with SyntaxFlag
    /* "hex" */ val Hex: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.Hex & String = js.native
    
    @js.native
    sealed trait LegacyHSL
      extends StObject
         with SyntaxFlag
    /* "legacy-hsl" */ val LegacyHSL: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.LegacyHSL & String = js.native
    
    @js.native
    sealed trait LegacyRGB
      extends StObject
         with SyntaxFlag
    /* "legacy-rgb" */ val LegacyRGB: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.LegacyRGB & String = js.native
    
    @js.native
    sealed trait NamedColor
      extends StObject
         with SyntaxFlag
    /* "named-color" */ val NamedColor: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.NamedColor & String = js.native
    
    @js.native
    sealed trait RelativeColorSyntax
      extends StObject
         with SyntaxFlag
    /* "relative-color-syntax" */ val RelativeColorSyntax: typings.csstoolsCssColorParser.distColorDataMod.SyntaxFlag.RelativeColorSyntax & String = js.native
  }
  
  inline def colorDataFitsRGBGamut(x: ColorData): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("colorDataFitsRGB_Gamut")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def colorDataTo(colorData: ColorData, toNotation: ColorNotation): ColorData = (^.asInstanceOf[js.Dynamic].applyDynamic("colorDataTo")(colorData.asInstanceOf[js.Any], toNotation.asInstanceOf[js.Any])).asInstanceOf[ColorData]
  
  inline def colorDataToXYZD50(colorData: ColorData): ColorData = ^.asInstanceOf[js.Dynamic].applyDynamic("colorData_to_XYZ_D50")(colorData.asInstanceOf[js.Any]).asInstanceOf[ColorData]
  
  inline def convertPowerlessComponentsToMissingComponents(a: Color, colorNotation: ColorNotation): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPowerlessComponentsToMissingComponents")(a.asInstanceOf[js.Any], colorNotation.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  inline def fillInMissingComponents(a: Color, b: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fillInMissingComponents")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  inline def noneToZeroInRelativeColorDataChannels(x: Map[String, TokenNumber | TokenPercentage | TokenDimension]): Map[String, TokenNumber | TokenPercentage | TokenDimension] = ^.asInstanceOf[js.Dynamic].applyDynamic("noneToZeroInRelativeColorDataChannels")(x.asInstanceOf[js.Any]).asInstanceOf[Map[String, TokenNumber | TokenPercentage | TokenDimension]]
  
  inline def normalizeRelativeColorDataChannels(x: ColorData): Map[String, TokenNumber | TokenPercentage | TokenDimension] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRelativeColorDataChannels")(x.asInstanceOf[js.Any]).asInstanceOf[Map[String, TokenNumber | TokenPercentage | TokenDimension]]
  
  trait ColorData extends StObject {
    
    var alpha: Double | ComponentValue
    
    var channels: Color
    
    var colorNotation: ColorNotation
    
    var syntaxFlags: Set[SyntaxFlag]
  }
  object ColorData {
    
    inline def apply(
      alpha: Double | ComponentValue,
      channels: Color,
      colorNotation: ColorNotation,
      syntaxFlags: Set[SyntaxFlag]
    ): ColorData = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], colorNotation = colorNotation.asInstanceOf[js.Any], syntaxFlags = syntaxFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorData] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double | ComponentValue): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setChannels(value: Color): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setColorNotation(value: ColorNotation): Self = StObject.set(x, "colorNotation", value.asInstanceOf[js.Any])
      
      inline def setSyntaxFlags(value: Set[SyntaxFlag]): Self = StObject.set(x, "syntaxFlags", value.asInstanceOf[js.Any])
    }
  }
}
