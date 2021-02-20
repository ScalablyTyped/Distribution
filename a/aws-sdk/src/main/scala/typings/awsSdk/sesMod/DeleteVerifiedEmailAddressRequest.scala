package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteVerifiedEmailAddressRequest extends StObject {
  
  /**
    * An email address to be removed from the list of verified addresses.
    */
  var EmailAddress: Address = js.native
}
object DeleteVerifiedEmailAddressRequest {
  
  @scala.inline
  def apply(EmailAddress: Address): DeleteVerifiedEmailAddressRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVerifiedEmailAddressRequest]
  }
  
  @scala.inline
  implicit class DeleteVerifiedEmailAddressRequestMutableBuilder[Self <: DeleteVerifiedEmailAddressRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailAddress(value: Address): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
  }
}
