package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deferred[T] extends js.Object {
  var _reject: js.Any
  var _resolve: js.Any
  /**
    * The promise associated with this deferred object.
    */
  val promise: js.Promise[T]
  /**
    * The reject method of the promise associated with this deferred object.
    */
  def reject: js.Function1[/* reason */ js.UndefOr[js.Any], Unit]
  /**
    * The resolve method of the promise associated with this deferred object.
    */
  def resolve: js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit]
}

object Deferred {
  @scala.inline
  def apply[T](
    _reject: js.Any,
    _resolve: js.Any,
    promise: js.Promise[T],
    reject: () => js.Function1[/* reason */ js.UndefOr[js.Any], Unit],
    resolve: () => js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit]
  ): Deferred[T] = {
    val __obj = js.Dynamic.literal(_reject = _reject.asInstanceOf[js.Any], _resolve = _resolve.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], reject = js.Any.fromFunction0(reject), resolve = js.Any.fromFunction0(resolve))
    __obj.asInstanceOf[Deferred[T]]
  }
}

