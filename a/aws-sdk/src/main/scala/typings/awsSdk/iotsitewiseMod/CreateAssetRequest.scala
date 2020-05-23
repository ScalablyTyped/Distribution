package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAssetRequest extends js.Object {
  /**
    * The ID of the asset model from which to create the asset.
    */
  var assetModelId: ID = js.native
  /**
    * A unique, friendly name for the asset.
    */
  var assetName: Name = js.native
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  /**
    * A list of key-value pairs that contain metadata for the asset. For more information, see Tagging your AWS IoT SiteWise resources in the AWS IoT SiteWise User Guide.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateAssetRequest {
  @scala.inline
  def apply(assetModelId: ID, assetName: Name, clientToken: ClientToken = null, tags: TagMap = null): CreateAssetRequest = {
    val __obj = js.Dynamic.literal(assetModelId = assetModelId.asInstanceOf[js.Any], assetName = assetName.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssetRequest]
  }
}

