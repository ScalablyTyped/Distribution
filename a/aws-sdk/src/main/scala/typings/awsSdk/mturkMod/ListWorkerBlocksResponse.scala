package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWorkerBlocksResponse extends StObject {
  
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    *  The number of assignments on the page in the filtered results list, equivalent to the number of assignments returned by this call.
    */
  var NumResults: js.UndefOr[Integer] = js.native
  
  /**
    *  The list of WorkerBlocks, containing the collection of Worker IDs and reasons for blocking.
    */
  var WorkerBlocks: js.UndefOr[WorkerBlockList] = js.native
}
object ListWorkerBlocksResponse {
  
  @scala.inline
  def apply(): ListWorkerBlocksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWorkerBlocksResponse]
  }
  
  @scala.inline
  implicit class ListWorkerBlocksResponseMutableBuilder[Self <: ListWorkerBlocksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setNumResults(value: Integer): Self = StObject.set(x, "NumResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumResultsUndefined: Self = StObject.set(x, "NumResults", js.undefined)
    
    @scala.inline
    def setWorkerBlocks(value: WorkerBlockList): Self = StObject.set(x, "WorkerBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerBlocksUndefined: Self = StObject.set(x, "WorkerBlocks", js.undefined)
    
    @scala.inline
    def setWorkerBlocksVarargs(value: WorkerBlock*): Self = StObject.set(x, "WorkerBlocks", js.Array(value :_*))
  }
}
