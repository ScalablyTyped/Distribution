package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.ICreateTopicIfNotExistsOptions> */
trait CreateTopicIfNotExistsOptions extends js.Object {
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
  @scala.inline
  def apply(
    DefaultMessageTimeToLive: String = null,
    DuplicateDetectionHistoryTimeWindow: String = null,
    EnableBatchedOperations: js.UndefOr[Boolean] = js.undefined,
    EnableDeadLetteringOnFilterEvaluationExceptions: js.UndefOr[Boolean] = js.undefined,
    EnableDeadLetteringOnMessageExpiration: js.UndefOr[Boolean] = js.undefined,
    EnablePartitioning: js.UndefOr[Boolean] = js.undefined,
    MaxCorrelationFiltersPerTopic: Int | Double = null,
    MaxSizeInMegabytes: Int | Double = null,
    MaxSqlFiltersPerTopic: Int | Double = null,
    MaxSubscriptionsPerTopic: Int | Double = null,
    RequiresDuplicateDetection: js.UndefOr[Boolean] = js.undefined,
    SizeInBytes: js.UndefOr[Boolean] = js.undefined,
    SupportOrdering: js.UndefOr[Boolean] = js.undefined
  ): CreateTopicIfNotExistsOptions = {
    val __obj = js.Dynamic.literal()
    if (DefaultMessageTimeToLive != null) __obj.updateDynamic("DefaultMessageTimeToLive")(DefaultMessageTimeToLive.asInstanceOf[js.Any])
    if (DuplicateDetectionHistoryTimeWindow != null) __obj.updateDynamic("DuplicateDetectionHistoryTimeWindow")(DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableBatchedOperations)) __obj.updateDynamic("EnableBatchedOperations")(EnableBatchedOperations.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableDeadLetteringOnFilterEvaluationExceptions)) __obj.updateDynamic("EnableDeadLetteringOnFilterEvaluationExceptions")(EnableDeadLetteringOnFilterEvaluationExceptions.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableDeadLetteringOnMessageExpiration)) __obj.updateDynamic("EnableDeadLetteringOnMessageExpiration")(EnableDeadLetteringOnMessageExpiration.asInstanceOf[js.Any])
    if (!js.isUndefined(EnablePartitioning)) __obj.updateDynamic("EnablePartitioning")(EnablePartitioning.asInstanceOf[js.Any])
    if (MaxCorrelationFiltersPerTopic != null) __obj.updateDynamic("MaxCorrelationFiltersPerTopic")(MaxCorrelationFiltersPerTopic.asInstanceOf[js.Any])
    if (MaxSizeInMegabytes != null) __obj.updateDynamic("MaxSizeInMegabytes")(MaxSizeInMegabytes.asInstanceOf[js.Any])
    if (MaxSqlFiltersPerTopic != null) __obj.updateDynamic("MaxSqlFiltersPerTopic")(MaxSqlFiltersPerTopic.asInstanceOf[js.Any])
    if (MaxSubscriptionsPerTopic != null) __obj.updateDynamic("MaxSubscriptionsPerTopic")(MaxSubscriptionsPerTopic.asInstanceOf[js.Any])
    if (!js.isUndefined(RequiresDuplicateDetection)) __obj.updateDynamic("RequiresDuplicateDetection")(RequiresDuplicateDetection.asInstanceOf[js.Any])
    if (!js.isUndefined(SizeInBytes)) __obj.updateDynamic("SizeInBytes")(SizeInBytes.asInstanceOf[js.Any])
    if (!js.isUndefined(SupportOrdering)) __obj.updateDynamic("SupportOrdering")(SupportOrdering.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTopicIfNotExistsOptions]
  }
}

