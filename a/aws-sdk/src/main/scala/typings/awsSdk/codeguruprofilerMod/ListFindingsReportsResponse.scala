package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFindingsReportsResponse extends StObject {
  
  /**
    * The list of analysis results summaries.
    */
  var findingsReportSummaries: FindingsReportSummaries = js.native
  
  /**
    * The nextToken value to include in a future ListFindingsReports request. When the results of a ListFindingsReports request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object ListFindingsReportsResponse {
  
  @scala.inline
  def apply(findingsReportSummaries: FindingsReportSummaries): ListFindingsReportsResponse = {
    val __obj = js.Dynamic.literal(findingsReportSummaries = findingsReportSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFindingsReportsResponse]
  }
  
  @scala.inline
  implicit class ListFindingsReportsResponseMutableBuilder[Self <: ListFindingsReportsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindingsReportSummaries(value: FindingsReportSummaries): Self = StObject.set(x, "findingsReportSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingsReportSummariesVarargs(value: FindingsReportSummary*): Self = StObject.set(x, "findingsReportSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
