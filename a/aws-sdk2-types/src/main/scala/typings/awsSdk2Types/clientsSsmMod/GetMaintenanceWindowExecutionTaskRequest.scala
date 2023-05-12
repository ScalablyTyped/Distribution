package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMaintenanceWindowExecutionTaskRequest extends StObject {
  
  /**
    * The ID of the specific task execution in the maintenance window task that should be retrieved.
    */
  var TaskId: MaintenanceWindowExecutionTaskId
  
  /**
    * The ID of the maintenance window execution that includes the task.
    */
  var WindowExecutionId: MaintenanceWindowExecutionId
}
object GetMaintenanceWindowExecutionTaskRequest {
  
  inline def apply(TaskId: MaintenanceWindowExecutionTaskId, WindowExecutionId: MaintenanceWindowExecutionId): GetMaintenanceWindowExecutionTaskRequest = {
    val __obj = js.Dynamic.literal(TaskId = TaskId.asInstanceOf[js.Any], WindowExecutionId = WindowExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMaintenanceWindowExecutionTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMaintenanceWindowExecutionTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setTaskId(value: MaintenanceWindowExecutionTaskId): Self = StObject.set(x, "TaskId", value.asInstanceOf[js.Any])
    
    inline def setWindowExecutionId(value: MaintenanceWindowExecutionId): Self = StObject.set(x, "WindowExecutionId", value.asInstanceOf[js.Any])
  }
}
