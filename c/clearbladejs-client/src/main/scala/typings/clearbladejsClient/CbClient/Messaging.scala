package typings.clearbladejsClient.CbClient

import typings.pahoMqtt.mod.global.Paho.MQTT.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messaging extends js.Object {
  var URI: String = js.native
  var callTimeout: Double = js.native
  var client: Client = js.native
  var endpoint: String = js.native
  var systemKey: String = js.native
  var systemSecret: String = js.native
  var user: APIUser = js.native
  def currentTopics(callback: CbCallback): Unit = js.native
  def disconnect(): Unit = js.native
  def getAndDeleteMessageHistory(topic: String, count: Double, last: Double, start: Double, stop: Double, callback: CbCallback): Unit = js.native
  def getMessageHistory(topic: String, last: Double, count: Double, callback: CbCallback): Unit = js.native
  def getMessageHistoryWithTimeFrame(topic: String, count: Double, last: Double, start: Double, stop: Double, callback: CbCallback): Unit = js.native
  def publish(topic: String, payload: js.Object): Unit = js.native
  def publishREST(topic: String, payload: js.Object, callback: CbCallback): Unit = js.native
  def subscribe(topic: String, options: MessagingSubscribeOptions, messageCallback: MessageCallback): Unit = js.native
  def unsubscribe(topic: String, options: MessagingSubscribeOptions): Unit = js.native
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
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], callTimeout = callTimeout.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], currentTopics = js.Any.fromFunction1(currentTopics), disconnect = js.Any.fromFunction0(disconnect), endpoint = endpoint.asInstanceOf[js.Any], getAndDeleteMessageHistory = js.Any.fromFunction6(getAndDeleteMessageHistory), getMessageHistory = js.Any.fromFunction4(getMessageHistory), getMessageHistoryWithTimeFrame = js.Any.fromFunction6(getMessageHistoryWithTimeFrame), publish = js.Any.fromFunction2(publish), publishREST = js.Any.fromFunction3(publishREST), subscribe = js.Any.fromFunction3(subscribe), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction2(unsubscribe), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Messaging]
  }
  @scala.inline
  implicit class MessagingOps[Self <: Messaging] (val x: Self) extends AnyVal {
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
    def setURI(value: String): Self = this.set("URI", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallTimeout(value: Double): Self = this.set("callTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setClient(value: Client): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTopics(value: CbCallback => Unit): Self = this.set("currentTopics", js.Any.fromFunction1(value))
    @scala.inline
    def setDisconnect(value: () => Unit): Self = this.set("disconnect", js.Any.fromFunction0(value))
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAndDeleteMessageHistory(value: (String, Double, Double, Double, Double, CbCallback) => Unit): Self = this.set("getAndDeleteMessageHistory", js.Any.fromFunction6(value))
    @scala.inline
    def setGetMessageHistory(value: (String, Double, Double, CbCallback) => Unit): Self = this.set("getMessageHistory", js.Any.fromFunction4(value))
    @scala.inline
    def setGetMessageHistoryWithTimeFrame(value: (String, Double, Double, Double, Double, CbCallback) => Unit): Self = this.set("getMessageHistoryWithTimeFrame", js.Any.fromFunction6(value))
    @scala.inline
    def setPublish(value: (String, js.Object) => Unit): Self = this.set("publish", js.Any.fromFunction2(value))
    @scala.inline
    def setPublishREST(value: (String, js.Object, CbCallback) => Unit): Self = this.set("publishREST", js.Any.fromFunction3(value))
    @scala.inline
    def setSubscribe(value: (String, MessagingSubscribeOptions, MessageCallback) => Unit): Self = this.set("subscribe", js.Any.fromFunction3(value))
    @scala.inline
    def setSystemKey(value: String): Self = this.set("systemKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemSecret(value: String): Self = this.set("systemSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnsubscribe(value: (String, MessagingSubscribeOptions) => Unit): Self = this.set("unsubscribe", js.Any.fromFunction2(value))
    @scala.inline
    def setUser(value: APIUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

