package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreReplicaUpdateMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreCreateReplicaActionMod._UnmarshalledCreateReplicaAction
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreDeleteReplicaActionMod._UnmarshalledDeleteReplicaAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledReplicaUpdate extends _ReplicaUpdate {
  /**
    * <p>The parameters required for creating a replica on an existing global table.</p>
    */
  @JSName("Create")
  var Create__UnmarshalledReplicaUpdate: js.UndefOr[_UnmarshalledCreateReplicaAction] = js.undefined
  /**
    * <p>The name of the existing replica to be removed.</p>
    */
  @JSName("Delete")
  var Delete__UnmarshalledReplicaUpdate: js.UndefOr[_UnmarshalledDeleteReplicaAction] = js.undefined
}

object _UnmarshalledReplicaUpdate {
  @scala.inline
  def apply(Create: _UnmarshalledCreateReplicaAction = null, Delete: _UnmarshalledDeleteReplicaAction = null): _UnmarshalledReplicaUpdate = {
    val __obj = js.Dynamic.literal()
    if (Create != null) __obj.updateDynamic("Create")(Create)
    if (Delete != null) __obj.updateDynamic("Delete")(Delete)
    __obj.asInstanceOf[_UnmarshalledReplicaUpdate]
  }
}

