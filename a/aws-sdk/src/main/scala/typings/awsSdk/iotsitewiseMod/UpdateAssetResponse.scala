package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAssetResponse extends js.Object {
  /**
    * The status of the asset, which contains a state (UPDATING after successfully calling this action) and any error message.
    */
  var assetStatus: AssetStatus = js.native
}

object UpdateAssetResponse {
  @scala.inline
  def apply(assetStatus: AssetStatus): UpdateAssetResponse = {
    val __obj = js.Dynamic.literal(assetStatus = assetStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssetResponse]
  }
}

