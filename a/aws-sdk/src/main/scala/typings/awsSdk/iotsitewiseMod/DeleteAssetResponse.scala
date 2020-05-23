package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAssetResponse extends js.Object {
  /**
    * The status of the asset, which contains a state (DELETING after successfully calling this action) and any error message.
    */
  var assetStatus: AssetStatus = js.native
}

object DeleteAssetResponse {
  @scala.inline
  def apply(assetStatus: AssetStatus): DeleteAssetResponse = {
    val __obj = js.Dynamic.literal(assetStatus = assetStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssetResponse]
  }
}

