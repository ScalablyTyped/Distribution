package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWebACLRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.wafMod.ChangeToken
  
  /**
    * The WebACLId of the WebACL that you want to delete. WebACLId is returned by CreateWebACL and by ListWebACLs.
    */
  var WebACLId: ResourceId
}
object DeleteWebACLRequest {
  
  @scala.inline
  def apply(ChangeToken: ChangeToken, WebACLId: ResourceId): DeleteWebACLRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], WebACLId = WebACLId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWebACLRequest]
  }
  
  @scala.inline
  implicit class DeleteWebACLRequestMutableBuilder[Self <: DeleteWebACLRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebACLId(value: ResourceId): Self = StObject.set(x, "WebACLId", value.asInstanceOf[js.Any])
  }
}
