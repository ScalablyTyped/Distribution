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
  
  @scala.inline
  def apply(): CreateQueueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateQueueOptions]
  }
  
  @scala.inline
  implicit class CreateQueueOptionsMutableBuilder[Self <: CreateQueueOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoDeleteOnIdle(value: String): Self = StObject.set(x, "AutoDeleteOnIdle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDeleteOnIdleUndefined: Self = StObject.set(x, "AutoDeleteOnIdle", js.undefined)
    
    @scala.inline
    def setDeadLetteringOnMessageExpiration(value: Boolean): Self = StObject.set(x, "DeadLetteringOnMessageExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeadLetteringOnMessageExpirationUndefined: Self = StObject.set(x, "DeadLetteringOnMessageExpiration", js.undefined)
    
    @scala.inline
    def setDefaultMessageTimeToLive(value: String): Self = StObject.set(x, "DefaultMessageTimeToLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultMessageTimeToLiveUndefined: Self = StObject.set(x, "DefaultMessageTimeToLive", js.undefined)
    
    @scala.inline
    def setDuplicateDetectionHistoryTimeWindow(value: String): Self = StObject.set(x, "DuplicateDetectionHistoryTimeWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicateDetectionHistoryTimeWindowUndefined: Self = StObject.set(x, "DuplicateDetectionHistoryTimeWindow", js.undefined)
    
    @scala.inline
    def setEnablePartitioning(value: Boolean): Self = StObject.set(x, "EnablePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePartitioningUndefined: Self = StObject.set(x, "EnablePartitioning", js.undefined)
    
    @scala.inline
    def setLockDuration(value: String): Self = StObject.set(x, "LockDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockDurationUndefined: Self = StObject.set(x, "LockDuration", js.undefined)
    
    @scala.inline
    def setMaxSizeInMegabytes(value: Double): Self = StObject.set(x, "MaxSizeInMegabytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeInMegabytesUndefined: Self = StObject.set(x, "MaxSizeInMegabytes", js.undefined)
    
    @scala.inline
    def setRequiresDuplicateDetection(value: Boolean): Self = StObject.set(x, "RequiresDuplicateDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresDuplicateDetectionUndefined: Self = StObject.set(x, "RequiresDuplicateDetection", js.undefined)
    
    @scala.inline
    def setRequiresSession(value: Boolean): Self = StObject.set(x, "RequiresSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresSessionUndefined: Self = StObject.set(x, "RequiresSession", js.undefined)
  }
}
