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
  @scala.inline
  implicit class CancelAuditTaskRequestOps[Self <: CancelAuditTaskRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTaskId(value: AuditTaskId): Self = this.set("taskId", value.asInstanceOf[js.Any])
  }
  
}

