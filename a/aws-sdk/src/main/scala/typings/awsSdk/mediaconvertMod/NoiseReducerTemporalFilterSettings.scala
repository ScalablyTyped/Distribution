package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoiseReducerTemporalFilterSettings extends js.Object {
  
  /**
    * Use Aggressive mode for content that has complex motion. Higher values produce stronger temporal filtering. This filters highly complex scenes more aggressively and creates better VQ for low bitrate outputs.
    */
  var AggressiveMode: js.UndefOr[integerMin0Max4] = js.native
  
  /**
    * Optional. When you set Noise reducer (noiseReducer) to Temporal (TEMPORAL), you can use this setting to apply sharpening. The default behavior, Auto (AUTO), allows the transcoder to determine whether to apply filtering, depending on input type and quality. When you set Noise reducer to Temporal, your output bandwidth is reduced. When Post temporal sharpening is also enabled, that bandwidth reduction is smaller.
    */
  var PostTemporalSharpening: js.UndefOr[NoiseFilterPostTemporalSharpening] = js.native
  
  /**
    * The speed of the filter (higher number is faster). Low setting reduces bit rate at the cost of transcode time, high setting improves transcode time at the cost of bit rate.
    */
  var Speed: js.UndefOr[integerMinNegative1Max3] = js.native
  
  /**
    * Specify the strength of the noise reducing filter on this output. Higher values produce stronger filtering. We recommend the following value ranges, depending on the result that you want: * 0-2 for complexity reduction with minimal sharpness loss * 2-8 for complexity reduction with image preservation * 8-16 for a high level of complexity reduction
    */
  var Strength: js.UndefOr[integerMin0Max16] = js.native
}
object NoiseReducerTemporalFilterSettings {
  
  @scala.inline
  def apply(): NoiseReducerTemporalFilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoiseReducerTemporalFilterSettings]
  }
  
  @scala.inline
  implicit class NoiseReducerTemporalFilterSettingsOps[Self <: NoiseReducerTemporalFilterSettings] (val x: Self) extends AnyVal {
    
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
    def setAggressiveMode(value: integerMin0Max4): Self = this.set("AggressiveMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggressiveMode: Self = this.set("AggressiveMode", js.undefined)
    
    @scala.inline
    def setPostTemporalSharpening(value: NoiseFilterPostTemporalSharpening): Self = this.set("PostTemporalSharpening", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostTemporalSharpening: Self = this.set("PostTemporalSharpening", js.undefined)
    
    @scala.inline
    def setSpeed(value: integerMinNegative1Max3): Self = this.set("Speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeed: Self = this.set("Speed", js.undefined)
    
    @scala.inline
    def setStrength(value: integerMin0Max16): Self = this.set("Strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrength: Self = this.set("Strength", js.undefined)
  }
}
