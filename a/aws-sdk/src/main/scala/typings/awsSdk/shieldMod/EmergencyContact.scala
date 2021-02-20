package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmergencyContact extends StObject {
  
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
  implicit class EmergencyContactMutableBuilder[Self <: EmergencyContact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactNotes(value: ContactNotes): Self = StObject.set(x, "ContactNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactNotesUndefined: Self = StObject.set(x, "ContactNotes", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
  }
}
