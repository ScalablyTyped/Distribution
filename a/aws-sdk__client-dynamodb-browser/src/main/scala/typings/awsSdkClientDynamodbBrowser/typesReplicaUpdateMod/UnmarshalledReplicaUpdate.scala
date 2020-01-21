package typings.awsSdkClientDynamodbBrowser.typesReplicaUpdateMod

import typings.awsSdkClientDynamodbBrowser.typesCreateReplicaActionMod.UnmarshalledCreateReplicaAction
import typings.awsSdkClientDynamodbBrowser.typesDeleteReplicaActionMod.UnmarshalledDeleteReplicaAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledReplicaUpdate extends ReplicaUpdate {
  /**
    * <p>The parameters required for creating a replica on an existing global table.</p>
    */
  @JSName("Create")
  var Create_UnmarshalledReplicaUpdate: js.UndefOr[UnmarshalledCreateReplicaAction] = js.undefined
  /**
    * <p>The name of the existing replica to be removed.</p>
    */
  @JSName("Delete")
  var Delete_UnmarshalledReplicaUpdate: js.UndefOr[UnmarshalledDeleteReplicaAction] = js.undefined
}

object UnmarshalledReplicaUpdate {
  @scala.inline
  def apply(Create: UnmarshalledCreateReplicaAction = null, Delete: UnmarshalledDeleteReplicaAction = null): UnmarshalledReplicaUpdate = {
    val __obj = js.Dynamic.literal()
    if (Create != null) __obj.updateDynamic("Create")(Create.asInstanceOf[js.Any])
    if (Delete != null) __obj.updateDynamic("Delete")(Delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledReplicaUpdate]
  }
}

