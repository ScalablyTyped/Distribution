package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyReplicationGroupShardConfigurationMessage extends StObject {
  
  /**
    * Indicates that the shard reconfiguration process begins immediately. At present, the only permitted value for this parameter is true. Value: true
    */
  var ApplyImmediately: Boolean = js.native
  
  /**
    * The number of node groups (shards) that results from the modification of the shard configuration.
    */
  var NodeGroupCount: Integer = js.native
  
  /**
    * If the value of NodeGroupCount is less than the current number of node groups (shards), then either NodeGroupsToRemove or NodeGroupsToRetain is required. NodeGroupsToRemove is a list of NodeGroupIds to remove from the cluster. ElastiCache for Redis will attempt to remove all node groups listed by NodeGroupsToRemove from the cluster.
    */
  var NodeGroupsToRemove: js.UndefOr[NodeGroupsToRemoveList] = js.native
  
  /**
    * If the value of NodeGroupCount is less than the current number of node groups (shards), then either NodeGroupsToRemove or NodeGroupsToRetain is required. NodeGroupsToRetain is a list of NodeGroupIds to retain in the cluster. ElastiCache for Redis will attempt to remove all node groups except those listed by NodeGroupsToRetain from the cluster.
    */
  var NodeGroupsToRetain: js.UndefOr[NodeGroupsToRetainList] = js.native
  
  /**
    * The name of the Redis (cluster mode enabled) cluster (replication group) on which the shards are to be configured.
    */
  var ReplicationGroupId: String = js.native
  
  /**
    * Specifies the preferred availability zones for each node group in the cluster. If the value of NodeGroupCount is greater than the current number of node groups (shards), you can use this parameter to specify the preferred availability zones of the cluster's shards. If you omit this parameter ElastiCache selects availability zones for you. You can specify this parameter only if the value of NodeGroupCount is greater than the current number of node groups (shards).
    */
  var ReshardingConfiguration: js.UndefOr[ReshardingConfigurationList] = js.native
}
object ModifyReplicationGroupShardConfigurationMessage {
  
  @scala.inline
  def apply(ApplyImmediately: Boolean, NodeGroupCount: Integer, ReplicationGroupId: String): ModifyReplicationGroupShardConfigurationMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], NodeGroupCount = NodeGroupCount.asInstanceOf[js.Any], ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReplicationGroupShardConfigurationMessage]
  }
  
  @scala.inline
  implicit class ModifyReplicationGroupShardConfigurationMessageMutableBuilder[Self <: ModifyReplicationGroupShardConfigurationMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyImmediately(value: Boolean): Self = StObject.set(x, "ApplyImmediately", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeGroupCount(value: Integer): Self = StObject.set(x, "NodeGroupCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeGroupsToRemove(value: NodeGroupsToRemoveList): Self = StObject.set(x, "NodeGroupsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeGroupsToRemoveUndefined: Self = StObject.set(x, "NodeGroupsToRemove", js.undefined)
    
    @scala.inline
    def setNodeGroupsToRemoveVarargs(value: AllowedNodeGroupId*): Self = StObject.set(x, "NodeGroupsToRemove", js.Array(value :_*))
    
    @scala.inline
    def setNodeGroupsToRetain(value: NodeGroupsToRetainList): Self = StObject.set(x, "NodeGroupsToRetain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeGroupsToRetainUndefined: Self = StObject.set(x, "NodeGroupsToRetain", js.undefined)
    
    @scala.inline
    def setNodeGroupsToRetainVarargs(value: AllowedNodeGroupId*): Self = StObject.set(x, "NodeGroupsToRetain", js.Array(value :_*))
    
    @scala.inline
    def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReshardingConfiguration(value: ReshardingConfigurationList): Self = StObject.set(x, "ReshardingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReshardingConfigurationUndefined: Self = StObject.set(x, "ReshardingConfiguration", js.undefined)
    
    @scala.inline
    def setReshardingConfigurationVarargs(value: ReshardingConfiguration*): Self = StObject.set(x, "ReshardingConfiguration", js.Array(value :_*))
  }
}
