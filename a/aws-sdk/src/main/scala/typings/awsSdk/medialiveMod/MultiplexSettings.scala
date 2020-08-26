package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexSettings extends js.Object {
  /**
    * Maximum video buffer delay in milliseconds.
    */
  var MaximumVideoBufferDelayMilliseconds: js.UndefOr[integerMin1000Max3000] = js.native
  /**
    * Transport stream bit rate.
    */
  var TransportStreamBitrate: integerMin1000000Max100000000 = js.native
  /**
    * Transport stream ID.
    */
  var TransportStreamId: integerMin0Max65535 = js.native
  /**
    * Transport stream reserved bit rate.
    */
  var TransportStreamReservedBitrate: js.UndefOr[integerMin0Max100000000] = js.native
}

object MultiplexSettings {
  @scala.inline
  def apply(TransportStreamBitrate: integerMin1000000Max100000000, TransportStreamId: integerMin0Max65535): MultiplexSettings = {
    val __obj = js.Dynamic.literal(TransportStreamBitrate = TransportStreamBitrate.asInstanceOf[js.Any], TransportStreamId = TransportStreamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexSettings]
  }
  @scala.inline
  implicit class MultiplexSettingsOps[Self <: MultiplexSettings] (val x: Self) extends AnyVal {
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
    def setTransportStreamBitrate(value: integerMin1000000Max100000000): Self = this.set("TransportStreamBitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransportStreamId(value: integerMin0Max65535): Self = this.set("TransportStreamId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximumVideoBufferDelayMilliseconds(value: integerMin1000Max3000): Self = this.set("MaximumVideoBufferDelayMilliseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumVideoBufferDelayMilliseconds: Self = this.set("MaximumVideoBufferDelayMilliseconds", js.undefined)
    @scala.inline
    def setTransportStreamReservedBitrate(value: integerMin0Max100000000): Self = this.set("TransportStreamReservedBitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransportStreamReservedBitrate: Self = this.set("TransportStreamReservedBitrate", js.undefined)
  }
  
}

