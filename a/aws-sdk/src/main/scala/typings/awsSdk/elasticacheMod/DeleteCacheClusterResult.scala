package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCacheClusterResult extends StObject {
  
  var CacheCluster: js.UndefOr[typings.awsSdk.elasticacheMod.CacheCluster] = js.undefined
}
object DeleteCacheClusterResult {
  
  inline def apply(): DeleteCacheClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCacheClusterResult]
  }
  
  extension [Self <: DeleteCacheClusterResult](x: Self) {
    
    inline def setCacheCluster(value: CacheCluster): Self = StObject.set(x, "CacheCluster", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterUndefined: Self = StObject.set(x, "CacheCluster", js.undefined)
  }
}
