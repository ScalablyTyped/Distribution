package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAssociatedAssetsResponse extends js.Object {
  /**
    * A list that summarizes the associated assets.
    */
  var assetSummaries: AssociatedAssetsSummaries = js.native
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListAssociatedAssetsResponse {
  @scala.inline
  def apply(assetSummaries: AssociatedAssetsSummaries, nextToken: NextToken = null): ListAssociatedAssetsResponse = {
    val __obj = js.Dynamic.literal(assetSummaries = assetSummaries.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssociatedAssetsResponse]
  }
}

