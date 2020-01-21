package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IotEventsAction extends js.Object {
  /**
    * The name of the AWS IoT Events input.
    */
  var inputName: InputName = js.native
  /**
    * [Optional] Use this to ensure that only one input (message) with a given messageId will be processed by an AWS IoT Events detector.
    */
  var messageId: js.UndefOr[MessageId] = js.native
  /**
    * The ARN of the role that grants AWS IoT permission to send an input to an AWS IoT Events detector. ("Action":"iotevents:BatchPutMessage").
    */
  var roleArn: AwsArn = js.native
}

object IotEventsAction {
  @scala.inline
  def apply(inputName: InputName, roleArn: AwsArn, messageId: MessageId = null): IotEventsAction = {
    val __obj = js.Dynamic.literal(inputName = inputName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotEventsAction]
  }
}

