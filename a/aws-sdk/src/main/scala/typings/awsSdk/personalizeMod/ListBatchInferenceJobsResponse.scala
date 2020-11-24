package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBatchInferenceJobsResponse extends js.Object {
  
  /**
    * A list containing information on each job that is returned.
    */
  var batchInferenceJobs: js.UndefOr[BatchInferenceJobs] = js.native
  
  /**
    * The token to use to retreive the next page of results. The value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListBatchInferenceJobsResponse {
  
  @scala.inline
  def apply(): ListBatchInferenceJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBatchInferenceJobsResponse]
  }
  
  @scala.inline
  implicit class ListBatchInferenceJobsResponseOps[Self <: ListBatchInferenceJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBatchInferenceJobsVarargs(value: BatchInferenceJobSummary*): Self = this.set("batchInferenceJobs", js.Array(value :_*))
    
    @scala.inline
    def setBatchInferenceJobs(value: BatchInferenceJobs): Self = this.set("batchInferenceJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchInferenceJobs: Self = this.set("batchInferenceJobs", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
