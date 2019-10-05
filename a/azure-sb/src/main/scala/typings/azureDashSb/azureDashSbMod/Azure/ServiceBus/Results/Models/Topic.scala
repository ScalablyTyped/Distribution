package typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models

import org.scalablytyped.runtime.StringDictionary
import typings.azureDashSb.Anon_Author
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.DateString
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Topic extends ExtendedBase {
  var AccessedAt: DateString
  var CountDetails: StringDictionary[String]
  var EnableSubscriptionPartitioning: String
  var FilteringMessagesBeforePublishing: String
  var IsExpress: String
  var SubscriptionCount: String
  var SupportOrdering: String
  var TopicName: String
}

object Topic {
  @scala.inline
  def apply(
    AccessedAt: DateString,
    AuthorizationRules: String,
    AutoDeleteOnIdle: String,
    CountDetails: StringDictionary[String],
    CreatedAt: DateString,
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: Duration,
    EnableBatchedOperations: String,
    EnableExpress: String,
    EnablePartitioning: String,
    EnableSubscriptionPartitioning: String,
    EntityAvailabilityStatus: String,
    FilteringMessagesBeforePublishing: String,
    IsAnonymousAccessible: String,
    IsExpress: String,
    MaxSizeInMegabytes: String,
    RequiresDuplicateDetection: String,
    SizeInBytes: String,
    Status: EntityStatus,
    SubscriptionCount: String,
    SupportOrdering: String,
    TopicName: String,
    UpdatedAt: DateString,
    `_`: Anon_Author
  ): Topic = {
    val __obj = js.Dynamic.literal(AccessedAt = AccessedAt, AuthorizationRules = AuthorizationRules, AutoDeleteOnIdle = AutoDeleteOnIdle, CountDetails = CountDetails, CreatedAt = CreatedAt, DefaultMessageTimeToLive = DefaultMessageTimeToLive, DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow, EnableBatchedOperations = EnableBatchedOperations, EnableExpress = EnableExpress, EnablePartitioning = EnablePartitioning, EnableSubscriptionPartitioning = EnableSubscriptionPartitioning, EntityAvailabilityStatus = EntityAvailabilityStatus, FilteringMessagesBeforePublishing = FilteringMessagesBeforePublishing, IsAnonymousAccessible = IsAnonymousAccessible, IsExpress = IsExpress, MaxSizeInMegabytes = MaxSizeInMegabytes, RequiresDuplicateDetection = RequiresDuplicateDetection, SizeInBytes = SizeInBytes, Status = Status, SubscriptionCount = SubscriptionCount, SupportOrdering = SupportOrdering, TopicName = TopicName, UpdatedAt = UpdatedAt)
    __obj.updateDynamic("_")(`_`)
    __obj.asInstanceOf[Topic]
  }
}

