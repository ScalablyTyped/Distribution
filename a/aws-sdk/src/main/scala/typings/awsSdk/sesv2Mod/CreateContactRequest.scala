package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateContactRequest extends js.Object {
  
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
  implicit class CreateContactRequestOps[Self <: CreateContactRequest] (val x: Self) extends AnyVal {
    
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
    def setContactListName(value: ContactListName): Self = this.set("ContactListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddress(value: EmailAddress): Self = this.set("EmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesData(value: AttributesData): Self = this.set("AttributesData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributesData: Self = this.set("AttributesData", js.undefined)
    
    @scala.inline
    def setTopicPreferencesVarargs(value: TopicPreference*): Self = this.set("TopicPreferences", js.Array(value :_*))
    
    @scala.inline
    def setTopicPreferences(value: TopicPreferenceList): Self = this.set("TopicPreferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicPreferences: Self = this.set("TopicPreferences", js.undefined)
    
    @scala.inline
    def setUnsubscribeAll(value: UnsubscribeAll): Self = this.set("UnsubscribeAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsubscribeAll: Self = this.set("UnsubscribeAll", js.undefined)
  }
}
