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
}

