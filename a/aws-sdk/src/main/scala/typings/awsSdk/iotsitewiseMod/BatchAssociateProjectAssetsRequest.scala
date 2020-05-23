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
  def apply(assetIds: IDs, projectId: ID, clientToken: ClientToken = null): BatchAssociateProjectAssetsRequest = {
    val __obj = js.Dynamic.literal(assetIds = assetIds.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAssociateProjectAssetsRequest]
  }
}

