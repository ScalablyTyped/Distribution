package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SNSTopicPublishAction extends js.Object {
  /**
    * You can configure the action payload when you send a message as an Amazon SNS push notification.
    */
  var payload: js.UndefOr[Payload] = js.native
  /**
    * The ARN of the Amazon SNS target where the message is sent.
    */
  var targetArn: AmazonResourceName = js.native
}

object SNSTopicPublishAction {
  @scala.inline
  def apply(targetArn: AmazonResourceName, payload: Payload = null): SNSTopicPublishAction = {
    val __obj = js.Dynamic.literal(targetArn = targetArn.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[SNSTopicPublishAction]
  }
}

