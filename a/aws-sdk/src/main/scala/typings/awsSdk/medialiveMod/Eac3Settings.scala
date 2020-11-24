package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Eac3Settings extends js.Object {
  
  /**
    * When set to attenuate3Db, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding mode.
    */
  var AttenuationControl: js.UndefOr[Eac3AttenuationControl] = js.native
  
  /**
    * Average bitrate in bits/second. Valid bitrates depend on the coding mode.
    */
  var Bitrate: js.UndefOr[double] = js.native
  
  /**
    * Specifies the bitstream mode (bsmod) for the emitted E-AC-3 stream. See ATSC A/52-2012 (Annex E) for background on these values.
    */
  var BitstreamMode: js.UndefOr[Eac3BitstreamMode] = js.native
  
  /**
    * Dolby Digital Plus coding mode. Determines number of channels.
    */
  var CodingMode: js.UndefOr[Eac3CodingMode] = js.native
  
  /**
    * When set to enabled, activates a DC highpass filter for all input channels.
    */
  var DcFilter: js.UndefOr[Eac3DcFilter] = js.native
  
  /**
    * Sets the dialnorm for the output. If blank and input audio is Dolby Digital Plus, dialnorm will be passed through.
    */
  var Dialnorm: js.UndefOr[integerMin1Max31] = js.native
  
  /**
    * Sets the Dolby dynamic range compression profile.
    */
  var DrcLine: js.UndefOr[Eac3DrcLine] = js.native
  
  /**
    * Sets the profile for heavy Dolby dynamic range compression, ensures that the instantaneous signal peaks do not exceed specified levels.
    */
  var DrcRf: js.UndefOr[Eac3DrcRf] = js.native
  
  /**
    * When encoding 3/2 audio, setting to lfe enables the LFE channel
    */
  var LfeControl: js.UndefOr[Eac3LfeControl] = js.native
  
  /**
    * When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with codingMode32 coding mode.
    */
  var LfeFilter: js.UndefOr[Eac3LfeFilter] = js.native
  
  /**
    * Left only/Right only center mix level. Only used for 3/2 coding mode.
    */
  var LoRoCenterMixLevel: js.UndefOr[double] = js.native
  
  /**
    * Left only/Right only surround mix level. Only used for 3/2 coding mode.
    */
  var LoRoSurroundMixLevel: js.UndefOr[double] = js.native
  
  /**
    * Left total/Right total center mix level. Only used for 3/2 coding mode.
    */
  var LtRtCenterMixLevel: js.UndefOr[double] = js.native
  
  /**
    * Left total/Right total surround mix level. Only used for 3/2 coding mode.
    */
  var LtRtSurroundMixLevel: js.UndefOr[double] = js.native
  
  /**
    * When set to followInput, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
    */
  var MetadataControl: js.UndefOr[Eac3MetadataControl] = js.native
  
  /**
    * When set to whenPossible, input DD+ audio will be passed through if it is present on the input. This detection is dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content will have a consistent DD+ output as the system alternates between passthrough and encoding.
    */
  var PassthroughControl: js.UndefOr[Eac3PassthroughControl] = js.native
  
  /**
    * When set to shift90Degrees, applies a 90-degree phase shift to the surround channels. Only used for 3/2 coding mode.
    */
  var PhaseControl: js.UndefOr[Eac3PhaseControl] = js.native
  
  /**
    * Stereo downmix preference. Only used for 3/2 coding mode.
    */
  var StereoDownmix: js.UndefOr[Eac3StereoDownmix] = js.native
  
  /**
    * When encoding 3/2 audio, sets whether an extra center back surround channel is matrix encoded into the left and right surround channels.
    */
  var SurroundExMode: js.UndefOr[Eac3SurroundExMode] = js.native
  
  /**
    * When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded into the two channels.
    */
  var SurroundMode: js.UndefOr[Eac3SurroundMode] = js.native
}
object Eac3Settings {
  
  @scala.inline
  def apply(): Eac3Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Eac3Settings]
  }
  
  @scala.inline
  implicit class Eac3SettingsOps[Self <: Eac3Settings] (val x: Self) extends AnyVal {
    
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
    def setAttenuationControl(value: Eac3AttenuationControl): Self = this.set("AttenuationControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttenuationControl: Self = this.set("AttenuationControl", js.undefined)
    
    @scala.inline
    def setBitrate(value: double): Self = this.set("Bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitrate: Self = this.set("Bitrate", js.undefined)
    
    @scala.inline
    def setBitstreamMode(value: Eac3BitstreamMode): Self = this.set("BitstreamMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitstreamMode: Self = this.set("BitstreamMode", js.undefined)
    
    @scala.inline
    def setCodingMode(value: Eac3CodingMode): Self = this.set("CodingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodingMode: Self = this.set("CodingMode", js.undefined)
    
    @scala.inline
    def setDcFilter(value: Eac3DcFilter): Self = this.set("DcFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDcFilter: Self = this.set("DcFilter", js.undefined)
    
    @scala.inline
    def setDialnorm(value: integerMin1Max31): Self = this.set("Dialnorm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialnorm: Self = this.set("Dialnorm", js.undefined)
    
    @scala.inline
    def setDrcLine(value: Eac3DrcLine): Self = this.set("DrcLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrcLine: Self = this.set("DrcLine", js.undefined)
    
    @scala.inline
    def setDrcRf(value: Eac3DrcRf): Self = this.set("DrcRf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrcRf: Self = this.set("DrcRf", js.undefined)
    
    @scala.inline
    def setLfeControl(value: Eac3LfeControl): Self = this.set("LfeControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLfeControl: Self = this.set("LfeControl", js.undefined)
    
    @scala.inline
    def setLfeFilter(value: Eac3LfeFilter): Self = this.set("LfeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLfeFilter: Self = this.set("LfeFilter", js.undefined)
    
    @scala.inline
    def setLoRoCenterMixLevel(value: double): Self = this.set("LoRoCenterMixLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoRoCenterMixLevel: Self = this.set("LoRoCenterMixLevel", js.undefined)
    
    @scala.inline
    def setLoRoSurroundMixLevel(value: double): Self = this.set("LoRoSurroundMixLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoRoSurroundMixLevel: Self = this.set("LoRoSurroundMixLevel", js.undefined)
    
    @scala.inline
    def setLtRtCenterMixLevel(value: double): Self = this.set("LtRtCenterMixLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLtRtCenterMixLevel: Self = this.set("LtRtCenterMixLevel", js.undefined)
    
    @scala.inline
    def setLtRtSurroundMixLevel(value: double): Self = this.set("LtRtSurroundMixLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLtRtSurroundMixLevel: Self = this.set("LtRtSurroundMixLevel", js.undefined)
    
    @scala.inline
    def setMetadataControl(value: Eac3MetadataControl): Self = this.set("MetadataControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadataControl: Self = this.set("MetadataControl", js.undefined)
    
    @scala.inline
    def setPassthroughControl(value: Eac3PassthroughControl): Self = this.set("PassthroughControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassthroughControl: Self = this.set("PassthroughControl", js.undefined)
    
    @scala.inline
    def setPhaseControl(value: Eac3PhaseControl): Self = this.set("PhaseControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhaseControl: Self = this.set("PhaseControl", js.undefined)
    
    @scala.inline
    def setStereoDownmix(value: Eac3StereoDownmix): Self = this.set("StereoDownmix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStereoDownmix: Self = this.set("StereoDownmix", js.undefined)
    
    @scala.inline
    def setSurroundExMode(value: Eac3SurroundExMode): Self = this.set("SurroundExMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurroundExMode: Self = this.set("SurroundExMode", js.undefined)
    
    @scala.inline
    def setSurroundMode(value: Eac3SurroundMode): Self = this.set("SurroundMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurroundMode: Self = this.set("SurroundMode", js.undefined)
  }
}
