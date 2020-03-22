package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonR extends js.Object {
  /**
    * The radius size of each point on selected.
    */
  var r: js.UndefOr[Double] = js.undefined
}

object AnonR {
  @scala.inline
  def apply(r: Int | Double = null): AnonR = {
    val __obj = js.Dynamic.literal()
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonR]
  }
}

