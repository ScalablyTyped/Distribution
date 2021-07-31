package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICreateTopicOptions
  extends StObject
     with CreateOptions {
  
  var EnableBatchedOperations: Boolean
  
  var SizeInBytes: Boolean
  
  var SupportOrdering: Boolean
}
object ICreateTopicOptions {
  
  @scala.inline
  def apply(
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: String,
    EnableBatchedOperations: Boolean,
    EnablePartitioning: Boolean,
    MaxSizeInMegabytes: Double,
    RequiresDuplicateDetection: Boolean,
    SizeInBytes: Boolean,
    SupportOrdering: Boolean
  ): ICreateTopicOptions = {
    val __obj = js.Dynamic.literal(DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any], EnableBatchedOperations = EnableBatchedOperations.asInstanceOf[js.Any], EnablePartitioning = EnablePartitioning.asInstanceOf[js.Any], MaxSizeInMegabytes = MaxSizeInMegabytes.asInstanceOf[js.Any], RequiresDuplicateDetection = RequiresDuplicateDetection.asInstanceOf[js.Any], SizeInBytes = SizeInBytes.asInstanceOf[js.Any], SupportOrdering = SupportOrdering.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateTopicOptions]
  }
  
  @scala.inline
  implicit class ICreateTopicOptionsMutableBuilder[Self <: ICreateTopicOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableBatchedOperations(value: Boolean): Self = StObject.set(x, "EnableBatchedOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeInBytes(value: Boolean): Self = StObject.set(x, "SizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportOrdering(value: Boolean): Self = StObject.set(x, "SupportOrdering", value.asInstanceOf[js.Any])
  }
}
