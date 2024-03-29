package typings.awsSdk2Types.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyEmailIdentityRequest extends StObject {
  
  /**
    * The email address to be verified.
    */
  var EmailAddress: Address
}
object VerifyEmailIdentityRequest {
  
  inline def apply(EmailAddress: Address): VerifyEmailIdentityRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyEmailIdentityRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifyEmailIdentityRequest] (val x: Self) extends AnyVal {
    
    inline def setEmailAddress(value: Address): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
  }
}
