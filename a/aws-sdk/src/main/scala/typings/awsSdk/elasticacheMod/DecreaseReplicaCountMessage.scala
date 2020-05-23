package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecreaseReplicaCountMessage extends js.Object {
  /**
    * If True, the number of replica nodes is decreased immediately. ApplyImmediately=False is not currently supported.
    */
  var ApplyImmediately: Boolean = js.native
  /**
    * The number of read replica nodes you want at the completion of this operation. For Redis (cluster mode disabled) replication groups, this is the number of replica nodes in the replication group. For Redis (cluster mode enabled) replication groups, this is the number of replica nodes in each of the replication group's node groups. The minimum number of replicas in a shard or replication group is:   Redis (cluster mode disabled)   If Multi-AZ with Automatic Failover is enabled: 1   If Multi-AZ with Automatic Failover is not enabled: 0     Redis (cluster mode enabled): 0 (though you will not be able to failover to a replica if your primary node fails)  
    */
  var NewReplicaCount: js.UndefOr[IntegerOptional] = js.native
  /**
    * A list of ConfigureShard objects that can be used to configure each shard in a Redis (cluster mode enabled) replication group. The ConfigureShard has three members: NewReplicaCount, NodeGroupId, and PreferredAvailabilityZones.
    */
  var ReplicaConfiguration: js.UndefOr[ReplicaConfigurationList] = js.native
  /**
    * A list of the node ids to remove from the replication group or node group (shard).
    */
  var ReplicasToRemove: js.UndefOr[RemoveReplicasList] = js.native
  /**
    * The id of the replication group from which you want to remove replica nodes.
    */
  var ReplicationGroupId: String = js.native
}

object DecreaseReplicaCountMessage {
  @scala.inline
  def apply(
    ApplyImmediately: Boolean,
    ReplicationGroupId: String,
    NewReplicaCount: js.UndefOr[IntegerOptional] = js.undefined,
    ReplicaConfiguration: ReplicaConfigurationList = null,
    ReplicasToRemove: RemoveReplicasList = null
  ): DecreaseReplicaCountMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
    if (!js.isUndefined(NewReplicaCount)) __obj.updateDynamic("NewReplicaCount")(NewReplicaCount.get.asInstanceOf[js.Any])
    if (ReplicaConfiguration != null) __obj.updateDynamic("ReplicaConfiguration")(ReplicaConfiguration.asInstanceOf[js.Any])
    if (ReplicasToRemove != null) __obj.updateDynamic("ReplicasToRemove")(ReplicasToRemove.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecreaseReplicaCountMessage]
  }
}

