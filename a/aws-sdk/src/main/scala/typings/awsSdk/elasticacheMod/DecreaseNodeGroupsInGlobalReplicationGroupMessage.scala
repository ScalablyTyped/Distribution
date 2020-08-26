package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecreaseNodeGroupsInGlobalReplicationGroupMessage extends js.Object {
  /**
    * Indicates that the shard reconfiguration process begins immediately. At present, the only permitted value for this parameter is true. 
    */
  var ApplyImmediately: Boolean = js.native
  /**
    * If the value of NodeGroupCount is less than the current number of node groups (shards), then either NodeGroupsToRemove or NodeGroupsToRetain is required. NodeGroupsToRemove is a list of NodeGroupIds to remove from the cluster. ElastiCache for Redis will attempt to remove all node groups listed by NodeGroupsToRemove from the cluster. 
    */
  var GlobalNodeGroupsToRemove: js.UndefOr[GlobalNodeGroupIdList] = js.native
  /**
    * If the value of NodeGroupCount is less than the current number of node groups (shards), then either NodeGroupsToRemove or NodeGroupsToRetain is required. NodeGroupsToRemove is a list of NodeGroupIds to remove from the cluster. ElastiCache for Redis will attempt to remove all node groups listed by NodeGroupsToRemove from the cluster. 
    */
  var GlobalNodeGroupsToRetain: js.UndefOr[GlobalNodeGroupIdList] = js.native
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: String = js.native
  /**
    * The number of node groups (shards) that results from the modification of the shard configuration
    */
  var NodeGroupCount: Integer = js.native
}

object DecreaseNodeGroupsInGlobalReplicationGroupMessage {
  @scala.inline
  def apply(ApplyImmediately: Boolean, GlobalReplicationGroupId: String, NodeGroupCount: Integer): DecreaseNodeGroupsInGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any], NodeGroupCount = NodeGroupCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecreaseNodeGroupsInGlobalReplicationGroupMessage]
  }
  @scala.inline
  implicit class DecreaseNodeGroupsInGlobalReplicationGroupMessageOps[Self <: DecreaseNodeGroupsInGlobalReplicationGroupMessage] (val x: Self) extends AnyVal {
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
    def setApplyImmediately(value: Boolean): Self = this.set("ApplyImmediately", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobalReplicationGroupId(value: String): Self = this.set("GlobalReplicationGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeGroupCount(value: Integer): Self = this.set("NodeGroupCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobalNodeGroupsToRemoveVarargs(value: String*): Self = this.set("GlobalNodeGroupsToRemove", js.Array(value :_*))
    @scala.inline
    def setGlobalNodeGroupsToRemove(value: GlobalNodeGroupIdList): Self = this.set("GlobalNodeGroupsToRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalNodeGroupsToRemove: Self = this.set("GlobalNodeGroupsToRemove", js.undefined)
    @scala.inline
    def setGlobalNodeGroupsToRetainVarargs(value: String*): Self = this.set("GlobalNodeGroupsToRetain", js.Array(value :_*))
    @scala.inline
    def setGlobalNodeGroupsToRetain(value: GlobalNodeGroupIdList): Self = this.set("GlobalNodeGroupsToRetain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalNodeGroupsToRetain: Self = this.set("GlobalNodeGroupsToRetain", js.undefined)
  }
  
}

