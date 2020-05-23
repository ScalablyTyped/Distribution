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
  def apply(
    PostFilterSharpenStrength: js.UndefOr[integerMin0Max3] = js.undefined,
    Speed: js.UndefOr[integerMinNegative2Max3] = js.undefined,
    Strength: js.UndefOr[integerMin0Max16] = js.undefined
  ): NoiseReducerSpatialFilterSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(PostFilterSharpenStrength)) __obj.updateDynamic("PostFilterSharpenStrength")(PostFilterSharpenStrength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Speed)) __obj.updateDynamic("Speed")(Speed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Strength)) __obj.updateDynamic("Strength")(Strength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoiseReducerSpatialFilterSettings]
  }
}

