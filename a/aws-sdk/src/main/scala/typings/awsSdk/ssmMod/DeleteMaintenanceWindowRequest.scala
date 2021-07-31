package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMaintenanceWindowRequest extends StObject {
  
  /**
    * The ID of the maintenance window to delete.
    */
  var WindowId: MaintenanceWindowId
}
object DeleteMaintenanceWindowRequest {
  
  @scala.inline
  def apply(WindowId: MaintenanceWindowId): DeleteMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMaintenanceWindowRequest]
  }
  
  @scala.inline
  implicit class DeleteMaintenanceWindowRequestMutableBuilder[Self <: DeleteMaintenanceWindowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
  }
}
