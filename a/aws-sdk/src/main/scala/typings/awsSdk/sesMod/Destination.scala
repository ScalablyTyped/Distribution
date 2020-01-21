package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Destination extends js.Object {
  /**
    * The recipients to place on the BCC: line of the message.
    */
  var BccAddresses: js.UndefOr[AddressList] = js.native
  /**
    * The recipients to place on the CC: line of the message.
    */
  var CcAddresses: js.UndefOr[AddressList] = js.native
  /**
    * The recipients to place on the To: line of the message.
    */
  var ToAddresses: js.UndefOr[AddressList] = js.native
}

object Destination {
  @scala.inline
  def apply(BccAddresses: AddressList = null, CcAddresses: AddressList = null, ToAddresses: AddressList = null): Destination = {
    val __obj = js.Dynamic.literal()
    if (BccAddresses != null) __obj.updateDynamic("BccAddresses")(BccAddresses.asInstanceOf[js.Any])
    if (CcAddresses != null) __obj.updateDynamic("CcAddresses")(CcAddresses.asInstanceOf[js.Any])
    if (ToAddresses != null) __obj.updateDynamic("ToAddresses")(ToAddresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
}

