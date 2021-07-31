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
  
  @scala.inline
  def apply(): CreateSubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSubscriptionOptions]
  }
  
  @scala.inline
  implicit class CreateSubscriptionOptionsMutableBuilder[Self <: CreateSubscriptionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultMessageTimeToLive(value: String): Self = StObject.set(x, "DefaultMessageTimeToLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultMessageTimeToLiveUndefined: Self = StObject.set(x, "DefaultMessageTimeToLive", js.undefined)
    
    @scala.inline
    def setEnableDeadLetteringOnFilterEvaluationExceptions(value: Boolean): Self = StObject.set(x, "EnableDeadLetteringOnFilterEvaluationExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDeadLetteringOnFilterEvaluationExceptionsUndefined: Self = StObject.set(x, "EnableDeadLetteringOnFilterEvaluationExceptions", js.undefined)
    
    @scala.inline
    def setEnableDeadLetteringOnMessageExpiration(value: Boolean): Self = StObject.set(x, "EnableDeadLetteringOnMessageExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDeadLetteringOnMessageExpirationUndefined: Self = StObject.set(x, "EnableDeadLetteringOnMessageExpiration", js.undefined)
    
    @scala.inline
    def setLockDuration(value: String): Self = StObject.set(x, "LockDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockDurationUndefined: Self = StObject.set(x, "LockDuration", js.undefined)
    
    @scala.inline
    def setRequiresSession(value: Boolean): Self = StObject.set(x, "RequiresSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresSessionUndefined: Self = StObject.set(x, "RequiresSession", js.undefined)
  }
}
