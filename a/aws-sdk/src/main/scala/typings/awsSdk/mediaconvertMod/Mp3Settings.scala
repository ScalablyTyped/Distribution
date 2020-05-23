package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mp3Settings extends js.Object {
  /**
    * Specify the average bitrate in bits per second.
    */
  var Bitrate: js.UndefOr[integerMin16000Max320000] = js.native
  /**
    * Specify the number of channels in this output audio track. Choosing Mono on the console gives you 1 output channel; choosing Stereo gives you 2. In the API, valid values are 1 and 2.
    */
  var Channels: js.UndefOr[integerMin1Max2] = js.native
  /**
    * Specify whether the service encodes this MP3 audio output with a constant bitrate (CBR) or a variable bitrate (VBR).
    */
  var RateControlMode: js.UndefOr[Mp3RateControlMode] = js.native
  /**
    * Sample rate in hz.
    */
  var SampleRate: js.UndefOr[integerMin22050Max48000] = js.native
  /**
    * Required when you set Bitrate control mode (rateControlMode) to VBR. Specify the audio quality of this MP3 output from 0 (highest quality) to 9 (lowest quality).
    */
  var VbrQuality: js.UndefOr[integerMin0Max9] = js.native
}

object Mp3Settings {
  @scala.inline
  def apply(
    Bitrate: js.UndefOr[integerMin16000Max320000] = js.undefined,
    Channels: js.UndefOr[integerMin1Max2] = js.undefined,
    RateControlMode: Mp3RateControlMode = null,
    SampleRate: js.UndefOr[integerMin22050Max48000] = js.undefined,
    VbrQuality: js.UndefOr[integerMin0Max9] = js.undefined
  ): Mp3Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Bitrate)) __obj.updateDynamic("Bitrate")(Bitrate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Channels)) __obj.updateDynamic("Channels")(Channels.get.asInstanceOf[js.Any])
    if (RateControlMode != null) __obj.updateDynamic("RateControlMode")(RateControlMode.asInstanceOf[js.Any])
    if (!js.isUndefined(SampleRate)) __obj.updateDynamic("SampleRate")(SampleRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(VbrQuality)) __obj.updateDynamic("VbrQuality")(VbrQuality.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mp3Settings]
  }
}

