package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBulkDeploymentDetailedReportsResponse extends js.Object {
  /**
    * A list of the individual group deployments in the bulk deployment operation.
    */
  var Deployments: js.UndefOr[BulkDeploymentResults] = js.native
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListBulkDeploymentDetailedReportsResponse {
  @scala.inline
  def apply(Deployments: BulkDeploymentResults = null, NextToken: string = null): ListBulkDeploymentDetailedReportsResponse = {
    val __obj = js.Dynamic.literal()
    if (Deployments != null) __obj.updateDynamic("Deployments")(Deployments.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBulkDeploymentDetailedReportsResponse]
  }
}

