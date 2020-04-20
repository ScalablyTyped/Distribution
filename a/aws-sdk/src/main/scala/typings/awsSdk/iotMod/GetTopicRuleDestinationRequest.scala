package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTopicRuleDestinationRequest extends js.Object {
  /**
    * The ARN of the topic rule destination.
    */
  var arn: AwsArn = js.native
}

object GetTopicRuleDestinationRequest {
  @scala.inline
  def apply(arn: AwsArn): GetTopicRuleDestinationRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTopicRuleDestinationRequest]
  }
}

