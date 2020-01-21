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
    PostFilterSharpenStrength: Int | Double = null,
    Speed: Int | Double = null,
    Strength: Int | Double = null
  ): NoiseReducerSpatialFilterSettings = {
    val __obj = js.Dynamic.literal()
    if (PostFilterSharpenStrength != null) __obj.updateDynamic("PostFilterSharpenStrength")(PostFilterSharpenStrength.asInstanceOf[js.Any])
    if (Speed != null) __obj.updateDynamic("Speed")(Speed.asInstanceOf[js.Any])
    if (Strength != null) __obj.updateDynamic("Strength")(Strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoiseReducerSpatialFilterSettings]
  }
}

