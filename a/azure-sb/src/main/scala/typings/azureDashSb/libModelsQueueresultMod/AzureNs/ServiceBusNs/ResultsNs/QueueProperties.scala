package typings.azureDashSb.libModelsQueueresultMod.AzureNs.ServiceBusNs.ResultsNs

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
    val __obj = js.Dynamic.literal(DeadLetteringOnMessageExpiration = DeadLetteringOnMessageExpiration, DefaultMessageTimeToLive = DefaultMessageTimeToLive, DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow, EnableBatchedOperations = EnableBatchedOperations, EnablePartitioning = EnablePartitioning, LockDuration = LockDuration, MaxDeliveryCount = MaxDeliveryCount, MaxSizeInMegabytes = MaxSizeInMegabytes, MessageCount = MessageCount, RequiresDuplicateDetection = RequiresDuplicateDetection, RequiresSession = RequiresSession, SizeInBytes = SizeInBytes)
  
    __obj.asInstanceOf[QueueProperties]
  }
}

