package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelMaintenanceWindowExecutionRequest extends js.Object {
  
  /**
    * The ID of the maintenance window execution to stop.
    */
  var WindowExecutionId: MaintenanceWindowExecutionId = js.native
}
object CancelMaintenanceWindowExecutionRequest {
  
  @scala.inline
  def apply(WindowExecutionId: MaintenanceWindowExecutionId): CancelMaintenanceWindowExecutionRequest = {
    val __obj = js.Dynamic.literal(WindowExecutionId = WindowExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelMaintenanceWindowExecutionRequest]
  }
  
  @scala.inline
  implicit class CancelMaintenanceWindowExecutionRequestOps[Self <: CancelMaintenanceWindowExecutionRequest] (val x: Self) extends AnyVal {
    
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
    def setWindowExecutionId(value: MaintenanceWindowExecutionId): Self = this.set("WindowExecutionId", value.asInstanceOf[js.Any])
  }
}
