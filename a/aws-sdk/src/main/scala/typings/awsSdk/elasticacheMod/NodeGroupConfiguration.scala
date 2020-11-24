package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeGroupConfiguration extends js.Object {
  
  /**
    * Either the ElastiCache for Redis supplied 4-digit id or a user supplied id for the node group these configuration values apply to.
    */
  var NodeGroupId: js.UndefOr[AllowedNodeGroupId] = js.native
  
  /**
    * The Availability Zone where the primary node of this node group (shard) is launched.
    */
  var PrimaryAvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The output ARN of the primary node.
    */
  var PrimaryOutpostArn: js.UndefOr[String] = js.native
  
  /**
    * A list of Availability Zones to be used for the read replicas. The number of Availability Zones in this list must match the value of ReplicaCount or ReplicasPerNodeGroup if not specified.
    */
  var ReplicaAvailabilityZones: js.UndefOr[AvailabilityZonesList] = js.native
  
  /**
    * The number of read replica nodes in this node group (shard).
    */
  var ReplicaCount: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The outpost ARN of the node replicas.
    */
  var ReplicaOutpostArns: js.UndefOr[OutpostArnsList] = js.native
  
  /**
    * A string that specifies the keyspace for a particular node group. Keyspaces range from 0 to 16,383. The string is in the format startkey-endkey. Example: "0-3999" 
    */
  var Slots: js.UndefOr[String] = js.native
}
object NodeGroupConfiguration {
  
  @scala.inline
  def apply(): NodeGroupConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupConfiguration]
  }
  
  @scala.inline
  implicit class NodeGroupConfigurationOps[Self <: NodeGroupConfiguration] (val x: Self) extends AnyVal {
    
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
    def deleteNodeGroupId: Self = this.set("NodeGroupId", js.undefined)
    
    @scala.inline
    def setPrimaryAvailabilityZone(value: String): Self = this.set("PrimaryAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryAvailabilityZone: Self = this.set("PrimaryAvailabilityZone", js.undefined)
    
    @scala.inline
    def setPrimaryOutpostArn(value: String): Self = this.set("PrimaryOutpostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryOutpostArn: Self = this.set("PrimaryOutpostArn", js.undefined)
    
    @scala.inline
    def setReplicaAvailabilityZonesVarargs(value: String*): Self = this.set("ReplicaAvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setReplicaAvailabilityZones(value: AvailabilityZonesList): Self = this.set("ReplicaAvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicaAvailabilityZones: Self = this.set("ReplicaAvailabilityZones", js.undefined)
    
    @scala.inline
    def setReplicaCount(value: IntegerOptional): Self = this.set("ReplicaCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicaCount: Self = this.set("ReplicaCount", js.undefined)
    
    @scala.inline
    def setReplicaOutpostArnsVarargs(value: String*): Self = this.set("ReplicaOutpostArns", js.Array(value :_*))
    
    @scala.inline
    def setReplicaOutpostArns(value: OutpostArnsList): Self = this.set("ReplicaOutpostArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicaOutpostArns: Self = this.set("ReplicaOutpostArns", js.undefined)
    
    @scala.inline
    def setSlots(value: String): Self = this.set("Slots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlots: Self = this.set("Slots", js.undefined)
  }
}
