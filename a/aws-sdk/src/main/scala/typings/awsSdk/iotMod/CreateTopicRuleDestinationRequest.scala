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
  
  @scala.inline
  def apply(destinationConfiguration: TopicRuleDestinationConfiguration): CreateTopicRuleDestinationRequest = {
    val __obj = js.Dynamic.literal(destinationConfiguration = destinationConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTopicRuleDestinationRequest]
  }
  
  @scala.inline
  implicit class CreateTopicRuleDestinationRequestMutableBuilder[Self <: CreateTopicRuleDestinationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationConfiguration(value: TopicRuleDestinationConfiguration): Self = StObject.set(x, "destinationConfiguration", value.asInstanceOf[js.Any])
  }
}
