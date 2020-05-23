package typings.bunyan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RingBufferOptions extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
}

object RingBufferOptions {
  @scala.inline
  def apply(limit: js.UndefOr[Double] = js.undefined): RingBufferOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RingBufferOptions]
  }
}

