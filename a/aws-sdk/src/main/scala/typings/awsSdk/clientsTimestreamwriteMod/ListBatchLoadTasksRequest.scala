package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBatchLoadTasksRequest extends StObject {
  
  /**
    * The total number of items to return in the output. If the total number of items available is more than the value specified, a NextToken is provided in the output. To resume pagination, provide the NextToken value as argument of a subsequent API invocation.
    */
  var MaxResults: js.UndefOr[PageLimit] = js.undefined
  
  /**
    * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Status of the batch load task.
    */
  var TaskStatus: js.UndefOr[BatchLoadStatus] = js.undefined
}
object ListBatchLoadTasksRequest {
  
  inline def apply(): ListBatchLoadTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBatchLoadTasksRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBatchLoadTasksRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: PageLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTaskStatus(value: BatchLoadStatus): Self = StObject.set(x, "TaskStatus", value.asInstanceOf[js.Any])
    
    inline def setTaskStatusUndefined: Self = StObject.set(x, "TaskStatus", js.undefined)
  }
}
