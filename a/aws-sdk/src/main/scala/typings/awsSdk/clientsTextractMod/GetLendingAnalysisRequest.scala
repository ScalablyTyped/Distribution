package typings.awsSdk.clientsTextractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLendingAnalysisRequest extends StObject {
  
  /**
    * A unique identifier for the lending or text-detection job. The JobId is returned from StartLendingAnalysis. A JobId value is only valid for 7 days.
    */
  var JobId: typings.awsSdk.clientsTextractMod.JobId
  
  /**
    * The maximum number of results to return per paginated call. The largest value that you can specify is 30. If you specify a value greater than 30, a maximum of 30 results is returned. The default value is 30.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsTextractMod.MaxResults] = js.undefined
  
  /**
    * If the previous response was incomplete, Amazon Textract returns a pagination token in the response. You can use this pagination token to retrieve the next set of lending results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object GetLendingAnalysisRequest {
  
  inline def apply(JobId: JobId): GetLendingAnalysisRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLendingAnalysisRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLendingAnalysisRequest] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
