package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchScheduleActionDeleteResult extends js.Object {
  /**
    * List of actions that have been deleted from the schedule.
    */
  var ScheduleActions: listOfScheduleAction = js.native
}

object BatchScheduleActionDeleteResult {
  @scala.inline
  def apply(ScheduleActions: listOfScheduleAction): BatchScheduleActionDeleteResult = {
    val __obj = js.Dynamic.literal(ScheduleActions = ScheduleActions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchScheduleActionDeleteResult]
  }
}

