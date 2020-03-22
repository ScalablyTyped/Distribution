package typings.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSpacingObject extends js.Object {
  var spacing: js.UndefOr[js.Object] = js.undefined
}

object AnonSpacingObject {
  @scala.inline
  def apply(spacing: js.Object = null): AnonSpacingObject = {
    val __obj = js.Dynamic.literal()
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSpacingObject]
  }
}

