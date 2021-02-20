package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMaintenanceWindowTaskRequest extends StObject {
  
  /**
    * The maintenance window ID that includes the task to retrieve.
    */
  var WindowId: MaintenanceWindowId = js.native
  
  /**
    * The maintenance window task ID to retrieve.
    */
  var WindowTaskId: MaintenanceWindowTaskId = js.native
}
object GetMaintenanceWindowTaskRequest {
  
  @scala.inline
  def apply(WindowId: MaintenanceWindowId, WindowTaskId: MaintenanceWindowTaskId): GetMaintenanceWindowTaskRequest = {
    val __obj = js.Dynamic.literal(WindowId = WindowId.asInstanceOf[js.Any], WindowTaskId = WindowTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMaintenanceWindowTaskRequest]
  }
  
  @scala.inline
  implicit class GetMaintenanceWindowTaskRequestMutableBuilder[Self <: GetMaintenanceWindowTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowId(value: MaintenanceWindowId): Self = StObject.set(x, "WindowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowTaskId(value: MaintenanceWindowTaskId): Self = StObject.set(x, "WindowTaskId", value.asInstanceOf[js.Any])
  }
}
