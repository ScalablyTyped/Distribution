package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelMaintenanceWindowExecutionRequest extends StObject {
  
  /**
    * The ID of the maintenance window execution to stop.
    */
  var WindowExecutionId: MaintenanceWindowExecutionId
}
object CancelMaintenanceWindowExecutionRequest {
  
  @scala.inline
  def apply(WindowExecutionId: MaintenanceWindowExecutionId): CancelMaintenanceWindowExecutionRequest = {
    val __obj = js.Dynamic.literal(WindowExecutionId = WindowExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelMaintenanceWindowExecutionRequest]
  }
  
  @scala.inline
  implicit class CancelMaintenanceWindowExecutionRequestMutableBuilder[Self <: CancelMaintenanceWindowExecutionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowExecutionId(value: MaintenanceWindowExecutionId): Self = StObject.set(x, "WindowExecutionId", value.asInstanceOf[js.Any])
  }
}
