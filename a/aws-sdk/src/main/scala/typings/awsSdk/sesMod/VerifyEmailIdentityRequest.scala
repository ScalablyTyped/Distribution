package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyEmailIdentityRequest extends js.Object {
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
}

