package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsInputSettings extends js.Object {
  /**
    * When specified the HLS stream with the m3u8 BANDWIDTH that most closely matches this value will be chosen, otherwise the highest bandwidth stream in the m3u8 will be chosen.  The bitrate is specified in bits per second, as in an HLS manifest.
    */
  var Bandwidth: js.UndefOr[integerMin0] = js.native
  /**
    * When specified, reading of the HLS input will begin this many buffer segments from the end (most recently written segment).  When not specified, the HLS input will begin with the first segment specified in the m3u8.
    */
  var BufferSegments: js.UndefOr[integerMin0] = js.native
  /**
    * The number of consecutive times that attempts to read a manifest or segment must fail before the input is considered unavailable.
    */
  var Retries: js.UndefOr[integerMin0] = js.native
  /**
    * The number of seconds between retries when an attempt to read a manifest or segment fails.
    */
  var RetryInterval: js.UndefOr[integerMin0] = js.native
}

object HlsInputSettings {
  @scala.inline
  def apply(
    Bandwidth: js.UndefOr[integerMin0] = js.undefined,
    BufferSegments: js.UndefOr[integerMin0] = js.undefined,
    Retries: js.UndefOr[integerMin0] = js.undefined,
    RetryInterval: js.UndefOr[integerMin0] = js.undefined
  ): HlsInputSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Bandwidth)) __obj.updateDynamic("Bandwidth")(Bandwidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(BufferSegments)) __obj.updateDynamic("BufferSegments")(BufferSegments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Retries)) __obj.updateDynamic("Retries")(Retries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RetryInterval)) __obj.updateDynamic("RetryInterval")(RetryInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsInputSettings]
  }
}

