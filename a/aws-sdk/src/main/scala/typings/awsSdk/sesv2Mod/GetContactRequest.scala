package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContactRequest extends StObject {
  
  /**
    * The name of the contact list to which the contact belongs.
    */
  var ContactListName: typings.awsSdk.sesv2Mod.ContactListName
  
  /**
    * The contact's email addres.
    */
  var EmailAddress: typings.awsSdk.sesv2Mod.EmailAddress
}
object GetContactRequest {
  
  @scala.inline
  def apply(ContactListName: ContactListName, EmailAddress: EmailAddress): GetContactRequest = {
    val __obj = js.Dynamic.literal(ContactListName = ContactListName.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContactRequest]
  }
  
  @scala.inline
  implicit class GetContactRequestMutableBuilder[Self <: GetContactRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactListName(value: ContactListName): Self = StObject.set(x, "ContactListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
  }
}
