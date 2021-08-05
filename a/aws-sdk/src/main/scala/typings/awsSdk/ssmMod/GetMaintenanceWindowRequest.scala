package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMaintenanceWindowRequest extends StObject {
  
  /**
    * The ID of the maintenance window for which you want to retrieve information.
    */
  var WindowId: MaintenanceWindowId
}
object GetMaintenanceWindowRequest {
  
  inline def apply(WindowId: MaintenanceWindowId): GetMaintenanceWindowRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMaintenanceWindowRequest]
  }
  
  extension [Self <: GetMaintenanceWindowRequest](x: Self) {
    
    inline def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
  }
}
