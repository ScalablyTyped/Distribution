package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDashboardsRequest extends js.Object {
  /**
    * The maximum number of results to be returned per paginated request.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token to be used for the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The ID of the project.
    */
  var projectId: ID = js.native
}

object ListDashboardsRequest {
  @scala.inline
  def apply(projectId: ID, maxResults: js.UndefOr[MaxResults] = js.undefined, nextToken: NextToken = null): ListDashboardsRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDashboardsRequest]
  }
}

