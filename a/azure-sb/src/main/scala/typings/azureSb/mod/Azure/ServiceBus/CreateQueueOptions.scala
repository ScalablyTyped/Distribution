package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.IQueueOptions> */
trait CreateQueueOptions extends js.Object {
  var AutoDeleteOnIdle: js.UndefOr[String] = js.undefined
  var DeadLetteringOnMessageExpiration: js.UndefOr[Boolean] = js.undefined
  var DefaultMessageTimeToLive: js.UndefOr[String] = js.undefined
  var DuplicateDetectionHistoryTimeWindow: js.UndefOr[String] = js.undefined
  var EnablePartitioning: js.UndefOr[Boolean] = js.undefined
  var LockDuration: js.UndefOr[String] = js.undefined
  var MaxSizeInMegabytes: js.UndefOr[Double] = js.undefined
  var RequiresDuplicateDetection: js.UndefOr[Boolean] = js.undefined
  var RequiresSession: js.UndefOr[Boolean] = js.undefined
}

object CreateQueueOptions {
  @scala.inline
  def apply(
    AutoDeleteOnIdle: String = null,
    DeadLetteringOnMessageExpiration: js.UndefOr[Boolean] = js.undefined,
    DefaultMessageTimeToLive: String = null,
    DuplicateDetectionHistoryTimeWindow: String = null,
    EnablePartitioning: js.UndefOr[Boolean] = js.undefined,
    LockDuration: String = null,
    MaxSizeInMegabytes: Int | Double = null,
    RequiresDuplicateDetection: js.UndefOr[Boolean] = js.undefined,
    RequiresSession: js.UndefOr[Boolean] = js.undefined
  ): CreateQueueOptions = {
    val __obj = js.Dynamic.literal()
    if (AutoDeleteOnIdle != null) __obj.updateDynamic("AutoDeleteOnIdle")(AutoDeleteOnIdle.asInstanceOf[js.Any])
    if (!js.isUndefined(DeadLetteringOnMessageExpiration)) __obj.updateDynamic("DeadLetteringOnMessageExpiration")(DeadLetteringOnMessageExpiration.asInstanceOf[js.Any])
    if (DefaultMessageTimeToLive != null) __obj.updateDynamic("DefaultMessageTimeToLive")(DefaultMessageTimeToLive.asInstanceOf[js.Any])
    if (DuplicateDetectionHistoryTimeWindow != null) __obj.updateDynamic("DuplicateDetectionHistoryTimeWindow")(DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(EnablePartitioning)) __obj.updateDynamic("EnablePartitioning")(EnablePartitioning.asInstanceOf[js.Any])
    if (LockDuration != null) __obj.updateDynamic("LockDuration")(LockDuration.asInstanceOf[js.Any])
    if (MaxSizeInMegabytes != null) __obj.updateDynamic("MaxSizeInMegabytes")(MaxSizeInMegabytes.asInstanceOf[js.Any])
    if (!js.isUndefined(RequiresDuplicateDetection)) __obj.updateDynamic("RequiresDuplicateDetection")(RequiresDuplicateDetection.asInstanceOf[js.Any])
    if (!js.isUndefined(RequiresSession)) __obj.updateDynamic("RequiresSession")(RequiresSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateQueueOptions]
  }
}

