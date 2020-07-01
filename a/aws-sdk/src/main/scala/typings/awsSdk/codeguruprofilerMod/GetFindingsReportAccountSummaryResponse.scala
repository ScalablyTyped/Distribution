package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(reportSummaries: FindingsReportSummaries, nextToken: PaginationToken = null): GetFindingsReportAccountSummaryResponse = {
    val __obj = js.Dynamic.literal(reportSummaries = reportSummaries.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsReportAccountSummaryResponse]
  }
}

