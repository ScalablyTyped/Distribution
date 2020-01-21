package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaUpdate extends js.Object {
  /**
    * The parameters required for creating a replica on an existing global table.
    */
  var Create: js.UndefOr[CreateReplicaAction] = js.native
  /**
    * The name of the existing replica to be removed.
    */
  var Delete: js.UndefOr[DeleteReplicaAction] = js.native
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

