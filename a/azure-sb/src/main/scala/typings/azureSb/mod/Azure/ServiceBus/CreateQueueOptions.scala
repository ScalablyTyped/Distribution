package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.IQueueOptions> */
trait CreateQueueOptions extends StObject {
  
  var AutoDeleteOnIdle: js.UndefOr[String] = js.undefined
  
  var DeadLetteringOnMessageExpiration: js.UndefOr[Boolean] = js.undefined
  
  var DefaultMessageTimeToLive: js.UndefOr[String] = js.undefined
  
  var DuplicateDetectionHistoryTimeWindow: js.UndefOr[String] = js.undefined
  
  var EnablePartitioning: js.UndefOr[Boolean] = js.undefined
  
  var LockDuration: js.UndefOr[String] = js.undefined
  
  var MaxSizeInMegabytes: js.UndefOr[Double] = js.undefined
  
  var RequiresDuplicateDetection: js.UndefOr[Boolean] = js.undefined
  
  var RequiresSession: js.UndefOr[Boolean] = js.undefined
}
object CreateQueueOptions {
  
  inline def apply(): CreateQueueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateQueueOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateQueueOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoDeleteOnIdle(value: String): Self = StObject.set(x, "AutoDeleteOnIdle", value.asInstanceOf[js.Any])
    
    inline def setAutoDeleteOnIdleUndefined: Self = StObject.set(x, "AutoDeleteOnIdle", js.undefined)
    
    inline def setDeadLetteringOnMessageExpiration(value: Boolean): Self = StObject.set(x, "DeadLetteringOnMessageExpiration", value.asInstanceOf[js.Any])
    
    inline def setDeadLetteringOnMessageExpirationUndefined: Self = StObject.set(x, "DeadLetteringOnMessageExpiration", js.undefined)
    
    inline def setDefaultMessageTimeToLive(value: String): Self = StObject.set(x, "DefaultMessageTimeToLive", value.asInstanceOf[js.Any])
    
    inline def setDefaultMessageTimeToLiveUndefined: Self = StObject.set(x, "DefaultMessageTimeToLive", js.undefined)
    
    inline def setDuplicateDetectionHistoryTimeWindow(value: String): Self = StObject.set(x, "DuplicateDetectionHistoryTimeWindow", value.asInstanceOf[js.Any])
    
    inline def setDuplicateDetectionHistoryTimeWindowUndefined: Self = StObject.set(x, "DuplicateDetectionHistoryTimeWindow", js.undefined)
    
    inline def setEnablePartitioning(value: Boolean): Self = StObject.set(x, "EnablePartitioning", value.asInstanceOf[js.Any])
    
    inline def setEnablePartitioningUndefined: Self = StObject.set(x, "EnablePartitioning", js.undefined)
    
    inline def setLockDuration(value: String): Self = StObject.set(x, "LockDuration", value.asInstanceOf[js.Any])
    
    inline def setLockDurationUndefined: Self = StObject.set(x, "LockDuration", js.undefined)
    
    inline def setMaxSizeInMegabytes(value: Double): Self = StObject.set(x, "MaxSizeInMegabytes", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeInMegabytesUndefined: Self = StObject.set(x, "MaxSizeInMegabytes", js.undefined)
    
    inline def setRequiresDuplicateDetection(value: Boolean): Self = StObject.set(x, "RequiresDuplicateDetection", value.asInstanceOf[js.Any])
    
    inline def setRequiresDuplicateDetectionUndefined: Self = StObject.set(x, "RequiresDuplicateDetection", js.undefined)
    
    inline def setRequiresSession(value: Boolean): Self = StObject.set(x, "RequiresSession", value.asInstanceOf[js.Any])
    
    inline def setRequiresSessionUndefined: Self = StObject.set(x, "RequiresSession", js.undefined)
  }
}
