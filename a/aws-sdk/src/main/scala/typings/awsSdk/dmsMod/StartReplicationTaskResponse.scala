package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartReplicationTaskResponse extends js.Object {
  /**
    * The replication task started.
    */
  var ReplicationTask: js.UndefOr[typings.awsSdk.dmsMod.ReplicationTask] = js.native
}

object StartReplicationTaskResponse {
  @scala.inline
  def apply(ReplicationTask: ReplicationTask = null): StartReplicationTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (ReplicationTask != null) __obj.updateDynamic("ReplicationTask")(ReplicationTask.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartReplicationTaskResponse]
  }
}

