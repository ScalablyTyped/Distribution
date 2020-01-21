package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveLayerVersionPermissionRequest extends js.Object {
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: typings.awsSdk.lambdaMod.LayerName = js.native
  /**
    * Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a policy that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.native
  /**
    * The identifier that was specified when the statement was added.
    */
  var StatementId: typings.awsSdk.lambdaMod.StatementId = js.native
  /**
    * The version number.
    */
  var VersionNumber: LayerVersionNumber = js.native
}

object RemoveLayerVersionPermissionRequest {
  @scala.inline
  def apply(
    LayerName: LayerName,
    StatementId: StatementId,
    VersionNumber: LayerVersionNumber,
    RevisionId: String = null
  ): RemoveLayerVersionPermissionRequest = {
    val __obj = js.Dynamic.literal(LayerName = LayerName.asInstanceOf[js.Any], StatementId = StatementId.asInstanceOf[js.Any], VersionNumber = VersionNumber.asInstanceOf[js.Any])
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveLayerVersionPermissionRequest]
  }
}

