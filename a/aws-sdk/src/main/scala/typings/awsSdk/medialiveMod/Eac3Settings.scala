package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Eac3Settings extends StObject {
  
  /**
    * When set to attenuate3Db, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding mode.
    */
  var AttenuationControl: js.UndefOr[Eac3AttenuationControl] = js.undefined
  
  /**
    * Average bitrate in bits/second. Valid bitrates depend on the coding mode.
    */
  var Bitrate: js.UndefOr[double] = js.undefined
  
  /**
    * Specifies the bitstream mode (bsmod) for the emitted E-AC-3 stream. See ATSC A/52-2012 (Annex E) for background on these values.
    */
  var BitstreamMode: js.UndefOr[Eac3BitstreamMode] = js.undefined
  
  /**
    * Dolby Digital Plus coding mode. Determines number of channels.
    */
  var CodingMode: js.UndefOr[Eac3CodingMode] = js.undefined
  
  /**
    * When set to enabled, activates a DC highpass filter for all input channels.
    */
  var DcFilter: js.UndefOr[Eac3DcFilter] = js.undefined
  
  /**
    * Sets the dialnorm for the output. If blank and input audio is Dolby Digital Plus, dialnorm will be passed through.
    */
  var Dialnorm: js.UndefOr[integerMin1Max31] = js.undefined
  
  /**
    * Sets the Dolby dynamic range compression profile.
    */
  var DrcLine: js.UndefOr[Eac3DrcLine] = js.undefined
  
  /**
    * Sets the profile for heavy Dolby dynamic range compression, ensures that the instantaneous signal peaks do not exceed specified levels.
    */
  var DrcRf: js.UndefOr[Eac3DrcRf] = js.undefined
  
  /**
    * When encoding 3/2 audio, setting to lfe enables the LFE channel
    */
  var LfeControl: js.UndefOr[Eac3LfeControl] = js.undefined
  
  /**
    * When set to enabled, applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with codingMode32 coding mode.
    */
  var LfeFilter: js.UndefOr[Eac3LfeFilter] = js.undefined
  
  /**
    * Left only/Right only center mix level. Only used for 3/2 coding mode.
    */
  var LoRoCenterMixLevel: js.UndefOr[double] = js.undefined
  
  /**
    * Left only/Right only surround mix level. Only used for 3/2 coding mode.
    */
  var LoRoSurroundMixLevel: js.UndefOr[double] = js.undefined
  
  /**
    * Left total/Right total center mix level. Only used for 3/2 coding mode.
    */
  var LtRtCenterMixLevel: js.UndefOr[double] = js.undefined
  
  /**
    * Left total/Right total surround mix level. Only used for 3/2 coding mode.
    */
  var LtRtSurroundMixLevel: js.UndefOr[double] = js.undefined
  
  /**
    * When set to followInput, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
    */
  var MetadataControl: js.UndefOr[Eac3MetadataControl] = js.undefined
  
  /**
    * When set to whenPossible, input DD+ audio will be passed through if it is present on the input. This detection is dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content will have a consistent DD+ output as the system alternates between passthrough and encoding.
    */
  var PassthroughControl: js.UndefOr[Eac3PassthroughControl] = js.undefined
  
  /**
    * When set to shift90Degrees, applies a 90-degree phase shift to the surround channels. Only used for 3/2 coding mode.
    */
  var PhaseControl: js.UndefOr[Eac3PhaseControl] = js.undefined
  
  /**
    * Stereo downmix preference. Only used for 3/2 coding mode.
    */
  var StereoDownmix: js.UndefOr[Eac3StereoDownmix] = js.undefined
  
  /**
    * When encoding 3/2 audio, sets whether an extra center back surround channel is matrix encoded into the left and right surround channels.
    */
  var SurroundExMode: js.UndefOr[Eac3SurroundExMode] = js.undefined
  
  /**
    * When encoding 2/0 audio, sets whether Dolby Surround is matrix encoded into the two channels.
    */
  var SurroundMode: js.UndefOr[Eac3SurroundMode] = js.undefined
}
object Eac3Settings {
  
  @scala.inline
  def apply(): Eac3Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Eac3Settings]
  }
  
  @scala.inline
  implicit class Eac3SettingsMutableBuilder[Self <: Eac3Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttenuationControl(value: Eac3AttenuationControl): Self = StObject.set(x, "AttenuationControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttenuationControlUndefined: Self = StObject.set(x, "AttenuationControl", js.undefined)
    
    @scala.inline
    def setBitrate(value: double): Self = StObject.set(x, "Bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrateUndefined: Self = StObject.set(x, "Bitrate", js.undefined)
    
    @scala.inline
    def setBitstreamMode(value: Eac3BitstreamMode): Self = StObject.set(x, "BitstreamMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitstreamModeUndefined: Self = StObject.set(x, "BitstreamMode", js.undefined)
    
    @scala.inline
    def setCodingMode(value: Eac3CodingMode): Self = StObject.set(x, "CodingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodingModeUndefined: Self = StObject.set(x, "CodingMode", js.undefined)
    
    @scala.inline
    def setDcFilter(value: Eac3DcFilter): Self = StObject.set(x, "DcFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDcFilterUndefined: Self = StObject.set(x, "DcFilter", js.undefined)
    
    @scala.inline
    def setDialnorm(value: integerMin1Max31): Self = StObject.set(x, "Dialnorm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialnormUndefined: Self = StObject.set(x, "Dialnorm", js.undefined)
    
    @scala.inline
    def setDrcLine(value: Eac3DrcLine): Self = StObject.set(x, "DrcLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrcLineUndefined: Self = StObject.set(x, "DrcLine", js.undefined)
    
    @scala.inline
    def setDrcRf(value: Eac3DrcRf): Self = StObject.set(x, "DrcRf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrcRfUndefined: Self = StObject.set(x, "DrcRf", js.undefined)
    
    @scala.inline
    def setLfeControl(value: Eac3LfeControl): Self = StObject.set(x, "LfeControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLfeControlUndefined: Self = StObject.set(x, "LfeControl", js.undefined)
    
    @scala.inline
    def setLfeFilter(value: Eac3LfeFilter): Self = StObject.set(x, "LfeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLfeFilterUndefined: Self = StObject.set(x, "LfeFilter", js.undefined)
    
    @scala.inline
    def setLoRoCenterMixLevel(value: double): Self = StObject.set(x, "LoRoCenterMixLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoRoCenterMixLevelUndefined: Self = StObject.set(x, "LoRoCenterMixLevel", js.undefined)
    
    @scala.inline
    def setLoRoSurroundMixLevel(value: double): Self = StObject.set(x, "LoRoSurroundMixLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoRoSurroundMixLevelUndefined: Self = StObject.set(x, "LoRoSurroundMixLevel", js.undefined)
    
    @scala.inline
    def setLtRtCenterMixLevel(value: double): Self = StObject.set(x, "LtRtCenterMixLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLtRtCenterMixLevelUndefined: Self = StObject.set(x, "LtRtCenterMixLevel", js.undefined)
    
    @scala.inline
    def setLtRtSurroundMixLevel(value: double): Self = StObject.set(x, "LtRtSurroundMixLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLtRtSurroundMixLevelUndefined: Self = StObject.set(x, "LtRtSurroundMixLevel", js.undefined)
    
    @scala.inline
    def setMetadataControl(value: Eac3MetadataControl): Self = StObject.set(x, "MetadataControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataControlUndefined: Self = StObject.set(x, "MetadataControl", js.undefined)
    
    @scala.inline
    def setPassthroughControl(value: Eac3PassthroughControl): Self = StObject.set(x, "PassthroughControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassthroughControlUndefined: Self = StObject.set(x, "PassthroughControl", js.undefined)
    
    @scala.inline
    def setPhaseControl(value: Eac3PhaseControl): Self = StObject.set(x, "PhaseControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhaseControlUndefined: Self = StObject.set(x, "PhaseControl", js.undefined)
    
    @scala.inline
    def setStereoDownmix(value: Eac3StereoDownmix): Self = StObject.set(x, "StereoDownmix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStereoDownmixUndefined: Self = StObject.set(x, "StereoDownmix", js.undefined)
    
    @scala.inline
    def setSurroundExMode(value: Eac3SurroundExMode): Self = StObject.set(x, "SurroundExMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurroundExModeUndefined: Self = StObject.set(x, "SurroundExMode", js.undefined)
    
    @scala.inline
    def setSurroundMode(value: Eac3SurroundMode): Self = StObject.set(x, "SurroundMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurroundModeUndefined: Self = StObject.set(x, "SurroundMode", js.undefined)
  }
}
