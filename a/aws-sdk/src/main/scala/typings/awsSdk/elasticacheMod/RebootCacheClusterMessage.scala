package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootCacheClusterMessage extends StObject {
  
  /**
    * The cluster identifier. This parameter is stored as a lowercase string.
    */
  var CacheClusterId: String
  
  /**
    * A list of cache node IDs to reboot. A node ID is a numeric identifier (0001, 0002, etc.). To reboot an entire cluster, specify all of the cache node IDs.
    */
  var CacheNodeIdsToReboot: CacheNodeIdsList
}
object RebootCacheClusterMessage {
  
  @scala.inline
  def apply(CacheClusterId: String, CacheNodeIdsToReboot: CacheNodeIdsList): RebootCacheClusterMessage = {
    val __obj = js.Dynamic.literal(CacheClusterId = CacheClusterId.asInstanceOf[js.Any], CacheNodeIdsToReboot = CacheNodeIdsToReboot.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootCacheClusterMessage]
  }
  
  @scala.inline
  implicit class RebootCacheClusterMessageMutableBuilder[Self <: RebootCacheClusterMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheClusterId(value: String): Self = StObject.set(x, "CacheClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheNodeIdsToReboot(value: CacheNodeIdsList): Self = StObject.set(x, "CacheNodeIdsToReboot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheNodeIdsToRebootVarargs(value: String*): Self = StObject.set(x, "CacheNodeIdsToReboot", js.Array(value :_*))
  }
}
