package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDurationNumber extends js.Object {
  /** Transition duration for expanding. */
  var duration: js.UndefOr[Double] = js.undefined
}

object AnonDurationNumber {
  @scala.inline
  def apply(duration: Int | Double = null): AnonDurationNumber = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDurationNumber]
  }
}

