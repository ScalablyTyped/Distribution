package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.ICreateTopicOptions> */
trait CreateTopicOptions extends StObject {
  
  var DefaultMessageTimeToLive: js.UndefOr[String] = js.undefined
  
  var DuplicateDetectionHistoryTimeWindow: js.UndefOr[String] = js.undefined
  
  var EnableBatchedOperations: js.UndefOr[Boolean] = js.undefined
  
  var EnablePartitioning: js.UndefOr[Boolean] = js.undefined
  
  var MaxSizeInMegabytes: js.UndefOr[Double] = js.undefined
  
  var RequiresDuplicateDetection: js.UndefOr[Boolean] = js.undefined
  
  var SizeInBytes: js.UndefOr[Boolean] = js.undefined
  
  var SupportOrdering: js.UndefOr[Boolean] = js.undefined
}
object CreateTopicOptions {
  
  inline def apply(): CreateTopicOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTopicOptions]
  }
  
  extension [Self <: CreateTopicOptions](x: Self) {
    
    inline def setDefaultMessageTimeToLive(value: String): Self = StObject.set(x, "DefaultMessageTimeToLive", value.asInstanceOf[js.Any])
    
    inline def setDefaultMessageTimeToLiveUndefined: Self = StObject.set(x, "DefaultMessageTimeToLive", js.undefined)
    
    inline def setDuplicateDetectionHistoryTimeWindow(value: String): Self = StObject.set(x, "DuplicateDetectionHistoryTimeWindow", value.asInstanceOf[js.Any])
    
    inline def setDuplicateDetectionHistoryTimeWindowUndefined: Self = StObject.set(x, "DuplicateDetectionHistoryTimeWindow", js.undefined)
    
    inline def setEnableBatchedOperations(value: Boolean): Self = StObject.set(x, "EnableBatchedOperations", value.asInstanceOf[js.Any])
    
    inline def setEnableBatchedOperationsUndefined: Self = StObject.set(x, "EnableBatchedOperations", js.undefined)
    
    inline def setEnablePartitioning(value: Boolean): Self = StObject.set(x, "EnablePartitioning", value.asInstanceOf[js.Any])
    
    inline def setEnablePartitioningUndefined: Self = StObject.set(x, "EnablePartitioning", js.undefined)
    
    inline def setMaxSizeInMegabytes(value: Double): Self = StObject.set(x, "MaxSizeInMegabytes", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeInMegabytesUndefined: Self = StObject.set(x, "MaxSizeInMegabytes", js.undefined)
    
    inline def setRequiresDuplicateDetection(value: Boolean): Self = StObject.set(x, "RequiresDuplicateDetection", value.asInstanceOf[js.Any])
    
    inline def setRequiresDuplicateDetectionUndefined: Self = StObject.set(x, "RequiresDuplicateDetection", js.undefined)
    
    inline def setSizeInBytes(value: Boolean): Self = StObject.set(x, "SizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeInBytesUndefined: Self = StObject.set(x, "SizeInBytes", js.undefined)
    
    inline def setSupportOrdering(value: Boolean): Self = StObject.set(x, "SupportOrdering", value.asInstanceOf[js.Any])
    
    inline def setSupportOrderingUndefined: Self = StObject.set(x, "SupportOrdering", js.undefined)
  }
}
