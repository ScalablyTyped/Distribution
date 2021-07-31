package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFindingsReportAccountSummaryRequest extends StObject {
  
  /**
    * A Boolean value indicating whether to only return reports from daily profiles. If set to True, only analysis data from daily profiles is returned. If set to False, analysis data is returned from smaller time windows (for example, one hour).
    */
  var dailyReportsOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of results returned by  GetFindingsReportAccountSummary in paginated output. When this parameter is used, GetFindingsReportAccountSummary only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another GetFindingsReportAccountSummary request with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The nextToken value returned from a previous paginated GetFindingsReportAccountSummary request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.   This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object GetFindingsReportAccountSummaryRequest {
  
  @scala.inline
  def apply(): GetFindingsReportAccountSummaryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFindingsReportAccountSummaryRequest]
  }
  
  @scala.inline
  implicit class GetFindingsReportAccountSummaryRequestMutableBuilder[Self <: GetFindingsReportAccountSummaryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDailyReportsOnly(value: Boolean): Self = StObject.set(x, "dailyReportsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyReportsOnlyUndefined: Self = StObject.set(x, "dailyReportsOnly", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
