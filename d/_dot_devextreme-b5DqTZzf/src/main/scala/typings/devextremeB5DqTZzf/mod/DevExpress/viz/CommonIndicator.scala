package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.anon.CustomizeText
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.bottom
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.left
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.right
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonIndicator extends StObject {
  
  /**
    * Specifies the length of an arrow for the indicator of the textCloud type in pixels.
    */
  var arrowLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the background color for the indicator of the rangeBar type.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the base value for the indicator of the rangeBar type.
    */
  var baseValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a radius small enough for the indicator to begin adapting.
    */
  var beginAdaptingAtRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a color of the indicator.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the orientation of the rangeBar indicator. Applies only if the geometry.orientation property is &apos;vertical&apos;.
    */
  var horizontalOrientation: js.UndefOr[left | right] = js.undefined
  
  /**
    * Specifies the distance between the needle and the center of a gauge for the indicator of a needle-like type.
    */
  var indentFromCenter: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the indicator length.
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the distance between the indicator and the invisible scale line.
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the palette to be used to colorize indicators differently.
    */
  var palette: js.UndefOr[js.Array[String] | PaletteType] = js.undefined
  
  /**
    * Specifies the second color for the indicator of the twoColorNeedle type.
    */
  var secondColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the length of a twoNeedleColor type indicator tip as a percentage.
    */
  var secondFraction: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the range bar size for an indicator of the rangeBar type.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the inner diameter in pixels, so that the spindle has the shape of a ring.
    */
  var spindleGapSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the spindle&apos;s diameter in pixels for the indicator of a needle-like type.
    */
  var spindleSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the appearance of the text displayed in an indicator of the rangeBar type.
    */
  var text: js.UndefOr[CustomizeText] = js.undefined
  
  /**
    * Specifies the orientation of the rangeBar indicator. Applies only if the geometry.orientation property is &apos;horizontal&apos;.
    */
  var verticalOrientation: js.UndefOr[bottom | top] = js.undefined
  
  /**
    * Specifies the width of an indicator in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object CommonIndicator {
  
  inline def apply(): CommonIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonIndicator]
  }
  
  extension [Self <: CommonIndicator](x: Self) {
    
    inline def setArrowLength(value: Double): Self = StObject.set(x, "arrowLength", value.asInstanceOf[js.Any])
    
    inline def setArrowLengthUndefined: Self = StObject.set(x, "arrowLength", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBaseValue(value: Double): Self = StObject.set(x, "baseValue", value.asInstanceOf[js.Any])
    
    inline def setBaseValueUndefined: Self = StObject.set(x, "baseValue", js.undefined)
    
    inline def setBeginAdaptingAtRadius(value: Double): Self = StObject.set(x, "beginAdaptingAtRadius", value.asInstanceOf[js.Any])
    
    inline def setBeginAdaptingAtRadiusUndefined: Self = StObject.set(x, "beginAdaptingAtRadius", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setHorizontalOrientation(value: left | right): Self = StObject.set(x, "horizontalOrientation", value.asInstanceOf[js.Any])
    
    inline def setHorizontalOrientationUndefined: Self = StObject.set(x, "horizontalOrientation", js.undefined)
    
    inline def setIndentFromCenter(value: Double): Self = StObject.set(x, "indentFromCenter", value.asInstanceOf[js.Any])
    
    inline def setIndentFromCenterUndefined: Self = StObject.set(x, "indentFromCenter", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPalette(value: js.Array[String] | PaletteType): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    inline def setPaletteVarargs(value: String*): Self = StObject.set(x, "palette", js.Array(value*))
    
    inline def setSecondColor(value: String): Self = StObject.set(x, "secondColor", value.asInstanceOf[js.Any])
    
    inline def setSecondColorUndefined: Self = StObject.set(x, "secondColor", js.undefined)
    
    inline def setSecondFraction(value: Double): Self = StObject.set(x, "secondFraction", value.asInstanceOf[js.Any])
    
    inline def setSecondFractionUndefined: Self = StObject.set(x, "secondFraction", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSpindleGapSize(value: Double): Self = StObject.set(x, "spindleGapSize", value.asInstanceOf[js.Any])
    
    inline def setSpindleGapSizeUndefined: Self = StObject.set(x, "spindleGapSize", js.undefined)
    
    inline def setSpindleSize(value: Double): Self = StObject.set(x, "spindleSize", value.asInstanceOf[js.Any])
    
    inline def setSpindleSizeUndefined: Self = StObject.set(x, "spindleSize", js.undefined)
    
    inline def setText(value: CustomizeText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setVerticalOrientation(value: bottom | top): Self = StObject.set(x, "verticalOrientation", value.asInstanceOf[js.Any])
    
    inline def setVerticalOrientationUndefined: Self = StObject.set(x, "verticalOrientation", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
