package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AacSettings extends js.Object {
  
  /**
    * Choose BROADCASTER_MIXED_AD when the input contains pre-mixed main audio + audio description (AD) as a stereo pair. The value for AudioType will be set to 3, which signals to downstream systems that this stream contains "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does not perform the mixing. When you choose BROADCASTER_MIXED_AD, the encoder ignores any values you provide in AudioType and  FollowInputAudioType. Choose NORMAL when the input does not contain pre-mixed audio + audio description (AD). In this case, the encoder will use any values you provide for AudioType and FollowInputAudioType.
    */
  var AudioDescriptionBroadcasterMix: js.UndefOr[AacAudioDescriptionBroadcasterMix] = js.native
  
  /**
    * Specify the average bitrate in bits per second. The set of valid values for this setting is: 6000, 8000, 10000, 12000, 14000, 16000, 20000, 24000, 28000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 384000, 448000, 512000, 576000, 640000, 768000, 896000, 1024000. The value you set is also constrained by the values that you choose for Profile (codecProfile), Bitrate control mode (codingMode), and Sample rate (sampleRate). Default values depend on Bitrate control mode and Profile.
    */
  var Bitrate: js.UndefOr[integerMin6000Max1024000] = js.native
  
  /**
    * AAC Profile.
    */
  var CodecProfile: js.UndefOr[AacCodecProfile] = js.native
  
  /**
    * Mono (Audio Description), Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile. "1.0 - Audio Description (Receiver Mix)" setting receives a stereo description plus control track and emits a mono AAC encode of the description track, with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
    */
  var CodingMode: js.UndefOr[AacCodingMode] = js.native
  
  /**
    * Rate Control Mode.
    */
  var RateControlMode: js.UndefOr[AacRateControlMode] = js.native
  
  /**
    * Enables LATM/LOAS AAC output. Note that if you use LATM/LOAS AAC in an output, you must choose "No container" for the output container.
    */
  var RawFormat: js.UndefOr[AacRawFormat] = js.native
  
  /**
    * Sample rate in Hz. Valid values depend on rate control mode and profile.
    */
  var SampleRate: js.UndefOr[integerMin8000Max96000] = js.native
  
  /**
    * Use MPEG-2 AAC instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
    */
  var Specification: js.UndefOr[AacSpecification] = js.native
  
  /**
    * VBR Quality Level - Only used if rate_control_mode is VBR.
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
    def setAudioDescriptionBroadcasterMix(value: AacAudioDescriptionBroadcasterMix): Self = this.set("AudioDescriptionBroadcasterMix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioDescriptionBroadcasterMix: Self = this.set("AudioDescriptionBroadcasterMix", js.undefined)
    
    @scala.inline
    def setBitrate(value: integerMin6000Max1024000): Self = this.set("Bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitrate: Self = this.set("Bitrate", js.undefined)
    
    @scala.inline
    def setCodecProfile(value: AacCodecProfile): Self = this.set("CodecProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodecProfile: Self = this.set("CodecProfile", js.undefined)
    
    @scala.inline
    def setCodingMode(value: AacCodingMode): Self = this.set("CodingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodingMode: Self = this.set("CodingMode", js.undefined)
    
    @scala.inline
    def setRateControlMode(value: AacRateControlMode): Self = this.set("RateControlMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRateControlMode: Self = this.set("RateControlMode", js.undefined)
    
    @scala.inline
    def setRawFormat(value: AacRawFormat): Self = this.set("RawFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawFormat: Self = this.set("RawFormat", js.undefined)
    
    @scala.inline
    def setSampleRate(value: integerMin8000Max96000): Self = this.set("SampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRate: Self = this.set("SampleRate", js.undefined)
    
    @scala.inline
    def setSpecification(value: AacSpecification): Self = this.set("Specification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecification: Self = this.set("Specification", js.undefined)
    
    @scala.inline
    def setVbrQuality(value: AacVbrQuality): Self = this.set("VbrQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVbrQuality: Self = this.set("VbrQuality", js.undefined)
  }
}
