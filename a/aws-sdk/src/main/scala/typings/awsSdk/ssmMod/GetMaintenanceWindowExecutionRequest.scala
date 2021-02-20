package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMaintenanceWindowExecutionRequest extends StObject {
  
  /**
    * The ID of the maintenance window execution that includes the task.
    */
  var WindowExecutionId: MaintenanceWindowExecutionId = js.native
}
object GetMaintenanceWindowExecutionRequest {
  
  @scala.inline
  def apply(WindowExecutionId: MaintenanceWindowExecutionId): GetMaintenanceWindowExecutionRequest = {
    val __obj = js.Dynamic.literal(WindowExecutionId = WindowExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMaintenanceWindowExecutionRequest]
  }
  
  @scala.inline
  implicit class GetMaintenanceWindowExecutionRequestMutableBuilder[Self <: GetMaintenanceWindowExecutionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowExecutionId(value: MaintenanceWindowExecutionId): Self = StObject.set(x, "WindowExecutionId", value.asInstanceOf[js.Any])
  }
}
