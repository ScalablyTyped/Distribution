package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class CancelAuditMitigationActionsTaskRequestOps[Self <: CancelAuditMitigationActionsTaskRequest] (val x: Self) extends AnyVal {
    
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
