package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyCacheSubnetGroupResult extends StObject {
  
  var CacheSubnetGroup: js.UndefOr[typings.awsSdk.elasticacheMod.CacheSubnetGroup] = js.undefined
}
object ModifyCacheSubnetGroupResult {
  
  inline def apply(): ModifyCacheSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyCacheSubnetGroupResult]
  }
  
  extension [Self <: ModifyCacheSubnetGroupResult](x: Self) {
    
    inline def setCacheSubnetGroup(value: CacheSubnetGroup): Self = StObject.set(x, "CacheSubnetGroup", value.asInstanceOf[js.Any])
    
    inline def setCacheSubnetGroupUndefined: Self = StObject.set(x, "CacheSubnetGroup", js.undefined)
  }
}
