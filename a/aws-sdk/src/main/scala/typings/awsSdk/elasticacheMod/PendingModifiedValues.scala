package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingModifiedValues extends js.Object {
  
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
  implicit class PendingModifiedValuesOps[Self <: PendingModifiedValues] (val x: Self) extends AnyVal {
    
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
    def setAuthTokenStatus(value: AuthTokenUpdateStatus): Self = this.set("AuthTokenStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthTokenStatus: Self = this.set("AuthTokenStatus", js.undefined)
    
    @scala.inline
    def setCacheNodeIdsToRemoveVarargs(value: String*): Self = this.set("CacheNodeIdsToRemove", js.Array(value :_*))
    
    @scala.inline
    def setCacheNodeIdsToRemove(value: CacheNodeIdsList): Self = this.set("CacheNodeIdsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheNodeIdsToRemove: Self = this.set("CacheNodeIdsToRemove", js.undefined)
    
    @scala.inline
    def setCacheNodeType(value: String): Self = this.set("CacheNodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheNodeType: Self = this.set("CacheNodeType", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    
    @scala.inline
    def setNumCacheNodes(value: IntegerOptional): Self = this.set("NumCacheNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumCacheNodes: Self = this.set("NumCacheNodes", js.undefined)
  }
}
