package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateAssetsRequest extends js.Object {
  /**
    * The ID of the parent asset from which to disassociate the child asset.
    */
  var assetId: ID = js.native
  /**
    * The ID of the child asset to disassociate.
    */
  var childAssetId: ID = js.native
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  /**
    * The ID of a hierarchy in the parent asset's model. Hierarchies allow different groupings of assets to be formed that all come from the same asset model. You can use the hierarchy ID to identify the correct asset to disassociate. For more information, see Asset Hierarchies in the AWS IoT SiteWise User Guide.
    */
  var hierarchyId: ID = js.native
}

object DisassociateAssetsRequest {
  @scala.inline
  def apply(assetId: ID, childAssetId: ID, hierarchyId: ID): DisassociateAssetsRequest = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any], childAssetId = childAssetId.asInstanceOf[js.Any], hierarchyId = hierarchyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateAssetsRequest]
  }
  @scala.inline
  implicit class DisassociateAssetsRequestOps[Self <: DisassociateAssetsRequest] (val x: Self) extends AnyVal {
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
    def setChildAssetId(value: ID): Self = this.set("childAssetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setHierarchyId(value: ID): Self = this.set("hierarchyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
  }
  
}

