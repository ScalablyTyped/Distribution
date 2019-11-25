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
  def apply(aspectRatio: Int | Double = null, crop: `true` = null): CropTrueOptions = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (crop != null) __obj.updateDynamic("crop")(crop.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropTrueOptions]
  }
}

