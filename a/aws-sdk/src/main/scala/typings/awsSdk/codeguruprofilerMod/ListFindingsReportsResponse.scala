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
  def apply(findingsReportSummaries: FindingsReportSummaries): ListFindingsReportsResponse = {
    val __obj = js.Dynamic.literal(findingsReportSummaries = findingsReportSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFindingsReportsResponse]
  }
  @scala.inline
  implicit class ListFindingsReportsResponseOps[Self <: ListFindingsReportsResponse] (val x: Self) extends AnyVal {
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
    def setFindingsReportSummariesVarargs(value: FindingsReportSummary*): Self = this.set("findingsReportSummaries", js.Array(value :_*))
    @scala.inline
    def setFindingsReportSummaries(value: FindingsReportSummaries): Self = this.set("findingsReportSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

