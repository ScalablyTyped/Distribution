package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): Eac3AtmosSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Eac3AtmosSettings]
  }
  
  @scala.inline
  implicit class Eac3AtmosSettingsOps[Self <: Eac3AtmosSettings] (val x: Self) extends AnyVal {
    
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
    def setBitrate(value: integerMin384000Max768000): Self = this.set("Bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitrate: Self = this.set("Bitrate", js.undefined)
    
    @scala.inline
    def setBitstreamMode(value: Eac3AtmosBitstreamMode): Self = this.set("BitstreamMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitstreamMode: Self = this.set("BitstreamMode", js.undefined)
    
    @scala.inline
    def setCodingMode(value: Eac3AtmosCodingMode): Self = this.set("CodingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodingMode: Self = this.set("CodingMode", js.undefined)
    
    @scala.inline
    def setDialogueIntelligence(value: Eac3AtmosDialogueIntelligence): Self = this.set("DialogueIntelligence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogueIntelligence: Self = this.set("DialogueIntelligence", js.undefined)
    
    @scala.inline
    def setDynamicRangeCompressionLine(value: Eac3AtmosDynamicRangeCompressionLine): Self = this.set("DynamicRangeCompressionLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicRangeCompressionLine: Self = this.set("DynamicRangeCompressionLine", js.undefined)
    
    @scala.inline
    def setDynamicRangeCompressionRf(value: Eac3AtmosDynamicRangeCompressionRf): Self = this.set("DynamicRangeCompressionRf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicRangeCompressionRf: Self = this.set("DynamicRangeCompressionRf", js.undefined)
    
    @scala.inline
    def setLoRoCenterMixLevel(value: doubleMinNegative6Max3): Self = this.set("LoRoCenterMixLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoRoCenterMixLevel: Self = this.set("LoRoCenterMixLevel", js.undefined)
    
    @scala.inline
    def setLoRoSurroundMixLevel(value: doubleMinNegative60MaxNegative1): Self = this.set("LoRoSurroundMixLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoRoSurroundMixLevel: Self = this.set("LoRoSurroundMixLevel", js.undefined)
    
    @scala.inline
    def setLtRtCenterMixLevel(value: doubleMinNegative6Max3): Self = this.set("LtRtCenterMixLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLtRtCenterMixLevel: Self = this.set("LtRtCenterMixLevel", js.undefined)
    
    @scala.inline
    def setLtRtSurroundMixLevel(value: doubleMinNegative60MaxNegative1): Self = this.set("LtRtSurroundMixLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLtRtSurroundMixLevel: Self = this.set("LtRtSurroundMixLevel", js.undefined)
    
    @scala.inline
    def setMeteringMode(value: Eac3AtmosMeteringMode): Self = this.set("MeteringMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeteringMode: Self = this.set("MeteringMode", js.undefined)
    
    @scala.inline
    def setSampleRate(value: integerMin48000Max48000): Self = this.set("SampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRate: Self = this.set("SampleRate", js.undefined)
    
    @scala.inline
    def setSpeechThreshold(value: integerMin1Max100): Self = this.set("SpeechThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeechThreshold: Self = this.set("SpeechThreshold", js.undefined)
    
    @scala.inline
    def setStereoDownmix(value: Eac3AtmosStereoDownmix): Self = this.set("StereoDownmix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStereoDownmix: Self = this.set("StereoDownmix", js.undefined)
    
    @scala.inline
    def setSurroundExMode(value: Eac3AtmosSurroundExMode): Self = this.set("SurroundExMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSurroundExMode: Self = this.set("SurroundExMode", js.undefined)
  }
}
