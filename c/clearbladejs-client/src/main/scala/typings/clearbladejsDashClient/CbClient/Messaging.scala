package typings.clearbladejsDashClient.CbClient

import typings.pahoDashMqtt.pahoDashMqttMod._Global_.Paho.MQTT.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Messaging extends js.Object {
  var URI: String
  var callTimeout: Double
  var client: Client
  var endpoint: String
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def currentTopics(callback: CbCallback): Unit
  def disconnect(): Unit
  def getAndDeleteMessageHistory(topic: String, count: Double, last: Double, start: Double, stop: Double, callback: CbCallback): Unit
  def getMessageHistory(topic: String, last: Double, count: Double, callback: CbCallback): Unit
  def getMessageHistoryWithTimeFrame(topic: String, count: Double, last: Double, start: Double, stop: Double, callback: CbCallback): Unit
  def publish(topic: String, payload: js.Object): Unit
  def publishREST(topic: String, payload: js.Object, callback: CbCallback): Unit
  def subscribe(topic: String, options: MessagingSubscribeOptions, messageCallback: MessageCallback): Unit
  def unsubscribe(topic: String, options: MessagingSubscribeOptions): Unit
}

object Messaging {
  @scala.inline
  def apply(
    URI: String,
    callTimeout: Double,
    client: Client,
    currentTopics: CbCallback => Unit,
    disconnect: () => Unit,
    endpoint: String,
    getAndDeleteMessageHistory: (String, Double, Double, Double, Double, CbCallback) => Unit,
    getMessageHistory: (String, Double, Double, CbCallback) => Unit,
    getMessageHistoryWithTimeFrame: (String, Double, Double, Double, Double, CbCallback) => Unit,
    publish: (String, js.Object) => Unit,
    publishREST: (String, js.Object, CbCallback) => Unit,
    subscribe: (String, MessagingSubscribeOptions, MessageCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    unsubscribe: (String, MessagingSubscribeOptions) => Unit,
    user: APIUser
  ): Messaging = {
    val __obj = js.Dynamic.literal(URI = URI, callTimeout = callTimeout, client = client, currentTopics = js.Any.fromFunction1(currentTopics), disconnect = js.Any.fromFunction0(disconnect), endpoint = endpoint, getAndDeleteMessageHistory = js.Any.fromFunction6(getAndDeleteMessageHistory), getMessageHistory = js.Any.fromFunction4(getMessageHistory), getMessageHistoryWithTimeFrame = js.Any.fromFunction6(getMessageHistoryWithTimeFrame), publish = js.Any.fromFunction2(publish), publishREST = js.Any.fromFunction3(publishREST), subscribe = js.Any.fromFunction3(subscribe), systemKey = systemKey, systemSecret = systemSecret, unsubscribe = js.Any.fromFunction2(unsubscribe), user = user)
  
    __obj.asInstanceOf[Messaging]
  }
}

