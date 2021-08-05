package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICreateSubscriptionOptions extends StObject {
  
  var DefaultMessageTimeToLive: String
  
  var EnableDeadLetteringOnFilterEvaluationExceptions: Boolean
  
  var EnableDeadLetteringOnMessageExpiration: Boolean
  
  var LockDuration: String
  
  var RequiresSession: Boolean
}
object ICreateSubscriptionOptions {
  
  inline def apply(
    DefaultMessageTimeToLive: String,
    EnableDeadLetteringOnFilterEvaluationExceptions: Boolean,
    EnableDeadLetteringOnMessageExpiration: Boolean,
    LockDuration: String,
    RequiresSession: Boolean
  ): ICreateSubscriptionOptions = {
    val __obj = js.Dynamic.literal(DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], EnableDeadLetteringOnFilterEvaluationExceptions = EnableDeadLetteringOnFilterEvaluationExceptions.asInstanceOf[js.Any], EnableDeadLetteringOnMessageExpiration = EnableDeadLetteringOnMessageExpiration.asInstanceOf[js.Any], LockDuration = LockDuration.asInstanceOf[js.Any], RequiresSession = RequiresSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateSubscriptionOptions]
  }
  
  extension [Self <: ICreateSubscriptionOptions](x: Self) {
    
    inline def setDefaultMessageTimeToLive(value: String): Self = StObject.set(x, "DefaultMessageTimeToLive", value.asInstanceOf[js.Any])
    
    inline def setEnableDeadLetteringOnFilterEvaluationExceptions(value: Boolean): Self = StObject.set(x, "EnableDeadLetteringOnFilterEvaluationExceptions", value.asInstanceOf[js.Any])
    
    inline def setEnableDeadLetteringOnMessageExpiration(value: Boolean): Self = StObject.set(x, "EnableDeadLetteringOnMessageExpiration", value.asInstanceOf[js.Any])
    
    inline def setLockDuration(value: String): Self = StObject.set(x, "LockDuration", value.asInstanceOf[js.Any])
    
    inline def setRequiresSession(value: Boolean): Self = StObject.set(x, "RequiresSession", value.asInstanceOf[js.Any])
  }
}
