package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAuditMitigationActionsTaskRequest extends js.Object {
  /**
    * The unique identifier for the audit mitigation task.
    */
  var taskId: AuditMitigationActionsTaskId = js.native
}

object DescribeAuditMitigationActionsTaskRequest {
  @scala.inline
  def apply(taskId: AuditMitigationActionsTaskId): DescribeAuditMitigationActionsTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAuditMitigationActionsTaskRequest]
  }
  @scala.inline
  implicit class DescribeAuditMitigationActionsTaskRequestOps[Self <: DescribeAuditMitigationActionsTaskRequest] (val x: Self) extends AnyVal {
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
    def setTaskId(value: AuditMitigationActionsTaskId): Self = this.set("taskId", value.asInstanceOf[js.Any])
  }
  
}

