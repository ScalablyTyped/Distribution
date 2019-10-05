package typings.azureDashSb.azureDashSbMod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICreateTopicOptions extends CreateOptions {
  var EnableBatchedOperations: Boolean
  var SizeInBytes: Boolean
  var SupportOrdering: Boolean
}

object ICreateTopicOptions {
  @scala.inline
  def apply(
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: String,
    EnableBatchedOperations: Boolean,
    EnablePartitioning: Boolean,
    MaxSizeInMegabytes: Double,
    RequiresDuplicateDetection: Boolean,
    SizeInBytes: Boolean,
    SupportOrdering: Boolean
  ): ICreateTopicOptions = {
    val __obj = js.Dynamic.literal(DefaultMessageTimeToLive = DefaultMessageTimeToLive, DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow, EnableBatchedOperations = EnableBatchedOperations, EnablePartitioning = EnablePartitioning, MaxSizeInMegabytes = MaxSizeInMegabytes, RequiresDuplicateDetection = RequiresDuplicateDetection, SizeInBytes = SizeInBytes, SupportOrdering = SupportOrdering)
  
    __obj.asInstanceOf[ICreateTopicOptions]
  }
}

