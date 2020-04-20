package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelAuditTaskRequest extends js.Object {
  /**
    * The ID of the audit you want to cancel. You can only cancel an audit that is "IN_PROGRESS".
    */
  var taskId: AuditTaskId = js.native
}

object CancelAuditTaskRequest {
  @scala.inline
  def apply(taskId: AuditTaskId): CancelAuditTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelAuditTaskRequest]
  }
}

