package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSuppressedDestinationRequest extends js.Object {
  /**
    * The suppressed email destination to remove from the account suppression list.
    */
  var EmailAddress: typings.awsSdk.sesv2Mod.EmailAddress = js.native
}

object DeleteSuppressedDestinationRequest {
  @scala.inline
  def apply(EmailAddress: EmailAddress): DeleteSuppressedDestinationRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSuppressedDestinationRequest]
  }
}

