package typings.bootstrapTimepicker

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimepickerOptions extends StObject {
  
  var appendWidgetTo: js.UndefOr[String] = js.native
  
  var defaultTime: js.UndefOr[String | Boolean | Date] = js.native
  
  var disableFocus: js.UndefOr[Boolean] = js.native
  
  var disableMousewheel: js.UndefOr[Boolean] = js.native
  
  var explicitMode: js.UndefOr[Boolean] = js.native
  
  var icons: js.UndefOr[TimepickerIconOptions] = js.native
  
  var isOpen: js.UndefOr[Boolean] = js.native
  
  var maxHours: js.UndefOr[Double] = js.native
  
  var minuteStep: js.UndefOr[Double] = js.native
  
  var modalBackdrop: js.UndefOr[Boolean] = js.native
  
  var secondStep: js.UndefOr[Double] = js.native
  
  var showInputs: js.UndefOr[Boolean] = js.native
  
  var showMeridian: js.UndefOr[Boolean] = js.native
  
  var showSeconds: js.UndefOr[Boolean] = js.native
  
  var snapToStep: js.UndefOr[Boolean] = js.native
  
  var template: js.UndefOr[String | Boolean] = js.native
}
object TimepickerOptions {
  
  @scala.inline
  def apply(): TimepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimepickerOptions]
  }
  
  @scala.inline
  implicit class TimepickerOptionsMutableBuilder[Self <: TimepickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendWidgetTo(value: String): Self = StObject.set(x, "appendWidgetTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendWidgetToUndefined: Self = StObject.set(x, "appendWidgetTo", js.undefined)
    
    @scala.inline
    def setDefaultTime(value: String | Boolean | Date): Self = StObject.set(x, "defaultTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTimeUndefined: Self = StObject.set(x, "defaultTime", js.undefined)
    
    @scala.inline
    def setDisableFocus(value: Boolean): Self = StObject.set(x, "disableFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableFocusUndefined: Self = StObject.set(x, "disableFocus", js.undefined)
    
    @scala.inline
    def setDisableMousewheel(value: Boolean): Self = StObject.set(x, "disableMousewheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableMousewheelUndefined: Self = StObject.set(x, "disableMousewheel", js.undefined)
    
    @scala.inline
    def setExplicitMode(value: Boolean): Self = StObject.set(x, "explicitMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicitModeUndefined: Self = StObject.set(x, "explicitMode", js.undefined)
    
    @scala.inline
    def setIcons(value: TimepickerIconOptions): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    @scala.inline
    def setMaxHours(value: Double): Self = StObject.set(x, "maxHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHoursUndefined: Self = StObject.set(x, "maxHours", js.undefined)
    
    @scala.inline
    def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
    
    @scala.inline
    def setModalBackdrop(value: Boolean): Self = StObject.set(x, "modalBackdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalBackdropUndefined: Self = StObject.set(x, "modalBackdrop", js.undefined)
    
    @scala.inline
    def setSecondStep(value: Double): Self = StObject.set(x, "secondStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondStepUndefined: Self = StObject.set(x, "secondStep", js.undefined)
    
    @scala.inline
    def setShowInputs(value: Boolean): Self = StObject.set(x, "showInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInputsUndefined: Self = StObject.set(x, "showInputs", js.undefined)
    
    @scala.inline
    def setShowMeridian(value: Boolean): Self = StObject.set(x, "showMeridian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMeridianUndefined: Self = StObject.set(x, "showMeridian", js.undefined)
    
    @scala.inline
    def setShowSeconds(value: Boolean): Self = StObject.set(x, "showSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSecondsUndefined: Self = StObject.set(x, "showSeconds", js.undefined)
    
    @scala.inline
    def setSnapToStep(value: Boolean): Self = StObject.set(x, "snapToStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapToStepUndefined: Self = StObject.set(x, "snapToStep", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | Boolean): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
