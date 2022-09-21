package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Push API interface provides a subcription's URL endpoint and allows unsubscription from a push service.
  * Available only in secure contexts.
  */
trait PushSubscription extends StObject {
  
  val endpoint: java.lang.String
  
  def getKey(name: PushEncryptionKeyName): ArrayBuffer | Null
  
  val options: PushSubscriptionOptions
  
  def toJSON(): PushSubscriptionJSON
  
  def unsubscribe(): Promise[scala.Boolean]
}
object PushSubscription {
  
  inline def apply(
    endpoint: java.lang.String,
    getKey: PushEncryptionKeyName => ArrayBuffer | Null,
    options: PushSubscriptionOptions,
    toJSON: () => PushSubscriptionJSON,
    unsubscribe: () => Promise[scala.Boolean]
  ): PushSubscription = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], getKey = js.Any.fromFunction1(getKey), options = options.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[PushSubscription]
  }
  
  extension [Self <: PushSubscription](x: Self) {
    
    inline def setEndpoint(value: java.lang.String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setGetKey(value: PushEncryptionKeyName => ArrayBuffer | Null): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    
    inline def setOptions(value: PushSubscriptionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => PushSubscriptionJSON): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    inline def setUnsubscribe(value: () => Promise[scala.Boolean]): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
  }
}
