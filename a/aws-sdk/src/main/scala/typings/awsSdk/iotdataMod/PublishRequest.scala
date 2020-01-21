package typings.awsSdk.iotdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishRequest extends js.Object {
  /**
    * The state information, in JSON format.
    */
  var payload: js.UndefOr[Payload] = js.native
  /**
    * The Quality of Service (QoS) level.
    */
  var qos: js.UndefOr[Qos] = js.native
  /**
    * The name of the MQTT topic.
    */
  var topic: Topic = js.native
}

object PublishRequest {
  @scala.inline
  def apply(topic: Topic, payload: Payload = null, qos: Int | Double = null): PublishRequest = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (qos != null) __obj.updateDynamic("qos")(qos.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishRequest]
  }
}

