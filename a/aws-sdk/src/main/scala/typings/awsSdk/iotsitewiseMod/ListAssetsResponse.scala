package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAssetsResponse extends js.Object {
  /**
    * A list that summarizes each asset.
    */
  var assetSummaries: AssetSummaries = js.native
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListAssetsResponse {
  @scala.inline
  def apply(assetSummaries: AssetSummaries, nextToken: NextToken = null): ListAssetsResponse = {
    val __obj = js.Dynamic.literal(assetSummaries = assetSummaries.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssetsResponse]
  }
}

