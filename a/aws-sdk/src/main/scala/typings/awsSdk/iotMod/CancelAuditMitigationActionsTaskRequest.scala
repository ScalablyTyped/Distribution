package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelAuditMitigationActionsTaskRequest extends js.Object {
  /**
    * The unique identifier for the task that you want to cancel. 
    */
  var taskId: AuditMitigationActionsTaskId = js.native
}

object CancelAuditMitigationActionsTaskRequest {
  @scala.inline
  def apply(taskId: AuditMitigationActionsTaskId): CancelAuditMitigationActionsTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelAuditMitigationActionsTaskRequest]
  }
}

