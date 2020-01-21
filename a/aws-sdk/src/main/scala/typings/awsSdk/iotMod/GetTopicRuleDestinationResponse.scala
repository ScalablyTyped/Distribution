package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTopicRuleDestinationResponse extends js.Object {
  /**
    * The topic rule destination.
    */
  var topicRuleDestination: js.UndefOr[TopicRuleDestination] = js.native
}

object GetTopicRuleDestinationResponse {
  @scala.inline
  def apply(topicRuleDestination: TopicRuleDestination = null): GetTopicRuleDestinationResponse = {
    val __obj = js.Dynamic.literal()
    if (topicRuleDestination != null) __obj.updateDynamic("topicRuleDestination")(topicRuleDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTopicRuleDestinationResponse]
  }
}

