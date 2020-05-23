package typings.azureSb.mod.Azure.ServiceBus.Results.Models

import org.scalablytyped.runtime.StringDictionary
import typings.azureSb.anon.Author
import typings.azureSb.mod.Azure.ServiceBus.DateString
import typings.azureSb.mod.Azure.ServiceBus.Duration
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
    _underscore: Author
  ): Topic = {
    val __obj = js.Dynamic.literal(AccessedAt = AccessedAt.asInstanceOf[js.Any], AuthorizationRules = AuthorizationRules.asInstanceOf[js.Any], AutoDeleteOnIdle = AutoDeleteOnIdle.asInstanceOf[js.Any], CountDetails = CountDetails.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any], EnableBatchedOperations = EnableBatchedOperations.asInstanceOf[js.Any], EnableExpress = EnableExpress.asInstanceOf[js.Any], EnablePartitioning = EnablePartitioning.asInstanceOf[js.Any], EnableSubscriptionPartitioning = EnableSubscriptionPartitioning.asInstanceOf[js.Any], EntityAvailabilityStatus = EntityAvailabilityStatus.asInstanceOf[js.Any], FilteringMessagesBeforePublishing = FilteringMessagesBeforePublishing.asInstanceOf[js.Any], IsAnonymousAccessible = IsAnonymousAccessible.asInstanceOf[js.Any], IsExpress = IsExpress.asInstanceOf[js.Any], MaxSizeInMegabytes = MaxSizeInMegabytes.asInstanceOf[js.Any], RequiresDuplicateDetection = RequiresDuplicateDetection.asInstanceOf[js.Any], SizeInBytes = SizeInBytes.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], SubscriptionCount = SubscriptionCount.asInstanceOf[js.Any], SupportOrdering = SupportOrdering.asInstanceOf[js.Any], TopicName = TopicName.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Topic]
  }
}

