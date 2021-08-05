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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): VerticalRhythm = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[VerticalRhythm]
  
  @JSImport("compass-vertical-rhythm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var baseFontSize: js.UndefOr[String] = js.undefined
    
    var baseLineHeight: js.UndefOr[Double | String] = js.undefined
    
    var defaultRhythmBorderStyle: js.UndefOr[
        solid | none | hidden | dashed | dotted | double | groove | ridge | inset | outset
      ] = js.undefined
    
    var defaultRhythmBorderWidth: js.UndefOr[String] = js.undefined
    
    var minLinePadding: js.UndefOr[String] = js.undefined
    
    var rhythmUnit: js.UndefOr[Percentsign | em | ex | ch | px | rem | vw | vh | vmin] = js.undefined
    
    var roundToNearestHalfLine: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBaseFontSize(value: String): Self = StObject.set(x, "baseFontSize", value.asInstanceOf[js.Any])
      
      inline def setBaseFontSizeUndefined: Self = StObject.set(x, "baseFontSize", js.undefined)
      
      inline def setBaseLineHeight(value: Double | String): Self = StObject.set(x, "baseLineHeight", value.asInstanceOf[js.Any])
      
      inline def setBaseLineHeightUndefined: Self = StObject.set(x, "baseLineHeight", js.undefined)
      
      inline def setDefaultRhythmBorderStyle(value: solid | none | hidden | dashed | dotted | double | groove | ridge | inset | outset): Self = StObject.set(x, "defaultRhythmBorderStyle", value.asInstanceOf[js.Any])
      
      inline def setDefaultRhythmBorderStyleUndefined: Self = StObject.set(x, "defaultRhythmBorderStyle", js.undefined)
      
      inline def setDefaultRhythmBorderWidth(value: String): Self = StObject.set(x, "defaultRhythmBorderWidth", value.asInstanceOf[js.Any])
      
      inline def setDefaultRhythmBorderWidthUndefined: Self = StObject.set(x, "defaultRhythmBorderWidth", js.undefined)
      
      inline def setMinLinePadding(value: String): Self = StObject.set(x, "minLinePadding", value.asInstanceOf[js.Any])
      
      inline def setMinLinePaddingUndefined: Self = StObject.set(x, "minLinePadding", js.undefined)
      
      inline def setRhythmUnit(value: Percentsign | em | ex | ch | px | rem | vw | vh | vmin): Self = StObject.set(x, "rhythmUnit", value.asInstanceOf[js.Any])
      
      inline def setRhythmUnitUndefined: Self = StObject.set(x, "rhythmUnit", js.undefined)
      
      inline def setRoundToNearestHalfLine(value: Boolean): Self = StObject.set(x, "roundToNearestHalfLine", value.asInstanceOf[js.Any])
      
      inline def setRoundToNearestHalfLineUndefined: Self = StObject.set(x, "roundToNearestHalfLine", js.undefined)
    }
  }
  
  @js.native
  trait VerticalRhythm extends StObject {
    
    def adjustFontSizeTo(toSize: String): VerticalRhythmStyles = js.native
    def adjustFontSizeTo(toSize: String, lines: Double): VerticalRhythmStyles = js.native
    def adjustFontSizeTo(toSize: String, lines: Double, fromSize: String): VerticalRhythmStyles = js.native
    def adjustFontSizeTo(toSize: String, lines: Null, fromSize: String): VerticalRhythmStyles = js.native
    def adjustFontSizeTo(toSize: String, lines: Unit, fromSize: String): VerticalRhythmStyles = js.native
    @JSName("adjustFontSizeTo")
    def adjustFontSizeTo_auto(toSize: String, lines: auto): VerticalRhythmStyles = js.native
    @JSName("adjustFontSizeTo")
    def adjustFontSizeTo_auto(toSize: String, lines: auto, fromSize: String): VerticalRhythmStyles = js.native
    
    def establishBaseline(): VerticalRhythmStyles = js.native
    
    def linesForFontSize(fontSize: String): Double = js.native
    
    def rhythm(): Double = js.native
    def rhythm(lines: Double): Double = js.native
    def rhythm(lines: Double, fontSize: String): Double = js.native
    def rhythm(lines: Double, fontSize: String, offset: Double): Double = js.native
    def rhythm(lines: Double, fontSize: Unit, offset: Double): Double = js.native
    def rhythm(lines: Unit, fontSize: String): Double = js.native
    def rhythm(lines: Unit, fontSize: String, offset: Double): Double = js.native
    def rhythm(lines: Unit, fontSize: Unit, offset: Double): Double = js.native
  }
  
  trait VerticalRhythmStyles extends StObject {
    
    var fontSize: String
    
    var lineHeight: String
  }
  object VerticalRhythmStyles {
    
    inline def apply(fontSize: String, lineHeight: String): VerticalRhythmStyles = {
      val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerticalRhythmStyles]
    }
    
    extension [Self <: VerticalRhythmStyles](x: Self) {
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    }
  }
}
