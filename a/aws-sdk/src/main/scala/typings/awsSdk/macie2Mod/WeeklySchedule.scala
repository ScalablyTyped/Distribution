package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeeklySchedule extends js.Object {
  /**
    * The day of the week when Amazon Macie runs the job.
    */
  var dayOfWeek: js.UndefOr[DayOfWeek] = js.native
}

object WeeklySchedule {
  @scala.inline
  def apply(): WeeklySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeeklySchedule]
  }
  @scala.inline
  implicit class WeeklyScheduleOps[Self <: WeeklySchedule] (val x: Self) extends AnyVal {
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
    def setDayOfWeek(value: DayOfWeek): Self = this.set("dayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayOfWeek: Self = this.set("dayOfWeek", js.undefined)
  }
  
}

