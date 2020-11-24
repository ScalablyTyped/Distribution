package typings.blueprintjsDatetime.timePickerMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimePickerState extends js.Object {
  
  var hourText: js.UndefOr[String] = js.native
  
  var isPm: js.UndefOr[Boolean] = js.native
  
  var millisecondText: js.UndefOr[String] = js.native
  
  var minuteText: js.UndefOr[String] = js.native
  
  var secondText: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[Date] = js.native
}
object ITimePickerState {
  
  @scala.inline
  def apply(): ITimePickerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimePickerState]
  }
  
  @scala.inline
  implicit class ITimePickerStateOps[Self <: ITimePickerState] (val x: Self) extends AnyVal {
    
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
    def setHourText(value: String): Self = this.set("hourText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourText: Self = this.set("hourText", js.undefined)
    
    @scala.inline
    def setIsPm(value: Boolean): Self = this.set("isPm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPm: Self = this.set("isPm", js.undefined)
    
    @scala.inline
    def setMillisecondText(value: String): Self = this.set("millisecondText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMillisecondText: Self = this.set("millisecondText", js.undefined)
    
    @scala.inline
    def setMinuteText(value: String): Self = this.set("minuteText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteText: Self = this.set("minuteText", js.undefined)
    
    @scala.inline
    def setSecondText(value: String): Self = this.set("secondText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondText: Self = this.set("secondText", js.undefined)
    
    @scala.inline
    def setValue(value: Date): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
