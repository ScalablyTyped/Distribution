package typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models

import typings.azureDashSb.Anon_Author
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.DateString
import typings.azureDashSb.azureDashSbMod.Azure.ServiceBus.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedBase extends Base {
  var AuthorizationRules: String
  var AutoDeleteOnIdle: String
  var DefaultMessageTimeToLive: String
  var DuplicateDetectionHistoryTimeWindow: Duration
  var EnableBatchedOperations: String
  var EnableExpress: String
  var EnablePartitioning: String
  var EntityAvailabilityStatus: String
  var IsAnonymousAccessible: String
  var MaxSizeInMegabytes: String
  var RequiresDuplicateDetection: String
  var SizeInBytes: String
  var Status: EntityStatus
  var UpdatedAt: DateString
}

object ExtendedBase {
  @scala.inline
  def apply(
    AuthorizationRules: String,
    AutoDeleteOnIdle: String,
    CreatedAt: DateString,
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: Duration,
    EnableBatchedOperations: String,
    EnableExpress: String,
    EnablePartitioning: String,
    EntityAvailabilityStatus: String,
    IsAnonymousAccessible: String,
    MaxSizeInMegabytes: String,
    RequiresDuplicateDetection: String,
    SizeInBytes: String,
    Status: EntityStatus,
    UpdatedAt: DateString,
    `_`: Anon_Author
  ): ExtendedBase = {
    val __obj = js.Dynamic.literal(AuthorizationRules = AuthorizationRules, AutoDeleteOnIdle = AutoDeleteOnIdle, CreatedAt = CreatedAt, DefaultMessageTimeToLive = DefaultMessageTimeToLive, DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow, EnableBatchedOperations = EnableBatchedOperations, EnableExpress = EnableExpress, EnablePartitioning = EnablePartitioning, EntityAvailabilityStatus = EntityAvailabilityStatus, IsAnonymousAccessible = IsAnonymousAccessible, MaxSizeInMegabytes = MaxSizeInMegabytes, RequiresDuplicateDetection = RequiresDuplicateDetection, SizeInBytes = SizeInBytes, Status = Status, UpdatedAt = UpdatedAt)
    __obj.updateDynamic("_")(`_`)
    __obj.asInstanceOf[ExtendedBase]
  }
}

