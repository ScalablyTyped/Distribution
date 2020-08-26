package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AacSettings extends js.Object {
  /**
    * Average bitrate in bits/second. Valid values depend on rate control mode and profile.
    */
  var Bitrate: js.UndefOr[double] = js.native
  /**
    * Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile. The adReceiverMix setting receives a stereo description plus control track and emits a mono AAC encode of the description track, with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
    */
  var CodingMode: js.UndefOr[AacCodingMode] = js.native
  /**
    * Set to "broadcasterMixedAd" when input contains pre-mixed main audio + AD (narration) as a stereo pair.  The Audio Type field (audioType) will be set to 3, which signals to downstream systems that this stream contains "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does not perform the mixing. The values in audioTypeControl and audioType (in AudioDescription) are ignored when set to broadcasterMixedAd.
  Leave set to "normal" when input does not contain pre-mixed audio + AD.
    */
  var InputType: js.UndefOr[AacInputType] = js.native
  /**
    * AAC Profile.
    */
  var Profile: js.UndefOr[AacProfile] = js.native
  /**
    * Rate Control Mode.
    */
  var RateControlMode: js.UndefOr[AacRateControlMode] = js.native
  /**
    * Sets LATM / LOAS AAC output for raw containers.
    */
  var RawFormat: js.UndefOr[AacRawFormat] = js.native
  /**
    * Sample rate in Hz. Valid values depend on rate control mode and profile.
    */
  var SampleRate: js.UndefOr[double] = js.native
  /**
    * Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
    */
  var Spec: js.UndefOr[AacSpec] = js.native
  /**
    * VBR Quality Level - Only used if rateControlMode is VBR.
    */
  var VbrQuality: js.UndefOr[AacVbrQuality] = js.native
}

object AacSettings {
  @scala.inline
  def apply(): AacSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AacSettings]
  }
  @scala.inline
  implicit class AacSettingsOps[Self <: AacSettings] (val x: Self) extends AnyVal {
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
    def setBitrate(value: double): Self = this.set("Bitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitrate: Self = this.set("Bitrate", js.undefined)
    @scala.inline
    def setCodingMode(value: AacCodingMode): Self = this.set("CodingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodingMode: Self = this.set("CodingMode", js.undefined)
    @scala.inline
    def setInputType(value: AacInputType): Self = this.set("InputType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputType: Self = this.set("InputType", js.undefined)
    @scala.inline
    def setProfile(value: AacProfile): Self = this.set("Profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("Profile", js.undefined)
    @scala.inline
    def setRateControlMode(value: AacRateControlMode): Self = this.set("RateControlMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRateControlMode: Self = this.set("RateControlMode", js.undefined)
    @scala.inline
    def setRawFormat(value: AacRawFormat): Self = this.set("RawFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawFormat: Self = this.set("RawFormat", js.undefined)
    @scala.inline
    def setSampleRate(value: double): Self = this.set("SampleRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleRate: Self = this.set("SampleRate", js.undefined)
    @scala.inline
    def setSpec(value: AacSpec): Self = this.set("Spec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpec: Self = this.set("Spec", js.undefined)
    @scala.inline
    def setVbrQuality(value: AacVbrQuality): Self = this.set("VbrQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVbrQuality: Self = this.set("VbrQuality", js.undefined)
  }
  
}

