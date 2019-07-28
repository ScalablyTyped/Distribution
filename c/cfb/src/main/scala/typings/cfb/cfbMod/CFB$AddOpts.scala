package typings.cfb.cfbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CFB$AddOpts extends js.Object {
  /** Skip existence and safety checks (best for bulk write operations) */
  var unsafe: js.UndefOr[Boolean] = js.undefined
}

object CFB$AddOpts {
  @scala.inline
  def apply(unsafe: js.UndefOr[Boolean] = js.undefined): CFB$AddOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(unsafe)) __obj.updateDynamic("unsafe")(unsafe)
    __obj.asInstanceOf[CFB$AddOpts]
  }
}

