package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAssetModelResponse extends js.Object {
  /**
    * The status of the asset model, which contains a state (DELETING after successfully calling this action) and any error message.
    */
  var assetModelStatus: AssetModelStatus = js.native
}

object DeleteAssetModelResponse {
  @scala.inline
  def apply(assetModelStatus: AssetModelStatus): DeleteAssetModelResponse = {
    val __obj = js.Dynamic.literal(assetModelStatus = assetModelStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssetModelResponse]
  }
}

