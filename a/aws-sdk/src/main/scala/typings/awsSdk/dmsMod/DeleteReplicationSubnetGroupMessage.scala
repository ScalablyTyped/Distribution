package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReplicationSubnetGroupMessage extends js.Object {
  /**
    * The subnet group name of the replication instance.
    */
  var ReplicationSubnetGroupIdentifier: String = js.native
}

object DeleteReplicationSubnetGroupMessage {
  @scala.inline
  def apply(ReplicationSubnetGroupIdentifier: String): DeleteReplicationSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(ReplicationSubnetGroupIdentifier = ReplicationSubnetGroupIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicationSubnetGroupMessage]
  }
  @scala.inline
  implicit class DeleteReplicationSubnetGroupMessageOps[Self <: DeleteReplicationSubnetGroupMessage] (val x: Self) extends AnyVal {
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
    def setReplicationSubnetGroupIdentifier(value: String): Self = this.set("ReplicationSubnetGroupIdentifier", value.asInstanceOf[js.Any])
  }
  
}

