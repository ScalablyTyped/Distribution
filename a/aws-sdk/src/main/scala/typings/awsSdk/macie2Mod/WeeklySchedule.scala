package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeeklySchedule extends js.Object {
  /**
    * Run the job once a week, on a specific day of the week. Valid values are: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, and SUNDAY.
    */
  var dayOfWeek: js.UndefOr[DayOfWeek] = js.native
}

object WeeklySchedule {
  @scala.inline
  def apply(dayOfWeek: DayOfWeek = null): WeeklySchedule = {
    val __obj = js.Dynamic.literal()
    if (dayOfWeek != null) __obj.updateDynamic("dayOfWeek")(dayOfWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeeklySchedule]
  }
}

