package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanoramaLabelOptions extends js.Object {
  var altitude: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[Point] = js.undefined
}

object PanoramaLabelOptions {
  @scala.inline
  def apply(altitude: js.UndefOr[Double] = js.undefined, position: Point = null): PanoramaLabelOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaLabelOptions]
  }
}

