package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAssetRequest extends js.Object {
  /**
    * The ID of the asset to update.
    */
  var assetId: ID = js.native
  /**
    * A unique, friendly name for the asset.
    */
  var assetName: Name = js.native
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
}

object UpdateAssetRequest {
  @scala.inline
  def apply(assetId: ID, assetName: Name): UpdateAssetRequest = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any], assetName = assetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssetRequest]
  }
  @scala.inline
  implicit class UpdateAssetRequestOps[Self <: UpdateAssetRequest] (val x: Self) extends AnyVal {
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
    def setAssetName(value: Name): Self = this.set("assetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
  }
  
}

