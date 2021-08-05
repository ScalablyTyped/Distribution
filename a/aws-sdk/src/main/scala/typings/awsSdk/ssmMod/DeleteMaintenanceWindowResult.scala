package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMaintenanceWindowResult extends StObject {
  
  /**
    * The ID of the deleted maintenance window.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
}
object DeleteMaintenanceWindowResult {
  
  inline def apply(): DeleteMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMaintenanceWindowResult]
  }
  
  extension [Self <: DeleteMaintenanceWindowResult](x: Self) {
    
    inline def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    inline def setWindowIdUndefined: Self = StObject.set(x, "WindowId", js.undefined)
  }
}
