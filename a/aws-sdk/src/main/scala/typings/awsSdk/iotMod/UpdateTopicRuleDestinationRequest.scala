package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTopicRuleDestinationRequest extends js.Object {
  /**
    * The ARN of the topic rule destination.
    */
  var arn: AwsArn = js.native
  /**
    * The status of the topic rule destination. Valid values are:  IN_PROGRESS  A topic rule destination was created but has not been confirmed. You can set status to IN_PROGRESS by calling UpdateTopicRuleDestination. Calling UpdateTopicRuleDestination causes a new confirmation challenge to be sent to your confirmation endpoint.  ENABLED  Confirmation was completed, and traffic to this destination is allowed. You can set status to DISABLED by calling UpdateTopicRuleDestination.  DISABLED  Confirmation was completed, and traffic to this destination is not allowed. You can set status to ENABLED by calling UpdateTopicRuleDestination.  ERROR  Confirmation could not be completed, for example if the confirmation timed out. You can call GetTopicRuleDestination for details about the error. You can set status to IN_PROGRESS by calling UpdateTopicRuleDestination. Calling UpdateTopicRuleDestination causes a new confirmation challenge to be sent to your confirmation endpoint.  
    */
  var status: TopicRuleDestinationStatus = js.native
}

object UpdateTopicRuleDestinationRequest {
  @scala.inline
  def apply(arn: AwsArn, status: TopicRuleDestinationStatus): UpdateTopicRuleDestinationRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTopicRuleDestinationRequest]
  }
  @scala.inline
  implicit class UpdateTopicRuleDestinationRequestOps[Self <: UpdateTopicRuleDestinationRequest] (val x: Self) extends AnyVal {
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
    def setArn(value: AwsArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: TopicRuleDestinationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

