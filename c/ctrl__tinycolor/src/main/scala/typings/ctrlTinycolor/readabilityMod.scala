package typings.ctrlTinycolor

import typings.ctrlTinycolor.ctrlTinycolorStrings.AA
import typings.ctrlTinycolor.ctrlTinycolorStrings.AAA
import typings.ctrlTinycolor.ctrlTinycolorStrings.large
import typings.ctrlTinycolor.ctrlTinycolorStrings.small
import typings.ctrlTinycolor.distMod.ColorInput
import typings.ctrlTinycolor.distMod.TinyColor_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readabilityMod {
  
  @JSImport("@ctrl/tinycolor/dist/readability", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isReadable(color1: ColorInput, color2: ColorInput): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReadable")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isReadable(color1: ColorInput, color2: ColorInput, wcag2: WCAG2Parms): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReadable")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any], wcag2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def mostReadable(baseColor: ColorInput, colorList: js.Array[ColorInput]): TinyColor_ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("mostReadable")(baseColor.asInstanceOf[js.Any], colorList.asInstanceOf[js.Any])).asInstanceOf[TinyColor_ | Null]
  @scala.inline
  def mostReadable(baseColor: ColorInput, colorList: js.Array[ColorInput], args: WCAG2FallbackParms): TinyColor_ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("mostReadable")(baseColor.asInstanceOf[js.Any], colorList.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[TinyColor_ | Null]
  
  @scala.inline
  def readability(color1: ColorInput, color2: ColorInput): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readability")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait WCAG2FallbackParms
    extends StObject
       with WCAG2Parms {
    
    var includeFallbackColors: js.UndefOr[Boolean] = js.undefined
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
  
  trait WCAG2Parms extends StObject {
    
    var level: js.UndefOr[AA | AAA] = js.undefined
    
    var size: js.UndefOr[large | small] = js.undefined
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
