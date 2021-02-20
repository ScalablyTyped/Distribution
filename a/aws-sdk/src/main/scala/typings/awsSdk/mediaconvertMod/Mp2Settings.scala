package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mp2Settings extends StObject {
  
  /**
    * Specify the average bitrate in bits per second.
    */
  var Bitrate: js.UndefOr[integerMin32000Max384000] = js.native
  
  /**
    * Set Channels to specify the number of channels in this output audio track. Choosing Mono in the console will give you 1 output channel; choosing Stereo will give you 2. In the API, valid values are 1 and 2.
    */
  var Channels: js.UndefOr[integerMin1Max2] = js.native
  
  /**
    * Sample rate in hz.
    */
  var SampleRate: js.UndefOr[integerMin32000Max48000] = js.native
}
object Mp2Settings {
  
  @scala.inline
  def apply(): Mp2Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mp2Settings]
  }
  
  @scala.inline
  implicit class Mp2SettingsMutableBuilder[Self <: Mp2Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitrate(value: integerMin32000Max384000): Self = StObject.set(x, "Bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrateUndefined: Self = StObject.set(x, "Bitrate", js.undefined)
    
    @scala.inline
    def setChannels(value: integerMin1Max2): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    @scala.inline
    def setSampleRate(value: integerMin32000Max48000): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
  }
}
