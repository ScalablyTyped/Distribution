package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyCacheClusterResult extends StObject {
  
  var CacheCluster: js.UndefOr[typings.awsSdk.elasticacheMod.CacheCluster] = js.undefined
}
object ModifyCacheClusterResult {
  
  inline def apply(): ModifyCacheClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyCacheClusterResult]
  }
  
  extension [Self <: ModifyCacheClusterResult](x: Self) {
    
    inline def setCacheCluster(value: CacheCluster): Self = StObject.set(x, "CacheCluster", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterUndefined: Self = StObject.set(x, "CacheCluster", js.undefined)
  }
}
