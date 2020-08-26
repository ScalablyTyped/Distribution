package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateGlobalReplicationGroupMessage extends js.Object {
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: String = js.native
  /**
    * The name of the secondary cluster you wish to remove from the Global Datastore
    */
  var ReplicationGroupId: String = js.native
  /**
    * The AWS region of secondary cluster you wish to remove from the Global Datastore
    */
  var ReplicationGroupRegion: String = js.native
}

object DisassociateGlobalReplicationGroupMessage {
  @scala.inline
  def apply(GlobalReplicationGroupId: String, ReplicationGroupId: String, ReplicationGroupRegion: String): DisassociateGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any], ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any], ReplicationGroupRegion = ReplicationGroupRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateGlobalReplicationGroupMessage]
  }
  @scala.inline
  implicit class DisassociateGlobalReplicationGroupMessageOps[Self <: DisassociateGlobalReplicationGroupMessage] (val x: Self) extends AnyVal {
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
    def setGlobalReplicationGroupId(value: String): Self = this.set("GlobalReplicationGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplicationGroupId(value: String): Self = this.set("ReplicationGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplicationGroupRegion(value: String): Self = this.set("ReplicationGroupRegion", value.asInstanceOf[js.Any])
  }
  
}

