package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WavSettings extends js.Object {
  
  /**
    * Bits per sample.
    */
  var BitDepth: js.UndefOr[double] = js.native
  
  /**
    * The audio coding mode for the WAV audio. The mode determines the number of channels in the audio.
    */
  var CodingMode: js.UndefOr[WavCodingMode] = js.native
  
  /**
    * Sample rate in Hz.
    */
  var SampleRate: js.UndefOr[double] = js.native
}
object WavSettings {
  
  @scala.inline
  def apply(): WavSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WavSettings]
  }
  
  @scala.inline
  implicit class WavSettingsOps[Self <: WavSettings] (val x: Self) extends AnyVal {
    
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
    def setBitDepth(value: double): Self = this.set("BitDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitDepth: Self = this.set("BitDepth", js.undefined)
    
    @scala.inline
    def setCodingMode(value: WavCodingMode): Self = this.set("CodingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodingMode: Self = this.set("CodingMode", js.undefined)
    
    @scala.inline
    def setSampleRate(value: double): Self = this.set("SampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRate: Self = this.set("SampleRate", js.undefined)
  }
}
