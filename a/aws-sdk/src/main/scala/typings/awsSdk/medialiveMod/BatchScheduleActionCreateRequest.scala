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
  @scala.inline
  implicit class BatchScheduleActionCreateRequestOps[Self <: BatchScheduleActionCreateRequest] (val x: Self) extends AnyVal {
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
    def setScheduleActionsVarargs(value: ScheduleAction*): Self = this.set("ScheduleActions", js.Array(value :_*))
    @scala.inline
    def setScheduleActions(value: listOfScheduleAction): Self = this.set("ScheduleActions", value.asInstanceOf[js.Any])
  }
  
}

