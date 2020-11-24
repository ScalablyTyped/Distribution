package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Topic extends js.Object {
  
  /**
    * The default subscription status to be applied to a contact if the contact has not noted their preference for subscribing to a topic.
    */
  var DefaultSubscriptionStatus: SubscriptionStatus = js.native
  
  /**
    * A description of what the topic is about, which the contact will see.
    */
  var Description: js.UndefOr[typings.awsSdk.sesv2Mod.Description] = js.native
  
  /**
    * The name of the topic the contact will see.
    */
  var DisplayName: typings.awsSdk.sesv2Mod.DisplayName = js.native
  
  /**
    * The name of the topic.
    */
  var TopicName: typings.awsSdk.sesv2Mod.TopicName = js.native
}
object Topic {
  
  @scala.inline
  def apply(DefaultSubscriptionStatus: SubscriptionStatus, DisplayName: DisplayName, TopicName: TopicName): Topic = {
    val __obj = js.Dynamic.literal(DefaultSubscriptionStatus = DefaultSubscriptionStatus.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], TopicName = TopicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Topic]
  }
  
  @scala.inline
  implicit class TopicOps[Self <: Topic] (val x: Self) extends AnyVal {
    
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
    def setDefaultSubscriptionStatus(value: SubscriptionStatus): Self = this.set("DefaultSubscriptionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: DisplayName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicName(value: TopicName): Self = this.set("TopicName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
}
