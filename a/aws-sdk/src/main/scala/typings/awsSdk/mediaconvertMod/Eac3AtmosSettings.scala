package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Eac3AtmosSettings extends StObject {
  
  /**
    * Specify the average bitrate in bits per second.
  Valid values: 384k, 448k, 640k, 768k
    */
  var Bitrate: js.UndefOr[integerMin384000Max768000] = js.undefined
  
  /**
    * Specify the bitstream mode for the E-AC-3 stream that the encoder emits. For more information about the EAC3 bitstream mode, see ATSC A/52-2012 (Annex E).
    */
  var BitstreamMode: js.UndefOr[Eac3AtmosBitstreamMode] = js.undefined
  
  /**
    * The coding mode for Dolby Digital Plus JOC (Atmos) is always 9.1.6 (CODING_MODE_9_1_6).
    */
  var CodingMode: js.UndefOr[Eac3AtmosCodingMode] = js.undefined
  
  /**
    * Enable Dolby Dialogue Intelligence to adjust loudness based on dialogue analysis.
    */
  var DialogueIntelligence: js.UndefOr[Eac3AtmosDialogueIntelligence] = js.undefined
  
  /**
    * Specify the absolute peak level for a signal with dynamic range compression.
    */
  var DynamicRangeCompressionLine: js.UndefOr[Eac3AtmosDynamicRangeCompressionLine] = js.undefined
  
  /**
    * Specify how the service limits the audio dynamic range when compressing the audio.
    */
  var DynamicRangeCompressionRf: js.UndefOr[Eac3AtmosDynamicRangeCompressionRf] = js.undefined
  
  /**
    * Specify a value for the following Dolby Atmos setting: Left only/Right only center mix
  (Lo/Ro center). MediaConvert uses this value for downmixing. How the service uses this
  value depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix).
  Valid values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0.
    */
  var LoRoCenterMixLevel: js.UndefOr[doubleMinNegative6Max3] = js.undefined
  
  /**
    * Specify a value for the following Dolby Atmos setting: Left only/Right only (Lo/Ro surround). MediaConvert uses this value for downmixing. How the service uses this value depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Valid values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel.
    */
  var LoRoSurroundMixLevel: js.UndefOr[doubleMinNegative60MaxNegative1] = js.undefined
  
  /**
    * Specify a value for the following Dolby Atmos setting: Left total/Right total center mix (Lt/Rt center). MediaConvert uses this value for downmixing. How the service uses this value depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Valid values: 3.0, 1.5, 0.0, -1.5, -3.0, -4.5, and -6.0.
    */
  var LtRtCenterMixLevel: js.UndefOr[doubleMinNegative6Max3] = js.undefined
  
  /**
    * Specify a value for the following Dolby Atmos setting: Left total/Right total surround mix (Lt/Rt surround). MediaConvert uses this value for downmixing. How the service uses this value depends on the value that you choose for Stereo downmix (Eac3AtmosStereoDownmix). Valid values: -1.5, -3.0, -4.5, -6.0, and -60. The value -60 mutes the channel.
    */
  var LtRtSurroundMixLevel: js.UndefOr[doubleMinNegative60MaxNegative1] = js.undefined
  
  /**
    * Choose how the service meters the loudness of your audio.
    */
  var MeteringMode: js.UndefOr[Eac3AtmosMeteringMode] = js.undefined
  
  /**
    * This value is always 48000. It represents the sample rate in Hz.
    */
  var SampleRate: js.UndefOr[integerMin48000Max48000] = js.undefined
  
  /**
    * Specify the percentage of audio content that must be speech before the encoder uses the measured speech loudness as the overall program loudness.
    */
  var SpeechThreshold: js.UndefOr[integerMin1Max100] = js.undefined
  
  /**
    * Choose how the service does stereo downmixing.
    */
  var StereoDownmix: js.UndefOr[Eac3AtmosStereoDownmix] = js.undefined
  
  /**
    * Specify whether your input audio has an additional center rear surround channel matrix encoded into your left and right surround channels.
    */
  var SurroundExMode: js.UndefOr[Eac3AtmosSurroundExMode] = js.undefined
}
object Eac3AtmosSettings {
  
  @scala.inline
  def apply(): Eac3AtmosSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Eac3AtmosSettings]
  }
  
  @scala.inline
  implicit class Eac3AtmosSettingsMutableBuilder[Self <: Eac3AtmosSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitrate(value: integerMin384000Max768000): Self = StObject.set(x, "Bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrateUndefined: Self = StObject.set(x, "Bitrate", js.undefined)
    
    @scala.inline
    def setBitstreamMode(value: Eac3AtmosBitstreamMode): Self = StObject.set(x, "BitstreamMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitstreamModeUndefined: Self = StObject.set(x, "BitstreamMode", js.undefined)
    
    @scala.inline
    def setCodingMode(value: Eac3AtmosCodingMode): Self = StObject.set(x, "CodingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodingModeUndefined: Self = StObject.set(x, "CodingMode", js.undefined)
    
    @scala.inline
    def setDialogueIntelligence(value: Eac3AtmosDialogueIntelligence): Self = StObject.set(x, "DialogueIntelligence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogueIntelligenceUndefined: Self = StObject.set(x, "DialogueIntelligence", js.undefined)
    
    @scala.inline
    def setDynamicRangeCompressionLine(value: Eac3AtmosDynamicRangeCompressionLine): Self = StObject.set(x, "DynamicRangeCompressionLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRangeCompressionLineUndefined: Self = StObject.set(x, "DynamicRangeCompressionLine", js.undefined)
    
    @scala.inline
    def setDynamicRangeCompressionRf(value: Eac3AtmosDynamicRangeCompressionRf): Self = StObject.set(x, "DynamicRangeCompressionRf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRangeCompressionRfUndefined: Self = StObject.set(x, "DynamicRangeCompressionRf", js.undefined)
    
    @scala.inline
    def setLoRoCenterMixLevel(value: doubleMinNegative6Max3): Self = StObject.set(x, "LoRoCenterMixLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoRoCenterMixLevelUndefined: Self = StObject.set(x, "LoRoCenterMixLevel", js.undefined)
    
    @scala.inline
    def setLoRoSurroundMixLevel(value: doubleMinNegative60MaxNegative1): Self = StObject.set(x, "LoRoSurroundMixLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoRoSurroundMixLevelUndefined: Self = StObject.set(x, "LoRoSurroundMixLevel", js.undefined)
    
    @scala.inline
    def setLtRtCenterMixLevel(value: doubleMinNegative6Max3): Self = StObject.set(x, "LtRtCenterMixLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLtRtCenterMixLevelUndefined: Self = StObject.set(x, "LtRtCenterMixLevel", js.undefined)
    
    @scala.inline
    def setLtRtSurroundMixLevel(value: doubleMinNegative60MaxNegative1): Self = StObject.set(x, "LtRtSurroundMixLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLtRtSurroundMixLevelUndefined: Self = StObject.set(x, "LtRtSurroundMixLevel", js.undefined)
    
    @scala.inline
    def setMeteringMode(value: Eac3AtmosMeteringMode): Self = StObject.set(x, "MeteringMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeteringModeUndefined: Self = StObject.set(x, "MeteringMode", js.undefined)
    
    @scala.inline
    def setSampleRate(value: integerMin48000Max48000): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
    
    @scala.inline
    def setSpeechThreshold(value: integerMin1Max100): Self = StObject.set(x, "SpeechThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechThresholdUndefined: Self = StObject.set(x, "SpeechThreshold", js.undefined)
    
    @scala.inline
    def setStereoDownmix(value: Eac3AtmosStereoDownmix): Self = StObject.set(x, "StereoDownmix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStereoDownmixUndefined: Self = StObject.set(x, "StereoDownmix", js.undefined)
    
    @scala.inline
    def setSurroundExMode(value: Eac3AtmosSurroundExMode): Self = StObject.set(x, "SurroundExMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurroundExModeUndefined: Self = StObject.set(x, "SurroundExMode", js.undefined)
  }
}
