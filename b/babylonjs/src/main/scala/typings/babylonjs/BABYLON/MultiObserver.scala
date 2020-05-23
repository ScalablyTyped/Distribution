package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiObserver[T] extends js.Object {
  var _observables: js.Any
  var _observers: js.Any
  /**
    * Release associated resources
    */
  def dispose(): Unit
}

object MultiObserver {
  @scala.inline
  def apply[T](_observables: js.Any, _observers: js.Any, dispose: () => Unit): MultiObserver[T] = {
    val __obj = js.Dynamic.literal(_observables = _observables.asInstanceOf[js.Any], _observers = _observers.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[MultiObserver[T]]
  }
}

