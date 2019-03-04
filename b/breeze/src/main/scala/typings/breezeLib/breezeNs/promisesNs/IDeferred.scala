package typings
package breezeLib.breezeNs.promisesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeferred[T] extends js.Object {
  var promise: js.Promise[T]
  def reject(reason: js.Any): scala.Unit
  def resolve(value: T): scala.Unit
}

object IDeferred {
  @scala.inline
  def apply[T](
    promise: js.Promise[T],
    reject: js.Function1[js.Any, scala.Unit],
    resolve: js.Function1[T, scala.Unit]
  ): IDeferred[T] = {
    val __obj = js.Dynamic.literal(promise = promise, reject = reject, resolve = resolve)
  
    __obj.asInstanceOf[IDeferred[T]]
  }
}

