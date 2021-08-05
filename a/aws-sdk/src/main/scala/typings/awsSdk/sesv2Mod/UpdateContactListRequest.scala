package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContactListRequest extends StObject {
  
  /**
    * The name of the contact list.
    */
  var ContactListName: typings.awsSdk.sesv2Mod.ContactListName
  
  /**
    * A description of what the contact list is about.
    */
  var Description: js.UndefOr[typings.awsSdk.sesv2Mod.Description] = js.undefined
  
  /**
    * An interest group, theme, or label within a list. A contact list can have multiple topics.
    */
  var Topics: js.UndefOr[typings.awsSdk.sesv2Mod.Topics] = js.undefined
}
object UpdateContactListRequest {
  
  inline def apply(ContactListName: ContactListName): UpdateContactListRequest = {
    val __obj = js.Dynamic.literal(ContactListName = ContactListName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContactListRequest]
  }
  
  extension [Self <: UpdateContactListRequest](x: Self) {
    
    inline def setContactListName(value: ContactListName): Self = StObject.set(x, "ContactListName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setTopics(value: Topics): Self = StObject.set(x, "Topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsUndefined: Self = StObject.set(x, "Topics", js.undefined)
    
    inline def setTopicsVarargs(value: Topic*): Self = StObject.set(x, "Topics", js.Array(value :_*))
  }
}
