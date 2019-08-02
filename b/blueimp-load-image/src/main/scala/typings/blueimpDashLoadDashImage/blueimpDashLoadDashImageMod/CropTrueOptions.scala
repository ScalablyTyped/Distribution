package typings.blueimpDashLoadDashImage.blueimpDashLoadDashImageMod

import typings.blueimpDashLoadDashImage.blueimpDashLoadDashImageNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropTrueOptions extends js.Object {
  var aspectRatio: js.UndefOr[AspectRatio] = js.undefined
  var crop: js.UndefOr[`true`] = js.undefined
}

object CropTrueOptions {
  @scala.inline
  def apply(aspectRatio: js.UndefOr[AspectRatio] = js.undefined, crop: `true` = null): CropTrueOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aspectRatio)) __obj.updateDynamic("aspectRatio")(aspectRatio)
    if (crop != null) __obj.updateDynamic("crop")(crop)
    __obj.asInstanceOf[CropTrueOptions]
  }
}

