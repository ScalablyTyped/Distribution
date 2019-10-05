package typings.azureDashSb.azureDashSbMod.Azure.ServiceBus

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
    val __obj = js.Dynamic.literal(AutoDeleteOnIdle = AutoDeleteOnIdle, DeadLetteringOnMessageExpiration = DeadLetteringOnMessageExpiration, DefaultMessageTimeToLive = DefaultMessageTimeToLive, DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow, EnablePartitioning = EnablePartitioning, LockDuration = LockDuration, MaxSizeInMegabytes = MaxSizeInMegabytes, RequiresDuplicateDetection = RequiresDuplicateDetection, RequiresSession = RequiresSession)
  
    __obj.asInstanceOf[IQueueOptions]
  }
}

