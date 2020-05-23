package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDashboardsResponse extends js.Object {
  /**
    * A list that summarizes each dashboard in the project.
    */
  var dashboardSummaries: DashboardSummaries = js.native
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDashboardsResponse {
  @scala.inline
  def apply(dashboardSummaries: DashboardSummaries, nextToken: NextToken = null): ListDashboardsResponse = {
    val __obj = js.Dynamic.literal(dashboardSummaries = dashboardSummaries.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDashboardsResponse]
  }
}

