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
}

