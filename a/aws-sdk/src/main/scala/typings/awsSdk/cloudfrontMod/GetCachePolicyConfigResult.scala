package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCachePolicyConfigResult extends js.Object {
  
  /**
    * The cache policy configuration.
    */
  var CachePolicyConfig: js.UndefOr[typings.awsSdk.cloudfrontMod.CachePolicyConfig] = js.native
  
  /**
    * The current version of the cache policy.
    */
  var ETag: js.UndefOr[String] = js.native
}
object GetCachePolicyConfigResult {
  
  @scala.inline
  def apply(): GetCachePolicyConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCachePolicyConfigResult]
  }
  
  @scala.inline
  implicit class GetCachePolicyConfigResultOps[Self <: GetCachePolicyConfigResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCachePolicyConfig(value: CachePolicyConfig): Self = this.set("CachePolicyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCachePolicyConfig: Self = this.set("CachePolicyConfig", js.undefined)
    
    @scala.inline
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
  }
}
