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
  
  @scala.inline
  def apply(): CreateTopicOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTopicOptions]
  }
  
  @scala.inline
  implicit class CreateTopicOptionsMutableBuilder[Self <: CreateTopicOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultMessageTimeToLive(value: String): Self = StObject.set(x, "DefaultMessageTimeToLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultMessageTimeToLiveUndefined: Self = StObject.set(x, "DefaultMessageTimeToLive", js.undefined)
    
    @scala.inline
    def setDuplicateDetectionHistoryTimeWindow(value: String): Self = StObject.set(x, "DuplicateDetectionHistoryTimeWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicateDetectionHistoryTimeWindowUndefined: Self = StObject.set(x, "DuplicateDetectionHistoryTimeWindow", js.undefined)
    
    @scala.inline
    def setEnableBatchedOperations(value: Boolean): Self = StObject.set(x, "EnableBatchedOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableBatchedOperationsUndefined: Self = StObject.set(x, "EnableBatchedOperations", js.undefined)
    
    @scala.inline
    def setEnablePartitioning(value: Boolean): Self = StObject.set(x, "EnablePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePartitioningUndefined: Self = StObject.set(x, "EnablePartitioning", js.undefined)
    
    @scala.inline
    def setMaxSizeInMegabytes(value: Double): Self = StObject.set(x, "MaxSizeInMegabytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeInMegabytesUndefined: Self = StObject.set(x, "MaxSizeInMegabytes", js.undefined)
    
    @scala.inline
    def setRequiresDuplicateDetection(value: Boolean): Self = StObject.set(x, "RequiresDuplicateDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresDuplicateDetectionUndefined: Self = StObject.set(x, "RequiresDuplicateDetection", js.undefined)
    
    @scala.inline
    def setSizeInBytes(value: Boolean): Self = StObject.set(x, "SizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeInBytesUndefined: Self = StObject.set(x, "SizeInBytes", js.undefined)
    
    @scala.inline
    def setSupportOrdering(value: Boolean): Self = StObject.set(x, "SupportOrdering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportOrderingUndefined: Self = StObject.set(x, "SupportOrdering", js.undefined)
  }
}
