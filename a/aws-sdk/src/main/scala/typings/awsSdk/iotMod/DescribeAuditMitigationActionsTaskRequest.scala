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
}

