package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchStopUpdateActionMessage extends StObject {
  
  /**
    * The cache cluster IDs
    */
  var CacheClusterIds: js.UndefOr[CacheClusterIdList] = js.undefined
  
  /**
    * The replication group IDs
    */
  var ReplicationGroupIds: js.UndefOr[ReplicationGroupIdList] = js.undefined
  
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: String
}
object BatchStopUpdateActionMessage {
  
  inline def apply(ServiceUpdateName: String): BatchStopUpdateActionMessage = {
    val __obj = js.Dynamic.literal(ServiceUpdateName = ServiceUpdateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchStopUpdateActionMessage]
  }
  
  extension [Self <: BatchStopUpdateActionMessage](x: Self) {
    
    inline def setCacheClusterIds(value: CacheClusterIdList): Self = StObject.set(x, "CacheClusterIds", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterIdsUndefined: Self = StObject.set(x, "CacheClusterIds", js.undefined)
    
    inline def setCacheClusterIdsVarargs(value: String*): Self = StObject.set(x, "CacheClusterIds", js.Array(value*))
    
    inline def setReplicationGroupIds(value: ReplicationGroupIdList): Self = StObject.set(x, "ReplicationGroupIds", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupIdsUndefined: Self = StObject.set(x, "ReplicationGroupIds", js.undefined)
    
    inline def setReplicationGroupIdsVarargs(value: String*): Self = StObject.set(x, "ReplicationGroupIds", js.Array(value*))
    
    inline def setServiceUpdateName(value: String): Self = StObject.set(x, "ServiceUpdateName", value.asInstanceOf[js.Any])
  }
}
