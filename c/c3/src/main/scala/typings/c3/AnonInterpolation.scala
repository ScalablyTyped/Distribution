package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInterpolation extends js.Object {
  var interpolation: js.UndefOr[AnonType] = js.undefined
}

object AnonInterpolation {
  @scala.inline
  def apply(interpolation: AnonType = null): AnonInterpolation = {
    val __obj = js.Dynamic.literal()
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInterpolation]
  }
}

