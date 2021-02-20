package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchStopUpdateActionMessage extends StObject {
  
  /**
    * The cache cluster IDs
    */
  var CacheClusterIds: js.UndefOr[CacheClusterIdList] = js.native
  
  /**
    * The replication group IDs
    */
  var ReplicationGroupIds: js.UndefOr[ReplicationGroupIdList] = js.native
  
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: String = js.native
}
object BatchStopUpdateActionMessage {
  
  @scala.inline
  def apply(ServiceUpdateName: String): BatchStopUpdateActionMessage = {
    val __obj = js.Dynamic.literal(ServiceUpdateName = ServiceUpdateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchStopUpdateActionMessage]
  }
  
  @scala.inline
  implicit class BatchStopUpdateActionMessageMutableBuilder[Self <: BatchStopUpdateActionMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheClusterIds(value: CacheClusterIdList): Self = StObject.set(x, "CacheClusterIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheClusterIdsUndefined: Self = StObject.set(x, "CacheClusterIds", js.undefined)
    
    @scala.inline
    def setCacheClusterIdsVarargs(value: String*): Self = StObject.set(x, "CacheClusterIds", js.Array(value :_*))
    
    @scala.inline
    def setReplicationGroupIds(value: ReplicationGroupIdList): Self = StObject.set(x, "ReplicationGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupIdsUndefined: Self = StObject.set(x, "ReplicationGroupIds", js.undefined)
    
    @scala.inline
    def setReplicationGroupIdsVarargs(value: String*): Self = StObject.set(x, "ReplicationGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setServiceUpdateName(value: String): Self = StObject.set(x, "ServiceUpdateName", value.asInstanceOf[js.Any])
  }
}
