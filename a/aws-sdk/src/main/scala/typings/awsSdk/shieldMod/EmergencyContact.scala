package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(EmailAddress: EmailAddress): EmergencyContact = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmergencyContact]
  }
  
  @scala.inline
  implicit class EmergencyContactOps[Self <: EmergencyContact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEmailAddress(value: EmailAddress): Self = this.set("EmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactNotes(value: ContactNotes): Self = this.set("ContactNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactNotes: Self = this.set("ContactNotes", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: PhoneNumber): Self = this.set("PhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("PhoneNumber", js.undefined)
  }
}
