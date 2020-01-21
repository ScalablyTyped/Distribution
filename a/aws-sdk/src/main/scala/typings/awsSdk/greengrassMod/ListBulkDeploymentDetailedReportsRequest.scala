package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBulkDeploymentDetailedReportsRequest extends js.Object {
  /**
    * The ID of the bulk deployment.
    */
  var BulkDeploymentId: string = js.native
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[string] = js.native
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListBulkDeploymentDetailedReportsRequest {
  @scala.inline
  def apply(BulkDeploymentId: string, MaxResults: string = null, NextToken: string = null): ListBulkDeploymentDetailedReportsRequest = {
    val __obj = js.Dynamic.literal(BulkDeploymentId = BulkDeploymentId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBulkDeploymentDetailedReportsRequest]
  }
}

