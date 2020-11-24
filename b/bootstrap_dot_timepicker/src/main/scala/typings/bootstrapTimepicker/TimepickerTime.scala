package typings.bootstrapTimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimepickerTime extends js.Object {
  
  var hours: js.UndefOr[Double] = js.native
  
  var meridian: js.UndefOr[String] = js.native
  
  var minutes: js.UndefOr[Double] = js.native
  
  var seconds: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object TimepickerTime {
  
  @scala.inline
  def apply(): TimepickerTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimepickerTime]
  }
  
  @scala.inline
  implicit class TimepickerTimeOps[Self <: TimepickerTime] (val x: Self) extends AnyVal {
    
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
    def setHours(value: Double): Self = this.set("hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHours: Self = this.set("hours", js.undefined)
    
    @scala.inline
    def setMeridian(value: String): Self = this.set("meridian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeridian: Self = this.set("meridian", js.undefined)
    
    @scala.inline
    def setMinutes(value: Double): Self = this.set("minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutes: Self = this.set("minutes", js.undefined)
    
    @scala.inline
    def setSeconds(value: Double): Self = this.set("seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeconds: Self = this.set("seconds", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
