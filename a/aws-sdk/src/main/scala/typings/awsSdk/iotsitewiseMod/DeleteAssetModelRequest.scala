package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAssetModelRequest extends js.Object {
  /**
    * The ID of the asset model to delete.
    */
  var assetModelId: ID = js.native
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
}

object DeleteAssetModelRequest {
  @scala.inline
  def apply(assetModelId: ID, clientToken: ClientToken = null): DeleteAssetModelRequest = {
    val __obj = js.Dynamic.literal(assetModelId = assetModelId.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssetModelRequest]
  }
}

