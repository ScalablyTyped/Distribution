package typings.bootstrapTimepicker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimepickerOptions extends js.Object {
  
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
  implicit class TimepickerOptionsOps[Self <: TimepickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppendWidgetTo(value: String): Self = this.set("appendWidgetTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendWidgetTo: Self = this.set("appendWidgetTo", js.undefined)
    
    @scala.inline
    def setDefaultTime(value: String | Boolean | Date): Self = this.set("defaultTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTime: Self = this.set("defaultTime", js.undefined)
    
    @scala.inline
    def setDisableFocus(value: Boolean): Self = this.set("disableFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableFocus: Self = this.set("disableFocus", js.undefined)
    
    @scala.inline
    def setDisableMousewheel(value: Boolean): Self = this.set("disableMousewheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableMousewheel: Self = this.set("disableMousewheel", js.undefined)
    
    @scala.inline
    def setExplicitMode(value: Boolean): Self = this.set("explicitMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitMode: Self = this.set("explicitMode", js.undefined)
    
    @scala.inline
    def setIcons(value: TimepickerIconOptions): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
    @scala.inline
    def setMaxHours(value: Double): Self = this.set("maxHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHours: Self = this.set("maxHours", js.undefined)
    
    @scala.inline
    def setMinuteStep(value: Double): Self = this.set("minuteStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteStep: Self = this.set("minuteStep", js.undefined)
    
    @scala.inline
    def setModalBackdrop(value: Boolean): Self = this.set("modalBackdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalBackdrop: Self = this.set("modalBackdrop", js.undefined)
    
    @scala.inline
    def setSecondStep(value: Double): Self = this.set("secondStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondStep: Self = this.set("secondStep", js.undefined)
    
    @scala.inline
    def setShowInputs(value: Boolean): Self = this.set("showInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowInputs: Self = this.set("showInputs", js.undefined)
    
    @scala.inline
    def setShowMeridian(value: Boolean): Self = this.set("showMeridian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMeridian: Self = this.set("showMeridian", js.undefined)
    
    @scala.inline
    def setShowSeconds(value: Boolean): Self = this.set("showSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSeconds: Self = this.set("showSeconds", js.undefined)
    
    @scala.inline
    def setSnapToStep(value: Boolean): Self = this.set("snapToStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapToStep: Self = this.set("snapToStep", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | Boolean): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}
