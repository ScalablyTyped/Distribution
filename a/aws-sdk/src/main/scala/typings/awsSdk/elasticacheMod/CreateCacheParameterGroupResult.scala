package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCacheParameterGroupResult extends js.Object {
  
  var CacheParameterGroup: js.UndefOr[typings.awsSdk.elasticacheMod.CacheParameterGroup] = js.native
}
object CreateCacheParameterGroupResult {
  
  @scala.inline
  def apply(): CreateCacheParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCacheParameterGroupResult]
  }
  
  @scala.inline
  implicit class CreateCacheParameterGroupResultOps[Self <: CreateCacheParameterGroupResult] (val x: Self) extends AnyVal {
    
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
    def setCacheParameterGroup(value: CacheParameterGroup): Self = this.set("CacheParameterGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheParameterGroup: Self = this.set("CacheParameterGroup", js.undefined)
  }
}
