package typings.croppie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Orientation extends js.Object {
  var orientation: js.UndefOr[Double] = js.undefined
  var points: js.UndefOr[js.Array[Double]] = js.undefined
  var url: String
  var useCanvas: js.UndefOr[Boolean] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
}

object Orientation {
  @scala.inline
  def apply(
    url: String,
    orientation: js.UndefOr[Double] = js.undefined,
    points: js.Array[Double] = null,
    useCanvas: js.UndefOr[Boolean] = js.undefined,
    zoom: js.UndefOr[Double] = js.undefined
  ): Orientation = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(orientation)) __obj.updateDynamic("orientation")(orientation.get.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (!js.isUndefined(useCanvas)) __obj.updateDynamic("useCanvas")(useCanvas.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Orientation]
  }
}

