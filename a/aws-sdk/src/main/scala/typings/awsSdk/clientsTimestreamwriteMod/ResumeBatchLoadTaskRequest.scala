package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResumeBatchLoadTaskRequest extends StObject {
  
  /**
    * The ID of the batch load task to resume.
    */
  var TaskId: BatchLoadTaskId
}
object ResumeBatchLoadTaskRequest {
  
  inline def apply(TaskId: BatchLoadTaskId): ResumeBatchLoadTaskRequest = {
    val __obj = js.Dynamic.literal(TaskId = TaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumeBatchLoadTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResumeBatchLoadTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setTaskId(value: BatchLoadTaskId): Self = StObject.set(x, "TaskId", value.asInstanceOf[js.Any])
  }
}
