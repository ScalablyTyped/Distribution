package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeeklyStartTime extends js.Object {
  
  /**
    * Required. The day of the week.
    */
  var DayOfWeek: js.UndefOr[typings.awsSdk.mqMod.DayOfWeek] = js.native
  
  /**
    * Required. The time, in 24-hour format.
    */
  var TimeOfDay: js.UndefOr[string] = js.native
  
  /**
    * The time zone, UTC by default, in either the Country/City format, or the UTC offset format.
    */
  var TimeZone: js.UndefOr[string] = js.native
}
object WeeklyStartTime {
  
  @scala.inline
  def apply(): WeeklyStartTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeeklyStartTime]
  }
  
  @scala.inline
  implicit class WeeklyStartTimeOps[Self <: WeeklyStartTime] (val x: Self) extends AnyVal {
    
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
    def setDayOfWeek(value: DayOfWeek): Self = this.set("DayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayOfWeek: Self = this.set("DayOfWeek", js.undefined)
    
    @scala.inline
    def setTimeOfDay(value: string): Self = this.set("TimeOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeOfDay: Self = this.set("TimeOfDay", js.undefined)
    
    @scala.inline
    def setTimeZone(value: string): Self = this.set("TimeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("TimeZone", js.undefined)
  }
}
