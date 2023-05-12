package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBatchLoadTaskRequest extends StObject {
  
  /**
    * The ID of the batch load task.
    */
  var TaskId: BatchLoadTaskId
}
object DescribeBatchLoadTaskRequest {
  
  inline def apply(TaskId: BatchLoadTaskId): DescribeBatchLoadTaskRequest = {
    val __obj = js.Dynamic.literal(TaskId = TaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBatchLoadTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeBatchLoadTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setTaskId(value: BatchLoadTaskId): Self = StObject.set(x, "TaskId", value.asInstanceOf[js.Any])
  }
}
