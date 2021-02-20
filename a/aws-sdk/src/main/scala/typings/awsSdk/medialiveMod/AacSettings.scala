package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AacSettings extends StObject {
  
  /**
    * Average bitrate in bits/second. Valid values depend on rate control mode and profile.
    */
  var Bitrate: js.UndefOr[double] = js.native
  
  /**
    * Mono, Stereo, or 5.1 channel layout. Valid values depend on rate control mode and profile. The adReceiverMix setting receives a stereo description plus control track and emits a mono AAC encode of the description track, with control data emitted in the PES header as per ETSI TS 101 154 Annex E.
    */
  var CodingMode: js.UndefOr[AacCodingMode] = js.native
  
  /**
    * Set to "broadcasterMixedAd" when input contains pre-mixed main audio + AD (narration) as a stereo pair.  The Audio Type field (audioType) will be set to 3, which signals to downstream systems that this stream contains "broadcaster mixed AD". Note that the input received by the encoder must contain pre-mixed audio; the encoder does not perform the mixing. The values in audioTypeControl and audioType (in AudioDescription) are ignored when set to broadcasterMixedAd.
  Leave set to "normal" when input does not contain pre-mixed audio + AD.
    */
  var InputType: js.UndefOr[AacInputType] = js.native
  
  /**
    * AAC Profile.
    */
  var Profile: js.UndefOr[AacProfile] = js.native
  
  /**
    * Rate Control Mode.
    */
  var RateControlMode: js.UndefOr[AacRateControlMode] = js.native
  
  /**
    * Sets LATM / LOAS AAC output for raw containers.
    */
  var RawFormat: js.UndefOr[AacRawFormat] = js.native
  
  /**
    * Sample rate in Hz. Valid values depend on rate control mode and profile.
    */
  var SampleRate: js.UndefOr[double] = js.native
  
  /**
    * Use MPEG-2 AAC audio instead of MPEG-4 AAC audio for raw or MPEG-2 Transport Stream containers.
    */
  var Spec: js.UndefOr[AacSpec] = js.native
  
  /**
    * VBR Quality Level - Only used if rateControlMode is VBR.
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
  implicit class AacSettingsMutableBuilder[Self <: AacSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitrate(value: double): Self = StObject.set(x, "Bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrateUndefined: Self = StObject.set(x, "Bitrate", js.undefined)
    
    @scala.inline
    def setCodingMode(value: AacCodingMode): Self = StObject.set(x, "CodingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodingModeUndefined: Self = StObject.set(x, "CodingMode", js.undefined)
    
    @scala.inline
    def setInputType(value: AacInputType): Self = StObject.set(x, "InputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputTypeUndefined: Self = StObject.set(x, "InputType", js.undefined)
    
    @scala.inline
    def setProfile(value: AacProfile): Self = StObject.set(x, "Profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUndefined: Self = StObject.set(x, "Profile", js.undefined)
    
    @scala.inline
    def setRateControlMode(value: AacRateControlMode): Self = StObject.set(x, "RateControlMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateControlModeUndefined: Self = StObject.set(x, "RateControlMode", js.undefined)
    
    @scala.inline
    def setRawFormat(value: AacRawFormat): Self = StObject.set(x, "RawFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawFormatUndefined: Self = StObject.set(x, "RawFormat", js.undefined)
    
    @scala.inline
    def setSampleRate(value: double): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
    
    @scala.inline
    def setSpec(value: AacSpec): Self = StObject.set(x, "Spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecUndefined: Self = StObject.set(x, "Spec", js.undefined)
    
    @scala.inline
    def setVbrQuality(value: AacVbrQuality): Self = StObject.set(x, "VbrQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVbrQualityUndefined: Self = StObject.set(x, "VbrQuality", js.undefined)
  }
}
