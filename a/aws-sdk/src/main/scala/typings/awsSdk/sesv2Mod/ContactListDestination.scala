package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactListDestination extends StObject {
  
  /**
    * &gt;The type of action that you want to perform on the addresses. Acceptable values:   PUT: add the addresses to the contact list. If the record already exists, it will override it with the new value.   DELETE: remove the addresses from the contact list.  
    */
  var ContactListImportAction: typings.awsSdk.sesv2Mod.ContactListImportAction = js.native
  
  /**
    * The name of the contact list.
    */
  var ContactListName: typings.awsSdk.sesv2Mod.ContactListName = js.native
}
object ContactListDestination {
  
  @scala.inline
  def apply(ContactListImportAction: ContactListImportAction, ContactListName: ContactListName): ContactListDestination = {
    val __obj = js.Dynamic.literal(ContactListImportAction = ContactListImportAction.asInstanceOf[js.Any], ContactListName = ContactListName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactListDestination]
  }
  
  @scala.inline
  implicit class ContactListDestinationMutableBuilder[Self <: ContactListDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactListImportAction(value: ContactListImportAction): Self = StObject.set(x, "ContactListImportAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactListName(value: ContactListName): Self = StObject.set(x, "ContactListName", value.asInstanceOf[js.Any])
  }
}
