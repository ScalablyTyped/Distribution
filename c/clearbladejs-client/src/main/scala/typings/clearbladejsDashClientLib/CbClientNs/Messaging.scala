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
    currentTopics: CbCallback => scala.Unit,
    disconnect: () => scala.Unit,
    endpoint: java.lang.String,
    getAndDeleteMessageHistory: (java.lang.String, scala.Double, scala.Double, scala.Double, scala.Double, CbCallback) => scala.Unit,
    getMessageHistory: (java.lang.String, scala.Double, scala.Double, CbCallback) => scala.Unit,
    getMessageHistoryWithTimeFrame: (java.lang.String, scala.Double, scala.Double, scala.Double, scala.Double, CbCallback) => scala.Unit,
    publish: (java.lang.String, js.Object) => scala.Unit,
    publishREST: (java.lang.String, js.Object, CbCallback) => scala.Unit,
    subscribe: (java.lang.String, MessagingSubscribeOptions, MessageCallback) => scala.Unit,
    systemKey: java.lang.String,
    systemSecret: java.lang.String,
    unsubscribe: (java.lang.String, MessagingSubscribeOptions) => scala.Unit,
    user: APIUser
  ): Messaging = {
    val __obj = js.Dynamic.literal(URI = URI, callTimeout = callTimeout, client = client, currentTopics = js.Any.fromFunction1(currentTopics), disconnect = js.Any.fromFunction0(disconnect), endpoint = endpoint, getAndDeleteMessageHistory = js.Any.fromFunction6(getAndDeleteMessageHistory), getMessageHistory = js.Any.fromFunction4(getMessageHistory), getMessageHistoryWithTimeFrame = js.Any.fromFunction6(getMessageHistoryWithTimeFrame), publish = js.Any.fromFunction2(publish), publishREST = js.Any.fromFunction3(publishREST), subscribe = js.Any.fromFunction3(subscribe), systemKey = systemKey, systemSecret = systemSecret, unsubscribe = js.Any.fromFunction2(unsubscribe), user = user)
  
    __obj.asInstanceOf[Messaging]
  }
}

