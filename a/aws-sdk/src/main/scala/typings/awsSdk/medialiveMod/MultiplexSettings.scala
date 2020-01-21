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
  def apply(
    TransportStreamBitrate: integerMin1000000Max100000000,
    TransportStreamId: integerMin0Max65535,
    MaximumVideoBufferDelayMilliseconds: Int | Double = null,
    TransportStreamReservedBitrate: Int | Double = null
  ): MultiplexSettings = {
    val __obj = js.Dynamic.literal(TransportStreamBitrate = TransportStreamBitrate.asInstanceOf[js.Any], TransportStreamId = TransportStreamId.asInstanceOf[js.Any])
    if (MaximumVideoBufferDelayMilliseconds != null) __obj.updateDynamic("MaximumVideoBufferDelayMilliseconds")(MaximumVideoBufferDelayMilliseconds.asInstanceOf[js.Any])
    if (TransportStreamReservedBitrate != null) __obj.updateDynamic("TransportStreamReservedBitrate")(TransportStreamReservedBitrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexSettings]
  }
}

