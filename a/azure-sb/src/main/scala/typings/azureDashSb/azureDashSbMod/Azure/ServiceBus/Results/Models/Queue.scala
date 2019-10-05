package typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models

import typings.azureDashSb.Anon_Author
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.DateString
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Queue extends ExtendedBase {
  var DeadLetteringOnMessageExpiration: String
  var LockDuration: Duration
  var MaxDeliveryCount: String
  var MessageCount: String
  var QueueName: String
  var RequiresSession: String
  var SupportOrdering: String
}

object Queue {
  @scala.inline
  def apply(
    AuthorizationRules: String,
    AutoDeleteOnIdle: String,
    CreatedAt: DateString,
    DeadLetteringOnMessageExpiration: String,
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: Duration,
    EnableBatchedOperations: String,
    EnableExpress: String,
    EnablePartitioning: String,
    EntityAvailabilityStatus: String,
    IsAnonymousAccessible: String,
    LockDuration: Duration,
    MaxDeliveryCount: String,
    MaxSizeInMegabytes: String,
    MessageCount: String,
    QueueName: String,
    RequiresDuplicateDetection: String,
    RequiresSession: String,
    SizeInBytes: String,
    Status: EntityStatus,
    SupportOrdering: String,
    UpdatedAt: DateString,
    `_`: Anon_Author
  ): Queue = {
    val __obj = js.Dynamic.literal(AuthorizationRules = AuthorizationRules, AutoDeleteOnIdle = AutoDeleteOnIdle, CreatedAt = CreatedAt, DeadLetteringOnMessageExpiration = DeadLetteringOnMessageExpiration, DefaultMessageTimeToLive = DefaultMessageTimeToLive, DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow, EnableBatchedOperations = EnableBatchedOperations, EnableExpress = EnableExpress, EnablePartitioning = EnablePartitioning, EntityAvailabilityStatus = EntityAvailabilityStatus, IsAnonymousAccessible = IsAnonymousAccessible, LockDuration = LockDuration, MaxDeliveryCount = MaxDeliveryCount, MaxSizeInMegabytes = MaxSizeInMegabytes, MessageCount = MessageCount, QueueName = QueueName, RequiresDuplicateDetection = RequiresDuplicateDetection, RequiresSession = RequiresSession, SizeInBytes = SizeInBytes, Status = Status, SupportOrdering = SupportOrdering, UpdatedAt = UpdatedAt)
    __obj.updateDynamic("_")(`_`)
    __obj.asInstanceOf[Queue]
  }
}

