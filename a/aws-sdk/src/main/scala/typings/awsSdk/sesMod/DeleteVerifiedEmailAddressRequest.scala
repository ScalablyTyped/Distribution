package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVerifiedEmailAddressRequest extends StObject {
  
  /**
    * An email address to be removed from the list of verified addresses.
    */
  var EmailAddress: Address
}
object DeleteVerifiedEmailAddressRequest {
  
  inline def apply(EmailAddress: Address): DeleteVerifiedEmailAddressRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVerifiedEmailAddressRequest]
  }
  
  extension [Self <: DeleteVerifiedEmailAddressRequest](x: Self) {
    
    inline def setEmailAddress(value: Address): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
  }
}
