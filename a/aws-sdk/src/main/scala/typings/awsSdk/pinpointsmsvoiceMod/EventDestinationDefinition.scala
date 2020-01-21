package typings.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDestinationDefinition extends js.Object {
  var CloudWatchLogsDestination: js.UndefOr[typings.awsSdk.pinpointsmsvoiceMod.CloudWatchLogsDestination] = js.native
  /**
    * Indicates whether or not the event destination is enabled. If the event destination is enabled, then Amazon Pinpoint sends response data to the specified event destination.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  var KinesisFirehoseDestination: js.UndefOr[typings.awsSdk.pinpointsmsvoiceMod.KinesisFirehoseDestination] = js.native
  var MatchingEventTypes: js.UndefOr[EventTypes] = js.native
  var SnsDestination: js.UndefOr[typings.awsSdk.pinpointsmsvoiceMod.SnsDestination] = js.native
}

object EventDestinationDefinition {
  @scala.inline
  def apply(
    CloudWatchLogsDestination: CloudWatchLogsDestination = null,
    Enabled: js.UndefOr[scala.Boolean] = js.undefined,
    KinesisFirehoseDestination: KinesisFirehoseDestination = null,
    MatchingEventTypes: EventTypes = null,
    SnsDestination: SnsDestination = null
  ): EventDestinationDefinition = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchLogsDestination != null) __obj.updateDynamic("CloudWatchLogsDestination")(CloudWatchLogsDestination.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (KinesisFirehoseDestination != null) __obj.updateDynamic("KinesisFirehoseDestination")(KinesisFirehoseDestination.asInstanceOf[js.Any])
    if (MatchingEventTypes != null) __obj.updateDynamic("MatchingEventTypes")(MatchingEventTypes.asInstanceOf[js.Any])
    if (SnsDestination != null) __obj.updateDynamic("SnsDestination")(SnsDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDestinationDefinition]
  }
}

