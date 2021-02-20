package typings.clearbladejsClient.CbClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagingStats extends StObject {
  
  var URI: String = js.native
  
  var endpoint: String = js.native
  
  def getAveragePayloadSize(topic: String, start: Double, stop: Double, callback: CbCallback): Unit = js.native
  
  def getCurrentSubscribers(topic: String, callback: CbCallback): Unit = js.native
  
  def getOpenConnections(callback: CbCallback): Unit = js.native
  
  var systemKey: String = js.native
  
  var user: APIUser = js.native
}
object MessagingStats {
  
  @scala.inline
  def apply(
    URI: String,
    endpoint: String,
    getAveragePayloadSize: (String, Double, Double, CbCallback) => Unit,
    getCurrentSubscribers: (String, CbCallback) => Unit,
    getOpenConnections: CbCallback => Unit,
    systemKey: String,
    user: APIUser
  ): MessagingStats = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], getAveragePayloadSize = js.Any.fromFunction4(getAveragePayloadSize), getCurrentSubscribers = js.Any.fromFunction2(getCurrentSubscribers), getOpenConnections = js.Any.fromFunction1(getOpenConnections), systemKey = systemKey.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagingStats]
  }
  
  @scala.inline
  implicit class MessagingStatsMutableBuilder[Self <: MessagingStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAveragePayloadSize(value: (String, Double, Double, CbCallback) => Unit): Self = StObject.set(x, "getAveragePayloadSize", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetCurrentSubscribers(value: (String, CbCallback) => Unit): Self = StObject.set(x, "getCurrentSubscribers", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetOpenConnections(value: CbCallback => Unit): Self = StObject.set(x, "getOpenConnections", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
