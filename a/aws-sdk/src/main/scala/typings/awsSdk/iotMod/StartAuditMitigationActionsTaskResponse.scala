package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartAuditMitigationActionsTaskResponse extends StObject {
  
  /**
    * The unique identifier for the audit mitigation task. This matches the taskId that you specified in the request.
    */
  var taskId: js.UndefOr[AuditMitigationActionsTaskId] = js.native
}
object StartAuditMitigationActionsTaskResponse {
  
  @scala.inline
  def apply(): StartAuditMitigationActionsTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartAuditMitigationActionsTaskResponse]
  }
  
  @scala.inline
  implicit class StartAuditMitigationActionsTaskResponseMutableBuilder[Self <: StartAuditMitigationActionsTaskResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskId(value: AuditMitigationActionsTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
  }
}
