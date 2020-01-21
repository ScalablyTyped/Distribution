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
}

