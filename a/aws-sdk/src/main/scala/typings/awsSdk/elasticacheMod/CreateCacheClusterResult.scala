package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCacheClusterResult extends StObject {
  
  var CacheCluster: js.UndefOr[typings.awsSdk.elasticacheMod.CacheCluster] = js.undefined
}
object CreateCacheClusterResult {
  
  @scala.inline
  def apply(): CreateCacheClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCacheClusterResult]
  }
  
  @scala.inline
  implicit class CreateCacheClusterResultMutableBuilder[Self <: CreateCacheClusterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheCluster(value: CacheCluster): Self = StObject.set(x, "CacheCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheClusterUndefined: Self = StObject.set(x, "CacheCluster", js.undefined)
  }
}
