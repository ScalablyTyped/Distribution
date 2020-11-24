package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecreaseReplicaCountMessage extends js.Object {
  
  /**
    * If True, the number of replica nodes is decreased immediately. ApplyImmediately=False is not currently supported.
    */
  var ApplyImmediately: Boolean = js.native
  
  /**
    * The number of read replica nodes you want at the completion of this operation. For Redis (cluster mode disabled) replication groups, this is the number of replica nodes in the replication group. For Redis (cluster mode enabled) replication groups, this is the number of replica nodes in each of the replication group's node groups. The minimum number of replicas in a shard or replication group is:   Redis (cluster mode disabled)   If Multi-AZ is enabled: 1   If Multi-AZ is not enabled: 0     Redis (cluster mode enabled): 0 (though you will not be able to failover to a replica if your primary node fails)  
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
  def apply(ApplyImmediately: Boolean, ReplicationGroupId: String): DecreaseReplicaCountMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecreaseReplicaCountMessage]
  }
  
  @scala.inline
  implicit class DecreaseReplicaCountMessageOps[Self <: DecreaseReplicaCountMessage] (val x: Self) extends AnyVal {
    
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
    def setReplicationGroupId(value: String): Self = this.set("ReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewReplicaCount(value: IntegerOptional): Self = this.set("NewReplicaCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewReplicaCount: Self = this.set("NewReplicaCount", js.undefined)
    
    @scala.inline
    def setReplicaConfigurationVarargs(value: ConfigureShard*): Self = this.set("ReplicaConfiguration", js.Array(value :_*))
    
    @scala.inline
    def setReplicaConfiguration(value: ReplicaConfigurationList): Self = this.set("ReplicaConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicaConfiguration: Self = this.set("ReplicaConfiguration", js.undefined)
    
    @scala.inline
    def setReplicasToRemoveVarargs(value: String*): Self = this.set("ReplicasToRemove", js.Array(value :_*))
    
    @scala.inline
    def setReplicasToRemove(value: RemoveReplicasList): Self = this.set("ReplicasToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicasToRemove: Self = this.set("ReplicasToRemove", js.undefined)
  }
}
