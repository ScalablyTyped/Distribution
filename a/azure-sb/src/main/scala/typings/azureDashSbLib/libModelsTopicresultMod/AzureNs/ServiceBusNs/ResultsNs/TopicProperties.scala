package typings
package azureDashSbLib.libModelsTopicresultMod.AzureNs.ServiceBusNs.ResultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicProperties extends js.Object {
  var DefaultMessageTimeToLive: java.lang.String
  var DuplicateDetectionHistoryTimeWindow: java.lang.String
  var EnableBatchedOperations: scala.Boolean
  var EnablePartitioning: scala.Boolean
  var MaxSizeInMegabytes: scala.Double
  var RequiresDuplicateDetection: scala.Boolean
  var SizeInBytes: scala.Double
  var SupportOrdering: scala.Boolean
}

object TopicProperties {
  @scala.inline
  def apply(
    DefaultMessageTimeToLive: java.lang.String,
    DuplicateDetectionHistoryTimeWindow: java.lang.String,
    EnableBatchedOperations: scala.Boolean,
    EnablePartitioning: scala.Boolean,
    MaxSizeInMegabytes: scala.Double,
    RequiresDuplicateDetection: scala.Boolean,
    SizeInBytes: scala.Double,
    SupportOrdering: scala.Boolean
  ): TopicProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DefaultMessageTimeToLive")(DefaultMessageTimeToLive)
    __obj.updateDynamic("DuplicateDetectionHistoryTimeWindow")(DuplicateDetectionHistoryTimeWindow)
    __obj.updateDynamic("EnableBatchedOperations")(EnableBatchedOperations)
    __obj.updateDynamic("EnablePartitioning")(EnablePartitioning)
    __obj.updateDynamic("MaxSizeInMegabytes")(MaxSizeInMegabytes)
    __obj.updateDynamic("RequiresDuplicateDetection")(RequiresDuplicateDetection)
    __obj.updateDynamic("SizeInBytes")(SizeInBytes)
    __obj.updateDynamic("SupportOrdering")(SupportOrdering)
    __obj.asInstanceOf[TopicProperties]
  }
}

