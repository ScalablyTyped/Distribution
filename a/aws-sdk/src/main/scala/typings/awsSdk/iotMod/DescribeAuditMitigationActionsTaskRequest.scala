package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAuditMitigationActionsTaskRequest extends StObject {
  
  /**
    * The unique identifier for the audit mitigation task.
    */
  var taskId: AuditMitigationActionsTaskId
}
object DescribeAuditMitigationActionsTaskRequest {
  
  @scala.inline
  def apply(taskId: AuditMitigationActionsTaskId): DescribeAuditMitigationActionsTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAuditMitigationActionsTaskRequest]
  }
  
  @scala.inline
  implicit class DescribeAuditMitigationActionsTaskRequestMutableBuilder[Self <: DescribeAuditMitigationActionsTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskId(value: AuditMitigationActionsTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
