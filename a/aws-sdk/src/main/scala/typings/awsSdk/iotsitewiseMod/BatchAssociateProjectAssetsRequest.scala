package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAssociateProjectAssetsRequest extends js.Object {
  /**
    * The IDs of the assets to be associated to the project.
    */
  var assetIds: IDs = js.native
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  /**
    * The ID of the project to which to associate the assets.
    */
  var projectId: ID = js.native
}

object BatchAssociateProjectAssetsRequest {
  @scala.inline
  def apply(assetIds: IDs, projectId: ID): BatchAssociateProjectAssetsRequest = {
    val __obj = js.Dynamic.literal(assetIds = assetIds.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAssociateProjectAssetsRequest]
  }
  @scala.inline
  implicit class BatchAssociateProjectAssetsRequestOps[Self <: BatchAssociateProjectAssetsRequest] (val x: Self) extends AnyVal {
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
    def setAssetIdsVarargs(value: ID*): Self = this.set("assetIds", js.Array(value :_*))
    @scala.inline
    def setAssetIds(value: IDs): Self = this.set("assetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectId(value: ID): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
  }
  
}

