package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTopicRuleDestinationRequest extends js.Object {
  /**
    * The ARN of the topic rule destination to delete.
    */
  var arn: AwsArn = js.native
}

object DeleteTopicRuleDestinationRequest {
  @scala.inline
  def apply(arn: AwsArn): DeleteTopicRuleDestinationRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTopicRuleDestinationRequest]
  }
  @scala.inline
  implicit class DeleteTopicRuleDestinationRequestOps[Self <: DeleteTopicRuleDestinationRequest] (val x: Self) extends AnyVal {
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
  }
  
}

