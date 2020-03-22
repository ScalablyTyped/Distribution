package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGlobalReplicationGroupMessage extends js.Object {
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: String = js.native
  /**
    * If set to true, the primary replication is retained as a standalone replication group. 
    */
  var RetainPrimaryReplicationGroup: Boolean = js.native
}

object DeleteGlobalReplicationGroupMessage {
  @scala.inline
  def apply(GlobalReplicationGroupId: String, RetainPrimaryReplicationGroup: Boolean): DeleteGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any], RetainPrimaryReplicationGroup = RetainPrimaryReplicationGroup.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteGlobalReplicationGroupMessage]
  }
}

