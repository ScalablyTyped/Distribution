package typings.azureSb.mod.Azure.ServiceBus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICreateTopicIfNotExistsOptions extends ICreateTopicOptions {
  
  var EnableDeadLetteringOnFilterEvaluationExceptions: Boolean = js.native
  
  var EnableDeadLetteringOnMessageExpiration: Boolean = js.native
  
  var MaxCorrelationFiltersPerTopic: Double = js.native
  
  var MaxSqlFiltersPerTopic: Double = js.native
  
  var MaxSubscriptionsPerTopic: Double = js.native
}
object ICreateTopicIfNotExistsOptions {
  
  @scala.inline
  def apply(
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: String,
    EnableBatchedOperations: Boolean,
    EnableDeadLetteringOnFilterEvaluationExceptions: Boolean,
    EnableDeadLetteringOnMessageExpiration: Boolean,
    EnablePartitioning: Boolean,
    MaxCorrelationFiltersPerTopic: Double,
    MaxSizeInMegabytes: Double,
    MaxSqlFiltersPerTopic: Double,
    MaxSubscriptionsPerTopic: Double,
    RequiresDuplicateDetection: Boolean,
    SizeInBytes: Boolean,
    SupportOrdering: Boolean
  ): ICreateTopicIfNotExistsOptions = {
    val __obj = js.Dynamic.literal(DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any], EnableBatchedOperations = EnableBatchedOperations.asInstanceOf[js.Any], EnableDeadLetteringOnFilterEvaluationExceptions = EnableDeadLetteringOnFilterEvaluationExceptions.asInstanceOf[js.Any], EnableDeadLetteringOnMessageExpiration = EnableDeadLetteringOnMessageExpiration.asInstanceOf[js.Any], EnablePartitioning = EnablePartitioning.asInstanceOf[js.Any], MaxCorrelationFiltersPerTopic = MaxCorrelationFiltersPerTopic.asInstanceOf[js.Any], MaxSizeInMegabytes = MaxSizeInMegabytes.asInstanceOf[js.Any], MaxSqlFiltersPerTopic = MaxSqlFiltersPerTopic.asInstanceOf[js.Any], MaxSubscriptionsPerTopic = MaxSubscriptionsPerTopic.asInstanceOf[js.Any], RequiresDuplicateDetection = RequiresDuplicateDetection.asInstanceOf[js.Any], SizeInBytes = SizeInBytes.asInstanceOf[js.Any], SupportOrdering = SupportOrdering.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateTopicIfNotExistsOptions]
  }
  
  @scala.inline
  implicit class ICreateTopicIfNotExistsOptionsMutableBuilder[Self <: ICreateTopicIfNotExistsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableDeadLetteringOnFilterEvaluationExceptions(value: Boolean): Self = StObject.set(x, "EnableDeadLetteringOnFilterEvaluationExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDeadLetteringOnMessageExpiration(value: Boolean): Self = StObject.set(x, "EnableDeadLetteringOnMessageExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCorrelationFiltersPerTopic(value: Double): Self = StObject.set(x, "MaxCorrelationFiltersPerTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSqlFiltersPerTopic(value: Double): Self = StObject.set(x, "MaxSqlFiltersPerTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSubscriptionsPerTopic(value: Double): Self = StObject.set(x, "MaxSubscriptionsPerTopic", value.asInstanceOf[js.Any])
  }
}
