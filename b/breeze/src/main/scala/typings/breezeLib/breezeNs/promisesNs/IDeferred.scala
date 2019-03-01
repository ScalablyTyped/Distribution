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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("promise")(promise)
    __obj.updateDynamic("reject")(reject)
    __obj.updateDynamic("resolve")(resolve)
    __obj.asInstanceOf[IDeferred[T]]
  }
}

