package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAuditTaskRequest extends StObject {
  
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
  
  @scala.inline
  implicit class DescribeAuditTaskRequestMutableBuilder[Self <: DescribeAuditTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskId(value: AuditTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
