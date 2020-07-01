package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAssetModelResponse extends js.Object {
  /**
    * The status of the asset model, which contains a state (UPDATING after successfully calling this operation) and any error message.
    */
  var assetModelStatus: AssetModelStatus = js.native
}

object UpdateAssetModelResponse {
  @scala.inline
  def apply(assetModelStatus: AssetModelStatus): UpdateAssetModelResponse = {
    val __obj = js.Dynamic.literal(assetModelStatus = assetModelStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssetModelResponse]
  }
}

