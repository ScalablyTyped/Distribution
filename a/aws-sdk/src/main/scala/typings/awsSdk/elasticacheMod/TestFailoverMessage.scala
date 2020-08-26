package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestFailoverMessage extends js.Object {
  /**
    * The name of the node group (called shard in the console) in this replication group on which automatic failover is to be tested. You may test automatic failover on up to 5 node groups in any rolling 24-hour period.
    */
  var NodeGroupId: AllowedNodeGroupId = js.native
  /**
    * The name of the replication group (console: cluster) whose automatic failover is being tested by this operation.
    */
  var ReplicationGroupId: String = js.native
}

object TestFailoverMessage {
  @scala.inline
  def apply(NodeGroupId: AllowedNodeGroupId, ReplicationGroupId: String): TestFailoverMessage = {
    val __obj = js.Dynamic.literal(NodeGroupId = NodeGroupId.asInstanceOf[js.Any], ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestFailoverMessage]
  }
  @scala.inline
  implicit class TestFailoverMessageOps[Self <: TestFailoverMessage] (val x: Self) extends AnyVal {
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
    def setNodeGroupId(value: AllowedNodeGroupId): Self = this.set("NodeGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplicationGroupId(value: String): Self = this.set("ReplicationGroupId", value.asInstanceOf[js.Any])
  }
  
}

