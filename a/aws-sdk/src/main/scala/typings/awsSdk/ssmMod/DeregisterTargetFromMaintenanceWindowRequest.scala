package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterTargetFromMaintenanceWindowRequest extends js.Object {
  
  /**
    * The system checks if the target is being referenced by a task. If the target is being referenced, the system returns an error and does not deregister the target from the maintenance window.
    */
  var Safe: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the maintenance window the target should be removed from.
    */
  var WindowId: MaintenanceWindowId = js.native
  
  /**
    * The ID of the target definition to remove.
    */
  var WindowTargetId: MaintenanceWindowTargetId = js.native
}
object DeregisterTargetFromMaintenanceWindowRequest {
  
  @scala.inline
  def apply(WindowId: MaintenanceWindowId, WindowTargetId: MaintenanceWindowTargetId): DeregisterTargetFromMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any], WindowTargetId = WindowTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterTargetFromMaintenanceWindowRequest]
  }
  
  @scala.inline
  implicit class DeregisterTargetFromMaintenanceWindowRequestOps[Self <: DeregisterTargetFromMaintenanceWindowRequest] (val x: Self) extends AnyVal {
    
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
    def setWindowId(value: MaintenanceWindowId): Self = this.set("WindowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowTargetId(value: MaintenanceWindowTargetId): Self = this.set("WindowTargetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafe(value: Boolean): Self = this.set("Safe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafe: Self = this.set("Safe", js.undefined)
  }
}
