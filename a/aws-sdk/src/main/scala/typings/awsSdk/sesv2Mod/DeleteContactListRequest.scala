package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteContactListRequest extends StObject {
  
  /**
    * The name of the contact list.
    */
  var ContactListName: typings.awsSdk.sesv2Mod.ContactListName
}
object DeleteContactListRequest {
  
  inline def apply(ContactListName: ContactListName): DeleteContactListRequest = {
    val __obj = js.Dynamic.literal(ContactListName = ContactListName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContactListRequest]
  }
  
  extension [Self <: DeleteContactListRequest](x: Self) {
    
    inline def setContactListName(value: ContactListName): Self = StObject.set(x, "ContactListName", value.asInstanceOf[js.Any])
  }
}
