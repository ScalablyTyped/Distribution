package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReplicationJobResponse extends js.Object {
  /**
    * The unique identifier of the replication job.
    */
  var replicationJobId: js.UndefOr[ReplicationJobId] = js.native
}

object CreateReplicationJobResponse {
  @scala.inline
  def apply(replicationJobId: ReplicationJobId = null): CreateReplicationJobResponse = {
    val __obj = js.Dynamic.literal()
    if (replicationJobId != null) __obj.updateDynamic("replicationJobId")(replicationJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReplicationJobResponse]
  }
}

