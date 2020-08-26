package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigureShard extends js.Object {
  /**
    * The number of replicas you want in this node group at the end of this operation. The maximum value for NewReplicaCount is 5. The minimum value depends upon the type of Redis replication group you are working with. The minimum number of replicas in a shard or replication group is:   Redis (cluster mode disabled)   If Multi-AZ: 1   If Multi-AZ: 0     Redis (cluster mode enabled): 0 (though you will not be able to failover to a replica if your primary node fails)  
    */
  var NewReplicaCount: Integer = js.native
  /**
    * The 4-digit id for the node group you are configuring. For Redis (cluster mode disabled) replication groups, the node group id is always 0001. To find a Redis (cluster mode enabled)'s node group's (shard's) id, see Finding a Shard's Id.
    */
  var NodeGroupId: AllowedNodeGroupId = js.native
  /**
    * A list of PreferredAvailabilityZone strings that specify which availability zones the replication group's nodes are to be in. The nummber of PreferredAvailabilityZone values must equal the value of NewReplicaCount plus 1 to account for the primary node. If this member of ReplicaConfiguration is omitted, ElastiCache for Redis selects the availability zone for each of the replicas.
    */
  var PreferredAvailabilityZones: js.UndefOr[PreferredAvailabilityZoneList] = js.native
}

object ConfigureShard {
  @scala.inline
  def apply(NewReplicaCount: Integer, NodeGroupId: AllowedNodeGroupId): ConfigureShard = {
    val __obj = js.Dynamic.literal(NewReplicaCount = NewReplicaCount.asInstanceOf[js.Any], NodeGroupId = NodeGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureShard]
  }
  @scala.inline
  implicit class ConfigureShardOps[Self <: ConfigureShard] (val x: Self) extends AnyVal {
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
    def setNewReplicaCount(value: Integer): Self = this.set("NewReplicaCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeGroupId(value: AllowedNodeGroupId): Self = this.set("NodeGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreferredAvailabilityZonesVarargs(value: String*): Self = this.set("PreferredAvailabilityZones", js.Array(value :_*))
    @scala.inline
    def setPreferredAvailabilityZones(value: PreferredAvailabilityZoneList): Self = this.set("PreferredAvailabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredAvailabilityZones: Self = this.set("PreferredAvailabilityZones", js.undefined)
  }
  
}

