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
    MaximumVideoBufferDelayMilliseconds: js.UndefOr[integerMin1000Max3000] = js.undefined,
    TransportStreamReservedBitrate: js.UndefOr[integerMin0Max100000000] = js.undefined
  ): MultiplexSettings = {
    val __obj = js.Dynamic.literal(TransportStreamBitrate = TransportStreamBitrate.asInstanceOf[js.Any], TransportStreamId = TransportStreamId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaximumVideoBufferDelayMilliseconds)) __obj.updateDynamic("MaximumVideoBufferDelayMilliseconds")(MaximumVideoBufferDelayMilliseconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TransportStreamReservedBitrate)) __obj.updateDynamic("TransportStreamReservedBitrate")(TransportStreamReservedBitrate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexSettings]
  }
}

