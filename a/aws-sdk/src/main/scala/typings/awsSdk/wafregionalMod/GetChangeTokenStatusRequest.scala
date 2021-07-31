package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChangeTokenStatusRequest extends StObject {
  
  /**
    * The change token for which you want to get the status. This change token was previously returned in the GetChangeToken response.
    */
  var ChangeToken: typings.awsSdk.wafregionalMod.ChangeToken
}
object GetChangeTokenStatusRequest {
  
  @scala.inline
  def apply(ChangeToken: ChangeToken): GetChangeTokenStatusRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChangeTokenStatusRequest]
  }
  
  @scala.inline
  implicit class GetChangeTokenStatusRequestMutableBuilder[Self <: GetChangeTokenStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
  }
}
