package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMinWidth extends js.Object {
  /**
    * Defaults to `5`.
    */
  var minWidth: js.UndefOr[Double] = js.undefined
}

object AnonMinWidth {
  @scala.inline
  def apply(minWidth: Int | Double = null): AnonMinWidth = {
    val __obj = js.Dynamic.literal()
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMinWidth]
  }
}

