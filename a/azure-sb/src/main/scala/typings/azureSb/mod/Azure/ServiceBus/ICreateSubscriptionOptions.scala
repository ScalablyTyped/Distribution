package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICreateSubscriptionOptions extends StObject {
  
  var DefaultMessageTimeToLive: String = js.native
  
  var EnableDeadLetteringOnFilterEvaluationExceptions: Boolean = js.native
  
  var EnableDeadLetteringOnMessageExpiration: Boolean = js.native
  
  var LockDuration: String = js.native
  
  var RequiresSession: Boolean = js.native
}
object ICreateSubscriptionOptions {
  
  @scala.inline
  def apply(
    DefaultMessageTimeToLive: String,
    EnableDeadLetteringOnFilterEvaluationExceptions: Boolean,
    EnableDeadLetteringOnMessageExpiration: Boolean,
    LockDuration: String,
    RequiresSession: Boolean
  ): ICreateSubscriptionOptions = {
    val __obj = js.Dynamic.literal(DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], EnableDeadLetteringOnFilterEvaluationExceptions = EnableDeadLetteringOnFilterEvaluationExceptions.asInstanceOf[js.Any], EnableDeadLetteringOnMessageExpiration = EnableDeadLetteringOnMessageExpiration.asInstanceOf[js.Any], LockDuration = LockDuration.asInstanceOf[js.Any], RequiresSession = RequiresSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateSubscriptionOptions]
  }
  
  @scala.inline
  implicit class ICreateSubscriptionOptionsMutableBuilder[Self <: ICreateSubscriptionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultMessageTimeToLive(value: String): Self = StObject.set(x, "DefaultMessageTimeToLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDeadLetteringOnFilterEvaluationExceptions(value: Boolean): Self = StObject.set(x, "EnableDeadLetteringOnFilterEvaluationExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDeadLetteringOnMessageExpiration(value: Boolean): Self = StObject.set(x, "EnableDeadLetteringOnMessageExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockDuration(value: String): Self = StObject.set(x, "LockDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresSession(value: Boolean): Self = StObject.set(x, "RequiresSession", value.asInstanceOf[js.Any])
  }
}
