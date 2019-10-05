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
    val __obj = js.Dynamic.literal(DefaultMessageTimeToLive = DefaultMessageTimeToLive, DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow, EnableBatchedOperations = EnableBatchedOperations, EnableDeadLetteringOnFilterEvaluationExceptions = EnableDeadLetteringOnFilterEvaluationExceptions, EnableDeadLetteringOnMessageExpiration = EnableDeadLetteringOnMessageExpiration, EnablePartitioning = EnablePartitioning, MaxCorrelationFiltersPerTopic = MaxCorrelationFiltersPerTopic, MaxSizeInMegabytes = MaxSizeInMegabytes, MaxSqlFiltersPerTopic = MaxSqlFiltersPerTopic, MaxSubscriptionsPerTopic = MaxSubscriptionsPerTopic, RequiresDuplicateDetection = RequiresDuplicateDetection, SizeInBytes = SizeInBytes, SupportOrdering = SupportOrdering)
  
    __obj.asInstanceOf[ICreateTopicIfNotExistsOptions]
  }
}

