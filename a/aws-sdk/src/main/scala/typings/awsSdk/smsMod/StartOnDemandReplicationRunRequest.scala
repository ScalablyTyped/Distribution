package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartOnDemandReplicationRunRequest extends js.Object {
  /**
    * The description of the replication run.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The identifier of the replication job.
    */
  var replicationJobId: ReplicationJobId = js.native
}

object StartOnDemandReplicationRunRequest {
  @scala.inline
  def apply(replicationJobId: ReplicationJobId, description: Description = null): StartOnDemandReplicationRunRequest = {
    val __obj = js.Dynamic.literal(replicationJobId = replicationJobId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOnDemandReplicationRunRequest]
  }
}

