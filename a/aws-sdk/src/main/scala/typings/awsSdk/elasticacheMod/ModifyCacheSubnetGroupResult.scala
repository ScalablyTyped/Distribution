package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyCacheSubnetGroupResult extends StObject {
  
  var CacheSubnetGroup: js.UndefOr[typings.awsSdk.elasticacheMod.CacheSubnetGroup] = js.native
}
object ModifyCacheSubnetGroupResult {
  
  @scala.inline
  def apply(): ModifyCacheSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyCacheSubnetGroupResult]
  }
  
  @scala.inline
  implicit class ModifyCacheSubnetGroupResultMutableBuilder[Self <: ModifyCacheSubnetGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheSubnetGroup(value: CacheSubnetGroup): Self = StObject.set(x, "CacheSubnetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheSubnetGroupUndefined: Self = StObject.set(x, "CacheSubnetGroup", js.undefined)
  }
}
