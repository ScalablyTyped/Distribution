package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReplicationTaskResponse extends js.Object {
  /**
    * The replication task that was created.
    */
  var ReplicationTask: js.UndefOr[typings.awsSdk.dmsMod.ReplicationTask] = js.native
}

object CreateReplicationTaskResponse {
  @scala.inline
  def apply(ReplicationTask: ReplicationTask = null): CreateReplicationTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (ReplicationTask != null) __obj.updateDynamic("ReplicationTask")(ReplicationTask.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReplicationTaskResponse]
  }
}

