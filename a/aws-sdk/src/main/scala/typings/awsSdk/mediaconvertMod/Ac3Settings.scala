package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ac3Settings extends StObject {
  
  /**
    * Specify the average bitrate in bits per second. Valid bitrates depend on the coding mode.
    */
  var Bitrate: js.UndefOr[integerMin64000Max640000] = js.native
  
  /**
    * Specify the bitstream mode for the AC-3 stream that the encoder emits. For more information about the AC3 bitstream mode, see ATSC A/52-2012 (Annex E).
    */
  var BitstreamMode: js.UndefOr[Ac3BitstreamMode] = js.native
  
  /**
    * Dolby Digital coding mode. Determines number of channels.
    */
  var CodingMode: js.UndefOr[Ac3CodingMode] = js.native
  
  /**
    * Sets the dialnorm for the output. If blank and input audio is Dolby Digital, dialnorm will be passed through.
    */
  var Dialnorm: js.UndefOr[integerMin1Max31] = js.native
  
  /**
    * If set to FILM_STANDARD, adds dynamic range compression signaling to the output bitstream as defined in the Dolby Digital specification.
    */
  var DynamicRangeCompressionProfile: js.UndefOr[Ac3DynamicRangeCompressionProfile] = js.native
  
  /**
    * Applies a 120Hz lowpass filter to the LFE channel prior to encoding. Only valid with 3_2_LFE coding mode.
    */
  var LfeFilter: js.UndefOr[Ac3LfeFilter] = js.native
  
  /**
    * When set to FOLLOW_INPUT, encoder metadata will be sourced from the DD, DD+, or DolbyE decoder that supplied this audio data. If audio was not supplied from one of these streams, then the static metadata settings will be used.
    */
  var MetadataControl: js.UndefOr[Ac3MetadataControl] = js.native
  
  /**
    * This value is always 48000. It represents the sample rate in Hz.
    */
  var SampleRate: js.UndefOr[integerMin48000Max48000] = js.native
}
object Ac3Settings {
  
  @scala.inline
  def apply(): Ac3Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ac3Settings]
  }
  
  @scala.inline
  implicit class Ac3SettingsMutableBuilder[Self <: Ac3Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitrate(value: integerMin64000Max640000): Self = StObject.set(x, "Bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrateUndefined: Self = StObject.set(x, "Bitrate", js.undefined)
    
    @scala.inline
    def setBitstreamMode(value: Ac3BitstreamMode): Self = StObject.set(x, "BitstreamMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitstreamModeUndefined: Self = StObject.set(x, "BitstreamMode", js.undefined)
    
    @scala.inline
    def setCodingMode(value: Ac3CodingMode): Self = StObject.set(x, "CodingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodingModeUndefined: Self = StObject.set(x, "CodingMode", js.undefined)
    
    @scala.inline
    def setDialnorm(value: integerMin1Max31): Self = StObject.set(x, "Dialnorm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialnormUndefined: Self = StObject.set(x, "Dialnorm", js.undefined)
    
    @scala.inline
    def setDynamicRangeCompressionProfile(value: Ac3DynamicRangeCompressionProfile): Self = StObject.set(x, "DynamicRangeCompressionProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRangeCompressionProfileUndefined: Self = StObject.set(x, "DynamicRangeCompressionProfile", js.undefined)
    
    @scala.inline
    def setLfeFilter(value: Ac3LfeFilter): Self = StObject.set(x, "LfeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLfeFilterUndefined: Self = StObject.set(x, "LfeFilter", js.undefined)
    
    @scala.inline
    def setMetadataControl(value: Ac3MetadataControl): Self = StObject.set(x, "MetadataControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataControlUndefined: Self = StObject.set(x, "MetadataControl", js.undefined)
    
    @scala.inline
    def setSampleRate(value: integerMin48000Max48000): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
  }
}
