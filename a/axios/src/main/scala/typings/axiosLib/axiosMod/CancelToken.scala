package typings
package axiosLib.axiosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelToken extends js.Object {
  var promise: js.Promise[Cancel]
  var reason: js.UndefOr[Cancel] = js.undefined
  def throwIfRequested(): scala.Unit
}

object CancelToken {
  @scala.inline
  def apply(promise: js.Promise[Cancel], throwIfRequested: () => scala.Unit, reason: Cancel = null): CancelToken = {
    val __obj = js.Dynamic.literal(promise = promise, throwIfRequested = js.Any.fromFunction0(throwIfRequested))
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[CancelToken]
  }
}

