package typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models

import org.scalablytyped.runtime.StringDictionary
import typings.azureDashSb.Anon_Author
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.DateString
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends ExtendedBase {
  var CountDetails: StringDictionary[String]
  var DeadLetteringOnFilterEvaluationExceptions: String
  var DeadLetteringOnMessageExpiration: String
  var LockDuration: String
  var MaxDeliveryCount: String
  var MessageCount: String
  var RequiresSession: String
  var SubscriptionName: String
  var TopicName: String
}

object Subscription {
  @scala.inline
  def apply(
    AuthorizationRules: String,
    AutoDeleteOnIdle: String,
    CountDetails: StringDictionary[String],
    CreatedAt: DateString,
    DeadLetteringOnFilterEvaluationExceptions: String,
    DeadLetteringOnMessageExpiration: String,
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: Duration,
    EnableBatchedOperations: String,
    EnableExpress: String,
    EnablePartitioning: String,
    EntityAvailabilityStatus: String,
    IsAnonymousAccessible: String,
    LockDuration: String,
    MaxDeliveryCount: String,
    MaxSizeInMegabytes: String,
    MessageCount: String,
    RequiresDuplicateDetection: String,
    RequiresSession: String,
    SizeInBytes: String,
    Status: EntityStatus,
    SubscriptionName: String,
    TopicName: String,
    UpdatedAt: DateString,
    `_`: Anon_Author
  ): Subscription = {
    val __obj = js.Dynamic.literal(AuthorizationRules = AuthorizationRules, AutoDeleteOnIdle = AutoDeleteOnIdle, CountDetails = CountDetails, CreatedAt = CreatedAt, DeadLetteringOnFilterEvaluationExceptions = DeadLetteringOnFilterEvaluationExceptions, DeadLetteringOnMessageExpiration = DeadLetteringOnMessageExpiration, DefaultMessageTimeToLive = DefaultMessageTimeToLive, DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow, EnableBatchedOperations = EnableBatchedOperations, EnableExpress = EnableExpress, EnablePartitioning = EnablePartitioning, EntityAvailabilityStatus = EntityAvailabilityStatus, IsAnonymousAccessible = IsAnonymousAccessible, LockDuration = LockDuration, MaxDeliveryCount = MaxDeliveryCount, MaxSizeInMegabytes = MaxSizeInMegabytes, MessageCount = MessageCount, RequiresDuplicateDetection = RequiresDuplicateDetection, RequiresSession = RequiresSession, SizeInBytes = SizeInBytes, Status = Status, SubscriptionName = SubscriptionName, TopicName = TopicName, UpdatedAt = UpdatedAt)
    __obj.updateDynamic("_")(`_`)
    __obj.asInstanceOf[Subscription]
  }
}

