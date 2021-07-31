package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WavSettings extends StObject {
  
  /**
    * Bits per sample.
    */
  var BitDepth: js.UndefOr[double] = js.undefined
  
  /**
    * The audio coding mode for the WAV audio. The mode determines the number of channels in the audio.
    */
  var CodingMode: js.UndefOr[WavCodingMode] = js.undefined
  
  /**
    * Sample rate in Hz.
    */
  var SampleRate: js.UndefOr[double] = js.undefined
}
object WavSettings {
  
  @scala.inline
  def apply(): WavSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WavSettings]
  }
  
  @scala.inline
  implicit class WavSettingsMutableBuilder[Self <: WavSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitDepth(value: double): Self = StObject.set(x, "BitDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitDepthUndefined: Self = StObject.set(x, "BitDepth", js.undefined)
    
    @scala.inline
    def setCodingMode(value: WavCodingMode): Self = StObject.set(x, "CodingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodingModeUndefined: Self = StObject.set(x, "CodingMode", js.undefined)
    
    @scala.inline
    def setSampleRate(value: double): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
  }
}
