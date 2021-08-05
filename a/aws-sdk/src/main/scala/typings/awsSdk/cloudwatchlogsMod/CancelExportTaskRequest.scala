package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelExportTaskRequest extends StObject {
  
  /**
    * The ID of the export task.
    */
  var taskId: ExportTaskId
}
object CancelExportTaskRequest {
  
  inline def apply(taskId: ExportTaskId): CancelExportTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelExportTaskRequest]
  }
  
  extension [Self <: CancelExportTaskRequest](x: Self) {
    
    inline def setTaskId(value: ExportTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
