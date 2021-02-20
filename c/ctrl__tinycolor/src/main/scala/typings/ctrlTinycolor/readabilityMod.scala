package typings.ctrlTinycolor

import typings.ctrlTinycolor.ctrlTinycolorStrings.AA
import typings.ctrlTinycolor.ctrlTinycolorStrings.AAA
import typings.ctrlTinycolor.ctrlTinycolorStrings.large
import typings.ctrlTinycolor.ctrlTinycolorStrings.small
import typings.ctrlTinycolor.distMod.ColorInput
import typings.ctrlTinycolor.distMod.TinyColor_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readabilityMod {
  
  @JSImport("@ctrl/tinycolor/dist/readability", "isReadable")
  @js.native
  def isReadable(color1: ColorInput, color2: ColorInput): Boolean = js.native
  @JSImport("@ctrl/tinycolor/dist/readability", "isReadable")
  @js.native
  def isReadable(color1: ColorInput, color2: ColorInput, wcag2: WCAG2Parms): Boolean = js.native
  
  @JSImport("@ctrl/tinycolor/dist/readability", "mostReadable")
  @js.native
  def mostReadable(baseColor: ColorInput, colorList: js.Array[ColorInput]): TinyColor_ | Null = js.native
  @JSImport("@ctrl/tinycolor/dist/readability", "mostReadable")
  @js.native
  def mostReadable(baseColor: ColorInput, colorList: js.Array[ColorInput], args: WCAG2FallbackParms): TinyColor_ | Null = js.native
  
  @JSImport("@ctrl/tinycolor/dist/readability", "readability")
  @js.native
  def readability(color1: ColorInput, color2: ColorInput): Double = js.native
  
  @js.native
  trait WCAG2FallbackParms extends WCAG2Parms {
    
    var includeFallbackColors: js.UndefOr[Boolean] = js.native
  }
  object WCAG2FallbackParms {
    
    @scala.inline
    def apply(): WCAG2FallbackParms = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WCAG2FallbackParms]
    }
    
    @scala.inline
    implicit class WCAG2FallbackParmsMutableBuilder[Self <: WCAG2FallbackParms] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeFallbackColors(value: Boolean): Self = StObject.set(x, "includeFallbackColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeFallbackColorsUndefined: Self = StObject.set(x, "includeFallbackColors", js.undefined)
    }
  }
  
  @js.native
  trait WCAG2Parms extends StObject {
    
    var level: js.UndefOr[AA | AAA] = js.native
    
    var size: js.UndefOr[large | small] = js.native
  }
  object WCAG2Parms {
    
    @scala.inline
    def apply(): WCAG2Parms = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WCAG2Parms]
    }
    
    @scala.inline
    implicit class WCAG2ParmsMutableBuilder[Self <: WCAG2Parms] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: AA | AAA): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setSize(value: large | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
