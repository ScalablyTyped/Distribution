package typings.azureSb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionresultMod {
  
  object Azure {
    
    object ServiceBus {
      
      object Results {
        
        trait SubscriptionProperties extends StObject {
          
          var AutoDeleteOnIdle: Boolean
          
          var DeadLetteringOnFilterEvaluationExceptions: String
          
          var DeadLetteringOnMessageExpiration: String
          
          var DefaultMessageTimeToLive: String
          
          var EnableBatchedOperations: Boolean
          
          var LockDuration: String
          
          var MaxDeliveryCount: Double
          
          var MessageCount: Double
          
          var RequiresSession: Boolean
        }
        object SubscriptionProperties {
          
          inline def apply(
            AutoDeleteOnIdle: Boolean,
            DeadLetteringOnFilterEvaluationExceptions: String,
            DeadLetteringOnMessageExpiration: String,
            DefaultMessageTimeToLive: String,
            EnableBatchedOperations: Boolean,
            LockDuration: String,
            MaxDeliveryCount: Double,
            MessageCount: Double,
            RequiresSession: Boolean
          ): SubscriptionProperties = {
            val __obj = js.Dynamic.literal(AutoDeleteOnIdle = AutoDeleteOnIdle.asInstanceOf[js.Any], DeadLetteringOnFilterEvaluationExceptions = DeadLetteringOnFilterEvaluationExceptions.asInstanceOf[js.Any], DeadLetteringOnMessageExpiration = DeadLetteringOnMessageExpiration.asInstanceOf[js.Any], DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], EnableBatchedOperations = EnableBatchedOperations.asInstanceOf[js.Any], LockDuration = LockDuration.asInstanceOf[js.Any], MaxDeliveryCount = MaxDeliveryCount.asInstanceOf[js.Any], MessageCount = MessageCount.asInstanceOf[js.Any], RequiresSession = RequiresSession.asInstanceOf[js.Any])
            __obj.asInstanceOf[SubscriptionProperties]
          }
          
          extension [Self <: SubscriptionProperties](x: Self) {
            
            inline def setAutoDeleteOnIdle(value: Boolean): Self = StObject.set(x, "AutoDeleteOnIdle", value.asInstanceOf[js.Any])
            
            inline def setDeadLetteringOnFilterEvaluationExceptions(value: String): Self = StObject.set(x, "DeadLetteringOnFilterEvaluationExceptions", value.asInstanceOf[js.Any])
            
            inline def setDeadLetteringOnMessageExpiration(value: String): Self = StObject.set(x, "DeadLetteringOnMessageExpiration", value.asInstanceOf[js.Any])
            
            inline def setDefaultMessageTimeToLive(value: String): Self = StObject.set(x, "DefaultMessageTimeToLive", value.asInstanceOf[js.Any])
            
            inline def setEnableBatchedOperations(value: Boolean): Self = StObject.set(x, "EnableBatchedOperations", value.asInstanceOf[js.Any])
            
            inline def setLockDuration(value: String): Self = StObject.set(x, "LockDuration", value.asInstanceOf[js.Any])
            
            inline def setMaxDeliveryCount(value: Double): Self = StObject.set(x, "MaxDeliveryCount", value.asInstanceOf[js.Any])
            
            inline def setMessageCount(value: Double): Self = StObject.set(x, "MessageCount", value.asInstanceOf[js.Any])
            
            inline def setRequiresSession(value: Boolean): Self = StObject.set(x, "RequiresSession", value.asInstanceOf[js.Any])
          }
        }
        
        trait SubscriptionResult extends StObject {
          
          def parse(xml: js.Object): js.Object | js.Array[js.Object]
          
          def serialize(resource: SubscriptionProperties): String
        }
        object SubscriptionResult {
          
          inline def apply(parse: js.Object => js.Object | js.Array[js.Object], serialize: SubscriptionProperties => String): SubscriptionResult = {
            val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), serialize = js.Any.fromFunction1(serialize))
            __obj.asInstanceOf[SubscriptionResult]
          }
          
          extension [Self <: SubscriptionResult](x: Self) {
            
            inline def setParse(value: js.Object => js.Object | js.Array[js.Object]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
            
            inline def setSerialize(value: SubscriptionProperties => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
          }
        }
      }
    }
  }
}
