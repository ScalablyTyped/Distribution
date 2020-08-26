package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoPreprocessor extends js.Object {
  /**
    * Enable the Color corrector (ColorCorrector) feature if necessary. Enable or disable this feature for each output individually. This setting is disabled by default.
    */
  var ColorCorrector: js.UndefOr[typings.awsSdk.mediaconvertMod.ColorCorrector] = js.native
  /**
    * Use Deinterlacer (Deinterlacer) to produce smoother motion and a clearer picture.
    */
  var Deinterlacer: js.UndefOr[typings.awsSdk.mediaconvertMod.Deinterlacer] = js.native
  /**
    * Enable Dolby Vision feature to produce Dolby Vision compatible video output.
    */
  var DolbyVision: js.UndefOr[typings.awsSdk.mediaconvertMod.DolbyVision] = js.native
  /**
    * Enable the Image inserter (ImageInserter) feature to include a graphic overlay on your video. Enable or disable this feature for each output individually. This setting is disabled by default.
    */
  var ImageInserter: js.UndefOr[typings.awsSdk.mediaconvertMod.ImageInserter] = js.native
  /**
    * Enable the Noise reducer (NoiseReducer) feature to remove noise from your video output if necessary. Enable or disable this feature for each output individually. This setting is disabled by default.
    */
  var NoiseReducer: js.UndefOr[typings.awsSdk.mediaconvertMod.NoiseReducer] = js.native
  /**
    * If you work with a third party video watermarking partner, use the group of settings that correspond with your watermarking partner to include watermarks in your output.
    */
  var PartnerWatermarking: js.UndefOr[typings.awsSdk.mediaconvertMod.PartnerWatermarking] = js.native
  /**
    * Timecode burn-in (TimecodeBurnIn)--Burns the output timecode and specified prefix into the output.
    */
  var TimecodeBurnin: js.UndefOr[typings.awsSdk.mediaconvertMod.TimecodeBurnin] = js.native
}

object VideoPreprocessor {
  @scala.inline
  def apply(): VideoPreprocessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoPreprocessor]
  }
  @scala.inline
  implicit class VideoPreprocessorOps[Self <: VideoPreprocessor] (val x: Self) extends AnyVal {
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
    def setColorCorrector(value: ColorCorrector): Self = this.set("ColorCorrector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorCorrector: Self = this.set("ColorCorrector", js.undefined)
    @scala.inline
    def setDeinterlacer(value: Deinterlacer): Self = this.set("Deinterlacer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeinterlacer: Self = this.set("Deinterlacer", js.undefined)
    @scala.inline
    def setDolbyVision(value: DolbyVision): Self = this.set("DolbyVision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDolbyVision: Self = this.set("DolbyVision", js.undefined)
    @scala.inline
    def setImageInserter(value: ImageInserter): Self = this.set("ImageInserter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageInserter: Self = this.set("ImageInserter", js.undefined)
    @scala.inline
    def setNoiseReducer(value: NoiseReducer): Self = this.set("NoiseReducer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoiseReducer: Self = this.set("NoiseReducer", js.undefined)
    @scala.inline
    def setPartnerWatermarking(value: PartnerWatermarking): Self = this.set("PartnerWatermarking", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartnerWatermarking: Self = this.set("PartnerWatermarking", js.undefined)
    @scala.inline
    def setTimecodeBurnin(value: TimecodeBurnin): Self = this.set("TimecodeBurnin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimecodeBurnin: Self = this.set("TimecodeBurnin", js.undefined)
  }
  
}

