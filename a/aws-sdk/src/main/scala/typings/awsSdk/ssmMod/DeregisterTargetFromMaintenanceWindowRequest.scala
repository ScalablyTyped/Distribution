package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterTargetFromMaintenanceWindowRequest extends StObject {
  
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
  implicit class DeregisterTargetFromMaintenanceWindowRequestMutableBuilder[Self <: DeregisterTargetFromMaintenanceWindowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSafe(value: Boolean): Self = StObject.set(x, "Safe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeUndefined: Self = StObject.set(x, "Safe", js.undefined)
    
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowTargetId(value: MaintenanceWindowTargetId): Self = StObject.set(x, "WindowTargetId", value.asInstanceOf[js.Any])
  }
}
