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
  def apply(replicationJobId: ReplicationJobId): StartOnDemandReplicationRunRequest = {
    val __obj = js.Dynamic.literal(replicationJobId = replicationJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOnDemandReplicationRunRequest]
  }
  @scala.inline
  implicit class StartOnDemandReplicationRunRequestOps[Self <: StartOnDemandReplicationRunRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReplicationJobId(value: ReplicationJobId): Self = this.set("replicationJobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
  
}

