package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartOnDemandReplicationRunResponse extends js.Object {
  /**
    * The identifier of the replication run.
    */
  var replicationRunId: js.UndefOr[ReplicationRunId] = js.native
}

object StartOnDemandReplicationRunResponse {
  @scala.inline
  def apply(replicationRunId: ReplicationRunId = null): StartOnDemandReplicationRunResponse = {
    val __obj = js.Dynamic.literal()
    if (replicationRunId != null) __obj.updateDynamic("replicationRunId")(replicationRunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOnDemandReplicationRunResponse]
  }
}

