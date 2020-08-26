package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchDashboardsResponse extends js.Object {
  /**
    * The list of dashboards owned by the user specified in Filters in your request.
    */
  var DashboardSummaryList: js.UndefOr[typings.awsSdk.quicksightMod.DashboardSummaryList] = js.native
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object SearchDashboardsResponse {
  @scala.inline
  def apply(): SearchDashboardsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchDashboardsResponse]
  }
  @scala.inline
  implicit class SearchDashboardsResponseOps[Self <: SearchDashboardsResponse] (val x: Self) extends AnyVal {
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
    def setDashboardSummaryListVarargs(value: DashboardSummary*): Self = this.set("DashboardSummaryList", js.Array(value :_*))
    @scala.inline
    def setDashboardSummaryList(value: DashboardSummaryList): Self = this.set("DashboardSummaryList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashboardSummaryList: Self = this.set("DashboardSummaryList", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

