package typings.clearbladejsClient.CbClient

import typings.pahoMqtt.mod.global.Paho.MQTT.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Messaging extends StObject {
  
  var URI: String
  
  var callTimeout: Double
  
  var client: Client
  
  def currentTopics(callback: CbCallback): Unit
  
  def disconnect(): Unit
  
  var endpoint: String
  
  def getAndDeleteMessageHistory(topic: String, count: Double, last: Double, start: Double, stop: Double, callback: CbCallback): Unit
  
  def getMessageHistory(topic: String, last: Double, count: Double, callback: CbCallback): Unit
  
  def getMessageHistoryWithTimeFrame(topic: String, count: Double, last: Double, start: Double, stop: Double, callback: CbCallback): Unit
  
  def publish(topic: String, payload: js.Object): Unit
  
  def publishREST(topic: String, payload: js.Object, callback: CbCallback): Unit
  
  def subscribe(topic: String, options: MessagingSubscribeOptions, messageCallback: MessageCallback): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  def unsubscribe(topic: String, options: MessagingSubscribeOptions): Unit
  
  var user: APIUser
}
object Messaging {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Messaging] (val x: Self) extends AnyVal {
    
    inline def setCallTimeout(value: Double): Self = StObject.set(x, "callTimeout", value.asInstanceOf[js.Any])
    
    inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setCurrentTopics(value: CbCallback => Unit): Self = StObject.set(x, "currentTopics", js.Any.fromFunction1(value))
    
    inline def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setGetAndDeleteMessageHistory(value: (String, Double, Double, Double, Double, CbCallback) => Unit): Self = StObject.set(x, "getAndDeleteMessageHistory", js.Any.fromFunction6(value))
    
    inline def setGetMessageHistory(value: (String, Double, Double, CbCallback) => Unit): Self = StObject.set(x, "getMessageHistory", js.Any.fromFunction4(value))
    
    inline def setGetMessageHistoryWithTimeFrame(value: (String, Double, Double, Double, Double, CbCallback) => Unit): Self = StObject.set(x, "getMessageHistoryWithTimeFrame", js.Any.fromFunction6(value))
    
    inline def setPublish(value: (String, js.Object) => Unit): Self = StObject.set(x, "publish", js.Any.fromFunction2(value))
    
    inline def setPublishREST(value: (String, js.Object, CbCallback) => Unit): Self = StObject.set(x, "publishREST", js.Any.fromFunction3(value))
    
    inline def setSubscribe(value: (String, MessagingSubscribeOptions, MessageCallback) => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction3(value))
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setUnsubscribe(value: (String, MessagingSubscribeOptions) => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction2(value))
    
    inline def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
