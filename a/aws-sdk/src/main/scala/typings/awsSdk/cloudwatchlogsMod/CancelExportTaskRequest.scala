package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelExportTaskRequest extends StObject {
  
  /**
    * The ID of the export task.
    */
  var taskId: ExportTaskId = js.native
}
object CancelExportTaskRequest {
  
  @scala.inline
  def apply(taskId: ExportTaskId): CancelExportTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelExportTaskRequest]
  }
  
  @scala.inline
  implicit class CancelExportTaskRequestMutableBuilder[Self <: CancelExportTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskId(value: ExportTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
