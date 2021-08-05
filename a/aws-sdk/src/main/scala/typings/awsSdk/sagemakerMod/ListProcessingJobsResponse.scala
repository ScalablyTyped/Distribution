package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProcessingJobsResponse extends StObject {
  
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of processing jobs, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.undefined
  
  /**
    * An array of ProcessingJobSummary objects, each listing a processing job.
    */
  var ProcessingJobSummaries: typings.awsSdk.sagemakerMod.ProcessingJobSummaries
}
object ListProcessingJobsResponse {
  
  inline def apply(ProcessingJobSummaries: ProcessingJobSummaries): ListProcessingJobsResponse = {
    val __obj = js.Dynamic.literal(ProcessingJobSummaries = ProcessingJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProcessingJobsResponse]
  }
  
  extension [Self <: ListProcessingJobsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProcessingJobSummaries(value: ProcessingJobSummaries): Self = StObject.set(x, "ProcessingJobSummaries", value.asInstanceOf[js.Any])
    
    inline def setProcessingJobSummariesVarargs(value: ProcessingJobSummary*): Self = StObject.set(x, "ProcessingJobSummaries", js.Array(value :_*))
  }
}
