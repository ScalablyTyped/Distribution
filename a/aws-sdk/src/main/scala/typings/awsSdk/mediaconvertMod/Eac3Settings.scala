package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Eac3Settings extends js.Object {
  /**
    * If set to ATTENUATE_3_DB, applies a 3 dB attenuation to the surround channels. Only used for 3/2 coding mode.
    */
  var AttenuationControl: js.UndefOr[Eac3AttenuationControl] = js.native
  /**
    * Specify the average bitrate in bits per second. Valid bitrates depend on the coding mode.
    */
  var Bitrate: js.UndefOr[integerMin64000Max640000] = js.native
  /**
    * Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
    */
  var BitstreamMode: js.UndefOr[Eac3BitstreamMode] = js.native
  /**
    * Dolby Digital Plus coding mode. Determines number of channels.
    */
  var CodingMode: js.UndefOr[Eac3CodingMode] = js.native
  /**
    * Activates a DC highpass filter for all input channels.
    */
  var DcFilter: js.UndefOr[Eac3DcFilter] = js.native
  /**
    * Sets the dialnorm for the output. If blank and input audio is Dolby Digital Plus, dialnorm will be passed through.
    */
  var Dialnorm: js.UndefOr[integerMin1Max31] = js.native
  /**
    * Specify the absolute peak level for a signal with dynamic range compression.
    */
  var DynamicRangeCompressionLine: js.UndefOr[Eac3DynamicRangeCompressionLine] = js.native
  /**
    * Specify how the service limits the audio dynamic range when compressing the audio.
    */
  var DynamicRangeCompressionRf: js.UndefOr[Eac3DynamicRangeCompressionRf] = js.native
  /**
    * When encoding 3/2 audio, controls whether the LFE channel is enabled
    */
  var LfeControl: js.UndefOr[Eac3LfeControl] = js.native
  /**
    * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
    */
  var LfeFilter: js.UndefOr[Eac3LfeFilter] = js.native
  /**
    * Specify a value for the following Dolby Digital Plus setting: Left only/Right only center mix (Lo/Ro center). MediaConvert uses this value for downmixing. How the service uses this value depends on the value that you choose for Stereo downmix (Eac3StereoDownmix). Valid values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel. This setting applies only if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you choose a different value for Coding mode, the service ignores Left only/Right only center (loRoCenterMixLevel).
    */
  var LoRoCenterMixLevel: js.UndefOr[doubleMinNegative60Max3] = js.native
  /**
    * Specify a value for the following Dolby Digital Plus setting: Left only/Right only (Lo/Ro surround). MediaConvert uses this value for downmixing. How the service uses this value depends on the value that you choose for Stereo downmix (Eac3StereoDownmix). Valid values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel. This setting applies only if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you choose a different value for Coding mode, the service ignores Left only/Right only surround (loRoSurroundMixLevel).
    */
  var LoRoSurroundMixLevel: js.UndefOr[doubleMinNegative60MaxNegative1] = js.native
  /**
    * Specify a value for the following Dolby Digital Plus setting: Left total/Right total center mix (Lt/Rt center). MediaConvert uses this value for downmixing. How the service uses this value depends on the value that you choose for Stereo downmix (Eac3StereoDownmix). Valid values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel. This setting applies only if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you choose a different value for Coding mode, the service ignores Left total/Right total center (ltRtCenterMixLevel).
    */
  var LtRtCenterMixLevel: js.UndefOr[doubleMinNegative60Max3] = js.native
  /**
    * Specify a value for the following Dolby Digital Plus setting: Left total/Right total surround mix (Lt/Rt surround). MediaConvert uses this value for downmixing. How the service uses this value depends on the value that you choose for Stereo downmix (Eac3StereoDownmix). Valid values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel. This setting applies only if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you choose a different value for Coding mode, the service ignores Left total/Right total surround (ltRtSurroundMixLevel).
    */
  var LtRtSurroundMixLevel: js.UndefOr[doubleMinNegative60MaxNegative1] = js.native
  /**
    * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
    */
  var MetadataControl: js.UndefOr[Eac3MetadataControl] = js.native
  /**
    * When set to WHEN_POSSIBLE, input DD+ audio will be passed through if it is present on the input. this detection is dynamic over the life of the transcode. Inputs that alternate between DD+ and non-DD+ content will have a consistent DD+ output as the system alternates between passthrough and encoding.
    */
  var PassthroughControl: js.UndefOr[Eac3PassthroughControl] = js.native
  /**
    * Controls the amount of phase-shift applied to the surround channels. Only used for 3/2 coding mode.
    */
  var PhaseControl: js.UndefOr[Eac3PhaseControl] = js.native
  /**
    * This value is always 48000. It represents the sample rate in Hz.
    */
  var SampleRate: js.UndefOr[integerMin48000Max48000] = js.native
  /**
    * Choose how the service does stereo downmixing. This setting only applies if you keep the default value of 3/2 - L, R, C, Ls, Rs (CODING_MODE_3_2) for the setting Coding mode (Eac3CodingMode). If you choose a different value for Coding mode, the service ignores Stereo downmix (Eac3StereoDownmix).
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
  def apply(
    AttenuationControl: Eac3AttenuationControl = null,
    Bitrate: js.UndefOr[integerMin64000Max640000] = js.undefined,
    BitstreamMode: Eac3BitstreamMode = null,
    CodingMode: Eac3CodingMode = null,
    DcFilter: Eac3DcFilter = null,
    Dialnorm: js.UndefOr[integerMin1Max31] = js.undefined,
    DynamicRangeCompressionLine: Eac3DynamicRangeCompressionLine = null,
    DynamicRangeCompressionRf: Eac3DynamicRangeCompressionRf = null,
    LfeControl: Eac3LfeControl = null,
    LfeFilter: Eac3LfeFilter = null,
    LoRoCenterMixLevel: js.UndefOr[doubleMinNegative60Max3] = js.undefined,
    LoRoSurroundMixLevel: js.UndefOr[doubleMinNegative60MaxNegative1] = js.undefined,
    LtRtCenterMixLevel: js.UndefOr[doubleMinNegative60Max3] = js.undefined,
    LtRtSurroundMixLevel: js.UndefOr[doubleMinNegative60MaxNegative1] = js.undefined,
    MetadataControl: Eac3MetadataControl = null,
    PassthroughControl: Eac3PassthroughControl = null,
    PhaseControl: Eac3PhaseControl = null,
    SampleRate: js.UndefOr[integerMin48000Max48000] = js.undefined,
    StereoDownmix: Eac3StereoDownmix = null,
    SurroundExMode: Eac3SurroundExMode = null,
    SurroundMode: Eac3SurroundMode = null
  ): Eac3Settings = {
    val __obj = js.Dynamic.literal()
    if (AttenuationControl != null) __obj.updateDynamic("AttenuationControl")(AttenuationControl.asInstanceOf[js.Any])
    if (!js.isUndefined(Bitrate)) __obj.updateDynamic("Bitrate")(Bitrate.get.asInstanceOf[js.Any])
    if (BitstreamMode != null) __obj.updateDynamic("BitstreamMode")(BitstreamMode.asInstanceOf[js.Any])
    if (CodingMode != null) __obj.updateDynamic("CodingMode")(CodingMode.asInstanceOf[js.Any])
    if (DcFilter != null) __obj.updateDynamic("DcFilter")(DcFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(Dialnorm)) __obj.updateDynamic("Dialnorm")(Dialnorm.get.asInstanceOf[js.Any])
    if (DynamicRangeCompressionLine != null) __obj.updateDynamic("DynamicRangeCompressionLine")(DynamicRangeCompressionLine.asInstanceOf[js.Any])
    if (DynamicRangeCompressionRf != null) __obj.updateDynamic("DynamicRangeCompressionRf")(DynamicRangeCompressionRf.asInstanceOf[js.Any])
    if (LfeControl != null) __obj.updateDynamic("LfeControl")(LfeControl.asInstanceOf[js.Any])
    if (LfeFilter != null) __obj.updateDynamic("LfeFilter")(LfeFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(LoRoCenterMixLevel)) __obj.updateDynamic("LoRoCenterMixLevel")(LoRoCenterMixLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(LoRoSurroundMixLevel)) __obj.updateDynamic("LoRoSurroundMixLevel")(LoRoSurroundMixLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(LtRtCenterMixLevel)) __obj.updateDynamic("LtRtCenterMixLevel")(LtRtCenterMixLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(LtRtSurroundMixLevel)) __obj.updateDynamic("LtRtSurroundMixLevel")(LtRtSurroundMixLevel.get.asInstanceOf[js.Any])
    if (MetadataControl != null) __obj.updateDynamic("MetadataControl")(MetadataControl.asInstanceOf[js.Any])
    if (PassthroughControl != null) __obj.updateDynamic("PassthroughControl")(PassthroughControl.asInstanceOf[js.Any])
    if (PhaseControl != null) __obj.updateDynamic("PhaseControl")(PhaseControl.asInstanceOf[js.Any])
    if (!js.isUndefined(SampleRate)) __obj.updateDynamic("SampleRate")(SampleRate.get.asInstanceOf[js.Any])
    if (StereoDownmix != null) __obj.updateDynamic("StereoDownmix")(StereoDownmix.asInstanceOf[js.Any])
    if (SurroundExMode != null) __obj.updateDynamic("SurroundExMode")(SurroundExMode.asInstanceOf[js.Any])
    if (SurroundMode != null) __obj.updateDynamic("SurroundMode")(SurroundMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eac3Settings]
  }
}

