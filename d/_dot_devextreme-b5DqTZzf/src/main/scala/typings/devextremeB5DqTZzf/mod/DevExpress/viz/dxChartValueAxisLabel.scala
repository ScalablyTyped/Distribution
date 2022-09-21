package typings.devextremeB5DqTZzf.mod.DevExpress.viz

import typings.devextremeB5DqTZzf.anon.ValueValueText
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartValueAxisLabel
  extends StObject
     with dxChartCommonAxisSettingsLabel {
  
  /**
    * Specifies the hint that appears when a user points to an axis label.
    */
  var customizeHint: js.UndefOr[js.Function1[/* axisValue */ ValueValueText, String]] = js.undefined
  
  /**
    * Customizes the text displayed by axis labels.
    */
  var customizeText: js.UndefOr[js.Function1[/* axisValue */ ValueValueText, String]] = js.undefined
  
  /**
    * Formats a value before it is displayed in an axis label.
    */
  var format: js.UndefOr[Format] = js.undefined
}
object dxChartValueAxisLabel {
  
  inline def apply(): dxChartValueAxisLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartValueAxisLabel]
  }
  
  extension [Self <: dxChartValueAxisLabel](x: Self) {
    
    inline def setCustomizeHint(value: /* axisValue */ ValueValueText => String): Self = StObject.set(x, "customizeHint", js.Any.fromFunction1(value))
    
    inline def setCustomizeHintUndefined: Self = StObject.set(x, "customizeHint", js.undefined)
    
    inline def setCustomizeText(value: /* axisValue */ ValueValueText => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
