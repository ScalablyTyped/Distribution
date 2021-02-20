package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RebootCacheClusterResult extends StObject {
  
  var CacheCluster: js.UndefOr[typings.awsSdk.elasticacheMod.CacheCluster] = js.native
}
object RebootCacheClusterResult {
  
  @scala.inline
  def apply(): RebootCacheClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RebootCacheClusterResult]
  }
  
  @scala.inline
  implicit class RebootCacheClusterResultMutableBuilder[Self <: RebootCacheClusterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheCluster(value: CacheCluster): Self = StObject.set(x, "CacheCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheClusterUndefined: Self = StObject.set(x, "CacheCluster", js.undefined)
  }
}
