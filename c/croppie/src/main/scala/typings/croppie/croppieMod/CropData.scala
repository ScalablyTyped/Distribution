package typings.croppie.croppieMod

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
  def apply(orientation: Int | Double = null, points: js.Array[Double] = null, zoom: Int | Double = null): CropData = {
    val __obj = js.Dynamic.literal()
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropData]
  }
}

