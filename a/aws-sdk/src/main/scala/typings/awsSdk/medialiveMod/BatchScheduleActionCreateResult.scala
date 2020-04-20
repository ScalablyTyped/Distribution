package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchScheduleActionCreateResult extends js.Object {
  /**
    * List of actions that have been created in the schedule.
    */
  var ScheduleActions: listOfScheduleAction = js.native
}

object BatchScheduleActionCreateResult {
  @scala.inline
  def apply(ScheduleActions: listOfScheduleAction): BatchScheduleActionCreateResult = {
    val __obj = js.Dynamic.literal(ScheduleActions = ScheduleActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchScheduleActionCreateResult]
  }
}

