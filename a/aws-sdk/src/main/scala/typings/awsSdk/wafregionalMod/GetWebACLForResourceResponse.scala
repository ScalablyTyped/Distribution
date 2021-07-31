package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWebACLForResourceResponse extends StObject {
  
  /**
    * Information about the web ACL that you specified in the GetWebACLForResource request. If there is no associated resource, a null WebACLSummary is returned.
    */
  var WebACLSummary: js.UndefOr[typings.awsSdk.wafregionalMod.WebACLSummary] = js.undefined
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
    def setWebACLSummary(value: WebACLSummary): Self = StObject.set(x, "WebACLSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebACLSummaryUndefined: Self = StObject.set(x, "WebACLSummary", js.undefined)
  }
}
