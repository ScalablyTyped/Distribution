package typings.compassVerticalRhythm

import typings.compassVerticalRhythm.compassVerticalRhythmStrings.Percentsign
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.auto
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.ch
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.dashed
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.dotted
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.double
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.em
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.ex
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.groove
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.hidden
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.inset
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.none
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.outset
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.px
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.rem
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.ridge
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.solid
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.vh
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.vmin
import typings.compassVerticalRhythm.compassVerticalRhythmStrings.vw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("compass-vertical-rhythm", JSImport.Namespace)
  @js.native
  def apply(options: Options): VerticalRhythm = js.native
  
  @js.native
  trait Options extends StObject {
    
    var baseFontSize: js.UndefOr[String] = js.native
    
    var baseLineHeight: js.UndefOr[Double | String] = js.native
    
    var defaultRhythmBorderStyle: js.UndefOr[
        solid | none | hidden | dashed | dotted | double | groove | ridge | inset | outset
      ] = js.native
    
    var defaultRhythmBorderWidth: js.UndefOr[String] = js.native
    
    var minLinePadding: js.UndefOr[String] = js.native
    
    var rhythmUnit: js.UndefOr[Percentsign | em | ex | ch | px | rem | vw | vh | vmin] = js.native
    
    var roundToNearestHalfLine: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseFontSize(value: String): Self = StObject.set(x, "baseFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseFontSizeUndefined: Self = StObject.set(x, "baseFontSize", js.undefined)
      
      @scala.inline
      def setBaseLineHeight(value: Double | String): Self = StObject.set(x, "baseLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseLineHeightUndefined: Self = StObject.set(x, "baseLineHeight", js.undefined)
      
      @scala.inline
      def setDefaultRhythmBorderStyle(value: solid | none | hidden | dashed | dotted | double | groove | ridge | inset | outset): Self = StObject.set(x, "defaultRhythmBorderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRhythmBorderStyleUndefined: Self = StObject.set(x, "defaultRhythmBorderStyle", js.undefined)
      
      @scala.inline
      def setDefaultRhythmBorderWidth(value: String): Self = StObject.set(x, "defaultRhythmBorderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRhythmBorderWidthUndefined: Self = StObject.set(x, "defaultRhythmBorderWidth", js.undefined)
      
      @scala.inline
      def setMinLinePadding(value: String): Self = StObject.set(x, "minLinePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLinePaddingUndefined: Self = StObject.set(x, "minLinePadding", js.undefined)
      
      @scala.inline
      def setRhythmUnit(value: Percentsign | em | ex | ch | px | rem | vw | vh | vmin): Self = StObject.set(x, "rhythmUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRhythmUnitUndefined: Self = StObject.set(x, "rhythmUnit", js.undefined)
      
      @scala.inline
      def setRoundToNearestHalfLine(value: Boolean): Self = StObject.set(x, "roundToNearestHalfLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundToNearestHalfLineUndefined: Self = StObject.set(x, "roundToNearestHalfLine", js.undefined)
    }
  }
  
  @js.native
  trait VerticalRhythm extends StObject {
    
    def adjustFontSizeTo(toSize: String): VerticalRhythmStyles = js.native
    def adjustFontSizeTo(toSize: String, lines: js.UndefOr[scala.Nothing], fromSize: String): VerticalRhythmStyles = js.native
    def adjustFontSizeTo(toSize: String, lines: Double): VerticalRhythmStyles = js.native
    def adjustFontSizeTo(toSize: String, lines: Double, fromSize: String): VerticalRhythmStyles = js.native
    def adjustFontSizeTo(toSize: String, lines: Null, fromSize: String): VerticalRhythmStyles = js.native
    @JSName("adjustFontSizeTo")
    def adjustFontSizeTo_auto(toSize: String, lines: auto): VerticalRhythmStyles = js.native
    @JSName("adjustFontSizeTo")
    def adjustFontSizeTo_auto(toSize: String, lines: auto, fromSize: String): VerticalRhythmStyles = js.native
    
    def establishBaseline(): VerticalRhythmStyles = js.native
    
    def linesForFontSize(fontSize: String): Double = js.native
    
    def rhythm(): Double = js.native
    def rhythm(lines: js.UndefOr[scala.Nothing], fontSize: js.UndefOr[scala.Nothing], offset: Double): Double = js.native
    def rhythm(lines: js.UndefOr[scala.Nothing], fontSize: String): Double = js.native
    def rhythm(lines: js.UndefOr[scala.Nothing], fontSize: String, offset: Double): Double = js.native
    def rhythm(lines: Double): Double = js.native
    def rhythm(lines: Double, fontSize: js.UndefOr[scala.Nothing], offset: Double): Double = js.native
    def rhythm(lines: Double, fontSize: String): Double = js.native
    def rhythm(lines: Double, fontSize: String, offset: Double): Double = js.native
  }
  
  @js.native
  trait VerticalRhythmStyles extends StObject {
    
    var fontSize: String = js.native
    
    var lineHeight: String = js.native
  }
  object VerticalRhythmStyles {
    
    @scala.inline
    def apply(fontSize: String, lineHeight: String): VerticalRhythmStyles = {
      val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerticalRhythmStyles]
    }
    
    @scala.inline
    implicit class VerticalRhythmStylesMutableBuilder[Self <: VerticalRhythmStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    }
  }
}
