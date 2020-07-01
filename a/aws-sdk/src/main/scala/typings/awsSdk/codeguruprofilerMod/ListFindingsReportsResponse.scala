package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFindingsReportsResponse extends js.Object {
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
  def apply(findingsReportSummaries: FindingsReportSummaries, nextToken: PaginationToken = null): ListFindingsReportsResponse = {
    val __obj = js.Dynamic.literal(findingsReportSummaries = findingsReportSummaries.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFindingsReportsResponse]
  }
}

