package typings.d3pie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPieDistance extends js.Object {
  var pieDistance: js.UndefOr[Double] = js.undefined
}

object AnonPieDistance {
  @scala.inline
  def apply(pieDistance: Int | Double = null): AnonPieDistance = {
    val __obj = js.Dynamic.literal()
    if (pieDistance != null) __obj.updateDynamic("pieDistance")(pieDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPieDistance]
  }
}

