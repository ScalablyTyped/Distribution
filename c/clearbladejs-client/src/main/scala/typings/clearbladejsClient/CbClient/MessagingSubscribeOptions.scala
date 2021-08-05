package typings.clearbladejsClient.CbClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagingSubscribeOptions extends StObject {
  
  var invocationContext: js.UndefOr[js.Object] = js.undefined
  
  var onFailure: js.UndefOr[js.Function] = js.undefined
  
  var onSuccess: js.UndefOr[js.Function] = js.undefined
  
  var qos: js.UndefOr[MessagingQOS] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object MessagingSubscribeOptions {
  
  inline def apply(): MessagingSubscribeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagingSubscribeOptions]
  }
  
  extension [Self <: MessagingSubscribeOptions](x: Self) {
    
    inline def setInvocationContext(value: js.Object): Self = StObject.set(x, "invocationContext", value.asInstanceOf[js.Any])
    
    inline def setInvocationContextUndefined: Self = StObject.set(x, "invocationContext", js.undefined)
    
    inline def setOnFailure(value: js.Function): Self = StObject.set(x, "onFailure", value.asInstanceOf[js.Any])
    
    inline def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
    
    inline def setOnSuccess(value: js.Function): Self = StObject.set(x, "onSuccess", value.asInstanceOf[js.Any])
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    
    inline def setQos(value: MessagingQOS): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
    
    inline def setQosUndefined: Self = StObject.set(x, "qos", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
