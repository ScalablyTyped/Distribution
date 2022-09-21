package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Eac3Settings extends StObject {
  
  /**
    * If set to ATTENUATE_3_DB, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding mode.
    */
  var AttenuationControl: js.UndefOr[Eac3AttenuationControl] = js.undefined
  
  /**
    * Specify the average bitrate in bits per second. Valid bitrates depend on the coding mode.
    */
  var Bitrate: js.UndefOr[integerMin64000Max640000] = js.undefined
  
  /**
    * Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
    */
  var BitstreamMode: js.UndefOr[Eac3BitstreamMode] = js.undefined
  
  /**
    * Dolby Digital Plus coding mode. Determines number of channels.
    */
  var CodingMode: js.UndefOr[Eac3CodingMode] = js.undefined
  
  /**
    * Activates a DC highpass filter for all input channels.
    */
  var DcFilter: js.UndefOr[Eac3DcFilter] = js.undefined
  
  /**
    * Sets the dialnorm for the output. If blank and input audio is Dolby Digital Plus, dialnorm will be passed through.
    */
  var Dialnorm: js.UndefOr[integerMin1Max31] = js.undefined
  
  /**
    * Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the Dolby Digital stream for the line operating mode. Related setting: When you use this setting, MediaConvert ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
    */
  var DynamicRangeCompressionLine: js.UndefOr[Eac3DynamicRangeCompressionLine] = js.undefined
  
  /**
    * Choose the Dolby Digital dynamic range control (DRC) profile that MediaConvert uses when encoding the metadata in the Dolby Digital stream for the RF operating mode. Related setting: When you use this setting, MediaConvert ignores any value you provide for Dynamic range compression profile (DynamicRangeCompressionProfile). For information about the Dolby Digital DRC operating modes and profiles, see the Dynamic Range Control chapter of the Dolby Metadata Guide at https://developer.dolby.com/globalassets/professional/documents/dolby-metadata-guide.pdf.
    */
  var DynamicRangeCompressionRf: js.UndefOr[Eac3DynamicRangeCompressionRf] = js.undefined
  
  /**
    * When encoding 3/2 audio, controls whether the LFE channel is enabled
    */
  var LfeControl: js.UndefOr[Eac3LfeControl] = js.undefined
  
  /**
    * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
    */
  var LfeFilter: js.UndefOr[Eac3LfeFilter] = js.undefined
  
  /**
    * Specify a value for the following Dolby Digital Plus setting: Left only/Right only center mix (Lo/Ro center). MediaConvert uses this value for downmixing. How the service uses this value depends on the value that you choose for Stereo downmix (Eac3StereoDownmix). Valid values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel. This setting applies only if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you choose a different value for Coding mode, the service ignores Left only/Right only center (loRoCenterMixLevel).
    */
  var LoRoCenterMixLevel: js.UndefOr[doubleMinNegative60Max3] = js.undefined
  
  /**
    * Specify a value for the following Dolby Digital Plus setting: Left only/Right only (Lo/Ro surround). MediaConvert uses this value for downmixing. How the service uses this value depends on the value that you choose for Stereo downmix (Eac3StereoDownmix). Valid values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel. This setting applies only if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you choose a different value for Coding mode, the service ignores Left only/Right only surround (loRoSurroundMixLevel).
    */
  var LoRoSurroundMixLevel: js.UndefOr[doubleMinNegative60MaxNegative1] = js.undefined
  
  /**
    * Specify a value for the following Dolby Digital Plus setting: Left total/Right total center mix (Lt/Rt center). MediaConvert uses this value for downmixing. How the service uses this value depends on the value that you choose for Stereo downmix (Eac3StereoDownmix). Valid values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel. This setting applies only if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you choose a different value for Coding mode, the service ignores Left total/Right total center (ltRtCenterMixLevel).
    */
  var LtRtCenterMixLevel: js.UndefOr[doubleMinNegative60Max3] = js.undefined
  
  /**
    * Specify a value for the following Dolby Digital Plus setting: Left total/Right total surround mix (Lt/Rt surround). MediaConvert uses this value for downmixing. How the service uses this value depends on the value that you choose for Stereo downmix (Eac3StereoDownmix). Valid values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel. This setting applies only if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you choose a different value for Coding mode, the service ignores Left total/Right total surround (ltRtSurroundMixLevel).
    */
  var LtRtSurroundMixLevel: js.UndefOr[doubleMinNegative60MaxNegative1] = js.undefined
  
  /**
    * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
    */
  var MetadataControl: js.UndefOr[Eac3MetadataControl] = js.undefined
  
  /**
    * When set to WHEN_POSSIBLE, input DD+ audio will be passed through if it is present on the input. this detection is dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content will have a consistent DD+ output as the system alternates between passthrough and encoding.
    */
  var PassthroughControl: js.UndefOr[Eac3PassthroughControl] = js.undefined
  
  /**
    * Controls the amount of phase-shift applied to the surround channels. Only used for 3/2 coding mode.
    */
  var PhaseControl: js.UndefOr[Eac3PhaseControl] = js.undefined
  
  /**
    * This value is always 48000. It represents the sample rate in Hz.
    */
  var SampleRate: js.UndefOr[integerMin48000Max48000] = js.undefined
  
  /**
    * Choose how the service does stereo downmixing. This setting only applies if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you choose a different value for Coding mode, the service ignores Stereo downmix (Eac3StereoDownmix).
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
  
  inline def apply(): Eac3Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Eac3Settings]
  }
  
  extension [Self <: Eac3Settings](x: Self) {
    
    inline def setAttenuationControl(value: Eac3AttenuationControl): Self = StObject.set(x, "AttenuationControl", value.asInstanceOf[js.Any])
    
    inline def setAttenuationControlUndefined: Self = StObject.set(x, "AttenuationControl", js.undefined)
    
    inline def setBitrate(value: integerMin64000Max640000): Self = StObject.set(x, "Bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateUndefined: Self = StObject.set(x, "Bitrate", js.undefined)
    
    inline def setBitstreamMode(value: Eac3BitstreamMode): Self = StObject.set(x, "BitstreamMode", value.asInstanceOf[js.Any])
    
    inline def setBitstreamModeUndefined: Self = StObject.set(x, "BitstreamMode", js.undefined)
    
    inline def setCodingMode(value: Eac3CodingMode): Self = StObject.set(x, "CodingMode", value.asInstanceOf[js.Any])
    
    inline def setCodingModeUndefined: Self = StObject.set(x, "CodingMode", js.undefined)
    
    inline def setDcFilter(value: Eac3DcFilter): Self = StObject.set(x, "DcFilter", value.asInstanceOf[js.Any])
    
    inline def setDcFilterUndefined: Self = StObject.set(x, "DcFilter", js.undefined)
    
    inline def setDialnorm(value: integerMin1Max31): Self = StObject.set(x, "Dialnorm", value.asInstanceOf[js.Any])
    
    inline def setDialnormUndefined: Self = StObject.set(x, "Dialnorm", js.undefined)
    
    inline def setDynamicRangeCompressionLine(value: Eac3DynamicRangeCompressionLine): Self = StObject.set(x, "DynamicRangeCompressionLine", value.asInstanceOf[js.Any])
    
    inline def setDynamicRangeCompressionLineUndefined: Self = StObject.set(x, "DynamicRangeCompressionLine", js.undefined)
    
    inline def setDynamicRangeCompressionRf(value: Eac3DynamicRangeCompressionRf): Self = StObject.set(x, "DynamicRangeCompressionRf", value.asInstanceOf[js.Any])
    
    inline def setDynamicRangeCompressionRfUndefined: Self = StObject.set(x, "DynamicRangeCompressionRf", js.undefined)
    
    inline def setLfeControl(value: Eac3LfeControl): Self = StObject.set(x, "LfeControl", value.asInstanceOf[js.Any])
    
    inline def setLfeControlUndefined: Self = StObject.set(x, "LfeControl", js.undefined)
    
    inline def setLfeFilter(value: Eac3LfeFilter): Self = StObject.set(x, "LfeFilter", value.asInstanceOf[js.Any])
    
    inline def setLfeFilterUndefined: Self = StObject.set(x, "LfeFilter", js.undefined)
    
    inline def setLoRoCenterMixLevel(value: doubleMinNegative60Max3): Self = StObject.set(x, "LoRoCenterMixLevel", value.asInstanceOf[js.Any])
    
    inline def setLoRoCenterMixLevelUndefined: Self = StObject.set(x, "LoRoCenterMixLevel", js.undefined)
    
    inline def setLoRoSurroundMixLevel(value: doubleMinNegative60MaxNegative1): Self = StObject.set(x, "LoRoSurroundMixLevel", value.asInstanceOf[js.Any])
    
    inline def setLoRoSurroundMixLevelUndefined: Self = StObject.set(x, "LoRoSurroundMixLevel", js.undefined)
    
    inline def setLtRtCenterMixLevel(value: doubleMinNegative60Max3): Self = StObject.set(x, "LtRtCenterMixLevel", value.asInstanceOf[js.Any])
    
    inline def setLtRtCenterMixLevelUndefined: Self = StObject.set(x, "LtRtCenterMixLevel", js.undefined)
    
    inline def setLtRtSurroundMixLevel(value: doubleMinNegative60MaxNegative1): Self = StObject.set(x, "LtRtSurroundMixLevel", value.asInstanceOf[js.Any])
    
    inline def setLtRtSurroundMixLevelUndefined: Self = StObject.set(x, "LtRtSurroundMixLevel", js.undefined)
    
    inline def setMetadataControl(value: Eac3MetadataControl): Self = StObject.set(x, "MetadataControl", value.asInstanceOf[js.Any])
    
    inline def setMetadataControlUndefined: Self = StObject.set(x, "MetadataControl", js.undefined)
    
    inline def setPassthroughControl(value: Eac3PassthroughControl): Self = StObject.set(x, "PassthroughControl", value.asInstanceOf[js.Any])
    
    inline def setPassthroughControlUndefined: Self = StObject.set(x, "PassthroughControl", js.undefined)
    
    inline def setPhaseControl(value: Eac3PhaseControl): Self = StObject.set(x, "PhaseControl", value.asInstanceOf[js.Any])
    
    inline def setPhaseControlUndefined: Self = StObject.set(x, "PhaseControl", js.undefined)
    
    inline def setSampleRate(value: integerMin48000Max48000): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
    
    inline def setStereoDownmix(value: Eac3StereoDownmix): Self = StObject.set(x, "StereoDownmix", value.asInstanceOf[js.Any])
    
    inline def setStereoDownmixUndefined: Self = StObject.set(x, "StereoDownmix", js.undefined)
    
    inline def setSurroundExMode(value: Eac3SurroundExMode): Self = StObject.set(x, "SurroundExMode", value.asInstanceOf[js.Any])
    
    inline def setSurroundExModeUndefined: Self = StObject.set(x, "SurroundExMode", js.undefined)
    
    inline def setSurroundMode(value: Eac3SurroundMode): Self = StObject.set(x, "SurroundMode", value.asInstanceOf[js.Any])
    
    inline def setSurroundModeUndefined: Self = StObject.set(x, "SurroundMode", js.undefined)
  }
}
