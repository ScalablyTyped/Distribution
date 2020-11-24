package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutSuppressedDestinationRequest extends js.Object {
  
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
  implicit class PutSuppressedDestinationRequestOps[Self <: PutSuppressedDestinationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEmailAddress(value: EmailAddress): Self = this.set("EmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: SuppressionListReason): Self = this.set("Reason", value.asInstanceOf[js.Any])
  }
}
