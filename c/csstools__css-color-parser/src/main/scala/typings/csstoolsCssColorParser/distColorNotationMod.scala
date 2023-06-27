package typings.csstoolsCssColorParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distColorNotationMod {
  
  @js.native
  sealed trait ColorNotation extends StObject
  @JSImport("@csstools/css-color-parser/dist/color-notation", "ColorNotation")
  @js.native
  object ColorNotation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ColorNotation & String] = js.native
    
    @js.native
    sealed trait A98_RGB
      extends StObject
         with ColorNotation
    /* "a98-rgb" */ val A98_RGB: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.A98_RGB & String = js.native
    
    @js.native
    sealed trait Display_P3
      extends StObject
         with ColorNotation
    /* "display-p3" */ val Display_P3: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.Display_P3 & String = js.native
    
    @js.native
    sealed trait HEX
      extends StObject
         with ColorNotation
    /* "hex" */ val HEX: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.HEX & String = js.native
    
    @js.native
    sealed trait HSL
      extends StObject
         with ColorNotation
    /* "hsl" */ val HSL: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.HSL & String = js.native
    
    @js.native
    sealed trait HWB
      extends StObject
         with ColorNotation
    /* "hwb" */ val HWB: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.HWB & String = js.native
    
    @js.native
    sealed trait LCH
      extends StObject
         with ColorNotation
    /* "lch" */ val LCH: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.LCH & String = js.native
    
    @js.native
    sealed trait Lab
      extends StObject
         with ColorNotation
    /* "lab" */ val Lab: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.Lab & String = js.native
    
    @js.native
    sealed trait Linear_sRGB
      extends StObject
         with ColorNotation
    /* "srgb-linear" */ val Linear_sRGB: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.Linear_sRGB & String = js.native
    
    @js.native
    sealed trait OKLCH
      extends StObject
         with ColorNotation
    /* "oklch" */ val OKLCH: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.OKLCH & String = js.native
    
    @js.native
    sealed trait OKLab
      extends StObject
         with ColorNotation
    /* "oklab" */ val OKLab: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.OKLab & String = js.native
    
    @js.native
    sealed trait ProPhoto_RGB
      extends StObject
         with ColorNotation
    /* "prophoto-rgb" */ val ProPhoto_RGB: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.ProPhoto_RGB & String = js.native
    
    @js.native
    sealed trait RGB
      extends StObject
         with ColorNotation
    /* "rgb" */ val RGB: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.RGB & String = js.native
    
    @js.native
    sealed trait Rec2020
      extends StObject
         with ColorNotation
    /* "rec2020" */ val Rec2020: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.Rec2020 & String = js.native
    
    @js.native
    sealed trait XYZ_D50
      extends StObject
         with ColorNotation
    /* "xyz-d50" */ val XYZ_D50: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.XYZ_D50 & String = js.native
    
    @js.native
    sealed trait XYZ_D65
      extends StObject
         with ColorNotation
    /* "xyz-d65" */ val XYZ_D65: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.XYZ_D65 & String = js.native
    
    @js.native
    sealed trait sRGB
      extends StObject
         with ColorNotation
    /* "srgb" */ val sRGB: typings.csstoolsCssColorParser.distColorNotationMod.ColorNotation.sRGB & String = js.native
  }
}
