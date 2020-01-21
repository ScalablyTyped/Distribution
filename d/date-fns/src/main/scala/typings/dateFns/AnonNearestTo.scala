package typings.dateFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNearestTo extends js.Object {
  var nearestTo: js.UndefOr[Double] = js.undefined
}

object AnonNearestTo {
  @scala.inline
  def apply(nearestTo: Int | Double = null): AnonNearestTo = {
    val __obj = js.Dynamic.literal()
    if (nearestTo != null) __obj.updateDynamic("nearestTo")(nearestTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNearestTo]
  }
}

