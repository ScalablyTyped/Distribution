package typings.croppie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Orientation extends js.Object {
  var orientation: js.UndefOr[Double] = js.undefined
  var points: js.UndefOr[js.Array[Double]] = js.undefined
  var url: String
  var useCanvas: js.UndefOr[Boolean] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
}

object Anon_Orientation {
  @scala.inline
  def apply(
    url: String,
    orientation: Int | Double = null,
    points: js.Array[Double] = null,
    useCanvas: js.UndefOr[Boolean] = js.undefined,
    zoom: Int | Double = null
  ): Anon_Orientation = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (!js.isUndefined(useCanvas)) __obj.updateDynamic("useCanvas")(useCanvas.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Orientation]
  }
}

