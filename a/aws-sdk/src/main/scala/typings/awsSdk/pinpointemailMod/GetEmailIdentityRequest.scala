package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEmailIdentityRequest extends StObject {
  
  /**
    * The email identity that you want to retrieve details for.
    */
  var EmailIdentity: Identity = js.native
}
object GetEmailIdentityRequest {
  
  @scala.inline
  def apply(EmailIdentity: Identity): GetEmailIdentityRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEmailIdentityRequest]
  }
  
  @scala.inline
  implicit class GetEmailIdentityRequestMutableBuilder[Self <: GetEmailIdentityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailIdentity(value: Identity): Self = StObject.set(x, "EmailIdentity", value.asInstanceOf[js.Any])
  }
}
