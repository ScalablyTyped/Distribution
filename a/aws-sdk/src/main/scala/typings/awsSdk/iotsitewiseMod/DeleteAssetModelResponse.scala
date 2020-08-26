package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAssetModelResponse extends js.Object {
  /**
    * The status of the asset model, which contains a state (DELETING after successfully calling this operation) and any error message.
    */
  var assetModelStatus: AssetModelStatus = js.native
}

object DeleteAssetModelResponse {
  @scala.inline
  def apply(assetModelStatus: AssetModelStatus): DeleteAssetModelResponse = {
    val __obj = js.Dynamic.literal(assetModelStatus = assetModelStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssetModelResponse]
  }
  @scala.inline
  implicit class DeleteAssetModelResponseOps[Self <: DeleteAssetModelResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssetModelStatus(value: AssetModelStatus): Self = this.set("assetModelStatus", value.asInstanceOf[js.Any])
  }
  
}

