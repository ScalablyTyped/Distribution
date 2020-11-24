package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioCodecSettings extends js.Object {
  
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AAC. The service accepts one of two mutually exclusive groups of AAC settings--VBR and CBR. To select one of these modes, set the value of Bitrate control mode (rateControlMode) to "VBR" or "CBR".  In VBR mode, you control the audio quality with the setting VBR quality (vbrQuality). In CBR mode, you use the setting Bitrate (bitrate). Defaults and valid values depend on the rate control mode.
    */
  var AacSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.AacSettings] = js.native
  
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AC3.
    */
  var Ac3Settings: js.UndefOr[typings.awsSdk.mediaconvertMod.Ac3Settings] = js.native
  
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value AIFF.
    */
  var AiffSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.AiffSettings] = js.native
  
  /**
    * Type of Audio codec.
    */
  var Codec: js.UndefOr[AudioCodec] = js.native
  
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value EAC3_ATMOS.
    */
  var Eac3AtmosSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.Eac3AtmosSettings] = js.native
  
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value EAC3.
    */
  var Eac3Settings: js.UndefOr[typings.awsSdk.mediaconvertMod.Eac3Settings] = js.native
  
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value MP2.
    */
  var Mp2Settings: js.UndefOr[typings.awsSdk.mediaconvertMod.Mp2Settings] = js.native
  
  /**
    * Required when you set Codec, under AudioDescriptions>CodecSettings, to the value MP3.
    */
  var Mp3Settings: js.UndefOr[typings.awsSdk.mediaconvertMod.Mp3Settings] = js.native
  
  /**
    * Required when you set Codec, under AudioDescriptions>CodecSettings, to the value OPUS.
    */
  var OpusSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.OpusSettings] = js.native
  
  /**
    * Required when you set Codec, under AudioDescriptions>CodecSettings, to the value Vorbis.
    */
  var VorbisSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.VorbisSettings] = js.native
  
  /**
    * Required when you set (Codec) under (AudioDescriptions)>(CodecSettings) to the value WAV.
    */
  var WavSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.WavSettings] = js.native
}
object AudioCodecSettings {
  
  @scala.inline
  def apply(): AudioCodecSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioCodecSettings]
  }
  
  @scala.inline
  implicit class AudioCodecSettingsOps[Self <: AudioCodecSettings] (val x: Self) extends AnyVal {
    
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
    def setAacSettings(value: AacSettings): Self = this.set("AacSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAacSettings: Self = this.set("AacSettings", js.undefined)
    
    @scala.inline
    def setAc3Settings(value: Ac3Settings): Self = this.set("Ac3Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAc3Settings: Self = this.set("Ac3Settings", js.undefined)
    
    @scala.inline
    def setAiffSettings(value: AiffSettings): Self = this.set("AiffSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAiffSettings: Self = this.set("AiffSettings", js.undefined)
    
    @scala.inline
    def setCodec(value: AudioCodec): Self = this.set("Codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodec: Self = this.set("Codec", js.undefined)
    
    @scala.inline
    def setEac3AtmosSettings(value: Eac3AtmosSettings): Self = this.set("Eac3AtmosSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEac3AtmosSettings: Self = this.set("Eac3AtmosSettings", js.undefined)
    
    @scala.inline
    def setEac3Settings(value: Eac3Settings): Self = this.set("Eac3Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEac3Settings: Self = this.set("Eac3Settings", js.undefined)
    
    @scala.inline
    def setMp2Settings(value: Mp2Settings): Self = this.set("Mp2Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMp2Settings: Self = this.set("Mp2Settings", js.undefined)
    
    @scala.inline
    def setMp3Settings(value: Mp3Settings): Self = this.set("Mp3Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMp3Settings: Self = this.set("Mp3Settings", js.undefined)
    
    @scala.inline
    def setOpusSettings(value: OpusSettings): Self = this.set("OpusSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpusSettings: Self = this.set("OpusSettings", js.undefined)
    
    @scala.inline
    def setVorbisSettings(value: VorbisSettings): Self = this.set("VorbisSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVorbisSettings: Self = this.set("VorbisSettings", js.undefined)
    
    @scala.inline
    def setWavSettings(value: WavSettings): Self = this.set("WavSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWavSettings: Self = this.set("WavSettings", js.undefined)
  }
}
