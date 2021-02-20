package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCacheClusterResult extends StObject {
  
  var CacheCluster: js.UndefOr[typings.awsSdk.elasticacheMod.CacheCluster] = js.native
}
object DeleteCacheClusterResult {
  
  @scala.inline
  def apply(): DeleteCacheClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCacheClusterResult]
  }
  
  @scala.inline
  implicit class DeleteCacheClusterResultMutableBuilder[Self <: DeleteCacheClusterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheCluster(value: CacheCluster): Self = StObject.set(x, "CacheCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheClusterUndefined: Self = StObject.set(x, "CacheCluster", js.undefined)
  }
}
