package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicPreference extends StObject {
  
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
  implicit class TopicPreferenceMutableBuilder[Self <: TopicPreference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubscriptionStatus(value: SubscriptionStatus): Self = StObject.set(x, "SubscriptionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicName(value: TopicName): Self = StObject.set(x, "TopicName", value.asInstanceOf[js.Any])
  }
}
