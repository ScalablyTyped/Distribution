package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyReplicationInstanceResponse extends js.Object {
  /**
    * The modified replication instance.
    */
  var ReplicationInstance: js.UndefOr[typings.awsSdk.dmsMod.ReplicationInstance] = js.native
}

object ModifyReplicationInstanceResponse {
  @scala.inline
  def apply(ReplicationInstance: ReplicationInstance = null): ModifyReplicationInstanceResponse = {
    val __obj = js.Dynamic.literal()
    if (ReplicationInstance != null) __obj.updateDynamic("ReplicationInstance")(ReplicationInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReplicationInstanceResponse]
  }
}

