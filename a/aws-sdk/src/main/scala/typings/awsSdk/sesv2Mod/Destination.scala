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
  def apply(
    BccAddresses: EmailAddressList = null,
    CcAddresses: EmailAddressList = null,
    ToAddresses: EmailAddressList = null
  ): Destination = {
    val __obj = js.Dynamic.literal()
    if (BccAddresses != null) __obj.updateDynamic("BccAddresses")(BccAddresses.asInstanceOf[js.Any])
    if (CcAddresses != null) __obj.updateDynamic("CcAddresses")(CcAddresses.asInstanceOf[js.Any])
    if (ToAddresses != null) __obj.updateDynamic("ToAddresses")(ToAddresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
}

