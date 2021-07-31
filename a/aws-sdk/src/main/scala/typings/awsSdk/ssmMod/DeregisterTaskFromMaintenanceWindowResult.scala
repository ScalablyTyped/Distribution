package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterTaskFromMaintenanceWindowResult extends StObject {
  
  /**
    * The ID of the maintenance window the task was removed from.
    */
  var WindowId: js.UndefOr[MaintenanceWindowId] = js.undefined
  
  /**
    * The ID of the task removed from the maintenance window.
    */
  var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.undefined
}
object DeregisterTaskFromMaintenanceWindowResult {
  
  @scala.inline
  def apply(): DeregisterTaskFromMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterTaskFromMaintenanceWindowResult]
  }
  
  @scala.inline
  implicit class DeregisterTaskFromMaintenanceWindowResultMutableBuilder[Self <: DeregisterTaskFromMaintenanceWindowResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowIdUndefined: Self = StObject.set(x, "WindowId", js.undefined)
    
    @scala.inline
    def setWindowTaskId(value: MaintenanceWindowTaskId): Self = StObject.set(x, "WindowTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowTaskIdUndefined: Self = StObject.set(x, "WindowTaskId", js.undefined)
  }
}
