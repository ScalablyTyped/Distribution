package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingsReportAccountSummaryRequest extends js.Object {
  /**
    * A Boolean value indicating whether to only return reports from daily profiles. If set to True, only analysis data from daily profiles is returned. If set to False, analysis data is returned from smaller time windows (for example, one hour).
    */
  var dailyReportsOnly: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of results returned by  GetFindingsReportAccountSummary in paginated output. When this parameter is used, GetFindingsReportAccountSummary only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another GetFindingsReportAccountSummary request with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The nextToken value returned from a previous paginated GetFindingsReportAccountSummary request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.   This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object GetFindingsReportAccountSummaryRequest {
  @scala.inline
  def apply(): GetFindingsReportAccountSummaryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFindingsReportAccountSummaryRequest]
  }
  @scala.inline
  implicit class GetFindingsReportAccountSummaryRequestOps[Self <: GetFindingsReportAccountSummaryRequest] (val x: Self) extends AnyVal {
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
    def setDailyReportsOnly(value: Boolean): Self = this.set("dailyReportsOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDailyReportsOnly: Self = this.set("dailyReportsOnly", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

