package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The Observable class is a simple implementation of the Observable pattern.
     *
     * There's one slight particularity though: a given Observable can notify its observer using a particular mask value, only the Observers registered with this mask value will be notified.
     * This enable a more fine grained execution without having to rely on multiple different Observable objects.
     * For instance you may have a given Observable that have four different types of notifications: Move (mask = 0x01), Stop (mask = 0x02), Turn Right (mask = 0X04), Turn Left (mask = 0X08).
     * A given observer can register itself with only Move and Stop (mask = 0x03), then it will only be notified when one of these two occurs and will never be for Turn Left/Right.
     */
@JSImport("babylonjs", "Observable")
@js.native
class Observable[T] ()
  extends babylonjsLib.BABYLONNs.Observable[T] {
  /**
           * Creates a new observable
           * @param onObserverAdded defines a callback to call when a new observer is added
           */
  def this(onObserverAdded: js.Function1[/* observer */ babylonjsLib.BABYLONNs.Observer[T], scala.Unit]) = this()
}

