package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.ICreateTopicOptions> */
trait CreateTopicOptions extends js.Object {
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
  def apply(
    DefaultMessageTimeToLive: String = null,
    DuplicateDetectionHistoryTimeWindow: String = null,
    EnableBatchedOperations: js.UndefOr[Boolean] = js.undefined,
    EnablePartitioning: js.UndefOr[Boolean] = js.undefined,
    MaxSizeInMegabytes: js.UndefOr[Double] = js.undefined,
    RequiresDuplicateDetection: js.UndefOr[Boolean] = js.undefined,
    SizeInBytes: js.UndefOr[Boolean] = js.undefined,
    SupportOrdering: js.UndefOr[Boolean] = js.undefined
  ): CreateTopicOptions = {
    val __obj = js.Dynamic.literal()
    if (DefaultMessageTimeToLive != null) __obj.updateDynamic("DefaultMessageTimeToLive")(DefaultMessageTimeToLive.asInstanceOf[js.Any])
    if (DuplicateDetectionHistoryTimeWindow != null) __obj.updateDynamic("DuplicateDetectionHistoryTimeWindow")(DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableBatchedOperations)) __obj.updateDynamic("EnableBatchedOperations")(EnableBatchedOperations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(EnablePartitioning)) __obj.updateDynamic("EnablePartitioning")(EnablePartitioning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxSizeInMegabytes)) __obj.updateDynamic("MaxSizeInMegabytes")(MaxSizeInMegabytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RequiresDuplicateDetection)) __obj.updateDynamic("RequiresDuplicateDetection")(RequiresDuplicateDetection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SizeInBytes)) __obj.updateDynamic("SizeInBytes")(SizeInBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SupportOrdering)) __obj.updateDynamic("SupportOrdering")(SupportOrdering.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTopicOptions]
  }
}

