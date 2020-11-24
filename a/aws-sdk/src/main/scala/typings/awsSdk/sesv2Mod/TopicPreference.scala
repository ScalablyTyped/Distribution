package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicPreference extends js.Object {
  
  /**
    * The contact's subscription status to a topic which is either OPT_IN or OPT_OUT.
    */
  var SubscriptionStatus: typings.awsSdk.sesv2Mod.SubscriptionStatus = js.native
  
  /**
    * The name of the topic.
    */
  var TopicName: typings.awsSdk.sesv2Mod.TopicName = js.native
}
object TopicPreference {
  
  @scala.inline
  def apply(SubscriptionStatus: SubscriptionStatus, TopicName: TopicName): TopicPreference = {
    val __obj = js.Dynamic.literal(SubscriptionStatus = SubscriptionStatus.asInstanceOf[js.Any], TopicName = TopicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicPreference]
  }
  
  @scala.inline
  implicit class TopicPreferenceOps[Self <: TopicPreference] (val x: Self) extends AnyVal {
    
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
    def setSubscriptionStatus(value: SubscriptionStatus): Self = this.set("SubscriptionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicName(value: TopicName): Self = this.set("TopicName", value.asInstanceOf[js.Any])
  }
}
