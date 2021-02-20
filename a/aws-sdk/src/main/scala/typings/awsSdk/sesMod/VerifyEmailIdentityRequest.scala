package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerifyEmailIdentityRequest extends StObject {
  
  /**
    * The email address to be verified.
    */
  var EmailAddress: Address = js.native
}
object VerifyEmailIdentityRequest {
  
  @scala.inline
  def apply(EmailAddress: Address): VerifyEmailIdentityRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyEmailIdentityRequest]
  }
  
  @scala.inline
  implicit class VerifyEmailIdentityRequestMutableBuilder[Self <: VerifyEmailIdentityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailAddress(value: Address): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
  }
}
