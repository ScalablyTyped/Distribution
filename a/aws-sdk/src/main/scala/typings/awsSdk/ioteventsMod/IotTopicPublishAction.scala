package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(mqttTopic: MQTTTopic): IotTopicPublishAction = {
    val __obj = js.Dynamic.literal(mqttTopic = mqttTopic.asInstanceOf[js.Any])
    __obj.asInstanceOf[IotTopicPublishAction]
  }
  
  @scala.inline
  implicit class IotTopicPublishActionOps[Self <: IotTopicPublishAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMqttTopic(value: MQTTTopic): Self = this.set("mqttTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: Payload): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
  }
}
