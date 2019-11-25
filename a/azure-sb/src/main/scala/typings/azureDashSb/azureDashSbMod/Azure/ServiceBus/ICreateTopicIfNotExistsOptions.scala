package typings.azureDashSb.azureDashSbMod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICreateTopicIfNotExistsOptions extends ICreateTopicOptions {
  var EnableDeadLetteringOnFilterEvaluationExceptions: Boolean
  var EnableDeadLetteringOnMessageExpiration: Boolean
  var MaxCorrelationFiltersPerTopic: Double
  var MaxSqlFiltersPerTopic: Double
  var MaxSubscriptionsPerTopic: Double
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
}

