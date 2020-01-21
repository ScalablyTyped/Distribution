package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SNSTopicPublishAction extends js.Object {
  /**
    * The ARN of the Amazon SNS target where the message is sent.
    */
  var targetArn: AmazonResourceName = js.native
}

object SNSTopicPublishAction {
  @scala.inline
  def apply(targetArn: AmazonResourceName): SNSTopicPublishAction = {
    val __obj = js.Dynamic.literal(targetArn = targetArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SNSTopicPublishAction]
  }
}

