package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterTaskFromMaintenanceWindowRequest extends StObject {
  
  /**
    * The ID of the maintenance window the task should be removed from.
    */
  var WindowId: MaintenanceWindowId
  
  /**
    * The ID of the task to remove from the maintenance window.
    */
  var WindowTaskId: MaintenanceWindowTaskId
}
object DeregisterTaskFromMaintenanceWindowRequest {
  
  inline def apply(WindowId: MaintenanceWindowId, WindowTaskId: MaintenanceWindowTaskId): DeregisterTaskFromMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any], WindowTaskId = WindowTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterTaskFromMaintenanceWindowRequest]
  }
  
  extension [Self <: DeregisterTaskFromMaintenanceWindowRequest](x: Self) {
    
    inline def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    inline def setWindowTaskId(value: MaintenanceWindowTaskId): Self = StObject.set(x, "WindowTaskId", value.asInstanceOf[js.Any])
  }
}
