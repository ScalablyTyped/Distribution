package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopReplicationTaskResponse extends js.Object {
  /**
    * The replication task stopped.
    */
  var ReplicationTask: js.UndefOr[typings.awsSdk.dmsMod.ReplicationTask] = js.native
}

object StopReplicationTaskResponse {
  @scala.inline
  def apply(ReplicationTask: ReplicationTask = null): StopReplicationTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (ReplicationTask != null) __obj.updateDynamic("ReplicationTask")(ReplicationTask.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopReplicationTaskResponse]
  }
}

