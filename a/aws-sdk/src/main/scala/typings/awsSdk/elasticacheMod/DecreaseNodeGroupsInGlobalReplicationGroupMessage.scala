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
  def apply(
    ApplyImmediately: Boolean,
    GlobalReplicationGroupId: String,
    NodeGroupCount: Integer,
    GlobalNodeGroupsToRemove: GlobalNodeGroupIdList = null,
    GlobalNodeGroupsToRetain: GlobalNodeGroupIdList = null
  ): DecreaseNodeGroupsInGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any], NodeGroupCount = NodeGroupCount.asInstanceOf[js.Any])
    if (GlobalNodeGroupsToRemove != null) __obj.updateDynamic("GlobalNodeGroupsToRemove")(GlobalNodeGroupsToRemove.asInstanceOf[js.Any])
    if (GlobalNodeGroupsToRetain != null) __obj.updateDynamic("GlobalNodeGroupsToRetain")(GlobalNodeGroupsToRetain.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecreaseNodeGroupsInGlobalReplicationGroupMessage]
  }
}

