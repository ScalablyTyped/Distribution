package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFindingsReportAccountSummaryResponse extends js.Object {
  
  /**
    * The nextToken value to include in a future GetFindingsReportAccountSummary request. When the results of a GetFindingsReportAccountSummary request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The return list of  FindingsReportSummary  objects taht contain summaries of analysis results for all profiling groups in your AWS account.
    */
  var reportSummaries: FindingsReportSummaries = js.native
}
object GetFindingsReportAccountSummaryResponse {
  
  @scala.inline
  def apply(reportSummaries: FindingsReportSummaries): GetFindingsReportAccountSummaryResponse = {
    val __obj = js.Dynamic.literal(reportSummaries = reportSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsReportAccountSummaryResponse]
  }
  
  @scala.inline
  implicit class GetFindingsReportAccountSummaryResponseOps[Self <: GetFindingsReportAccountSummaryResponse] (val x: Self) extends AnyVal {
    
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
    def setReportSummariesVarargs(value: FindingsReportSummary*): Self = this.set("reportSummaries", js.Array(value :_*))
    
    @scala.inline
    def setReportSummaries(value: FindingsReportSummaries): Self = this.set("reportSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
