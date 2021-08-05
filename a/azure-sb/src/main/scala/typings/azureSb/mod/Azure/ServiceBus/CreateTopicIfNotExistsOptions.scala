package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.ICreateTopicIfNotExistsOptions> */
trait CreateTopicIfNotExistsOptions extends StObject {
  
  var DefaultMessageTimeToLive: js.UndefOr[String] = js.undefined
  
  var DuplicateDetectionHistoryTimeWindow: js.UndefOr[String] = js.undefined
  
  var EnableBatchedOperations: js.UndefOr[Boolean] = js.undefined
  
  var EnableDeadLetteringOnFilterEvaluationExceptions: js.UndefOr[Boolean] = js.undefined
  
  var EnableDeadLetteringOnMessageExpiration: js.UndefOr[Boolean] = js.undefined
  
  var EnablePartitioning: js.UndefOr[Boolean] = js.undefined
  
  var MaxCorrelationFiltersPerTopic: js.UndefOr[Double] = js.undefined
  
  var MaxSizeInMegabytes: js.UndefOr[Double] = js.undefined
  
  var MaxSqlFiltersPerTopic: js.UndefOr[Double] = js.undefined
  
  var MaxSubscriptionsPerTopic: js.UndefOr[Double] = js.undefined
  
  var RequiresDuplicateDetection: js.UndefOr[Boolean] = js.undefined
  
  var SizeInBytes: js.UndefOr[Boolean] = js.undefined
  
  var SupportOrdering: js.UndefOr[Boolean] = js.undefined
}
object CreateTopicIfNotExistsOptions {
  
  inline def apply(): CreateTopicIfNotExistsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTopicIfNotExistsOptions]
  }
  
  extension [Self <: CreateTopicIfNotExistsOptions](x: Self) {
    
    inline def setDefaultMessageTimeToLive(value: String): Self = StObject.set(x, "DefaultMessageTimeToLive", value.asInstanceOf[js.Any])
    
    inline def setDefaultMessageTimeToLiveUndefined: Self = StObject.set(x, "DefaultMessageTimeToLive", js.undefined)
    
    inline def setDuplicateDetectionHistoryTimeWindow(value: String): Self = StObject.set(x, "DuplicateDetectionHistoryTimeWindow", value.asInstanceOf[js.Any])
    
    inline def setDuplicateDetectionHistoryTimeWindowUndefined: Self = StObject.set(x, "DuplicateDetectionHistoryTimeWindow", js.undefined)
    
    inline def setEnableBatchedOperations(value: Boolean): Self = StObject.set(x, "EnableBatchedOperations", value.asInstanceOf[js.Any])
    
    inline def setEnableBatchedOperationsUndefined: Self = StObject.set(x, "EnableBatchedOperations", js.undefined)
    
    inline def setEnableDeadLetteringOnFilterEvaluationExceptions(value: Boolean): Self = StObject.set(x, "EnableDeadLetteringOnFilterEvaluationExceptions", value.asInstanceOf[js.Any])
    
    inline def setEnableDeadLetteringOnFilterEvaluationExceptionsUndefined: Self = StObject.set(x, "EnableDeadLetteringOnFilterEvaluationExceptions", js.undefined)
    
    inline def setEnableDeadLetteringOnMessageExpiration(value: Boolean): Self = StObject.set(x, "EnableDeadLetteringOnMessageExpiration", value.asInstanceOf[js.Any])
    
    inline def setEnableDeadLetteringOnMessageExpirationUndefined: Self = StObject.set(x, "EnableDeadLetteringOnMessageExpiration", js.undefined)
    
    inline def setEnablePartitioning(value: Boolean): Self = StObject.set(x, "EnablePartitioning", value.asInstanceOf[js.Any])
    
    inline def setEnablePartitioningUndefined: Self = StObject.set(x, "EnablePartitioning", js.undefined)
    
    inline def setMaxCorrelationFiltersPerTopic(value: Double): Self = StObject.set(x, "MaxCorrelationFiltersPerTopic", value.asInstanceOf[js.Any])
    
    inline def setMaxCorrelationFiltersPerTopicUndefined: Self = StObject.set(x, "MaxCorrelationFiltersPerTopic", js.undefined)
    
    inline def setMaxSizeInMegabytes(value: Double): Self = StObject.set(x, "MaxSizeInMegabytes", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeInMegabytesUndefined: Self = StObject.set(x, "MaxSizeInMegabytes", js.undefined)
    
    inline def setMaxSqlFiltersPerTopic(value: Double): Self = StObject.set(x, "MaxSqlFiltersPerTopic", value.asInstanceOf[js.Any])
    
    inline def setMaxSqlFiltersPerTopicUndefined: Self = StObject.set(x, "MaxSqlFiltersPerTopic", js.undefined)
    
    inline def setMaxSubscriptionsPerTopic(value: Double): Self = StObject.set(x, "MaxSubscriptionsPerTopic", value.asInstanceOf[js.Any])
    
    inline def setMaxSubscriptionsPerTopicUndefined: Self = StObject.set(x, "MaxSubscriptionsPerTopic", js.undefined)
    
    inline def setRequiresDuplicateDetection(value: Boolean): Self = StObject.set(x, "RequiresDuplicateDetection", value.asInstanceOf[js.Any])
    
    inline def setRequiresDuplicateDetectionUndefined: Self = StObject.set(x, "RequiresDuplicateDetection", js.undefined)
    
    inline def setSizeInBytes(value: Boolean): Self = StObject.set(x, "SizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeInBytesUndefined: Self = StObject.set(x, "SizeInBytes", js.undefined)
    
    inline def setSupportOrdering(value: Boolean): Self = StObject.set(x, "SupportOrdering", value.asInstanceOf[js.Any])
    
    inline def setSupportOrderingUndefined: Self = StObject.set(x, "SupportOrdering", js.undefined)
  }
}
