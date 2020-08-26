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
  def apply(): Mp3Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mp3Settings]
  }
  @scala.inline
  implicit class Mp3SettingsOps[Self <: Mp3Settings] (val x: Self) extends AnyVal {
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
    def setBitrate(value: integerMin16000Max320000): Self = this.set("Bitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitrate: Self = this.set("Bitrate", js.undefined)
    @scala.inline
    def setChannels(value: integerMin1Max2): Self = this.set("Channels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannels: Self = this.set("Channels", js.undefined)
    @scala.inline
    def setRateControlMode(value: Mp3RateControlMode): Self = this.set("RateControlMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRateControlMode: Self = this.set("RateControlMode", js.undefined)
    @scala.inline
    def setSampleRate(value: integerMin22050Max48000): Self = this.set("SampleRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleRate: Self = this.set("SampleRate", js.undefined)
    @scala.inline
    def setVbrQuality(value: integerMin0Max9): Self = this.set("VbrQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVbrQuality: Self = this.set("VbrQuality", js.undefined)
  }
  
}

