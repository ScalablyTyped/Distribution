package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReplicationInstanceResponse extends js.Object {
  /**
    * The replication instance that was deleted.
    */
  var ReplicationInstance: js.UndefOr[typings.awsSdk.dmsMod.ReplicationInstance] = js.native
}

object DeleteReplicationInstanceResponse {
  @scala.inline
  def apply(ReplicationInstance: ReplicationInstance = null): DeleteReplicationInstanceResponse = {
    val __obj = js.Dynamic.literal()
    if (ReplicationInstance != null) __obj.updateDynamic("ReplicationInstance")(ReplicationInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicationInstanceResponse]
  }
}

