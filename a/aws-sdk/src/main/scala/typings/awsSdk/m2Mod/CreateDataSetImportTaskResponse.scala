package typings.awsSdk.m2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataSetImportTaskResponse extends StObject {
  
  /**
    * The task identifier. This operation is asynchronous. Use this identifier with the GetDataSetImportTask operation to obtain the status of this task.
    */
  var taskId: Identifier
}
object CreateDataSetImportTaskResponse {
  
  inline def apply(taskId: Identifier): CreateDataSetImportTaskResponse = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSetImportTaskResponse]
  }
  
  extension [Self <: CreateDataSetImportTaskResponse](x: Self) {
    
    inline def setTaskId(value: Identifier): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
