package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAssetModelsResponse extends js.Object {
  /**
    * A list that summarizes each asset model.
    */
  var assetModelSummaries: AssetModelSummaries = js.native
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListAssetModelsResponse {
  @scala.inline
  def apply(assetModelSummaries: AssetModelSummaries, nextToken: NextToken = null): ListAssetModelsResponse = {
    val __obj = js.Dynamic.literal(assetModelSummaries = assetModelSummaries.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssetModelsResponse]
  }
}

