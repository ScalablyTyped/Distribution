package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteEmailIdentityRequest extends StObject {
  
  /**
    * The identity (that is, the email address or domain) that you want to delete from your Amazon Pinpoint account.
    */
  var EmailIdentity: Identity = js.native
}
object DeleteEmailIdentityRequest {
  
  @scala.inline
  def apply(EmailIdentity: Identity): DeleteEmailIdentityRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEmailIdentityRequest]
  }
  
  @scala.inline
  implicit class DeleteEmailIdentityRequestMutableBuilder[Self <: DeleteEmailIdentityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailIdentity(value: Identity): Self = StObject.set(x, "EmailIdentity", value.asInstanceOf[js.Any])
  }
}
