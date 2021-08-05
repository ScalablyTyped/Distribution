package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCacheSecurityGroupResult extends StObject {
  
  var CacheSecurityGroup: js.UndefOr[typings.awsSdk.elasticacheMod.CacheSecurityGroup] = js.undefined
}
object CreateCacheSecurityGroupResult {
  
  inline def apply(): CreateCacheSecurityGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCacheSecurityGroupResult]
  }
  
  extension [Self <: CreateCacheSecurityGroupResult](x: Self) {
    
    inline def setCacheSecurityGroup(value: CacheSecurityGroup): Self = StObject.set(x, "CacheSecurityGroup", value.asInstanceOf[js.Any])
    
    inline def setCacheSecurityGroupUndefined: Self = StObject.set(x, "CacheSecurityGroup", js.undefined)
  }
}
