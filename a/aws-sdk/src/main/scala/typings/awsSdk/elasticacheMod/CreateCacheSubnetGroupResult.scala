package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCacheSubnetGroupResult extends StObject {
  
  var CacheSubnetGroup: js.UndefOr[typings.awsSdk.elasticacheMod.CacheSubnetGroup] = js.native
}
object CreateCacheSubnetGroupResult {
  
  @scala.inline
  def apply(): CreateCacheSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCacheSubnetGroupResult]
  }
  
  @scala.inline
  implicit class CreateCacheSubnetGroupResultMutableBuilder[Self <: CreateCacheSubnetGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheSubnetGroup(value: CacheSubnetGroup): Self = StObject.set(x, "CacheSubnetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheSubnetGroupUndefined: Self = StObject.set(x, "CacheSubnetGroup", js.undefined)
  }
}
