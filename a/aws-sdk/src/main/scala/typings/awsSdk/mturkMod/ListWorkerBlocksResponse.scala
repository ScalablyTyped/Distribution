package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWorkerBlocksResponse extends js.Object {
  
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
  implicit class ListWorkerBlocksResponseOps[Self <: ListWorkerBlocksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setNumResults(value: Integer): Self = this.set("NumResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumResults: Self = this.set("NumResults", js.undefined)
    
    @scala.inline
    def setWorkerBlocksVarargs(value: WorkerBlock*): Self = this.set("WorkerBlocks", js.Array(value :_*))
    
    @scala.inline
    def setWorkerBlocks(value: WorkerBlockList): Self = this.set("WorkerBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerBlocks: Self = this.set("WorkerBlocks", js.undefined)
  }
}
