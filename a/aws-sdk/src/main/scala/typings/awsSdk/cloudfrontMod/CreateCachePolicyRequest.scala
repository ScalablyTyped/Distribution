package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCachePolicyRequest extends js.Object {
  
  /**
    * A cache policy configuration.
    */
  var CachePolicyConfig: typings.awsSdk.cloudfrontMod.CachePolicyConfig = js.native
}
object CreateCachePolicyRequest {
  
  @scala.inline
  def apply(CachePolicyConfig: CachePolicyConfig): CreateCachePolicyRequest = {
    val __obj = js.Dynamic.literal(CachePolicyConfig = CachePolicyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCachePolicyRequest]
  }
  
  @scala.inline
  implicit class CreateCachePolicyRequestOps[Self <: CreateCachePolicyRequest] (val x: Self) extends AnyVal {
    
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
  }
}
