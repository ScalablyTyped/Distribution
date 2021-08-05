package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTopicRuleDestinationRequest extends StObject {
  
  /**
    * The topic rule destination configuration.
    */
  var destinationConfiguration: TopicRuleDestinationConfiguration
}
object CreateTopicRuleDestinationRequest {
  
  inline def apply(destinationConfiguration: TopicRuleDestinationConfiguration): CreateTopicRuleDestinationRequest = {
    val __obj = js.Dynamic.literal(destinationConfiguration = destinationConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTopicRuleDestinationRequest]
  }
  
  extension [Self <: CreateTopicRuleDestinationRequest](x: Self) {
    
    inline def setDestinationConfiguration(value: TopicRuleDestinationConfiguration): Self = StObject.set(x, "destinationConfiguration", value.asInstanceOf[js.Any])
  }
}
