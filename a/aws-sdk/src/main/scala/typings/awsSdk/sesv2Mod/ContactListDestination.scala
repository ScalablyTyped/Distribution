package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactListDestination extends js.Object {
  
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
  implicit class ContactListDestinationOps[Self <: ContactListDestination] (val x: Self) extends AnyVal {
    
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
    def setContactListImportAction(value: ContactListImportAction): Self = this.set("ContactListImportAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactListName(value: ContactListName): Self = this.set("ContactListName", value.asInstanceOf[js.Any])
  }
}
