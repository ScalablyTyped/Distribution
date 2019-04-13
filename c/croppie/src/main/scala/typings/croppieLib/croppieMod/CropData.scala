package typings
package croppieLib.croppieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropData extends js.Object {
  var orientation: js.UndefOr[scala.Double] = js.undefined
  var points: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

object CropData {
  @scala.inline
  def apply(
    orientation: scala.Int | scala.Double = null,
    points: js.Array[scala.Double] = null,
    zoom: scala.Int | scala.Double = null
  ): CropData = {
    val __obj = js.Dynamic.literal()
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropData]
  }
}

