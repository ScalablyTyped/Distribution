package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepublishAction extends js.Object {
  /**
    * The Quality of Service (QoS) level to use when republishing messages. The default value is 0.
    */
  var qos: js.UndefOr[Qos] = js.native
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: AwsArn = js.native
  /**
    * The name of the MQTT topic.
    */
  var topic: TopicPattern = js.native
}

object RepublishAction {
  @scala.inline
  def apply(roleArn: AwsArn, topic: TopicPattern, qos: Int | Double = null): RepublishAction = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    if (qos != null) __obj.updateDynamic("qos")(qos.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepublishAction]
  }
}

