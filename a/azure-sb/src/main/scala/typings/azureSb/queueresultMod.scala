package typings.azureSb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queueresultMod {
  
  object Azure {
    
    object ServiceBus {
      
      object Results {
        
        @js.native
        trait QueueProperties extends StObject {
          
          var DeadLetteringOnMessageExpiration: String = js.native
          
          var DefaultMessageTimeToLive: String = js.native
          
          var DuplicateDetectionHistoryTimeWindow: String = js.native
          
          var EnableBatchedOperations: Boolean = js.native
          
          var EnablePartitioning: Boolean = js.native
          
          var LockDuration: String = js.native
          
          var MaxDeliveryCount: Double = js.native
          
          var MaxSizeInMegabytes: Double = js.native
          
          var MessageCount: Double = js.native
          
          var RequiresDuplicateDetection: Boolean = js.native
          
          var RequiresSession: Boolean = js.native
          
          var SizeInBytes: Double = js.native
        }
        object QueueProperties {
          
          @scala.inline
          def apply(
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
          
          @scala.inline
          implicit class QueuePropertiesMutableBuilder[Self <: QueueProperties] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setDeadLetteringOnMessageExpiration(value: String): Self = StObject.set(x, "DeadLetteringOnMessageExpiration", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setDefaultMessageTimeToLive(value: String): Self = StObject.set(x, "DefaultMessageTimeToLive", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setDuplicateDetectionHistoryTimeWindow(value: String): Self = StObject.set(x, "DuplicateDetectionHistoryTimeWindow", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setEnableBatchedOperations(value: Boolean): Self = StObject.set(x, "EnableBatchedOperations", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setEnablePartitioning(value: Boolean): Self = StObject.set(x, "EnablePartitioning", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setLockDuration(value: String): Self = StObject.set(x, "LockDuration", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setMaxDeliveryCount(value: Double): Self = StObject.set(x, "MaxDeliveryCount", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setMaxSizeInMegabytes(value: Double): Self = StObject.set(x, "MaxSizeInMegabytes", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setMessageCount(value: Double): Self = StObject.set(x, "MessageCount", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setRequiresDuplicateDetection(value: Boolean): Self = StObject.set(x, "RequiresDuplicateDetection", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setRequiresSession(value: Boolean): Self = StObject.set(x, "RequiresSession", value.asInstanceOf[js.Any])
            
            @scala.inline
            def setSizeInBytes(value: Double): Self = StObject.set(x, "SizeInBytes", value.asInstanceOf[js.Any])
          }
        }
        
        @js.native
        trait QueueResult extends StObject {
          
          def parse(xml: js.Object): js.Object | js.Array[js.Object] = js.native
          
          def serialize(resource: QueueProperties): String = js.native
        }
        object QueueResult {
          
          @scala.inline
          def apply(parse: js.Object => js.Object | js.Array[js.Object], serialize: QueueProperties => String): QueueResult = {
            val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), serialize = js.Any.fromFunction1(serialize))
            __obj.asInstanceOf[QueueResult]
          }
          
          @scala.inline
          implicit class QueueResultMutableBuilder[Self <: QueueResult] (val x: Self) extends AnyVal {
            
            @scala.inline
            def setParse(value: js.Object => js.Object | js.Array[js.Object]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
            
            @scala.inline
            def setSerialize(value: QueueProperties => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
          }
        }
      }
    }
  }
}
