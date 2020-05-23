package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  /**
    * Set duration of transition (in milliseconds) for chart animation.
    * Note: If `0` or `null` set, transition will be skipped. So, this makes initial rendering faster especially in case you have a lot of data.
    */
  var duration: js.UndefOr[Double | Null] = js.undefined
}

object Duration {
  @scala.inline
  def apply(duration: js.UndefOr[Null | Double] = js.undefined): Duration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

