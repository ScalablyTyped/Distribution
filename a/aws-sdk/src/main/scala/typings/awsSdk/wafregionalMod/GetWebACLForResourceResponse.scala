package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWebACLForResourceResponse extends js.Object {
  
  /**
    * Information about the web ACL that you specified in the GetWebACLForResource request. If there is no associated resource, a null WebACLSummary is returned.
    */
  var WebACLSummary: js.UndefOr[typings.awsSdk.wafregionalMod.WebACLSummary] = js.native
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
    def setWebACLSummary(value: WebACLSummary): Self = this.set("WebACLSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebACLSummary: Self = this.set("WebACLSummary", js.undefined)
  }
}
