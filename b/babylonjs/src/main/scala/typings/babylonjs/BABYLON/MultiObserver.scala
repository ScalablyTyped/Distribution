package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.MultiObserver")
@js.native
class MultiObserver[T] () extends js.Object {
  var _observables: js.Any = js.native
  var _observers: js.Any = js.native
  /**
    * Release associated resources
    */
  def dispose(): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.MultiObserver")
@js.native
object MultiObserver extends js.Object {
  /**
    * Raise a callback when one of the observable will notify
    * @param observables defines a list of observables to watch
    * @param callback defines the callback to call on notification
    * @param mask defines the mask used to filter notifications
    * @param scope defines the current scope used to restore the JS context
    * @returns the new MultiObserver
    */
  def Watch[T](
    observables: js.Array[Observable[T]],
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit]
  ): MultiObserver[T] = js.native
  def Watch[T](
    observables: js.Array[Observable[T]],
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: Double
  ): MultiObserver[T] = js.native
  def Watch[T](
    observables: js.Array[Observable[T]],
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: Double,
    scope: js.Any
  ): MultiObserver[T] = js.native
}

