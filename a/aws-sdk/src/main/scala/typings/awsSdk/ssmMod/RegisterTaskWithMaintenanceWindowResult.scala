package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterTaskWithMaintenanceWindowResult extends StObject {
  
  /**
    * The ID of the task in the maintenance window.
    */
  var WindowTaskId: js.UndefOr[MaintenanceWindowTaskId] = js.native
}
object RegisterTaskWithMaintenanceWindowResult {
  
  @scala.inline
  def apply(): RegisterTaskWithMaintenanceWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterTaskWithMaintenanceWindowResult]
  }
  
  @scala.inline
  implicit class RegisterTaskWithMaintenanceWindowResultMutableBuilder[Self <: RegisterTaskWithMaintenanceWindowResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowTaskId(value: MaintenanceWindowTaskId): Self = StObject.set(x, "WindowTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowTaskIdUndefined: Self = StObject.set(x, "WindowTaskId", js.undefined)
  }
}
