package typings
package clearbladejsDashClientLib.CbClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Messaging extends js.Object {
  var URI: java.lang.String
  var callTimeout: scala.Double
  var client: pahoDashMqttLib.pahoDashMqttMod.Global.PahoNs.MQTTNs.Client
  var endpoint: java.lang.String
  var systemKey: java.lang.String
  var systemSecret: java.lang.String
  var user: APIUser
  def currentTopics(callback: CbCallback): scala.Unit
  def disconnect(): scala.Unit
  def getAndDeleteMessageHistory(
    topic: java.lang.String,
    count: scala.Double,
    last: scala.Double,
    start: scala.Double,
    stop: scala.Double,
    callback: CbCallback
  ): scala.Unit
  def getMessageHistory(topic: java.lang.String, last: scala.Double, count: scala.Double, callback: CbCallback): scala.Unit
  def getMessageHistoryWithTimeFrame(
    topic: java.lang.String,
    count: scala.Double,
    last: scala.Double,
    start: scala.Double,
    stop: scala.Double,
    callback: CbCallback
  ): scala.Unit
  def publish(topic: java.lang.String, payload: js.Object): scala.Unit
  def publishREST(topic: java.lang.String, payload: js.Object, callback: CbCallback): scala.Unit
  def subscribe(topic: java.lang.String, options: MessagingSubscribeOptions, messageCallback: MessageCallback): scala.Unit
  def unsubscribe(topic: java.lang.String, options: MessagingSubscribeOptions): scala.Unit
}

object Messaging {
  @scala.inline
  def apply(
    URI: java.lang.String,
    callTimeout: scala.Double,
    client: pahoDashMqttLib.pahoDashMqttMod.Global.PahoNs.MQTTNs.Client,
    currentTopics: js.Function1[CbCallback, scala.Unit],
    disconnect: js.Function0[scala.Unit],
    endpoint: java.lang.String,
    getAndDeleteMessageHistory: js.Function6[
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      CbCallback, 
      scala.Unit
    ],
    getMessageHistory: js.Function4[java.lang.String, scala.Double, scala.Double, CbCallback, scala.Unit],
    getMessageHistoryWithTimeFrame: js.Function6[
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      CbCallback, 
      scala.Unit
    ],
    publish: js.Function2[java.lang.String, js.Object, scala.Unit],
    publishREST: js.Function3[java.lang.String, js.Object, CbCallback, scala.Unit],
    subscribe: js.Function3[java.lang.String, MessagingSubscribeOptions, MessageCallback, scala.Unit],
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    unsubscribe: js.Function2[java.lang.String, MessagingSubscribeOptions, scala.Unit],
    user: APIUser
  ): Messaging = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI)
    __obj.updateDynamic("callTimeout")(callTimeout)
    __obj.updateDynamic("client")(client)
    __obj.updateDynamic("currentTopics")(currentTopics)
    __obj.updateDynamic("disconnect")(disconnect)
    __obj.updateDynamic("endpoint")(endpoint)
    __obj.updateDynamic("getAndDeleteMessageHistory")(getAndDeleteMessageHistory)
    __obj.updateDynamic("getMessageHistory")(getMessageHistory)
    __obj.updateDynamic("getMessageHistoryWithTimeFrame")(getMessageHistoryWithTimeFrame)
    __obj.updateDynamic("publish")(publish)
    __obj.updateDynamic("publishREST")(publishREST)
    __obj.updateDynamic("subscribe")(subscribe)
    __obj.updateDynamic("systemKey")(systemKey)
    __obj.updateDynamic("systemSecret")(systemSecret)
    __obj.updateDynamic("unsubscribe")(unsubscribe)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Messaging]
  }
}

