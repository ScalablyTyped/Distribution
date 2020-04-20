package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchScheduleActionCreateRequest extends js.Object {
  /**
    * A list of schedule actions to create.
    */
  var ScheduleActions: listOfScheduleAction = js.native
}

object BatchScheduleActionCreateRequest {
  @scala.inline
  def apply(ScheduleActions: listOfScheduleAction): BatchScheduleActionCreateRequest = {
    val __obj = js.Dynamic.literal(ScheduleActions = ScheduleActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchScheduleActionCreateRequest]
  }
}

