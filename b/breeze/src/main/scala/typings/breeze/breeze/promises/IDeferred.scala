package typings.breeze.breeze.promises

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeferred[T] extends js.Object {
  var promise: js.Promise[T]
  def reject(reason: js.Any): Unit
  def resolve(value: T): Unit
}

object IDeferred {
  @scala.inline
  def apply[T](promise: js.Promise[T], reject: js.Any => Unit, resolve: T => Unit): IDeferred[T] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[IDeferred[T]]
  }
}

