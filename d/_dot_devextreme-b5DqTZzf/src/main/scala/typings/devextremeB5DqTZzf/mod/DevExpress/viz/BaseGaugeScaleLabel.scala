package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.anon.ValueText
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.hide
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseGaugeScaleLabel extends StObject {
  
  /**
    * Specifies a callback function that returns the text to be displayed in scale labels.
    */
  var customizeText: js.UndefOr[js.Function1[/* scaleValue */ ValueText, String]] = js.undefined
  
  /**
    * Specifies font properties for the text displayed in the scale labels of the gauge.
    */
  var font: js.UndefOr[Font] = js.undefined
  
  /**
    * Formats a value before it is displayed in a scale label. Accepts only numeric formats.
    */
  var format: js.UndefOr[Format] = js.undefined
  
  /**
    * Decides how to arrange scale labels when there is not enough space to keep all of them.
    */
  var overlappingBehavior: js.UndefOr[hide | none] = js.undefined
  
  /**
    * Specifies whether or not scale labels should be colored similarly to their corresponding ranges in the range container.
    */
  var useRangeColors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not scale labels are visible on the gauge.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object BaseGaugeScaleLabel {
  
  inline def apply(): BaseGaugeScaleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseGaugeScaleLabel]
  }
  
  extension [Self <: BaseGaugeScaleLabel](x: Self) {
    
    inline def setCustomizeText(value: /* scaleValue */ ValueText => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setOverlappingBehavior(value: hide | none): Self = StObject.set(x, "overlappingBehavior", value.asInstanceOf[js.Any])
    
    inline def setOverlappingBehaviorUndefined: Self = StObject.set(x, "overlappingBehavior", js.undefined)
    
    inline def setUseRangeColors(value: Boolean): Self = StObject.set(x, "useRangeColors", value.asInstanceOf[js.Any])
    
    inline def setUseRangeColorsUndefined: Self = StObject.set(x, "useRangeColors", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
