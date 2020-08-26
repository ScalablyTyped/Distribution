package typings.axios.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelToken extends js.Object {
  var promise: js.Promise[Cancel] = js.native
  var reason: js.UndefOr[Cancel] = js.native
  def throwIfRequested(): Unit = js.native
}

object CancelToken {
  @scala.inline
  def apply(promise: js.Promise[Cancel], throwIfRequested: () => Unit): CancelToken = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], throwIfRequested = js.Any.fromFunction0(throwIfRequested))
    __obj.asInstanceOf[CancelToken]
  }
  @scala.inline
  implicit class CancelTokenOps[Self <: CancelToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPromise(value: js.Promise[Cancel]): Self = this.set("promise", value.asInstanceOf[js.Any])
    @scala.inline
    def setThrowIfRequested(value: () => Unit): Self = this.set("throwIfRequested", js.Any.fromFunction0(value))
    @scala.inline
    def setReason(value: Cancel): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
  
}

