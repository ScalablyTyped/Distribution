package typings.croppie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrientation extends js.Object {
  var orientation: js.UndefOr[Double] = js.undefined
  var points: js.UndefOr[js.Array[Double]] = js.undefined
  var url: String
  var useCanvas: js.UndefOr[Boolean] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
}

object AnonOrientation {
  @scala.inline
  def apply(
    url: String,
    orientation: Int | Double = null,
    points: js.Array[Double] = null,
    useCanvas: js.UndefOr[Boolean] = js.undefined,
    zoom: Int | Double = null
  ): AnonOrientation = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (!js.isUndefined(useCanvas)) __obj.updateDynamic("useCanvas")(useCanvas.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOrientation]
  }
}

