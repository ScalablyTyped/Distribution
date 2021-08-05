package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.ICreateSubscriptionOptions> */
trait CreateSubscriptionOptions extends StObject {
  
  var DefaultMessageTimeToLive: js.UndefOr[String] = js.undefined
  
  var EnableDeadLetteringOnFilterEvaluationExceptions: js.UndefOr[Boolean] = js.undefined
  
  var EnableDeadLetteringOnMessageExpiration: js.UndefOr[Boolean] = js.undefined
  
  var LockDuration: js.UndefOr[String] = js.undefined
  
  var RequiresSession: js.UndefOr[Boolean] = js.undefined
}
object CreateSubscriptionOptions {
  
  inline def apply(): CreateSubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSubscriptionOptions]
  }
  
  extension [Self <: CreateSubscriptionOptions](x: Self) {
    
    inline def setDefaultMessageTimeToLive(value: String): Self = StObject.set(x, "DefaultMessageTimeToLive", value.asInstanceOf[js.Any])
    
    inline def setDefaultMessageTimeToLiveUndefined: Self = StObject.set(x, "DefaultMessageTimeToLive", js.undefined)
    
    inline def setEnableDeadLetteringOnFilterEvaluationExceptions(value: Boolean): Self = StObject.set(x, "EnableDeadLetteringOnFilterEvaluationExceptions", value.asInstanceOf[js.Any])
    
    inline def setEnableDeadLetteringOnFilterEvaluationExceptionsUndefined: Self = StObject.set(x, "EnableDeadLetteringOnFilterEvaluationExceptions", js.undefined)
    
    inline def setEnableDeadLetteringOnMessageExpiration(value: Boolean): Self = StObject.set(x, "EnableDeadLetteringOnMessageExpiration", value.asInstanceOf[js.Any])
    
    inline def setEnableDeadLetteringOnMessageExpirationUndefined: Self = StObject.set(x, "EnableDeadLetteringOnMessageExpiration", js.undefined)
    
    inline def setLockDuration(value: String): Self = StObject.set(x, "LockDuration", value.asInstanceOf[js.Any])
    
    inline def setLockDurationUndefined: Self = StObject.set(x, "LockDuration", js.undefined)
    
    inline def setRequiresSession(value: Boolean): Self = StObject.set(x, "RequiresSession", value.asInstanceOf[js.Any])
    
    inline def setRequiresSessionUndefined: Self = StObject.set(x, "RequiresSession", js.undefined)
  }
}
