package typings.blueimpLoadImage.mod

import typings.blueimpLoadImage.blueimpLoadImageBooleans.`false`
import typings.blueimpLoadImage.blueimpLoadImageBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.blueimpLoadImage.mod.CropTrueOptions
  - typings.blueimpLoadImage.mod.CropFalseOptions
*/
trait CropOptions extends js.Object

object CropOptions {
  @scala.inline
  def CropTrueOptions(aspectRatio: js.UndefOr[AspectRatio] = js.undefined, crop: `true` = null): CropOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aspectRatio)) __obj.updateDynamic("aspectRatio")(aspectRatio.get.asInstanceOf[js.Any])
    if (crop != null) __obj.updateDynamic("crop")(crop.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropOptions]
  }
  @scala.inline
  def CropFalseOptions(crop: `false` = null): CropOptions = {
    val __obj = js.Dynamic.literal()
    if (crop != null) __obj.updateDynamic("crop")(crop.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropOptions]
  }
}

