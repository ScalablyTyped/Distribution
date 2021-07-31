package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyEmailAddressRequest extends StObject {
  
  /**
    * The email address to be verified.
    */
  var EmailAddress: Address
}
object VerifyEmailAddressRequest {
  
  @scala.inline
  def apply(EmailAddress: Address): VerifyEmailAddressRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyEmailAddressRequest]
  }
  
  @scala.inline
  implicit class VerifyEmailAddressRequestMutableBuilder[Self <: VerifyEmailAddressRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailAddress(value: Address): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
  }
}
