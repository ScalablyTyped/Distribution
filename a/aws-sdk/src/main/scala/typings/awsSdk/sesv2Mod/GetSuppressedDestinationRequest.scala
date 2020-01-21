package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSuppressedDestinationRequest extends js.Object {
  /**
    * The email address that's on the account suppression list.
    */
  var EmailAddress: typings.awsSdk.sesv2Mod.EmailAddress = js.native
}

object GetSuppressedDestinationRequest {
  @scala.inline
  def apply(EmailAddress: EmailAddress): GetSuppressedDestinationRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSuppressedDestinationRequest]
  }
}

