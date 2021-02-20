package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteContactRequest extends StObject {
  
  /**
    * The name of the contact list from which the contact should be removed.
    */
  var ContactListName: typings.awsSdk.sesv2Mod.ContactListName = js.native
  
  /**
    * The contact's email address.
    */
  var EmailAddress: typings.awsSdk.sesv2Mod.EmailAddress = js.native
}
object DeleteContactRequest {
  
  @scala.inline
  def apply(ContactListName: ContactListName, EmailAddress: EmailAddress): DeleteContactRequest = {
    val __obj = js.Dynamic.literal(ContactListName = ContactListName.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContactRequest]
  }
  
  @scala.inline
  implicit class DeleteContactRequestMutableBuilder[Self <: DeleteContactRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactListName(value: ContactListName): Self = StObject.set(x, "ContactListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
  }
}
