package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schedule extends js.Object {
  /**
    * A cron expression used to specify the schedule (see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, you would specify: cron(15 12 * * ? *).
    */
  var ScheduleExpression: js.UndefOr[CronExpression] = js.native
  /**
    * The state of the schedule.
    */
  var State: js.UndefOr[ScheduleState] = js.native
}

object Schedule {
  @scala.inline
  def apply(ScheduleExpression: CronExpression = null, State: ScheduleState = null): Schedule = {
    val __obj = js.Dynamic.literal()
    if (ScheduleExpression != null) __obj.updateDynamic("ScheduleExpression")(ScheduleExpression.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schedule]
  }
}

