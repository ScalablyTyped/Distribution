package typings.bunyan.bunyanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RingBufferOptions extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
}

object RingBufferOptions {
  @scala.inline
  def apply(limit: Int | Double = null): RingBufferOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[RingBufferOptions]
  }
}

