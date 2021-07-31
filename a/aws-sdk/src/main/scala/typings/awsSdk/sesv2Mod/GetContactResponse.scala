package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContactResponse extends StObject {
  
  /**
    * The attribute data attached to a contact.
    */
  var AttributesData: js.UndefOr[typings.awsSdk.sesv2Mod.AttributesData] = js.undefined
  
  /**
    * The name of the contact list to which the contact belongs.
    */
  var ContactListName: js.UndefOr[typings.awsSdk.sesv2Mod.ContactListName] = js.undefined
  
  /**
    * A timestamp noting when the contact was created.
    */
  var CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The contact's email addres.
    */
  var EmailAddress: js.UndefOr[typings.awsSdk.sesv2Mod.EmailAddress] = js.undefined
  
  /**
    * A timestamp noting the last time the contact's information was updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The default topic preferences applied to the contact.
    */
  var TopicDefaultPreferences: js.UndefOr[TopicPreferenceList] = js.undefined
  
  /**
    * The contact's preference for being opted-in to or opted-out of a topic.&gt;
    */
  var TopicPreferences: js.UndefOr[TopicPreferenceList] = js.undefined
  
  /**
    * A boolean value status noting if the contact is unsubscribed from all contact list topics.
    */
  var UnsubscribeAll: js.UndefOr[typings.awsSdk.sesv2Mod.UnsubscribeAll] = js.undefined
}
object GetContactResponse {
  
  @scala.inline
  def apply(): GetContactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContactResponse]
  }
  
  @scala.inline
  implicit class GetContactResponseMutableBuilder[Self <: GetContactResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributesData(value: AttributesData): Self = StObject.set(x, "AttributesData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesDataUndefined: Self = StObject.set(x, "AttributesData", js.undefined)
    
    @scala.inline
    def setContactListName(value: ContactListName): Self = StObject.set(x, "ContactListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactListNameUndefined: Self = StObject.set(x, "ContactListName", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: Timestamp): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "EmailAddress", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestamp(value: Timestamp): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setTopicDefaultPreferences(value: TopicPreferenceList): Self = StObject.set(x, "TopicDefaultPreferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicDefaultPreferencesUndefined: Self = StObject.set(x, "TopicDefaultPreferences", js.undefined)
    
    @scala.inline
    def setTopicDefaultPreferencesVarargs(value: TopicPreference*): Self = StObject.set(x, "TopicDefaultPreferences", js.Array(value :_*))
    
    @scala.inline
    def setTopicPreferences(value: TopicPreferenceList): Self = StObject.set(x, "TopicPreferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicPreferencesUndefined: Self = StObject.set(x, "TopicPreferences", js.undefined)
    
    @scala.inline
    def setTopicPreferencesVarargs(value: TopicPreference*): Self = StObject.set(x, "TopicPreferences", js.Array(value :_*))
    
    @scala.inline
    def setUnsubscribeAll(value: UnsubscribeAll): Self = StObject.set(x, "UnsubscribeAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsubscribeAllUndefined: Self = StObject.set(x, "UnsubscribeAll", js.undefined)
  }
}
