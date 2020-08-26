package typings.awsSdkClientKinesisBrowser.typesStreamDescriptionSummaryMod

import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ACTIVE
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.CREATING
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.DELETING
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.UPDATING
import typings.awsSdkClientKinesisBrowser.typesEnhancedMetricsMod.UnmarshalledEnhancedMetrics
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledStreamDescriptionSummary extends StreamDescriptionSummary {
  /**
    * <p>Represents the current enhanced monitoring settings of the stream.</p>
    */
  @JSName("EnhancedMonitoring")
  var EnhancedMonitoring_UnmarshalledStreamDescriptionSummary: js.Array[UnmarshalledEnhancedMetrics] = js.native
  /**
    * <p>The approximate time that the stream was created.</p>
    */
  @JSName("StreamCreationTimestamp")
  var StreamCreationTimestamp_UnmarshalledStreamDescriptionSummary: Date = js.native
}

object UnmarshalledStreamDescriptionSummary {
  @scala.inline
  def apply(
    EnhancedMonitoring: js.Array[UnmarshalledEnhancedMetrics],
    OpenShardCount: Double,
    RetentionPeriodHours: Double,
    StreamARN: String,
    StreamCreationTimestamp: Date,
    StreamName: String,
    StreamStatus: CREATING | DELETING | ACTIVE | UPDATING | String
  ): UnmarshalledStreamDescriptionSummary = {
    val __obj = js.Dynamic.literal(EnhancedMonitoring = EnhancedMonitoring.asInstanceOf[js.Any], OpenShardCount = OpenShardCount.asInstanceOf[js.Any], RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any], StreamCreationTimestamp = StreamCreationTimestamp.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any], StreamStatus = StreamStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledStreamDescriptionSummary]
  }
  @scala.inline
  implicit class UnmarshalledStreamDescriptionSummaryOps[Self <: UnmarshalledStreamDescriptionSummary] (val x: Self) extends AnyVal {
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
    def setEnhancedMonitoringVarargs(value: UnmarshalledEnhancedMetrics*): Self = this.set("EnhancedMonitoring", js.Array(value :_*))
    @scala.inline
    def setEnhancedMonitoring(value: js.Array[UnmarshalledEnhancedMetrics]): Self = this.set("EnhancedMonitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamCreationTimestamp(value: Date): Self = this.set("StreamCreationTimestamp", value.asInstanceOf[js.Any])
  }
  
}

