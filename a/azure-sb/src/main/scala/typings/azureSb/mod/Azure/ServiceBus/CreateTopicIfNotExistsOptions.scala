package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.ICreateTopicIfNotExistsOptions> */
@js.native
trait CreateTopicIfNotExistsOptions extends StObject {
  
  var DefaultMessageTimeToLive: js.UndefOr[String] = js.native
  
  var DuplicateDetectionHistoryTimeWindow: js.UndefOr[String] = js.native
  
  var EnableBatchedOperations: js.UndefOr[Boolean] = js.native
  
  var EnableDeadLetteringOnFilterEvaluationExceptions: js.UndefOr[Boolean] = js.native
  
  var EnableDeadLetteringOnMessageExpiration: js.UndefOr[Boolean] = js.native
  
  var EnablePartitioning: js.UndefOr[Boolean] = js.native
  
  var MaxCorrelationFiltersPerTopic: js.UndefOr[Double] = js.native
  
  var MaxSizeInMegabytes: js.UndefOr[Double] = js.native
  
  var MaxSqlFiltersPerTopic: js.UndefOr[Double] = js.native
  
  var MaxSubscriptionsPerTopic: js.UndefOr[Double] = js.native
  
  var RequiresDuplicateDetection: js.UndefOr[Boolean] = js.native
  
  var SizeInBytes: js.UndefOr[Boolean] = js.native
  
  var SupportOrdering: js.UndefOr[Boolean] = js.native
}
object CreateTopicIfNotExistsOptions {
  
  @scala.inline
  def apply(): CreateTopicIfNotExistsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTopicIfNotExistsOptions]
  }
  
  @scala.inline
  implicit class CreateTopicIfNotExistsOptionsMutableBuilder[Self <: CreateTopicIfNotExistsOptions] (val x: Self) extends AnyVal {
    
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
    def setEnableDeadLetteringOnFilterEvaluationExceptions(value: Boolean): Self = StObject.set(x, "EnableDeadLetteringOnFilterEvaluationExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDeadLetteringOnFilterEvaluationExceptionsUndefined: Self = StObject.set(x, "EnableDeadLetteringOnFilterEvaluationExceptions", js.undefined)
    
    @scala.inline
    def setEnableDeadLetteringOnMessageExpiration(value: Boolean): Self = StObject.set(x, "EnableDeadLetteringOnMessageExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDeadLetteringOnMessageExpirationUndefined: Self = StObject.set(x, "EnableDeadLetteringOnMessageExpiration", js.undefined)
    
    @scala.inline
    def setEnablePartitioning(value: Boolean): Self = StObject.set(x, "EnablePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePartitioningUndefined: Self = StObject.set(x, "EnablePartitioning", js.undefined)
    
    @scala.inline
    def setMaxCorrelationFiltersPerTopic(value: Double): Self = StObject.set(x, "MaxCorrelationFiltersPerTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCorrelationFiltersPerTopicUndefined: Self = StObject.set(x, "MaxCorrelationFiltersPerTopic", js.undefined)
    
    @scala.inline
    def setMaxSizeInMegabytes(value: Double): Self = StObject.set(x, "MaxSizeInMegabytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeInMegabytesUndefined: Self = StObject.set(x, "MaxSizeInMegabytes", js.undefined)
    
    @scala.inline
    def setMaxSqlFiltersPerTopic(value: Double): Self = StObject.set(x, "MaxSqlFiltersPerTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSqlFiltersPerTopicUndefined: Self = StObject.set(x, "MaxSqlFiltersPerTopic", js.undefined)
    
    @scala.inline
    def setMaxSubscriptionsPerTopic(value: Double): Self = StObject.set(x, "MaxSubscriptionsPerTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSubscriptionsPerTopicUndefined: Self = StObject.set(x, "MaxSubscriptionsPerTopic", js.undefined)
    
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
