package typings.bootstrapTimepicker

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimepickerOptions extends StObject {
  
  var appendWidgetTo: js.UndefOr[String] = js.undefined
  
  var defaultTime: js.UndefOr[String | Boolean | Date] = js.undefined
  
  var disableFocus: js.UndefOr[Boolean] = js.undefined
  
  var disableMousewheel: js.UndefOr[Boolean] = js.undefined
  
  var explicitMode: js.UndefOr[Boolean] = js.undefined
  
  var icons: js.UndefOr[TimepickerIconOptions] = js.undefined
  
  var isOpen: js.UndefOr[Boolean] = js.undefined
  
  var maxHours: js.UndefOr[Double] = js.undefined
  
  var minuteStep: js.UndefOr[Double] = js.undefined
  
  var modalBackdrop: js.UndefOr[Boolean] = js.undefined
  
  var secondStep: js.UndefOr[Double] = js.undefined
  
  var showInputs: js.UndefOr[Boolean] = js.undefined
  
  var showMeridian: js.UndefOr[Boolean] = js.undefined
  
  var showSeconds: js.UndefOr[Boolean] = js.undefined
  
  var snapToStep: js.UndefOr[Boolean] = js.undefined
  
  var template: js.UndefOr[String | Boolean] = js.undefined
}
object TimepickerOptions {
  
  inline def apply(): TimepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimepickerOptions]
  }
  
  extension [Self <: TimepickerOptions](x: Self) {
    
    inline def setAppendWidgetTo(value: String): Self = StObject.set(x, "appendWidgetTo", value.asInstanceOf[js.Any])
    
    inline def setAppendWidgetToUndefined: Self = StObject.set(x, "appendWidgetTo", js.undefined)
    
    inline def setDefaultTime(value: String | Boolean | Date): Self = StObject.set(x, "defaultTime", value.asInstanceOf[js.Any])
    
    inline def setDefaultTimeUndefined: Self = StObject.set(x, "defaultTime", js.undefined)
    
    inline def setDisableFocus(value: Boolean): Self = StObject.set(x, "disableFocus", value.asInstanceOf[js.Any])
    
    inline def setDisableFocusUndefined: Self = StObject.set(x, "disableFocus", js.undefined)
    
    inline def setDisableMousewheel(value: Boolean): Self = StObject.set(x, "disableMousewheel", value.asInstanceOf[js.Any])
    
    inline def setDisableMousewheelUndefined: Self = StObject.set(x, "disableMousewheel", js.undefined)
    
    inline def setExplicitMode(value: Boolean): Self = StObject.set(x, "explicitMode", value.asInstanceOf[js.Any])
    
    inline def setExplicitModeUndefined: Self = StObject.set(x, "explicitMode", js.undefined)
    
    inline def setIcons(value: TimepickerIconOptions): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    inline def setMaxHours(value: Double): Self = StObject.set(x, "maxHours", value.asInstanceOf[js.Any])
    
    inline def setMaxHoursUndefined: Self = StObject.set(x, "maxHours", js.undefined)
    
    inline def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
    
    inline def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
    
    inline def setModalBackdrop(value: Boolean): Self = StObject.set(x, "modalBackdrop", value.asInstanceOf[js.Any])
    
    inline def setModalBackdropUndefined: Self = StObject.set(x, "modalBackdrop", js.undefined)
    
    inline def setSecondStep(value: Double): Self = StObject.set(x, "secondStep", value.asInstanceOf[js.Any])
    
    inline def setSecondStepUndefined: Self = StObject.set(x, "secondStep", js.undefined)
    
    inline def setShowInputs(value: Boolean): Self = StObject.set(x, "showInputs", value.asInstanceOf[js.Any])
    
    inline def setShowInputsUndefined: Self = StObject.set(x, "showInputs", js.undefined)
    
    inline def setShowMeridian(value: Boolean): Self = StObject.set(x, "showMeridian", value.asInstanceOf[js.Any])
    
    inline def setShowMeridianUndefined: Self = StObject.set(x, "showMeridian", js.undefined)
    
    inline def setShowSeconds(value: Boolean): Self = StObject.set(x, "showSeconds", value.asInstanceOf[js.Any])
    
    inline def setShowSecondsUndefined: Self = StObject.set(x, "showSeconds", js.undefined)
    
    inline def setSnapToStep(value: Boolean): Self = StObject.set(x, "snapToStep", value.asInstanceOf[js.Any])
    
    inline def setSnapToStepUndefined: Self = StObject.set(x, "snapToStep", js.undefined)
    
    inline def setTemplate(value: String | Boolean): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
