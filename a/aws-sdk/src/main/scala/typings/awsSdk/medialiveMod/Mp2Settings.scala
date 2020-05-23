package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mp2Settings extends js.Object {
  /**
    * Average bitrate in bits/second.
    */
  var Bitrate: js.UndefOr[double] = js.native
  /**
    * The MPEG2 Audio coding mode.  Valid values are codingMode10 (for mono) or codingMode20 (for stereo).
    */
  var CodingMode: js.UndefOr[Mp2CodingMode] = js.native
  /**
    * Sample rate in Hz.
    */
  var SampleRate: js.UndefOr[double] = js.native
}

object Mp2Settings {
  @scala.inline
  def apply(
    Bitrate: js.UndefOr[double] = js.undefined,
    CodingMode: Mp2CodingMode = null,
    SampleRate: js.UndefOr[double] = js.undefined
  ): Mp2Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Bitrate)) __obj.updateDynamic("Bitrate")(Bitrate.get.asInstanceOf[js.Any])
    if (CodingMode != null) __obj.updateDynamic("CodingMode")(CodingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(SampleRate)) __obj.updateDynamic("SampleRate")(SampleRate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mp2Settings]
  }
}

