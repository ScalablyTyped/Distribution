package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobScheduleFrequency extends js.Object {
  /**
    * Specifies a daily recurrence pattern for running the job.
    */
  var dailySchedule: js.UndefOr[DailySchedule] = js.native
  /**
    * Specifies a monthly recurrence pattern for running the job.
    */
  var monthlySchedule: js.UndefOr[MonthlySchedule] = js.native
  /**
    * Specifies a weekly recurrence pattern for running the job.
    */
  var weeklySchedule: js.UndefOr[WeeklySchedule] = js.native
}

object JobScheduleFrequency {
  @scala.inline
  def apply(): JobScheduleFrequency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobScheduleFrequency]
  }
  @scala.inline
  implicit class JobScheduleFrequencyOps[Self <: JobScheduleFrequency] (val x: Self) extends AnyVal {
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
    def setDailySchedule(value: DailySchedule): Self = this.set("dailySchedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDailySchedule: Self = this.set("dailySchedule", js.undefined)
    @scala.inline
    def setMonthlySchedule(value: MonthlySchedule): Self = this.set("monthlySchedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthlySchedule: Self = this.set("monthlySchedule", js.undefined)
    @scala.inline
    def setWeeklySchedule(value: WeeklySchedule): Self = this.set("weeklySchedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeeklySchedule: Self = this.set("weeklySchedule", js.undefined)
  }
  
}

