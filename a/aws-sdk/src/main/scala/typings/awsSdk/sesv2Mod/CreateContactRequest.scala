package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateContactRequest extends StObject {
  
  /**
    * The attribute data attached to a contact.
    */
  var AttributesData: js.UndefOr[typings.awsSdk.sesv2Mod.AttributesData] = js.native
  
  /**
    * The name of the contact list to which the contact should be added.
    */
  var ContactListName: typings.awsSdk.sesv2Mod.ContactListName = js.native
  
  /**
    * The contact's email address.
    */
  var EmailAddress: typings.awsSdk.sesv2Mod.EmailAddress = js.native
  
  /**
    * The contact's preferences for being opted-in to or opted-out of topics.
    */
  var TopicPreferences: js.UndefOr[TopicPreferenceList] = js.native
  
  /**
    * A boolean value status noting if the contact is unsubscribed from all contact list topics.
    */
  var UnsubscribeAll: js.UndefOr[typings.awsSdk.sesv2Mod.UnsubscribeAll] = js.native
}
object CreateContactRequest {
  
  @scala.inline
  def apply(ContactListName: ContactListName, EmailAddress: EmailAddress): CreateContactRequest = {
    val __obj = js.Dynamic.literal(ContactListName = ContactListName.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContactRequest]
  }
  
  @scala.inline
  implicit class CreateContactRequestMutableBuilder[Self <: CreateContactRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributesData(value: AttributesData): Self = StObject.set(x, "AttributesData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesDataUndefined: Self = StObject.set(x, "AttributesData", js.undefined)
    
    @scala.inline
    def setContactListName(value: ContactListName): Self = StObject.set(x, "ContactListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
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
