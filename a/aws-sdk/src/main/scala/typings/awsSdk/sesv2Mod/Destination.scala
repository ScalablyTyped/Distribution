package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Destination extends js.Object {
  /**
    * An array that contains the email addresses of the "BCC" (blind carbon copy) recipients for the email.
    */
  var BccAddresses: js.UndefOr[EmailAddressList] = js.native
  /**
    * An array that contains the email addresses of the "CC" (carbon copy) recipients for the email.
    */
  var CcAddresses: js.UndefOr[EmailAddressList] = js.native
  /**
    * An array that contains the email addresses of the "To" recipients for the email.
    */
  var ToAddresses: js.UndefOr[EmailAddressList] = js.native
}

object Destination {
  @scala.inline
  def apply(): Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Destination]
  }
  @scala.inline
  implicit class DestinationOps[Self <: Destination] (val x: Self) extends AnyVal {
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
    def setBccAddressesVarargs(value: EmailAddress*): Self = this.set("BccAddresses", js.Array(value :_*))
    @scala.inline
    def setBccAddresses(value: EmailAddressList): Self = this.set("BccAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBccAddresses: Self = this.set("BccAddresses", js.undefined)
    @scala.inline
    def setCcAddressesVarargs(value: EmailAddress*): Self = this.set("CcAddresses", js.Array(value :_*))
    @scala.inline
    def setCcAddresses(value: EmailAddressList): Self = this.set("CcAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCcAddresses: Self = this.set("CcAddresses", js.undefined)
    @scala.inline
    def setToAddressesVarargs(value: EmailAddress*): Self = this.set("ToAddresses", js.Array(value :_*))
    @scala.inline
    def setToAddresses(value: EmailAddressList): Self = this.set("ToAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToAddresses: Self = this.set("ToAddresses", js.undefined)
  }
  
}

