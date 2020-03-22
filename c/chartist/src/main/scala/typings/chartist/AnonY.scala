package typings.chartist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonY extends js.Object {
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object AnonY {
  @scala.inline
  def apply(x: Int | Double = null, y: Int | Double = null): AnonY = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonY]
  }
}

