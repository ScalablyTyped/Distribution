package typings.blueimpDashLoadDashImage.blueimpDashLoadDashImageMod

import typings.blueimpDashLoadDashImage.blueimpDashLoadDashImageBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropFalseOptions extends CropOptions {
  var crop: js.UndefOr[`false`] = js.undefined
}

object CropFalseOptions {
  @scala.inline
  def apply(crop: `false` = null): CropFalseOptions = {
    val __obj = js.Dynamic.literal()
    if (crop != null) __obj.updateDynamic("crop")(crop.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropFalseOptions]
  }
}

