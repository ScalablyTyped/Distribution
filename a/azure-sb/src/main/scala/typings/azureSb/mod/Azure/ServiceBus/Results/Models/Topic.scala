package typings.azureSb.mod.Azure.ServiceBus.Results.Models

import org.scalablytyped.runtime.StringDictionary
import typings.azureSb.anon.Author
import typings.azureSb.mod.Azure.ServiceBus.DateString
import typings.azureSb.mod.Azure.ServiceBus.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Topic extends ExtendedBase {
  var AccessedAt: DateString = js.native
  var CountDetails: StringDictionary[String] = js.native
  var EnableSubscriptionPartitioning: String = js.native
  var FilteringMessagesBeforePublishing: String = js.native
  var IsExpress: String = js.native
  var SubscriptionCount: String = js.native
  var SupportOrdering: String = js.native
  var TopicName: String = js.native
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
  @scala.inline
  implicit class TopicOps[Self <: Topic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessedAt(value: DateString): Self = this.set("AccessedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountDetails(value: StringDictionary[String]): Self = this.set("CountDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableSubscriptionPartitioning(value: String): Self = this.set("EnableSubscriptionPartitioning", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilteringMessagesBeforePublishing(value: String): Self = this.set("FilteringMessagesBeforePublishing", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsExpress(value: String): Self = this.set("IsExpress", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionCount(value: String): Self = this.set("SubscriptionCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportOrdering(value: String): Self = this.set("SupportOrdering", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopicName(value: String): Self = this.set("TopicName", value.asInstanceOf[js.Any])
  }
  
}

