package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMin extends js.Object {
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
}

object AnonMin {
  @scala.inline
  def apply(max: Int | Double = null, min: Int | Double = null): AnonMin = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMin]
  }
}

