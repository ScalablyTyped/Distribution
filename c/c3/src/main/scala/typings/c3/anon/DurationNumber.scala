package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurationNumber extends js.Object {
  /** Transition duration for expanding. */
  var duration: js.UndefOr[Double] = js.undefined
}

object DurationNumber {
  @scala.inline
  def apply(duration: js.UndefOr[Double] = js.undefined): DurationNumber = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationNumber]
  }
}

