package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTopicRuleDestinationResponse extends StObject {
  
  /**
    * The topic rule destination.
    */
  var topicRuleDestination: js.UndefOr[TopicRuleDestination] = js.native
}
object CreateTopicRuleDestinationResponse {
  
  @scala.inline
  def apply(): CreateTopicRuleDestinationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTopicRuleDestinationResponse]
  }
  
  @scala.inline
  implicit class CreateTopicRuleDestinationResponseMutableBuilder[Self <: CreateTopicRuleDestinationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopicRuleDestination(value: TopicRuleDestination): Self = StObject.set(x, "topicRuleDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicRuleDestinationUndefined: Self = StObject.set(x, "topicRuleDestination", js.undefined)
  }
}
