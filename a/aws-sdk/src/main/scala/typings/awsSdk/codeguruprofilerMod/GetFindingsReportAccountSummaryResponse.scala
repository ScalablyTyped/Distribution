package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFindingsReportAccountSummaryResponse extends StObject {
  
  /**
    * The nextToken value to include in a future GetFindingsReportAccountSummary request. When the results of a GetFindingsReportAccountSummary request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The return list of  FindingsReportSummary  objects taht contain summaries of analysis results for all profiling groups in your AWS account.
    */
  var reportSummaries: FindingsReportSummaries
}
object GetFindingsReportAccountSummaryResponse {
  
  inline def apply(reportSummaries: FindingsReportSummaries): GetFindingsReportAccountSummaryResponse = {
    val __obj = js.Dynamic.literal(reportSummaries = reportSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsReportAccountSummaryResponse]
  }
  
  extension [Self <: GetFindingsReportAccountSummaryResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setReportSummaries(value: FindingsReportSummaries): Self = StObject.set(x, "reportSummaries", value.asInstanceOf[js.Any])
    
    inline def setReportSummariesVarargs(value: FindingsReportSummary*): Self = StObject.set(x, "reportSummaries", js.Array(value*))
  }
}
