package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProjectAssetsResponse extends js.Object {
  /**
    * A list that contains the IDs of each asset associated with the project.
    */
  var assetIds: AssetIDs = js.native
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListProjectAssetsResponse {
  @scala.inline
  def apply(assetIds: AssetIDs, nextToken: NextToken = null): ListProjectAssetsResponse = {
    val __obj = js.Dynamic.literal(assetIds = assetIds.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProjectAssetsResponse]
  }
}

