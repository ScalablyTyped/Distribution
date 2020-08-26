package typings.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDestination extends js.Object {
  var CloudWatchLogsDestination: js.UndefOr[typings.awsSdk.pinpointsmsvoiceMod.CloudWatchLogsDestination] = js.native
  /**
    * Indicates whether or not the event destination is enabled. If the event destination is enabled, then Amazon Pinpoint sends response data to the specified event destination.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  var KinesisFirehoseDestination: js.UndefOr[typings.awsSdk.pinpointsmsvoiceMod.KinesisFirehoseDestination] = js.native
  var MatchingEventTypes: js.UndefOr[EventTypes] = js.native
  /**
    * A name that identifies the event destination configuration.
    */
  var Name: js.UndefOr[String] = js.native
  var SnsDestination: js.UndefOr[typings.awsSdk.pinpointsmsvoiceMod.SnsDestination] = js.native
}

object EventDestination {
  @scala.inline
  def apply(): EventDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDestination]
  }
  @scala.inline
  implicit class EventDestinationOps[Self <: EventDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCloudWatchLogsDestination(value: CloudWatchLogsDestination): Self = this.set("CloudWatchLogsDestination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudWatchLogsDestination: Self = this.set("CloudWatchLogsDestination", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    @scala.inline
    def setKinesisFirehoseDestination(value: KinesisFirehoseDestination): Self = this.set("KinesisFirehoseDestination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKinesisFirehoseDestination: Self = this.set("KinesisFirehoseDestination", js.undefined)
    @scala.inline
    def setMatchingEventTypesVarargs(value: EventType*): Self = this.set("MatchingEventTypes", js.Array(value :_*))
    @scala.inline
    def setMatchingEventTypes(value: EventTypes): Self = this.set("MatchingEventTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchingEventTypes: Self = this.set("MatchingEventTypes", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setSnsDestination(value: SnsDestination): Self = this.set("SnsDestination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnsDestination: Self = this.set("SnsDestination", js.undefined)
  }
  
}

