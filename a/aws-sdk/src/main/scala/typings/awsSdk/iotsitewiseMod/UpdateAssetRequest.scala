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
  def apply(assetId: ID, assetName: Name, clientToken: ClientToken = null): UpdateAssetRequest = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any], assetName = assetName.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssetRequest]
  }
}

