package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mp2Settings extends js.Object {
  /**
    * Specify the average bitrate in bits per second.
    */
  var Bitrate: js.UndefOr[integerMin32000Max384000] = js.native
  /**
    * Set Channels to specify the number of channels in this output audio track. Choosing Mono in the console will give you 1 output channel; choosing Stereo will give you 2. In the API, valid values are 1 and 2.
    */
  var Channels: js.UndefOr[integerMin1Max2] = js.native
  /**
    * Sample rate in hz.
    */
  var SampleRate: js.UndefOr[integerMin32000Max48000] = js.native
}

object Mp2Settings {
  @scala.inline
  def apply(
    Bitrate: js.UndefOr[integerMin32000Max384000] = js.undefined,
    Channels: js.UndefOr[integerMin1Max2] = js.undefined,
    SampleRate: js.UndefOr[integerMin32000Max48000] = js.undefined
  ): Mp2Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Bitrate)) __obj.updateDynamic("Bitrate")(Bitrate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Channels)) __obj.updateDynamic("Channels")(Channels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SampleRate)) __obj.updateDynamic("SampleRate")(SampleRate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mp2Settings]
  }
}

