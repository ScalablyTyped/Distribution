package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    Friday: DailyAutoScalingSchedule = null,
    Monday: DailyAutoScalingSchedule = null,
    Saturday: DailyAutoScalingSchedule = null,
    Sunday: DailyAutoScalingSchedule = null,
    Thursday: DailyAutoScalingSchedule = null,
    Tuesday: DailyAutoScalingSchedule = null,
    Wednesday: DailyAutoScalingSchedule = null
  ): WeeklyAutoScalingSchedule = {
    val __obj = js.Dynamic.literal()
    if (Friday != null) __obj.updateDynamic("Friday")(Friday.asInstanceOf[js.Any])
    if (Monday != null) __obj.updateDynamic("Monday")(Monday.asInstanceOf[js.Any])
    if (Saturday != null) __obj.updateDynamic("Saturday")(Saturday.asInstanceOf[js.Any])
    if (Sunday != null) __obj.updateDynamic("Sunday")(Sunday.asInstanceOf[js.Any])
    if (Thursday != null) __obj.updateDynamic("Thursday")(Thursday.asInstanceOf[js.Any])
    if (Tuesday != null) __obj.updateDynamic("Tuesday")(Tuesday.asInstanceOf[js.Any])
    if (Wednesday != null) __obj.updateDynamic("Wednesday")(Wednesday.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeeklyAutoScalingSchedule]
  }
}

