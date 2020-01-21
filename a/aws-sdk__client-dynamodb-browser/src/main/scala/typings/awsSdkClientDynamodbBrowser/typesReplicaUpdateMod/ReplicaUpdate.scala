package typings.awsSdkClientDynamodbBrowser.typesReplicaUpdateMod

import typings.awsSdkClientDynamodbBrowser.typesCreateReplicaActionMod.CreateReplicaAction
import typings.awsSdkClientDynamodbBrowser.typesDeleteReplicaActionMod.DeleteReplicaAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicaUpdate extends js.Object {
  /**
    * <p>The parameters required for creating a replica on an existing global table.</p>
    */
  var Create: js.UndefOr[CreateReplicaAction] = js.undefined
  /**
    * <p>The name of the existing replica to be removed.</p>
    */
  var Delete: js.UndefOr[DeleteReplicaAction] = js.undefined
}

object ReplicaUpdate {
  @scala.inline
  def apply(Create: CreateReplicaAction = null, Delete: DeleteReplicaAction = null): ReplicaUpdate = {
    val __obj = js.Dynamic.literal()
    if (Create != null) __obj.updateDynamic("Create")(Create.asInstanceOf[js.Any])
    if (Delete != null) __obj.updateDynamic("Delete")(Delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaUpdate]
  }
}

