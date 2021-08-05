package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContactRequest extends StObject {
  
  /**
    * The attribute data attached to a contact.
    */
  var AttributesData: js.UndefOr[typings.awsSdk.sesv2Mod.AttributesData] = js.undefined
  
  /**
    * The name of the contact list to which the contact should be added.
    */
  var ContactListName: typings.awsSdk.sesv2Mod.ContactListName
  
  /**
    * The contact's email address.
    */
  var EmailAddress: typings.awsSdk.sesv2Mod.EmailAddress
  
  /**
    * The contact's preferences for being opted-in to or opted-out of topics.
    */
  var TopicPreferences: js.UndefOr[TopicPreferenceList] = js.undefined
  
  /**
    * A boolean value status noting if the contact is unsubscribed from all contact list topics.
    */
  var UnsubscribeAll: js.UndefOr[typings.awsSdk.sesv2Mod.UnsubscribeAll] = js.undefined
}
object CreateContactRequest {
  
  inline def apply(ContactListName: ContactListName, EmailAddress: EmailAddress): CreateContactRequest = {
    val __obj = js.Dynamic.literal(ContactListName = ContactListName.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContactRequest]
  }
  
  extension [Self <: CreateContactRequest](x: Self) {
    
    inline def setAttributesData(value: AttributesData): Self = StObject.set(x, "AttributesData", value.asInstanceOf[js.Any])
    
    inline def setAttributesDataUndefined: Self = StObject.set(x, "AttributesData", js.undefined)
    
    inline def setContactListName(value: ContactListName): Self = StObject.set(x, "ContactListName", value.asInstanceOf[js.Any])
    
    inline def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    inline def setTopicPreferences(value: TopicPreferenceList): Self = StObject.set(x, "TopicPreferences", value.asInstanceOf[js.Any])
    
    inline def setTopicPreferencesUndefined: Self = StObject.set(x, "TopicPreferences", js.undefined)
    
    inline def setTopicPreferencesVarargs(value: TopicPreference*): Self = StObject.set(x, "TopicPreferences", js.Array(value :_*))
    
    inline def setUnsubscribeAll(value: UnsubscribeAll): Self = StObject.set(x, "UnsubscribeAll", value.asInstanceOf[js.Any])
    
    inline def setUnsubscribeAllUndefined: Self = StObject.set(x, "UnsubscribeAll", js.undefined)
  }
}
