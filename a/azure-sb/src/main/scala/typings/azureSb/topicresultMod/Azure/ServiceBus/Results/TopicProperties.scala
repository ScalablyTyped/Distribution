package typings.azureSb.topicresultMod.Azure.ServiceBus.Results

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicProperties extends js.Object {
  var DefaultMessageTimeToLive: String = js.native
  var DuplicateDetectionHistoryTimeWindow: String = js.native
  var EnableBatchedOperations: Boolean = js.native
  var EnablePartitioning: Boolean = js.native
  var MaxSizeInMegabytes: Double = js.native
  var RequiresDuplicateDetection: Boolean = js.native
  var SizeInBytes: Double = js.native
  var SupportOrdering: Boolean = js.native
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
    val __obj = js.Dynamic.literal(DefaultMessageTimeToLive = DefaultMessageTimeToLive.asInstanceOf[js.Any], DuplicateDetectionHistoryTimeWindow = DuplicateDetectionHistoryTimeWindow.asInstanceOf[js.Any], EnableBatchedOperations = EnableBatchedOperations.asInstanceOf[js.Any], EnablePartitioning = EnablePartitioning.asInstanceOf[js.Any], MaxSizeInMegabytes = MaxSizeInMegabytes.asInstanceOf[js.Any], RequiresDuplicateDetection = RequiresDuplicateDetection.asInstanceOf[js.Any], SizeInBytes = SizeInBytes.asInstanceOf[js.Any], SupportOrdering = SupportOrdering.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicProperties]
  }
  @scala.inline
  implicit class TopicPropertiesOps[Self <: TopicProperties] (val x: Self) extends AnyVal {
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
    def setDefaultMessageTimeToLive(value: String): Self = this.set("DefaultMessageTimeToLive", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuplicateDetectionHistoryTimeWindow(value: String): Self = this.set("DuplicateDetectionHistoryTimeWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableBatchedOperations(value: Boolean): Self = this.set("EnableBatchedOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnablePartitioning(value: Boolean): Self = this.set("EnablePartitioning", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxSizeInMegabytes(value: Double): Self = this.set("MaxSizeInMegabytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiresDuplicateDetection(value: Boolean): Self = this.set("RequiresDuplicateDetection", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizeInBytes(value: Double): Self = this.set("SizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportOrdering(value: Boolean): Self = this.set("SupportOrdering", value.asInstanceOf[js.Any])
  }
  
}

