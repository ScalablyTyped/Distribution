package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProcessingJobsResponse extends js.Object {
  
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of processing jobs, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
  
  /**
    * An array of ProcessingJobSummary objects, each listing a processing job.
    */
  var ProcessingJobSummaries: typings.awsSdk.sagemakerMod.ProcessingJobSummaries = js.native
}
object ListProcessingJobsResponse {
  
  @scala.inline
  def apply(ProcessingJobSummaries: ProcessingJobSummaries): ListProcessingJobsResponse = {
    val __obj = js.Dynamic.literal(ProcessingJobSummaries = ProcessingJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProcessingJobsResponse]
  }
  
  @scala.inline
  implicit class ListProcessingJobsResponseOps[Self <: ListProcessingJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setProcessingJobSummariesVarargs(value: ProcessingJobSummary*): Self = this.set("ProcessingJobSummaries", js.Array(value :_*))
    
    @scala.inline
    def setProcessingJobSummaries(value: ProcessingJobSummaries): Self = this.set("ProcessingJobSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
