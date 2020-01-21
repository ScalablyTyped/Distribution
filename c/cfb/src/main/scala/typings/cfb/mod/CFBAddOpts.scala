package typings.cfb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CFBAddOpts extends js.Object {
  /** Skip existence and safety checks (best for bulk write operations) */
  var unsafe: js.UndefOr[Boolean] = js.undefined
}

object CFBAddOpts {
  @scala.inline
  def apply(unsafe: js.UndefOr[Boolean] = js.undefined): CFBAddOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(unsafe)) __obj.updateDynamic("unsafe")(unsafe.asInstanceOf[js.Any])
    __obj.asInstanceOf[CFBAddOpts]
  }
}

