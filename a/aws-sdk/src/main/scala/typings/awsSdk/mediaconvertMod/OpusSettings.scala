package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpusSettings extends StObject {
  
  /**
    * Optional. Specify the average bitrate in bits per second. Valid values are multiples of 8000, from 32000 through 192000. The default value is 96000, which we recommend for quality and bandwidth.
    */
  var Bitrate: js.UndefOr[integerMin32000Max192000] = js.undefined
  
  /**
    * Specify the number of channels in this output audio track. Choosing Mono on the console gives you 1 output channel; choosing Stereo gives you 2. In the API, valid values are 1 and 2.
    */
  var Channels: js.UndefOr[integerMin1Max2] = js.undefined
  
  /**
    * Optional. Sample rate in hz. Valid values are 16000, 24000, and 48000. The default value is 48000.
    */
  var SampleRate: js.UndefOr[integerMin16000Max48000] = js.undefined
}
object OpusSettings {
  
  @scala.inline
  def apply(): OpusSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpusSettings]
  }
  
  @scala.inline
  implicit class OpusSettingsMutableBuilder[Self <: OpusSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitrate(value: integerMin32000Max192000): Self = StObject.set(x, "Bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrateUndefined: Self = StObject.set(x, "Bitrate", js.undefined)
    
    @scala.inline
    def setChannels(value: integerMin1Max2): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    @scala.inline
    def setSampleRate(value: integerMin16000Max48000): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
  }
}
