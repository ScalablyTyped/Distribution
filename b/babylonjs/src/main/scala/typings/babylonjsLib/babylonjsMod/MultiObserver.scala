package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represent a list of observers registered to multiple Observables object.
  */
@JSImport("babylonjs", "MultiObserver")
@js.native
class MultiObserver[T] ()
  extends babylonjsLib.BABYLONNs.MultiObserver[T]

/* static members */
@JSImport("babylonjs", "MultiObserver")
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
    observables: js.Array[babylonjsLib.BABYLONNs.Observable[T]],
    callback: js.Function2[/* eventData */ T, /* eventState */ babylonjsLib.BABYLONNs.EventState, scala.Unit]
  ): babylonjsLib.BABYLONNs.MultiObserver[T] = js.native
  def Watch[T](
    observables: js.Array[babylonjsLib.BABYLONNs.Observable[T]],
    callback: js.Function2[/* eventData */ T, /* eventState */ babylonjsLib.BABYLONNs.EventState, scala.Unit],
    mask: scala.Double
  ): babylonjsLib.BABYLONNs.MultiObserver[T] = js.native
  def Watch[T](
    observables: js.Array[babylonjsLib.BABYLONNs.Observable[T]],
    callback: js.Function2[/* eventData */ T, /* eventState */ babylonjsLib.BABYLONNs.EventState, scala.Unit],
    mask: scala.Double,
    scope: js.Any
  ): babylonjsLib.BABYLONNs.MultiObserver[T] = js.native
}

