package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCallAnalyticsJobsResponse extends StObject {
  
  /**
    * Provides a summary of information about each result.
    */
  var CallAnalyticsJobSummaries: js.UndefOr[typings.awsSdk.transcribeserviceMod.CallAnalyticsJobSummaries] = js.undefined
  
  /**
    * If NextToken is present in your response, it indicates that not all results are displayed. To view the next set of results, copy the string associated with the NextToken parameter in your results output, then run your request again including NextToken with the value of the copied string. Repeat as needed to view all your results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.undefined
  
  /**
    * Lists all Call Analytics jobs that have the status specified in your request. Jobs are ordered by creation date, with the newest job first.
    */
  var Status: js.UndefOr[CallAnalyticsJobStatus] = js.undefined
}
object ListCallAnalyticsJobsResponse {
  
  inline def apply(): ListCallAnalyticsJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCallAnalyticsJobsResponse]
  }
  
  extension [Self <: ListCallAnalyticsJobsResponse](x: Self) {
    
    inline def setCallAnalyticsJobSummaries(value: CallAnalyticsJobSummaries): Self = StObject.set(x, "CallAnalyticsJobSummaries", value.asInstanceOf[js.Any])
    
    inline def setCallAnalyticsJobSummariesUndefined: Self = StObject.set(x, "CallAnalyticsJobSummaries", js.undefined)
    
    inline def setCallAnalyticsJobSummariesVarargs(value: CallAnalyticsJobSummary*): Self = StObject.set(x, "CallAnalyticsJobSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatus(value: CallAnalyticsJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
