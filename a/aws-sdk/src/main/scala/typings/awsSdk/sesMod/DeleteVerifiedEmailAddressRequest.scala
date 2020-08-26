package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVerifiedEmailAddressRequest extends js.Object {
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
  implicit class DeleteVerifiedEmailAddressRequestOps[Self <: DeleteVerifiedEmailAddressRequest] (val x: Self) extends AnyVal {
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
    def setEmailAddress(value: Address): Self = this.set("EmailAddress", value.asInstanceOf[js.Any])
  }
  
}

