package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IotTopicPublishAction extends js.Object {
  /**
    * The MQTT topic of the message. You can use a string expression that includes variables ($variable.&lt;variable-name&gt;) and input values ($input.&lt;input-name&gt;.&lt;path-to-datum&gt;) as the topic string.
    */
  var mqttTopic: MQTTTopic = js.native
  /**
    * You can configure the action payload when you publish a message to an AWS IoT Core topic.
    */
  var payload: js.UndefOr[Payload] = js.native
}

object IotTopicPublishAction {
  @scala.inline
  def apply(mqttTopic: MQTTTopic, payload: Payload = null): IotTopicPublishAction = {
    val __obj = js.Dynamic.literal(mqttTopic = mqttTopic.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotTopicPublishAction]
  }
}

