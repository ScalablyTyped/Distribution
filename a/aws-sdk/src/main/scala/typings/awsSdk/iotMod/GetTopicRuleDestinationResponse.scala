package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTopicRuleDestinationResponse extends StObject {
  
  /**
    * The topic rule destination.
    */
  var topicRuleDestination: js.UndefOr[TopicRuleDestination] = js.native
}
object GetTopicRuleDestinationResponse {
  
  @scala.inline
  def apply(): GetTopicRuleDestinationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTopicRuleDestinationResponse]
  }
  
  @scala.inline
  implicit class GetTopicRuleDestinationResponseMutableBuilder[Self <: GetTopicRuleDestinationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopicRuleDestination(value: TopicRuleDestination): Self = StObject.set(x, "topicRuleDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicRuleDestinationUndefined: Self = StObject.set(x, "topicRuleDestination", js.undefined)
  }
}
