package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreStreamDescriptionMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.ACTIVE
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.CREATING
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.DELETING
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.KMS
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.NONE
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.UPDATING
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreEnhancedMetricsMod._UnmarshalledEnhancedMetrics
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreShardMod._UnmarshalledShard
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledStreamDescription extends _StreamDescription {
  /**
    * <p>Represents the current enhanced monitoring settings of the stream.</p>
    */
  @JSName("EnhancedMonitoring")
  var EnhancedMonitoring__UnmarshalledStreamDescription: js.Array[_UnmarshalledEnhancedMetrics]
  /**
    * <p>The shards that comprise the stream.</p>
    */
  @JSName("Shards")
  var Shards__UnmarshalledStreamDescription: js.Array[_UnmarshalledShard]
  /**
    * <p>The approximate time that the stream was created.</p>
    */
  @JSName("StreamCreationTimestamp")
  var StreamCreationTimestamp__UnmarshalledStreamDescription: Date
}

object _UnmarshalledStreamDescription {
  @scala.inline
  def apply(
    EnhancedMonitoring: js.Array[_UnmarshalledEnhancedMetrics],
    HasMoreShards: Boolean,
    RetentionPeriodHours: Double,
    Shards: js.Array[_UnmarshalledShard],
    StreamARN: String,
    StreamCreationTimestamp: Date,
    StreamName: String,
    StreamStatus: CREATING | DELETING | ACTIVE | UPDATING | String,
    EncryptionType: NONE | KMS | String = null,
    KeyId: String = null
  ): _UnmarshalledStreamDescription = {
    val __obj = js.Dynamic.literal(EnhancedMonitoring = EnhancedMonitoring, HasMoreShards = HasMoreShards, RetentionPeriodHours = RetentionPeriodHours, Shards = Shards, StreamARN = StreamARN, StreamCreationTimestamp = StreamCreationTimestamp, StreamName = StreamName, StreamStatus = StreamStatus.asInstanceOf[js.Any])
    if (EncryptionType != null) __obj.updateDynamic("EncryptionType")(EncryptionType.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId)
    __obj.asInstanceOf[_UnmarshalledStreamDescription]
  }
}

