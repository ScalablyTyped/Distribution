package typings.azureDashSb.azureDashSbMod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Options interfaces
  */
trait CreateOptions extends js.Object {
  var DefaultMessageTimeToLive: String
  var DuplicateDetectionHistoryTimeWindow: String
  var EnablePartitioning: Boolean
  var MaxSizeInMegabytes: Double
  var RequiresDuplicateDetection: Boolean
}

object CreateOptions {
  @scala.inline
  def apply(
    DefaultMessageTimeToLive: String,
    DuplicateDetectionHistoryTimeWindow: String,
    EnablePartitioning: Boolean,
    MaxSizeInMegabytes: Double,
    RequiresDuplicateDetection: Boolean
  ): CreateOptions = {
    val __obj = js.Dynamic.literal(DefaultMessageTimeToLive = DefaultMessageTimeToLive, DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow, EnablePartitioning = EnablePartitioning, MaxSizeInMegabytes = MaxSizeInMegabytes, RequiresDuplicateDetection = RequiresDuplicateDetection)
  
    __obj.asInstanceOf[CreateOptions]
  }
}

