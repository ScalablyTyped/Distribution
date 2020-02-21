package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSpacing extends js.Object {
  var spacing: js.UndefOr[js.Object] = js.undefined
}

object AnonSpacing {
  @scala.inline
  def apply(spacing: js.Object = null): AnonSpacing = {
    val __obj = js.Dynamic.literal()
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSpacing]
  }
}

