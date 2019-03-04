package typings
package croppieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Orientation extends js.Object {
  var orientation: js.UndefOr[scala.Double] = js.undefined
  var points: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var url: java.lang.String
  var useCanvas: js.UndefOr[scala.Boolean] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Orientation {
  @scala.inline
  def apply(
    url: java.lang.String,
    orientation: scala.Int | scala.Double = null,
    points: js.Array[scala.Double] = null,
    useCanvas: js.UndefOr[scala.Boolean] = js.undefined,
    zoom: scala.Int | scala.Double = null
  ): Anon_Orientation = {
    val __obj = js.Dynamic.literal(url = url)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points)
    if (!js.isUndefined(useCanvas)) __obj.updateDynamic("useCanvas")(useCanvas)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Orientation]
  }
}

