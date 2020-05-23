package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobScheduleFrequency extends js.Object {
  /**
    * Run the job once a day, every day. If specified, this is an empty object.
    */
  var dailySchedule: js.UndefOr[DailySchedule] = js.native
  /**
    * Run the job once a month, on a specific day of the month. This value can be an integer from 1 through 30.
    */
  var monthlySchedule: js.UndefOr[MonthlySchedule] = js.native
  /**
    * Run the job once a week, on a specific day of the week. Valid values are: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, and SUNDAY.
    */
  var weeklySchedule: js.UndefOr[WeeklySchedule] = js.native
}

object JobScheduleFrequency {
  @scala.inline
  def apply(
    dailySchedule: DailySchedule = null,
    monthlySchedule: MonthlySchedule = null,
    weeklySchedule: WeeklySchedule = null
  ): JobScheduleFrequency = {
    val __obj = js.Dynamic.literal()
    if (dailySchedule != null) __obj.updateDynamic("dailySchedule")(dailySchedule.asInstanceOf[js.Any])
    if (monthlySchedule != null) __obj.updateDynamic("monthlySchedule")(monthlySchedule.asInstanceOf[js.Any])
    if (weeklySchedule != null) __obj.updateDynamic("weeklySchedule")(weeklySchedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobScheduleFrequency]
  }
}

