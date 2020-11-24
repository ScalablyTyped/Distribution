package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyCacheSubnetGroupResult extends js.Object {
  
  var CacheSubnetGroup: js.UndefOr[typings.awsSdk.elasticacheMod.CacheSubnetGroup] = js.native
}
object ModifyCacheSubnetGroupResult {
  
  @scala.inline
  def apply(): ModifyCacheSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyCacheSubnetGroupResult]
  }
  
  @scala.inline
  implicit class ModifyCacheSubnetGroupResultOps[Self <: ModifyCacheSubnetGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCacheSubnetGroup(value: CacheSubnetGroup): Self = this.set("CacheSubnetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheSubnetGroup: Self = this.set("CacheSubnetGroup", js.undefined)
  }
}
