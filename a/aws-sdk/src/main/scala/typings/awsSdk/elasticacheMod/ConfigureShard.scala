package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigureShard extends StObject {
  
  /**
    * The number of replicas you want in this node group at the end of this operation. The maximum value for NewReplicaCount is 5. The minimum value depends upon the type of Redis replication group you are working with. The minimum number of replicas in a shard or replication group is:   Redis (cluster mode disabled)   If Multi-AZ: 1   If Multi-AZ: 0     Redis (cluster mode enabled): 0 (though you will not be able to failover to a replica if your primary node fails)  
    */
  var NewReplicaCount: Integer
  
  /**
    * The 4-digit id for the node group you are configuring. For Redis (cluster mode disabled) replication groups, the node group id is always 0001. To find a Redis (cluster mode enabled)'s node group's (shard's) id, see Finding a Shard's Id.
    */
  var NodeGroupId: AllowedNodeGroupId
  
  /**
    * A list of PreferredAvailabilityZone strings that specify which availability zones the replication group's nodes are to be in. The nummber of PreferredAvailabilityZone values must equal the value of NewReplicaCount plus 1 to account for the primary node. If this member of ReplicaConfiguration is omitted, ElastiCache for Redis selects the availability zone for each of the replicas.
    */
  var PreferredAvailabilityZones: js.UndefOr[PreferredAvailabilityZoneList] = js.undefined
  
  /**
    * The outpost ARNs in which the cache cluster is created.
    */
  var PreferredOutpostArns: js.UndefOr[PreferredOutpostArnList] = js.undefined
}
object ConfigureShard {
  
  @scala.inline
  def apply(NewReplicaCount: Integer, NodeGroupId: AllowedNodeGroupId): ConfigureShard = {
    val __obj = js.Dynamic.literal(NewReplicaCount = NewReplicaCount.asInstanceOf[js.Any], NodeGroupId = NodeGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureShard]
  }
  
  @scala.inline
  implicit class ConfigureShardMutableBuilder[Self <: ConfigureShard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewReplicaCount(value: Integer): Self = StObject.set(x, "NewReplicaCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeGroupId(value: AllowedNodeGroupId): Self = StObject.set(x, "NodeGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredAvailabilityZones(value: PreferredAvailabilityZoneList): Self = StObject.set(x, "PreferredAvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredAvailabilityZonesUndefined: Self = StObject.set(x, "PreferredAvailabilityZones", js.undefined)
    
    @scala.inline
    def setPreferredAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "PreferredAvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setPreferredOutpostArns(value: PreferredOutpostArnList): Self = StObject.set(x, "PreferredOutpostArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredOutpostArnsUndefined: Self = StObject.set(x, "PreferredOutpostArns", js.undefined)
    
    @scala.inline
    def setPreferredOutpostArnsVarargs(value: String*): Self = StObject.set(x, "PreferredOutpostArns", js.Array(value :_*))
  }
}
