package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpusSettings extends js.Object {
  
  /**
    * Optional. Specify the average bitrate in bits per second. Valid values are multiples of 8000, from 32000 through 192000. The default value is 96000, which we recommend for quality and bandwidth.
    */
  var Bitrate: js.UndefOr[integerMin32000Max192000] = js.native
  
  /**
    * Specify the number of channels in this output audio track. Choosing Mono on the console gives you 1 output channel; choosing Stereo gives you 2. In the API, valid values are 1 and 2.
    */
  var Channels: js.UndefOr[integerMin1Max2] = js.native
  
  /**
    * Optional. Sample rate in hz. Valid values are 16000, 24000, and 48000. The default value is 48000.
    */
  var SampleRate: js.UndefOr[integerMin16000Max48000] = js.native
}
object OpusSettings {
  
  @scala.inline
  def apply(): OpusSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpusSettings]
  }
  
  @scala.inline
  implicit class OpusSettingsOps[Self <: OpusSettings] (val x: Self) extends AnyVal {
    
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
    def setBitrate(value: integerMin32000Max192000): Self = this.set("Bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitrate: Self = this.set("Bitrate", js.undefined)
    
    @scala.inline
    def setChannels(value: integerMin1Max2): Self = this.set("Channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannels: Self = this.set("Channels", js.undefined)
    
    @scala.inline
    def setSampleRate(value: integerMin16000Max48000): Self = this.set("SampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRate: Self = this.set("SampleRate", js.undefined)
  }
}
