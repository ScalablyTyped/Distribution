package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contact extends js.Object {
  
  /**
    * The contact's email address.
    */
  var EmailAddress: js.UndefOr[typings.awsSdk.sesv2Mod.EmailAddress] = js.native
  
  /**
    * A timestamp noting the last time the contact's information was updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The default topic preferences applied to the contact.
    */
  var TopicDefaultPreferences: js.UndefOr[TopicPreferenceList] = js.native
  
  /**
    * The contact's preference for being opted-in to or opted-out of a topic.
    */
  var TopicPreferences: js.UndefOr[TopicPreferenceList] = js.native
  
  /**
    * A boolean value status noting if the contact is unsubscribed from all contact list topics.
    */
  var UnsubscribeAll: js.UndefOr[typings.awsSdk.sesv2Mod.UnsubscribeAll] = js.native
}
object Contact {
  
  @scala.inline
  def apply(): Contact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contact]
  }
  
  @scala.inline
  implicit class ContactOps[Self <: Contact] (val x: Self) extends AnyVal {
    
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
    def setEmailAddress(value: EmailAddress): Self = this.set("EmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailAddress: Self = this.set("EmailAddress", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestamp(value: Timestamp): Self = this.set("LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTimestamp: Self = this.set("LastUpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setTopicDefaultPreferencesVarargs(value: TopicPreference*): Self = this.set("TopicDefaultPreferences", js.Array(value :_*))
    
    @scala.inline
    def setTopicDefaultPreferences(value: TopicPreferenceList): Self = this.set("TopicDefaultPreferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicDefaultPreferences: Self = this.set("TopicDefaultPreferences", js.undefined)
    
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
