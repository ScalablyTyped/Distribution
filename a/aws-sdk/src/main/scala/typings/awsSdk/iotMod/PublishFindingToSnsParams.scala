package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishFindingToSnsParams extends js.Object {
  /**
    * The ARN of the topic to which you want to publish the findings.
    */
  var topicArn: SnsTopicArn = js.native
}

object PublishFindingToSnsParams {
  @scala.inline
  def apply(topicArn: SnsTopicArn): PublishFindingToSnsParams = {
    val __obj = js.Dynamic.literal(topicArn = topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishFindingToSnsParams]
  }
}

