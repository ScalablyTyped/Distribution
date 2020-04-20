package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQueueOptions extends CreateOptions {
  var AutoDeleteOnIdle: String
  var DeadLetteringOnMessageExpiration: Boolean
  var LockDuration: String
  var RequiresSession: Boolean
}

object IQueueOptions {
  @scala.inline
  def apply(
    AutoDeleteOnIdle: String,
    DeadLetteringOnMessageExpiration: Boolean,
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: String,
    EnablePartitioning: Boolean,
    LockDuration: String,
    MaxSizeInMegabytes: Double,
    RequiresDuplicateDetection: Boolean,
    RequiresSession: Boolean
  ): IQueueOptions = {
    val __obj = js.Dynamic.literal(AutoDeleteOnIdle = AutoDeleteOnIdle.asInstanceOf[js.Any], DeadLetteringOnMessageExpiration = DeadLetteringOnMessageExpiration.asInstanceOf[js.Any], DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any], EnablePartitioning = EnablePartitioning.asInstanceOf[js.Any], LockDuration = LockDuration.asInstanceOf[js.Any], MaxSizeInMegabytes = MaxSizeInMegabytes.asInstanceOf[js.Any], RequiresDuplicateDetection = RequiresDuplicateDetection.asInstanceOf[js.Any], RequiresSession = RequiresSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueueOptions]
  }
}

