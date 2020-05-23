package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAssetModelRequest extends js.Object {
  /**
    * A description for the asset model.
    */
  var assetModelDescription: js.UndefOr[Description] = js.native
  /**
    * The hierarchy definitions of the asset model. Each hierarchy specifies an asset model whose assets can be children of any other assets created from this asset model. For more information, see Asset Hierarchies in the AWS IoT SiteWise User Guide. You can specify up to 10 hierarchies per asset model. For more information, see Quotas in the AWS IoT SiteWise User Guide.
    */
  var assetModelHierarchies: js.UndefOr[AssetModelHierarchyDefinitions] = js.native
  /**
    * A unique, friendly name for the asset model.
    */
  var assetModelName: Name = js.native
  /**
    * The property definitions of the asset model. For more information, see Asset Properties in the AWS IoT SiteWise User Guide. You can specify up to 200 properties per asset model. For more information, see Quotas in the AWS IoT SiteWise User Guide.
    */
  var assetModelProperties: js.UndefOr[AssetModelPropertyDefinitions] = js.native
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  /**
    * A list of key-value pairs that contain metadata for the asset model. For more information, see Tagging your AWS IoT SiteWise resources in the AWS IoT SiteWise User Guide.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateAssetModelRequest {
  @scala.inline
  def apply(
    assetModelName: Name,
    assetModelDescription: Description = null,
    assetModelHierarchies: AssetModelHierarchyDefinitions = null,
    assetModelProperties: AssetModelPropertyDefinitions = null,
    clientToken: ClientToken = null,
    tags: TagMap = null
  ): CreateAssetModelRequest = {
    val __obj = js.Dynamic.literal(assetModelName = assetModelName.asInstanceOf[js.Any])
    if (assetModelDescription != null) __obj.updateDynamic("assetModelDescription")(assetModelDescription.asInstanceOf[js.Any])
    if (assetModelHierarchies != null) __obj.updateDynamic("assetModelHierarchies")(assetModelHierarchies.asInstanceOf[js.Any])
    if (assetModelProperties != null) __obj.updateDynamic("assetModelProperties")(assetModelProperties.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssetModelRequest]
  }
}

