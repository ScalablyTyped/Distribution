package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterTargetFromMaintenanceWindowResult extends StObject {
  
  /**
    * The ID of the maintenance window the target was removed from.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
  
  /**
    * The ID of the removed target definition.
    */
  var WindowTargetId: js.UndefOr[MaintenanceWindowTargetId] = js.undefined
}
object DeregisterTargetFromMaintenanceWindowResult {
  
  @scala.inline
  def apply(): DeregisterTargetFromMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterTargetFromMaintenanceWindowResult]
  }
  
  @scala.inline
  implicit class DeregisterTargetFromMaintenanceWindowResultMutableBuilder[Self <: DeregisterTargetFromMaintenanceWindowResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowIdUndefined: Self = StObject.set(x, "WindowId", js.undefined)
    
    @scala.inline
    def setWindowTargetId(value: MaintenanceWindowTargetId): Self = StObject.set(x, "WindowTargetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowTargetIdUndefined: Self = StObject.set(x, "WindowTargetId", js.undefined)
  }
}
