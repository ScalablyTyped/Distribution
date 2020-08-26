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
  @scala.inline
  implicit class DeleteReplicationInstanceMessageOps[Self <: DeleteReplicationInstanceMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReplicationInstanceArn(value: String): Self = this.set("ReplicationInstanceArn", value.asInstanceOf[js.Any])
  }
  
}

