package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  /** @hidden */
  var _willBeUnregistered: Boolean
  /**
    * Defines the mask of the observer (used to filter notifications)
    */
  var mask: Double
  /**
    * Defines the current scope used to restore the JS context
    */
  var scope: js.Any
  /**
    * Gets or sets a property defining that the observer as to be unregistered after the next notification
    */
  var unregisterOnNextCall: Boolean
  /**
    * Defines the callback to call when the observer is notified
    */
  def callback(eventData: T, eventState: EventState): Unit
}

object Observer {
  @scala.inline
  def apply[T](
    _willBeUnregistered: Boolean,
    callback: (T, EventState) => Unit,
    mask: Double,
    scope: js.Any,
    unregisterOnNextCall: Boolean
  ): Observer[T] = {
    val __obj = js.Dynamic.literal(_willBeUnregistered = _willBeUnregistered.asInstanceOf[js.Any], callback = js.Any.fromFunction2(callback), mask = mask.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], unregisterOnNextCall = unregisterOnNextCall.asInstanceOf[js.Any])
    __obj.asInstanceOf[Observer[T]]
  }
}

