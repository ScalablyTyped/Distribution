package typings.croppie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropData extends js.Object {
  var orientation: js.UndefOr[Double] = js.undefined
  var points: js.UndefOr[js.Array[Double]] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
}

object CropData {
  @scala.inline
  def apply(
    orientation: js.UndefOr[Double] = js.undefined,
    points: js.Array[Double] = null,
    zoom: js.UndefOr[Double] = js.undefined
  ): CropData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(orientation)) __obj.updateDynamic("orientation")(orientation.get.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropData]
  }
}

