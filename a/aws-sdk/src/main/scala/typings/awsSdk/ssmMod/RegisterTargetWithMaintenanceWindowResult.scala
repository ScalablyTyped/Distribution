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
  
  @scala.inline
  def apply(): RegisterTargetWithMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterTargetWithMaintenanceWindowResult]
  }
  
  @scala.inline
  implicit class RegisterTargetWithMaintenanceWindowResultMutableBuilder[Self <: RegisterTargetWithMaintenanceWindowResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowTargetId(value: MaintenanceWindowTargetId): Self = StObject.set(x, "WindowTargetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowTargetIdUndefined: Self = StObject.set(x, "WindowTargetId", js.undefined)
  }
}
