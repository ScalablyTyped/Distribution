package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMaintenanceWindowExecutionRequest extends StObject {
  
  /**
    * The ID of the maintenance window execution that includes the task.
    */
  var WindowExecutionId: MaintenanceWindowExecutionId
}
object GetMaintenanceWindowExecutionRequest {
  
  inline def apply(WindowExecutionId: MaintenanceWindowExecutionId): GetMaintenanceWindowExecutionRequest = {
    val __obj = js.Dynamic.literal(WindowExecutionId = WindowExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMaintenanceWindowExecutionRequest]
  }
  
  extension [Self <: GetMaintenanceWindowExecutionRequest](x: Self) {
    
    inline def setWindowExecutionId(value: MaintenanceWindowExecutionId): Self = StObject.set(x, "WindowExecutionId", value.asInstanceOf[js.Any])
  }
}
