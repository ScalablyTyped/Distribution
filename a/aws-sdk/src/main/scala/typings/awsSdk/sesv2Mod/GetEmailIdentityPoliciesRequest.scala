package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEmailIdentityPoliciesRequest extends StObject {
  
  /**
    * The email identity that you want to retrieve policies for.
    */
  var EmailIdentity: Identity
}
object GetEmailIdentityPoliciesRequest {
  
  @scala.inline
  def apply(EmailIdentity: Identity): GetEmailIdentityPoliciesRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEmailIdentityPoliciesRequest]
  }
  
  @scala.inline
  implicit class GetEmailIdentityPoliciesRequestMutableBuilder[Self <: GetEmailIdentityPoliciesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailIdentity(value: Identity): Self = StObject.set(x, "EmailIdentity", value.asInstanceOf[js.Any])
  }
}
