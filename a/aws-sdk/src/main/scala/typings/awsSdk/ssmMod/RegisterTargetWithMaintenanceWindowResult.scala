package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterTargetWithMaintenanceWindowResult extends StObject {
  
  /**
    * The ID of the target definition in this maintenance window.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined
}
object RegisterTargetWithMaintenanceWindowResult {
  
  inline def apply(): RegisterTargetWithMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterTargetWithMaintenanceWindowResult]
  }
  
  extension [Self <: RegisterTargetWithMaintenanceWindowResult](x: Self) {
    
    inline def setWindowTargetId(value: MaintenanceWindowTargetId): Self = StObject.set(x, "WindowTargetId", value.asInstanceOf[js.Any])
    
    inline def setWindowTargetIdUndefined: Self = StObject.set(x, "WindowTargetId", js.undefined)
  }
}
