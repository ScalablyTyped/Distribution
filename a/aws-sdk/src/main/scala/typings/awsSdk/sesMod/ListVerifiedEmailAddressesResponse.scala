package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVerifiedEmailAddressesResponse extends js.Object {
  /**
    * A list of email addresses that have been verified.
    */
  var VerifiedEmailAddresses: js.UndefOr[AddressList] = js.native
}

object ListVerifiedEmailAddressesResponse {
  @scala.inline
  def apply(): ListVerifiedEmailAddressesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVerifiedEmailAddressesResponse]
  }
  @scala.inline
  implicit class ListVerifiedEmailAddressesResponseOps[Self <: ListVerifiedEmailAddressesResponse] (val x: Self) extends AnyVal {
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
    def setVerifiedEmailAddressesVarargs(value: Address*): Self = this.set("VerifiedEmailAddresses", js.Array(value :_*))
    @scala.inline
    def setVerifiedEmailAddresses(value: AddressList): Self = this.set("VerifiedEmailAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerifiedEmailAddresses: Self = this.set("VerifiedEmailAddresses", js.undefined)
  }
  
}

