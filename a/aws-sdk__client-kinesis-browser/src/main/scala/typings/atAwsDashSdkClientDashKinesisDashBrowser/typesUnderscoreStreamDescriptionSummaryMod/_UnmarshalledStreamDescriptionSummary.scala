package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreStreamDescriptionSummaryMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.ACTIVE
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.CREATING
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.DELETING
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.KMS
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.NONE
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.UPDATING
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreEnhancedMetricsMod._UnmarshalledEnhancedMetrics
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledStreamDescriptionSummary extends _StreamDescriptionSummary {
  /**
    * <p>Represents the current enhanced monitoring settings of the stream.</p>
    */
  @JSName("EnhancedMonitoring")
  var EnhancedMonitoring__UnmarshalledStreamDescriptionSummary: js.Array[_UnmarshalledEnhancedMetrics]
  /**
    * <p>The approximate time that the stream was created.</p>
    */
  @JSName("StreamCreationTimestamp")
  var StreamCreationTimestamp__UnmarshalledStreamDescriptionSummary: Date
}

object _UnmarshalledStreamDescriptionSummary {
  @scala.inline
  def apply(
    EnhancedMonitoring: js.Array[_UnmarshalledEnhancedMetrics],
    OpenShardCount: Double,
    RetentionPeriodHours: Double,
    StreamARN: String,
    StreamCreationTimestamp: Date,
    StreamName: String,
    StreamStatus: CREATING | DELETING | ACTIVE | UPDATING | String,
    ConsumerCount: Int | Double = null,
    EncryptionType: NONE | KMS | String = null,
    KeyId: String = null
  ): _UnmarshalledStreamDescriptionSummary = {
    val __obj = js.Dynamic.literal(EnhancedMonitoring = EnhancedMonitoring.asInstanceOf[js.Any], OpenShardCount = OpenShardCount.asInstanceOf[js.Any], RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any], StreamCreationTimestamp = StreamCreationTimestamp.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any], StreamStatus = StreamStatus.asInstanceOf[js.Any])
    if (ConsumerCount != null) __obj.updateDynamic("ConsumerCount")(ConsumerCount.asInstanceOf[js.Any])
    if (EncryptionType != null) __obj.updateDynamic("EncryptionType")(EncryptionType.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledStreamDescriptionSummary]
  }
}

