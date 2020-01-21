package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Eac3AtmosSettings extends js.Object {
  /**
    * Specify the average bitrate in bits per second.
  Valid values: 384k, 448k, 640k, 768k
    */
  var Bitrate: js.UndefOr[integerMin384000Max768000] = js.native
  /**
    * Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
    */
  var BitstreamMode: js.UndefOr[Eac3AtmosBitstreamMode] = js.native
  /**
    * The coding mode for Dolby Digital Plus JOC (Atmos) is always 9.1.6 (CODING_MODE_9_1_6).
    */
  var CodingMode: js.UndefOr[Eac3AtmosCodingMode] = js.native
  /**
    * Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue analysis.
    */
  var DialogueIntelligence: js.UndefOr[Eac3AtmosDialogueIntelligence] = js.native
  /**
    * Specify the absolute peak level for a signal with dynamic range compression.
    */
  var DynamicRangeCompressionLine: js.UndefOr[Eac3AtmosDynamicRangeCompressionLine] = js.native
  /**
    * Specify how the service limits the audio dynamic range when compressing the audio.
    */
  var DynamicRangeCompressionRf: js.UndefOr[Eac3AtmosDynamicRangeCompressionRf] = js.native
  /**
    * Specify a value for the following Dolby Atmos setting: Left only/Right only center mix
  (Lo/Ro center). MediaConvert uses this value for downmixing. How the service uses this
  value depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix).
  Valid values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0.
    */
  var LoRoCenterMixLevel: js.UndefOr[doubleMinNegative6Max3] = js.native
  /**
    * Specify a value for the following Dolby Atmos setting: Left only/Right only (Lo/Ro surround). MediaConvert uses this value for downmixing. How the service uses this value depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Valid values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel.
    */
  var LoRoSurroundMixLevel: js.UndefOr[doubleMinNegative60MaxNegative1] = js.native
  /**
    * Specify a value for the following Dolby Atmos setting: Left total/Right total center mix (Lt/Rt center). MediaConvert uses this value for downmixing. How the service uses this value depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Valid values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0.
    */
  var LtRtCenterMixLevel: js.UndefOr[doubleMinNegative6Max3] = js.native
  /**
    * Specify a value for the following Dolby Atmos setting: Left total/Right total surround mix (Lt/Rt surround). MediaConvert uses this value for downmixing. How the service uses this value depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Valid values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel.
    */
  var LtRtSurroundMixLevel: js.UndefOr[doubleMinNegative60MaxNegative1] = js.native
  /**
    * Choose how the service meters the loudness of your audio.
    */
  var MeteringMode: js.UndefOr[Eac3AtmosMeteringMode] = js.native
  /**
    * This value is always 48000. It represents the sample rate in Hz.
    */
  var SampleRate: js.UndefOr[integerMin48000Max48000] = js.native
  /**
    * Specify the percentage of audio content that must be speech before the encoder uses the measured speech loudness as the overall program loudness.
    */
  var SpeechThreshold: js.UndefOr[integerMin1Max100] = js.native
  /**
    * Choose how the service does stereo downmixing.
    */
  var StereoDownmix: js.UndefOr[Eac3AtmosStereoDownmix] = js.native
  /**
    * Specify whether your input audio has an additional center rear surround channel matrix encoded into your left and right surround channels.
    */
  var SurroundExMode: js.UndefOr[Eac3AtmosSurroundExMode] = js.native
}

object Eac3AtmosSettings {
  @scala.inline
  def apply(
    Bitrate: Int | Double = null,
    BitstreamMode: Eac3AtmosBitstreamMode = null,
    CodingMode: Eac3AtmosCodingMode = null,
    DialogueIntelligence: Eac3AtmosDialogueIntelligence = null,
    DynamicRangeCompressionLine: Eac3AtmosDynamicRangeCompressionLine = null,
    DynamicRangeCompressionRf: Eac3AtmosDynamicRangeCompressionRf = null,
    LoRoCenterMixLevel: Int | Double = null,
    LoRoSurroundMixLevel: Int | Double = null,
    LtRtCenterMixLevel: Int | Double = null,
    LtRtSurroundMixLevel: Int | Double = null,
    MeteringMode: Eac3AtmosMeteringMode = null,
    SampleRate: Int | Double = null,
    SpeechThreshold: Int | Double = null,
    StereoDownmix: Eac3AtmosStereoDownmix = null,
    SurroundExMode: Eac3AtmosSurroundExMode = null
  ): Eac3AtmosSettings = {
    val __obj = js.Dynamic.literal()
    if (Bitrate != null) __obj.updateDynamic("Bitrate")(Bitrate.asInstanceOf[js.Any])
    if (BitstreamMode != null) __obj.updateDynamic("BitstreamMode")(BitstreamMode.asInstanceOf[js.Any])
    if (CodingMode != null) __obj.updateDynamic("CodingMode")(CodingMode.asInstanceOf[js.Any])
    if (DialogueIntelligence != null) __obj.updateDynamic("DialogueIntelligence")(DialogueIntelligence.asInstanceOf[js.Any])
    if (DynamicRangeCompressionLine != null) __obj.updateDynamic("DynamicRangeCompressionLine")(DynamicRangeCompressionLine.asInstanceOf[js.Any])
    if (DynamicRangeCompressionRf != null) __obj.updateDynamic("DynamicRangeCompressionRf")(DynamicRangeCompressionRf.asInstanceOf[js.Any])
    if (LoRoCenterMixLevel != null) __obj.updateDynamic("LoRoCenterMixLevel")(LoRoCenterMixLevel.asInstanceOf[js.Any])
    if (LoRoSurroundMixLevel != null) __obj.updateDynamic("LoRoSurroundMixLevel")(LoRoSurroundMixLevel.asInstanceOf[js.Any])
    if (LtRtCenterMixLevel != null) __obj.updateDynamic("LtRtCenterMixLevel")(LtRtCenterMixLevel.asInstanceOf[js.Any])
    if (LtRtSurroundMixLevel != null) __obj.updateDynamic("LtRtSurroundMixLevel")(LtRtSurroundMixLevel.asInstanceOf[js.Any])
    if (MeteringMode != null) __obj.updateDynamic("MeteringMode")(MeteringMode.asInstanceOf[js.Any])
    if (SampleRate != null) __obj.updateDynamic("SampleRate")(SampleRate.asInstanceOf[js.Any])
    if (SpeechThreshold != null) __obj.updateDynamic("SpeechThreshold")(SpeechThreshold.asInstanceOf[js.Any])
    if (StereoDownmix != null) __obj.updateDynamic("StereoDownmix")(StereoDownmix.asInstanceOf[js.Any])
    if (SurroundExMode != null) __obj.updateDynamic("SurroundExMode")(SurroundExMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eac3AtmosSettings]
  }
}

