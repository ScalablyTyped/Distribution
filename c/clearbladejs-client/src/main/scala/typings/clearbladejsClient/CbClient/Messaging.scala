package typings.clearbladejsClient.CbClient

import typings.pahoMqtt.mod.global.Paho.MQTT.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Messaging extends StObject {
  
  var URI: String = js.native
  
  var callTimeout: Double = js.native
  
  var client: Client = js.native
  
  def currentTopics(callback: CbCallback): Unit = js.native
  
  def disconnect(): Unit = js.native
  
  var endpoint: String = js.native
  
  def getAndDeleteMessageHistory(topic: String, count: Double, last: Double, start: Double, stop: Double, callback: CbCallback): Unit = js.native
  
  def getMessageHistory(topic: String, last: Double, count: Double, callback: CbCallback): Unit = js.native
  
  def getMessageHistoryWithTimeFrame(topic: String, count: Double, last: Double, start: Double, stop: Double, callback: CbCallback): Unit = js.native
  
  def publish(topic: String, payload: js.Object): Unit = js.native
  
  def publishREST(topic: String, payload: js.Object, callback: CbCallback): Unit = js.native
  
  def subscribe(topic: String, options: MessagingSubscribeOptions, messageCallback: MessageCallback): Unit = js.native
  
  var systemKey: String = js.native
  
  var systemSecret: String = js.native
  
  def unsubscribe(topic: String, options: MessagingSubscribeOptions): Unit = js.native
  
  var user: APIUser = js.native
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
  implicit class MessagingMutableBuilder[Self <: Messaging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallTimeout(value: Double): Self = StObject.set(x, "callTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTopics(value: CbCallback => Unit): Self = StObject.set(x, "currentTopics", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAndDeleteMessageHistory(value: (String, Double, Double, Double, Double, CbCallback) => Unit): Self = StObject.set(x, "getAndDeleteMessageHistory", js.Any.fromFunction6(value))
    
    @scala.inline
    def setGetMessageHistory(value: (String, Double, Double, CbCallback) => Unit): Self = StObject.set(x, "getMessageHistory", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetMessageHistoryWithTimeFrame(value: (String, Double, Double, Double, Double, CbCallback) => Unit): Self = StObject.set(x, "getMessageHistoryWithTimeFrame", js.Any.fromFunction6(value))
    
    @scala.inline
    def setPublish(value: (String, js.Object) => Unit): Self = StObject.set(x, "publish", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPublishREST(value: (String, js.Object, CbCallback) => Unit): Self = StObject.set(x, "publishREST", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSubscribe(value: (String, MessagingSubscribeOptions, MessageCallback) => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsubscribe(value: (String, MessagingSubscribeOptions) => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
