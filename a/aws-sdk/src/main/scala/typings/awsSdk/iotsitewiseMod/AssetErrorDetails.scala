package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetErrorDetails extends js.Object {
  /**
    * The ID of the asset.
    */
  var assetId: ID = js.native
  /**
    * The error code.
    */
  var code: AssetErrorCode = js.native
  /**
    * The error message.
    */
  var message: AssetErrorMessage = js.native
}

object AssetErrorDetails {
  @scala.inline
  def apply(assetId: ID, code: AssetErrorCode, message: AssetErrorMessage): AssetErrorDetails = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetErrorDetails]
  }
  @scala.inline
  implicit class AssetErrorDetailsOps[Self <: AssetErrorDetails] (val x: Self) extends AnyVal {
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
    def setAssetId(value: ID): Self = this.set("assetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: AssetErrorCode): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: AssetErrorMessage): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

