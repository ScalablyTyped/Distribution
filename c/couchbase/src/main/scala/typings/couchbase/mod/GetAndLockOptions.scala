package typings.couchbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAndLockOptions extends js.Object {
  var lockTime: js.UndefOr[Double] = js.undefined
}

object GetAndLockOptions {
  @scala.inline
  def apply(lockTime: js.UndefOr[Double] = js.undefined): GetAndLockOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lockTime)) __obj.updateDynamic("lockTime")(lockTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAndLockOptions]
  }
}

