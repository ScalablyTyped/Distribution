package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterTargetFromMaintenanceWindowRequest extends StObject {
  
  /**
    * The system checks if the target is being referenced by a task. If the target is being referenced, the system returns an error and doesn't deregister the target from the maintenance window.
    */
  var Safe: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the maintenance window the target should be removed from.
    */
  var WindowId: MaintenanceWindowId
  
  /**
    * The ID of the target definition to remove.
    */
  var WindowTargetId: MaintenanceWindowTargetId
}
object DeregisterTargetFromMaintenanceWindowRequest {
  
  inline def apply(WindowId: MaintenanceWindowId, WindowTargetId: MaintenanceWindowTargetId): DeregisterTargetFromMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any], WindowTargetId = WindowTargetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterTargetFromMaintenanceWindowRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeregisterTargetFromMaintenanceWindowRequest] (val x: Self) extends AnyVal {
    
    inline def setSafe(value: Boolean): Self = StObject.set(x, "Safe", value.asInstanceOf[js.Any])
    
    inline def setSafeUndefined: Self = StObject.set(x, "Safe", js.undefined)
    
    inline def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    inline def setWindowTargetId(value: MaintenanceWindowTargetId): Self = StObject.set(x, "WindowTargetId", value.asInstanceOf[js.Any])
  }
}
