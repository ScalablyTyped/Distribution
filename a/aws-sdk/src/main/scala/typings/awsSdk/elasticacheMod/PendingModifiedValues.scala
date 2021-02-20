package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingModifiedValues extends StObject {
  
  /**
    * The auth token status
    */
  var AuthTokenStatus: js.UndefOr[AuthTokenUpdateStatus] = js.native
  
  /**
    * A list of cache node IDs that are being removed (or will be removed) from the cluster. A node ID is a 4-digit numeric identifier (0001, 0002, etc.).
    */
  var CacheNodeIdsToRemove: js.UndefOr[CacheNodeIdsList] = js.native
  
  /**
    * The cache node type that this cluster or replication group is scaled to.
    */
  var CacheNodeType: js.UndefOr[String] = js.native
  
  /**
    * The new cache engine version that the cluster runs.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    * The new number of cache nodes for the cluster. For clusters running Redis, this value must be 1. For clusters running Memcached, this value must be between 1 and 20.
    */
  var NumCacheNodes: js.UndefOr[IntegerOptional] = js.native
}
object PendingModifiedValues {
  
  @scala.inline
  def apply(): PendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingModifiedValues]
  }
  
  @scala.inline
  implicit class PendingModifiedValuesMutableBuilder[Self <: PendingModifiedValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthTokenStatus(value: AuthTokenUpdateStatus): Self = StObject.set(x, "AuthTokenStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthTokenStatusUndefined: Self = StObject.set(x, "AuthTokenStatus", js.undefined)
    
    @scala.inline
    def setCacheNodeIdsToRemove(value: CacheNodeIdsList): Self = StObject.set(x, "CacheNodeIdsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheNodeIdsToRemoveUndefined: Self = StObject.set(x, "CacheNodeIdsToRemove", js.undefined)
    
    @scala.inline
    def setCacheNodeIdsToRemoveVarargs(value: String*): Self = StObject.set(x, "CacheNodeIdsToRemove", js.Array(value :_*))
    
    @scala.inline
    def setCacheNodeType(value: String): Self = StObject.set(x, "CacheNodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheNodeTypeUndefined: Self = StObject.set(x, "CacheNodeType", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setNumCacheNodes(value: IntegerOptional): Self = StObject.set(x, "NumCacheNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumCacheNodesUndefined: Self = StObject.set(x, "NumCacheNodes", js.undefined)
  }
}
