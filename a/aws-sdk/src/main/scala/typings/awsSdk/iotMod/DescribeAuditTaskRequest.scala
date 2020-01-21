package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAuditTaskRequest extends js.Object {
  /**
    * The ID of the audit whose information you want to get.
    */
  var taskId: AuditTaskId = js.native
}

object DescribeAuditTaskRequest {
  @scala.inline
  def apply(taskId: AuditTaskId): DescribeAuditTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeAuditTaskRequest]
  }
}

