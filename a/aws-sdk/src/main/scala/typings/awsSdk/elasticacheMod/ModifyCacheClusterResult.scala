package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyCacheClusterResult extends StObject {
  
  var CacheCluster: js.UndefOr[typings.awsSdk.elasticacheMod.CacheCluster] = js.native
}
object ModifyCacheClusterResult {
  
  @scala.inline
  def apply(): ModifyCacheClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyCacheClusterResult]
  }
  
  @scala.inline
  implicit class ModifyCacheClusterResultMutableBuilder[Self <: ModifyCacheClusterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheCluster(value: CacheCluster): Self = StObject.set(x, "CacheCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheClusterUndefined: Self = StObject.set(x, "CacheCluster", js.undefined)
  }
}
