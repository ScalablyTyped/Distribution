package typings
package couchbaseLib.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAndLockOptions extends js.Object {
  var lockTime: js.UndefOr[scala.Double] = js.undefined
}

object GetAndLockOptions {
  @scala.inline
  def apply(lockTime: scala.Int | scala.Double = null): GetAndLockOptions = {
    val __obj = js.Dynamic.literal()
    if (lockTime != null) __obj.updateDynamic("lockTime")(lockTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAndLockOptions]
  }
}

