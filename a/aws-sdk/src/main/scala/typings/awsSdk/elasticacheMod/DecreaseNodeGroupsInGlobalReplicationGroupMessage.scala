package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecreaseNodeGroupsInGlobalReplicationGroupMessage extends StObject {
  
  /**
    * Indicates that the shard reconfiguration process begins immediately. At present, the only permitted value for this parameter is true. 
    */
  var ApplyImmediately: Boolean
  
  /**
    * If the value of NodeGroupCount is less than the current number of node groups (shards), then either NodeGroupsToRemove or NodeGroupsToRetain is required. NodeGroupsToRemove is a list of NodeGroupIds to remove from the cluster. ElastiCache for Redis will attempt to remove all node groups listed by NodeGroupsToRemove from the cluster. 
    */
  var GlobalNodeGroupsToRemove: js.UndefOr[GlobalNodeGroupIdList] = js.undefined
  
  /**
    * If the value of NodeGroupCount is less than the current number of node groups (shards), then either NodeGroupsToRemove or NodeGroupsToRetain is required. NodeGroupsToRemove is a list of NodeGroupIds to remove from the cluster. ElastiCache for Redis will attempt to remove all node groups listed by NodeGroupsToRemove from the cluster. 
    */
  var GlobalNodeGroupsToRetain: js.UndefOr[GlobalNodeGroupIdList] = js.undefined
  
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: String
  
  /**
    * The number of node groups (shards) that results from the modification of the shard configuration
    */
  var NodeGroupCount: Integer
}
object DecreaseNodeGroupsInGlobalReplicationGroupMessage {
  
  inline def apply(ApplyImmediately: Boolean, GlobalReplicationGroupId: String, NodeGroupCount: Integer): DecreaseNodeGroupsInGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(ApplyImmediately = ApplyImmediately.asInstanceOf[js.Any], GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any], NodeGroupCount = NodeGroupCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecreaseNodeGroupsInGlobalReplicationGroupMessage]
  }
  
  extension [Self <: DecreaseNodeGroupsInGlobalReplicationGroupMessage](x: Self) {
    
    inline def setApplyImmediately(value: Boolean): Self = StObject.set(x, "ApplyImmediately", value.asInstanceOf[js.Any])
    
    inline def setGlobalNodeGroupsToRemove(value: GlobalNodeGroupIdList): Self = StObject.set(x, "GlobalNodeGroupsToRemove", value.asInstanceOf[js.Any])
    
    inline def setGlobalNodeGroupsToRemoveUndefined: Self = StObject.set(x, "GlobalNodeGroupsToRemove", js.undefined)
    
    inline def setGlobalNodeGroupsToRemoveVarargs(value: String*): Self = StObject.set(x, "GlobalNodeGroupsToRemove", js.Array(value :_*))
    
    inline def setGlobalNodeGroupsToRetain(value: GlobalNodeGroupIdList): Self = StObject.set(x, "GlobalNodeGroupsToRetain", value.asInstanceOf[js.Any])
    
    inline def setGlobalNodeGroupsToRetainUndefined: Self = StObject.set(x, "GlobalNodeGroupsToRetain", js.undefined)
    
    inline def setGlobalNodeGroupsToRetainVarargs(value: String*): Self = StObject.set(x, "GlobalNodeGroupsToRetain", js.Array(value :_*))
    
    inline def setGlobalReplicationGroupId(value: String): Self = StObject.set(x, "GlobalReplicationGroupId", value.asInstanceOf[js.Any])
    
    inline def setNodeGroupCount(value: Integer): Self = StObject.set(x, "NodeGroupCount", value.asInstanceOf[js.Any])
  }
}
