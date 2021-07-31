package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWebACLRequest extends StObject {
  
  /**
    * The WebACLId of the WebACL that you want to get. WebACLId is returned by CreateWebACL and by ListWebACLs.
    */
  var WebACLId: ResourceId
}
object GetWebACLRequest {
  
  @scala.inline
  def apply(WebACLId: ResourceId): GetWebACLRequest = {
    val __obj = js.Dynamic.literal(WebACLId = WebACLId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWebACLRequest]
  }
  
  @scala.inline
  implicit class GetWebACLRequestMutableBuilder[Self <: GetWebACLRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWebACLId(value: ResourceId): Self = StObject.set(x, "WebACLId", value.asInstanceOf[js.Any])
  }
}
