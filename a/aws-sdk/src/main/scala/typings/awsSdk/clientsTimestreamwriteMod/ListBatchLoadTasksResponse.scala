package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBatchLoadTasksResponse extends StObject {
  
  /**
    * A list of batch load task details.
    */
  var BatchLoadTasks: js.UndefOr[BatchLoadTaskList] = js.undefined
  
  /**
    * A token to specify where to start paginating. Provide the next ListBatchLoadTasksRequest.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListBatchLoadTasksResponse {
  
  inline def apply(): ListBatchLoadTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBatchLoadTasksResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBatchLoadTasksResponse] (val x: Self) extends AnyVal {
    
    inline def setBatchLoadTasks(value: BatchLoadTaskList): Self = StObject.set(x, "BatchLoadTasks", value.asInstanceOf[js.Any])
    
    inline def setBatchLoadTasksUndefined: Self = StObject.set(x, "BatchLoadTasks", js.undefined)
    
    inline def setBatchLoadTasksVarargs(value: BatchLoadTask*): Self = StObject.set(x, "BatchLoadTasks", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
