package typings.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDocumentAnalysisRequest extends StObject {
  
  /**
    * A unique identifier for the text-detection job. The JobId is returned from StartDocumentAnalysis. A JobId value is only valid for 7 days.
    */
  var JobId: typings.awsSdk.textractMod.JobId
  
  /**
    * The maximum number of results to return per paginated call. The largest value that you can specify is 1,000. If you specify a value greater than 1,000, a maximum of 1,000 results is returned. The default value is 1,000.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.textractMod.MaxResults] = js.undefined
  
  /**
    * If the previous response was incomplete (because there are more blocks to retrieve), Amazon Textract returns a pagination token in the response. You can use this pagination token to retrieve the next set of blocks.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object GetDocumentAnalysisRequest {
  
  @scala.inline
  def apply(JobId: JobId): GetDocumentAnalysisRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentAnalysisRequest]
  }
  
  @scala.inline
  implicit class GetDocumentAnalysisRequestMutableBuilder[Self <: GetDocumentAnalysisRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
