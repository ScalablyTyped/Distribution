package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IotTopicPublishAction extends js.Object {
  /**
    * The MQTT topic of the message.
    */
  var mqttTopic: MQTTTopic = js.native
}

object IotTopicPublishAction {
  @scala.inline
  def apply(mqttTopic: MQTTTopic): IotTopicPublishAction = {
    val __obj = js.Dynamic.literal(mqttTopic = mqttTopic.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IotTopicPublishAction]
  }
}

