package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmergencyContact extends js.Object {
  /**
    * Additional notes regarding the contact. 
    */
  var ContactNotes: js.UndefOr[typings.awsSdk.shieldMod.ContactNotes] = js.native
  /**
    * The email address for the contact.
    */
  var EmailAddress: typings.awsSdk.shieldMod.EmailAddress = js.native
  /**
    * The phone number for the contact.
    */
  var PhoneNumber: js.UndefOr[typings.awsSdk.shieldMod.PhoneNumber] = js.native
}

object EmergencyContact {
  @scala.inline
  def apply(EmailAddress: EmailAddress, ContactNotes: ContactNotes = null, PhoneNumber: PhoneNumber = null): EmergencyContact = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any])
    if (ContactNotes != null) __obj.updateDynamic("ContactNotes")(ContactNotes.asInstanceOf[js.Any])
    if (PhoneNumber != null) __obj.updateDynamic("PhoneNumber")(PhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmergencyContact]
  }
}

