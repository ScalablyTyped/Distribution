package typings.blueimpLoadImage.mod

import typings.blueimpLoadImage.blueimpLoadImageBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Setting 'aspectRatio' automatically enables 'crop', so setting 'crop' to
// 'false' in that case is not valid
trait CropTrueOptions extends CropOptions {
  var aspectRatio: js.UndefOr[AspectRatio] = js.undefined
  var crop: js.UndefOr[`true`] = js.undefined
}

object CropTrueOptions {
  @scala.inline
  def apply(aspectRatio: js.UndefOr[AspectRatio] = js.undefined, crop: `true` = null): CropTrueOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aspectRatio)) __obj.updateDynamic("aspectRatio")(aspectRatio.get.asInstanceOf[js.Any])
    if (crop != null) __obj.updateDynamic("crop")(crop.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropTrueOptions]
  }
}

