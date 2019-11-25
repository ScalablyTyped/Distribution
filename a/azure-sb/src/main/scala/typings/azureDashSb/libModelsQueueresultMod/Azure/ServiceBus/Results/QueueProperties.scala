package typings.azureDashSb.libModelsQueueresultMod.Azure.ServiceBus.Results

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueProperties extends js.Object {
  var DeadLetteringOnMessageExpiration: String
  var DefaultMessageTimeToLive: String
  var DuplicateDetectionHistoryTimeWindow: String
  var EnableBatchedOperations: Boolean
  var EnablePartitioning: Boolean
  var LockDuration: String
  var MaxDeliveryCount: Double
  var MaxSizeInMegabytes: Double
  var MessageCount: Double
  var RequiresDuplicateDetection: Boolean
  var RequiresSession: Boolean
  var SizeInBytes: Double
}

object QueueProperties {
  @scala.inline
  def apply(
    DeadLetteringOnMessageExpiration: String,
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: String,
    EnableBatchedOperations: Boolean,
    EnablePartitioning: Boolean,
    LockDuration: String,
    MaxDeliveryCount: Double,
    MaxSizeInMegabytes: Double,
    MessageCount: Double,
    RequiresDuplicateDetection: Boolean,
    RequiresSession: Boolean,
    SizeInBytes: Double
  ): QueueProperties = {
    val __obj = js.Dynamic.literal(DeadLetteringOnMessageExpiration = DeadLetteringOnMessageExpiration.asInstanceOf[js.Any], DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any], EnableBatchedOperations = EnableBatchedOperations.asInstanceOf[js.Any], EnablePartitioning = EnablePartitioning.asInstanceOf[js.Any], LockDuration = LockDuration.asInstanceOf[js.Any], MaxDeliveryCount = MaxDeliveryCount.asInstanceOf[js.Any], MaxSizeInMegabytes = MaxSizeInMegabytes.asInstanceOf[js.Any], MessageCount = MessageCount.asInstanceOf[js.Any], RequiresDuplicateDetection = RequiresDuplicateDetection.asInstanceOf[js.Any], RequiresSession = RequiresSession.asInstanceOf[js.Any], SizeInBytes = SizeInBytes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueueProperties]
  }
}

