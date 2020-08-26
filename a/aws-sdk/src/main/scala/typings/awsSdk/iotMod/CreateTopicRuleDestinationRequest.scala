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
  @scala.inline
  implicit class CreateTopicRuleDestinationRequestOps[Self <: CreateTopicRuleDestinationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestinationConfiguration(value: TopicRuleDestinationConfiguration): Self = this.set("destinationConfiguration", value.asInstanceOf[js.Any])
  }
  
}

