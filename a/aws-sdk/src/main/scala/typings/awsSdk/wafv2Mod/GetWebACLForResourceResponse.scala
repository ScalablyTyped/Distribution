package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWebACLForResourceResponse extends js.Object {
  
  /**
    * The Web ACL that is associated with the resource. If there is no associated resource, AWS WAF returns a null Web ACL.
    */
  var WebACL: js.UndefOr[typings.awsSdk.wafv2Mod.WebACL] = js.native
}
object GetWebACLForResourceResponse {
  
  @scala.inline
  def apply(): GetWebACLForResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWebACLForResourceResponse]
  }
  
  @scala.inline
  implicit class GetWebACLForResourceResponseOps[Self <: GetWebACLForResourceResponse] (val x: Self) extends AnyVal {
    
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
    def setWebACL(value: WebACL): Self = this.set("WebACL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebACL: Self = this.set("WebACL", js.undefined)
  }
}
