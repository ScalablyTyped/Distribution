package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReplicationTaskMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the replication task to be deleted.
    */
  var ReplicationTaskArn: String = js.native
}

object DeleteReplicationTaskMessage {
  @scala.inline
  def apply(ReplicationTaskArn: String): DeleteReplicationTaskMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicationTaskMessage]
  }
}

