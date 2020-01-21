package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReplicationInstanceMessage extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the replication instance to be deleted.
    */
  var ReplicationInstanceArn: String = js.native
}

object DeleteReplicationInstanceMessage {
  @scala.inline
  def apply(ReplicationInstanceArn: String): DeleteReplicationInstanceMessage = {
    val __obj = js.Dynamic.literal(ReplicationInstanceArn = ReplicationInstanceArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteReplicationInstanceMessage]
  }
}

