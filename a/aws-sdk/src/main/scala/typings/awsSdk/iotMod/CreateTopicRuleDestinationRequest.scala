package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTopicRuleDestinationRequest extends js.Object {
  /**
    * The topic rule destination configuration.
    */
  var destinationConfiguration: TopicRuleDestinationConfiguration = js.native
}

object CreateTopicRuleDestinationRequest {
  @scala.inline
  def apply(destinationConfiguration: TopicRuleDestinationConfiguration): CreateTopicRuleDestinationRequest = {
    val __obj = js.Dynamic.literal(destinationConfiguration = destinationConfiguration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateTopicRuleDestinationRequest]
  }
}

