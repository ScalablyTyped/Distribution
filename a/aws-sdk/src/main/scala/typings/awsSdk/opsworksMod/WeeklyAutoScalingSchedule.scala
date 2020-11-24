package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeeklyAutoScalingSchedule extends js.Object {
  
  /**
    * The schedule for Friday.
    */
  var Friday: js.UndefOr[DailyAutoScalingSchedule] = js.native
  
  /**
    * The schedule for Monday.
    */
  var Monday: js.UndefOr[DailyAutoScalingSchedule] = js.native
  
  /**
    * The schedule for Saturday.
    */
  var Saturday: js.UndefOr[DailyAutoScalingSchedule] = js.native
  
  /**
    * The schedule for Sunday.
    */
  var Sunday: js.UndefOr[DailyAutoScalingSchedule] = js.native
  
  /**
    * The schedule for Thursday.
    */
  var Thursday: js.UndefOr[DailyAutoScalingSchedule] = js.native
  
  /**
    * The schedule for Tuesday.
    */
  var Tuesday: js.UndefOr[DailyAutoScalingSchedule] = js.native
  
  /**
    * The schedule for Wednesday.
    */
  var Wednesday: js.UndefOr[DailyAutoScalingSchedule] = js.native
}
object WeeklyAutoScalingSchedule {
  
  @scala.inline
  def apply(): WeeklyAutoScalingSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeeklyAutoScalingSchedule]
  }
  
  @scala.inline
  implicit class WeeklyAutoScalingScheduleOps[Self <: WeeklyAutoScalingSchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFriday(value: DailyAutoScalingSchedule): Self = this.set("Friday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriday: Self = this.set("Friday", js.undefined)
    
    @scala.inline
    def setMonday(value: DailyAutoScalingSchedule): Self = this.set("Monday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonday: Self = this.set("Monday", js.undefined)
    
    @scala.inline
    def setSaturday(value: DailyAutoScalingSchedule): Self = this.set("Saturday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaturday: Self = this.set("Saturday", js.undefined)
    
    @scala.inline
    def setSunday(value: DailyAutoScalingSchedule): Self = this.set("Sunday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSunday: Self = this.set("Sunday", js.undefined)
    
    @scala.inline
    def setThursday(value: DailyAutoScalingSchedule): Self = this.set("Thursday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThursday: Self = this.set("Thursday", js.undefined)
    
    @scala.inline
    def setTuesday(value: DailyAutoScalingSchedule): Self = this.set("Tuesday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTuesday: Self = this.set("Tuesday", js.undefined)
    
    @scala.inline
    def setWednesday(value: DailyAutoScalingSchedule): Self = this.set("Wednesday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWednesday: Self = this.set("Wednesday", js.undefined)
  }
}
