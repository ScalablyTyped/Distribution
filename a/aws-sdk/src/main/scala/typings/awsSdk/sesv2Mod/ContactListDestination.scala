package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactListDestination extends StObject {
  
  /**
    * &gt;The type of action to perform on the addresses. The following are the possible values:   PUT: add the addresses to the contact list. If the record already exists, it will override it with the new value.   DELETE: remove the addresses from the contact list.  
    */
  var ContactListImportAction: typings.awsSdk.sesv2Mod.ContactListImportAction
  
  /**
    * The name of the contact list.
    */
  var ContactListName: typings.awsSdk.sesv2Mod.ContactListName
}
object ContactListDestination {
  
  inline def apply(ContactListImportAction: ContactListImportAction, ContactListName: ContactListName): ContactListDestination = {
    val __obj = js.Dynamic.literal(ContactListImportAction = ContactListImportAction.asInstanceOf[js.Any], ContactListName = ContactListName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactListDestination]
  }
  
  extension [Self <: ContactListDestination](x: Self) {
    
    inline def setContactListImportAction(value: ContactListImportAction): Self = StObject.set(x, "ContactListImportAction", value.asInstanceOf[js.Any])
    
    inline def setContactListName(value: ContactListName): Self = StObject.set(x, "ContactListName", value.asInstanceOf[js.Any])
  }
}
