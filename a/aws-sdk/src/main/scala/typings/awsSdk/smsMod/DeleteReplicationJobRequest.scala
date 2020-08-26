package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReplicationJobRequest extends js.Object {
  /**
    * The identifier of the replication job.
    */
  var replicationJobId: ReplicationJobId = js.native
}

object DeleteReplicationJobRequest {
  @scala.inline
  def apply(replicationJobId: ReplicationJobId): DeleteReplicationJobRequest = {
    val __obj = js.Dynamic.literal(replicationJobId = replicationJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicationJobRequest]
  }
  @scala.inline
  implicit class DeleteReplicationJobRequestOps[Self <: DeleteReplicationJobRequest] (val x: Self) extends AnyVal {
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
  }
  
}

