package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoiseReducerSpatialFilterSettings extends js.Object {
  /**
    * Specify strength of post noise reduction sharpening filter, with 0 disabling the filter and 3 enabling it at maximum strength.
    */
  var PostFilterSharpenStrength: js.UndefOr[integerMin0Max3] = js.native
  /**
    * The speed of the filter, from -2 (lower speed) to 3 (higher speed), with 0 being the nominal value.
    */
  var Speed: js.UndefOr[integerMinNegative2Max3] = js.native
  /**
    * Relative strength of noise reducing filter. Higher values produce stronger filtering.
    */
  var Strength: js.UndefOr[integerMin0Max16] = js.native
}

object NoiseReducerSpatialFilterSettings {
  @scala.inline
  def apply(): NoiseReducerSpatialFilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoiseReducerSpatialFilterSettings]
  }
  @scala.inline
  implicit class NoiseReducerSpatialFilterSettingsOps[Self <: NoiseReducerSpatialFilterSettings] (val x: Self) extends AnyVal {
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
    def setPostFilterSharpenStrength(value: integerMin0Max3): Self = this.set("PostFilterSharpenStrength", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostFilterSharpenStrength: Self = this.set("PostFilterSharpenStrength", js.undefined)
    @scala.inline
    def setSpeed(value: integerMinNegative2Max3): Self = this.set("Speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("Speed", js.undefined)
    @scala.inline
    def setStrength(value: integerMin0Max16): Self = this.set("Strength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrength: Self = this.set("Strength", js.undefined)
  }
  
}

