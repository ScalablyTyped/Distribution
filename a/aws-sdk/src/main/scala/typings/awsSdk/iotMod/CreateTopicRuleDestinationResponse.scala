package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTopicRuleDestinationResponse extends js.Object {
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
  implicit class CreateTopicRuleDestinationResponseOps[Self <: CreateTopicRuleDestinationResponse] (val x: Self) extends AnyVal {
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
    def setTopicRuleDestination(value: TopicRuleDestination): Self = this.set("topicRuleDestination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicRuleDestination: Self = this.set("topicRuleDestination", js.undefined)
  }
  
}

