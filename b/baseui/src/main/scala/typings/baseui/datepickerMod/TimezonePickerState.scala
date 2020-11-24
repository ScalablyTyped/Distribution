package typings.baseui.datepickerMod

import typings.baseui.selectMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimezonePickerState extends js.Object {
  
  var timezones: js.Array[Option] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object TimezonePickerState {
  
  @scala.inline
  def apply(timezones: js.Array[Option]): TimezonePickerState = {
    val __obj = js.Dynamic.literal(timezones = timezones.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimezonePickerState]
  }
  
  @scala.inline
  implicit class TimezonePickerStateOps[Self <: TimezonePickerState] (val x: Self) extends AnyVal {
    
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
    def setTimezonesVarargs(value: Option*): Self = this.set("timezones", js.Array(value :_*))
    
    @scala.inline
    def setTimezones(value: js.Array[Option]): Self = this.set("timezones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
