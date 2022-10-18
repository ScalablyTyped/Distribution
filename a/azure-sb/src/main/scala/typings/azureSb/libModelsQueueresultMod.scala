package typings.azureSb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsQueueresultMod {
  
  object Azure {
    
    object ServiceBus {
      
      object Results {
        
        trait QueueProperties extends StObject {
          
          var DeadLetteringOnMessageExpiration: String
          
          var DefaultMessageTimeToLive: String
          
          var DuplicateDetectionHistoryTimeWindow: String
          
          var EnableBatchedOperations: Boolean
          
          var EnablePartitioning: Boolean
          
          var LockDuration: String
          
          var MaxDeliveryCount: Double
          
          var MaxSizeInMegabytes: Double
          
          var MessageCount: Double
          
          var RequiresDuplicateDetection: Boolean
          
          var RequiresSession: Boolean
          
          var SizeInBytes: Double
        }
        object QueueProperties {
          
          inline def apply(
            DeadLetteringOnMessageExpiration: String,
            DefaultMessageTimeToLive: String,
            DuplicateDetectionHistoryTimeWindow: String,
            EnableBatchedOperations: Boolean,
            EnablePartitioning: Boolean,
            LockDuration: String,
            MaxDeliveryCount: Double,
            MaxSizeInMegabytes: Double,
            MessageCount: Double,
            RequiresDuplicateDetection: Boolean,
            RequiresSession: Boolean,
            SizeInBytes: Double
          ): QueueProperties = {
            val __obj = js.Dynamic.literal(DeadLetteringOnMessageExpiration = DeadLetteringOnMessageExpiration.asInstanceOf[js.Any], DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any], EnableBatchedOperations = EnableBatchedOperations.asInstanceOf[js.Any], EnablePartitioning = EnablePartitioning.asInstanceOf[js.Any], LockDuration = LockDuration.asInstanceOf[js.Any], MaxDeliveryCount = MaxDeliveryCount.asInstanceOf[js.Any], MaxSizeInMegabytes = MaxSizeInMegabytes.asInstanceOf[js.Any], MessageCount = MessageCount.asInstanceOf[js.Any], RequiresDuplicateDetection = RequiresDuplicateDetection.asInstanceOf[js.Any], RequiresSession = RequiresSession.asInstanceOf[js.Any], SizeInBytes = SizeInBytes.asInstanceOf[js.Any])
            __obj.asInstanceOf[QueueProperties]
          }
          
          extension [Self <: QueueProperties](x: Self) {
            
            inline def setDeadLetteringOnMessageExpiration(value: String): Self = StObject.set(x, "DeadLetteringOnMessageExpiration", value.asInstanceOf[js.Any])
            
            inline def setDefaultMessageTimeToLive(value: String): Self = StObject.set(x, "DefaultMessageTimeToLive", value.asInstanceOf[js.Any])
            
            inline def setDuplicateDetectionHistoryTimeWindow(value: String): Self = StObject.set(x, "DuplicateDetectionHistoryTimeWindow", value.asInstanceOf[js.Any])
            
            inline def setEnableBatchedOperations(value: Boolean): Self = StObject.set(x, "EnableBatchedOperations", value.asInstanceOf[js.Any])
            
            inline def setEnablePartitioning(value: Boolean): Self = StObject.set(x, "EnablePartitioning", value.asInstanceOf[js.Any])
            
            inline def setLockDuration(value: String): Self = StObject.set(x, "LockDuration", value.asInstanceOf[js.Any])
            
            inline def setMaxDeliveryCount(value: Double): Self = StObject.set(x, "MaxDeliveryCount", value.asInstanceOf[js.Any])
            
            inline def setMaxSizeInMegabytes(value: Double): Self = StObject.set(x, "MaxSizeInMegabytes", value.asInstanceOf[js.Any])
            
            inline def setMessageCount(value: Double): Self = StObject.set(x, "MessageCount", value.asInstanceOf[js.Any])
            
            inline def setRequiresDuplicateDetection(value: Boolean): Self = StObject.set(x, "RequiresDuplicateDetection", value.asInstanceOf[js.Any])
            
            inline def setRequiresSession(value: Boolean): Self = StObject.set(x, "RequiresSession", value.asInstanceOf[js.Any])
            
            inline def setSizeInBytes(value: Double): Self = StObject.set(x, "SizeInBytes", value.asInstanceOf[js.Any])
          }
        }
        
        trait QueueResult extends StObject {
          
          def parse(xml: js.Object): js.Object | js.Array[js.Object]
          
          def serialize(resource: QueueProperties): String
        }
        object QueueResult {
          
          inline def apply(parse: js.Object => js.Object | js.Array[js.Object], serialize: QueueProperties => String): QueueResult = {
            val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), serialize = js.Any.fromFunction1(serialize))
            __obj.asInstanceOf[QueueResult]
          }
          
          extension [Self <: QueueResult](x: Self) {
            
            inline def setParse(value: js.Object => js.Object | js.Array[js.Object]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
            
            inline def setSerialize(value: QueueProperties => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
          }
        }
      }
    }
  }
}
