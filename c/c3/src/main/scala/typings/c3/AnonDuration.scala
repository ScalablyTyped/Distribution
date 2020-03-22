package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDuration extends js.Object {
  /**
    * Set duration of transition (in milliseconds) for chart animation.
    * Note: If `0` or `null` set, transition will be skipped. So, this makes initial rendering faster especially in case you have a lot of data.
    */
  var duration: js.UndefOr[Double | Null] = js.undefined
}

object AnonDuration {
  @scala.inline
  def apply(duration: Int | Double = null): AnonDuration = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDuration]
  }
}

