package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAssetPropertyValueHistoryResponse extends js.Object {
  /**
    * The asset property's value history.
    */
  var assetPropertyValueHistory: AssetPropertyValueHistory = js.native
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetAssetPropertyValueHistoryResponse {
  @scala.inline
  def apply(assetPropertyValueHistory: AssetPropertyValueHistory, nextToken: NextToken = null): GetAssetPropertyValueHistoryResponse = {
    val __obj = js.Dynamic.literal(assetPropertyValueHistory = assetPropertyValueHistory.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssetPropertyValueHistoryResponse]
  }
}

