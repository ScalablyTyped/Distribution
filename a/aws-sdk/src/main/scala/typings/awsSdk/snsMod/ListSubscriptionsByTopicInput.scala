package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSubscriptionsByTopicInput extends StObject {
  
  /**
    * Token returned by the previous ListSubscriptionsByTopic request.
    */
  var NextToken: js.UndefOr[nextToken] = js.native
  
  /**
    * The ARN of the topic for which you wish to find subscriptions.
    */
  var TopicArn: topicARN = js.native
}
object ListSubscriptionsByTopicInput {
  
  @scala.inline
  def apply(TopicArn: topicARN): ListSubscriptionsByTopicInput = {
    val __obj = js.Dynamic.literal(TopicArn = TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSubscriptionsByTopicInput]
  }
  
  @scala.inline
  implicit class ListSubscriptionsByTopicInputMutableBuilder[Self <: ListSubscriptionsByTopicInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: nextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTopicArn(value: topicARN): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
  }
}
