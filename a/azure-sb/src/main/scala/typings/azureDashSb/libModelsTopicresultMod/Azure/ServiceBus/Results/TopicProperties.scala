package typings.azureDashSb.libModelsTopicresultMod.Azure.ServiceBus.Results

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicProperties extends js.Object {
  var DefaultMessageTimeToLive: String
  var DuplicateDetectionHistoryTimeWindow: String
  var EnableBatchedOperations: Boolean
  var EnablePartitioning: Boolean
  var MaxSizeInMegabytes: Double
  var RequiresDuplicateDetection: Boolean
  var SizeInBytes: Double
  var SupportOrdering: Boolean
}

object TopicProperties {
  @scala.inline
  def apply(
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: String,
    EnableBatchedOperations: Boolean,
    EnablePartitioning: Boolean,
    MaxSizeInMegabytes: Double,
    RequiresDuplicateDetection: Boolean,
    SizeInBytes: Double,
    SupportOrdering: Boolean
  ): TopicProperties = {
    val __obj = js.Dynamic.literal(DefaultMessageTimeToLive = DefaultMessageTimeToLive, DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow, EnableBatchedOperations = EnableBatchedOperations, EnablePartitioning = EnablePartitioning, MaxSizeInMegabytes = MaxSizeInMegabytes, RequiresDuplicateDetection = RequiresDuplicateDetection, SizeInBytes = SizeInBytes, SupportOrdering = SupportOrdering)
  
    __obj.asInstanceOf[TopicProperties]
  }
}

