package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanoramaLabelOptions extends js.Object {
  var altitude: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[Point] = js.undefined
}

object PanoramaLabelOptions {
  @scala.inline
  def apply(altitude: scala.Int | scala.Double = null, position: Point = null): PanoramaLabelOptions = {
    val __obj = js.Dynamic.literal()
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[PanoramaLabelOptions]
  }
}

