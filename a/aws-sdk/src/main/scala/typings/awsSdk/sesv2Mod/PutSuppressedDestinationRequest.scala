package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutSuppressedDestinationRequest extends StObject {
  
  /**
    * The email address that should be added to the suppression list for your account.
    */
  var EmailAddress: typings.awsSdk.sesv2Mod.EmailAddress = js.native
  
  /**
    * The factors that should cause the email address to be added to the suppression list for your account.
    */
  var Reason: SuppressionListReason = js.native
}
object PutSuppressedDestinationRequest {
  
  @scala.inline
  def apply(EmailAddress: EmailAddress, Reason: SuppressionListReason): PutSuppressedDestinationRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSuppressedDestinationRequest]
  }
  
  @scala.inline
  implicit class PutSuppressedDestinationRequestMutableBuilder[Self <: PutSuppressedDestinationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: SuppressionListReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
  }
}
