package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTopicRuleDestinationResponse extends StObject {
  
  /**
    * The topic rule destination.
    */
  var topicRuleDestination: js.UndefOr[TopicRuleDestination] = js.undefined
}
object CreateTopicRuleDestinationResponse {
  
  inline def apply(): CreateTopicRuleDestinationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTopicRuleDestinationResponse]
  }
  
  extension [Self <: CreateTopicRuleDestinationResponse](x: Self) {
    
    inline def setTopicRuleDestination(value: TopicRuleDestination): Self = StObject.set(x, "topicRuleDestination", value.asInstanceOf[js.Any])
    
    inline def setTopicRuleDestinationUndefined: Self = StObject.set(x, "topicRuleDestination", js.undefined)
  }
}
