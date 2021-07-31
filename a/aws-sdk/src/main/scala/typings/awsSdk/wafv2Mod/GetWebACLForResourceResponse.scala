package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWebACLForResourceResponse extends StObject {
  
  /**
    * The Web ACL that is associated with the resource. If there is no associated resource, AWS WAF returns a null Web ACL.
    */
  var WebACL: js.UndefOr[typings.awsSdk.wafv2Mod.WebACL] = js.undefined
}
object GetWebACLForResourceResponse {
  
  @scala.inline
  def apply(): GetWebACLForResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWebACLForResourceResponse]
  }
  
  @scala.inline
  implicit class GetWebACLForResourceResponseMutableBuilder[Self <: GetWebACLForResourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWebACL(value: WebACL): Self = StObject.set(x, "WebACL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebACLUndefined: Self = StObject.set(x, "WebACL", js.undefined)
  }
}
