package typings.breeze.breeze.promises

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeferred[T] extends js.Object {
  var promise: js.Promise[T] = js.native
  def reject(reason: js.Any): Unit = js.native
  def resolve(value: T): Unit = js.native
}

object IDeferred {
  @scala.inline
  def apply[T](promise: js.Promise[T], reject: js.Any => Unit, resolve: T => Unit): IDeferred[T] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[IDeferred[T]]
  }
  @scala.inline
  implicit class IDeferredOps[Self <: IDeferred[_], T] (val x: Self with IDeferred[T]) extends AnyVal {
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
    def setPromise(value: js.Promise[T]): Self = this.set("promise", value.asInstanceOf[js.Any])
    @scala.inline
    def setReject(value: js.Any => Unit): Self = this.set("reject", js.Any.fromFunction1(value))
    @scala.inline
    def setResolve(value: T => Unit): Self = this.set("resolve", js.Any.fromFunction1(value))
  }
  
}

