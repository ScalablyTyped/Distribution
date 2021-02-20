package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProcessingJobsResponse extends StObject {
  
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
  implicit class ListProcessingJobsResponseMutableBuilder[Self <: ListProcessingJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setProcessingJobSummaries(value: ProcessingJobSummaries): Self = StObject.set(x, "ProcessingJobSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingJobSummariesVarargs(value: ProcessingJobSummary*): Self = StObject.set(x, "ProcessingJobSummaries", js.Array(value :_*))
  }
}
