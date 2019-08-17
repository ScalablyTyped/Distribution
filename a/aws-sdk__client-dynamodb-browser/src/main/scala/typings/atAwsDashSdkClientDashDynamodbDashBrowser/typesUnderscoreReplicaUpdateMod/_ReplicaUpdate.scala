package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreReplicaUpdateMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreCreateReplicaActionMod._CreateReplicaAction
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreDeleteReplicaActionMod._DeleteReplicaAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ReplicaUpdate extends js.Object {
  /**
    * <p>The parameters required for creating a replica on an existing global table.</p>
    */
  var Create: js.UndefOr[_CreateReplicaAction] = js.undefined
  /**
    * <p>The name of the existing replica to be removed.</p>
    */
  var Delete: js.UndefOr[_DeleteReplicaAction] = js.undefined
}

object _ReplicaUpdate {
  @scala.inline
  def apply(Create: _CreateReplicaAction = null, Delete: _DeleteReplicaAction = null): _ReplicaUpdate = {
    val __obj = js.Dynamic.literal()
    if (Create != null) __obj.updateDynamic("Create")(Create)
    if (Delete != null) __obj.updateDynamic("Delete")(Delete)
    __obj.asInstanceOf[_ReplicaUpdate]
  }
}

