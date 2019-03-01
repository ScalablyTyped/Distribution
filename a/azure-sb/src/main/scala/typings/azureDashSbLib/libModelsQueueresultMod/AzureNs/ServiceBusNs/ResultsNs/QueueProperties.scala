package typings
package azureDashSbLib.libModelsQueueresultMod.AzureNs.ServiceBusNs.ResultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueProperties extends js.Object {
  var DeadLetteringOnMessageExpiration: java.lang.String
  var DefaultMessageTimeToLive: java.lang.String
  var DuplicateDetectionHistoryTimeWindow: java.lang.String
  var EnableBatchedOperations: scala.Boolean
  var EnablePartitioning: scala.Boolean
  var LockDuration: java.lang.String
  var MaxDeliveryCount: scala.Double
  var MaxSizeInMegabytes: scala.Double
  var MessageCount: scala.Double
  var RequiresDuplicateDetection: scala.Boolean
  var RequiresSession: scala.Boolean
  var SizeInBytes: scala.Double
}

object QueueProperties {
  @scala.inline
  def apply(
    DeadLetteringOnMessageExpiration: java.lang.String,
    DefaultMessageTimeToLive: java.lang.String,
    DuplicateDetectionHistoryTimeWindow: java.lang.String,
    EnableBatchedOperations: scala.Boolean,
    EnablePartitioning: scala.Boolean,
    LockDuration: java.lang.String,
    MaxDeliveryCount: scala.Double,
    MaxSizeInMegabytes: scala.Double,
    MessageCount: scala.Double,
    RequiresDuplicateDetection: scala.Boolean,
    RequiresSession: scala.Boolean,
    SizeInBytes: scala.Double
  ): QueueProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DeadLetteringOnMessageExpiration")(DeadLetteringOnMessageExpiration)
    __obj.updateDynamic("DefaultMessageTimeToLive")(DefaultMessageTimeToLive)
    __obj.updateDynamic("DuplicateDetectionHistoryTimeWindow")(DuplicateDetectionHistoryTimeWindow)
    __obj.updateDynamic("EnableBatchedOperations")(EnableBatchedOperations)
    __obj.updateDynamic("EnablePartitioning")(EnablePartitioning)
    __obj.updateDynamic("LockDuration")(LockDuration)
    __obj.updateDynamic("MaxDeliveryCount")(MaxDeliveryCount)
    __obj.updateDynamic("MaxSizeInMegabytes")(MaxSizeInMegabytes)
    __obj.updateDynamic("MessageCount")(MessageCount)
    __obj.updateDynamic("RequiresDuplicateDetection")(RequiresDuplicateDetection)
    __obj.updateDynamic("RequiresSession")(RequiresSession)
    __obj.updateDynamic("SizeInBytes")(SizeInBytes)
    __obj.asInstanceOf[QueueProperties]
  }
}

