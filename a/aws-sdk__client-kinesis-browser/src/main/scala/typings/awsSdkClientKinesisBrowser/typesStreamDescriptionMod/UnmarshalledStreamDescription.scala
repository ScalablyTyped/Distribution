package typings.awsSdkClientKinesisBrowser.typesStreamDescriptionMod

import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ACTIVE
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.CREATING
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.DELETING
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.UPDATING
import typings.awsSdkClientKinesisBrowser.typesEnhancedMetricsMod.UnmarshalledEnhancedMetrics
import typings.awsSdkClientKinesisBrowser.typesShardMod.UnmarshalledShard
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledStreamDescription extends StreamDescription {
  /**
    * <p>Represents the current enhanced monitoring settings of the stream.</p>
    */
  @JSName("EnhancedMonitoring")
  var EnhancedMonitoring_UnmarshalledStreamDescription: js.Array[UnmarshalledEnhancedMetrics] = js.native
  /**
    * <p>The shards that comprise the stream.</p>
    */
  @JSName("Shards")
  var Shards_UnmarshalledStreamDescription: js.Array[UnmarshalledShard] = js.native
  /**
    * <p>The approximate time that the stream was created.</p>
    */
  @JSName("StreamCreationTimestamp")
  var StreamCreationTimestamp_UnmarshalledStreamDescription: Date = js.native
}

object UnmarshalledStreamDescription {
  @scala.inline
  def apply(
    EnhancedMonitoring: js.Array[UnmarshalledEnhancedMetrics],
    HasMoreShards: Boolean,
    RetentionPeriodHours: Double,
    Shards: js.Array[UnmarshalledShard],
    StreamARN: String,
    StreamCreationTimestamp: Date,
    StreamName: String,
    StreamStatus: CREATING | DELETING | ACTIVE | UPDATING | String
  ): UnmarshalledStreamDescription = {
    val __obj = js.Dynamic.literal(EnhancedMonitoring = EnhancedMonitoring.asInstanceOf[js.Any], HasMoreShards = HasMoreShards.asInstanceOf[js.Any], RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], Shards = Shards.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any], StreamCreationTimestamp = StreamCreationTimestamp.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any], StreamStatus = StreamStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledStreamDescription]
  }
  @scala.inline
  implicit class UnmarshalledStreamDescriptionOps[Self <: UnmarshalledStreamDescription] (val x: Self) extends AnyVal {
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
    def setShardsVarargs(value: UnmarshalledShard*): Self = this.set("Shards", js.Array(value :_*))
    @scala.inline
    def setShards(value: js.Array[UnmarshalledShard]): Self = this.set("Shards", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamCreationTimestamp(value: Date): Self = this.set("StreamCreationTimestamp", value.asInstanceOf[js.Any])
  }
  
}

