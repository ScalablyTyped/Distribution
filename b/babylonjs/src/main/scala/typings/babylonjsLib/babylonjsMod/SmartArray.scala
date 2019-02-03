package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an GC Friendly array where the backfield array do not shrink to prevent over allocations.
  */
@JSImport("babylonjs", "SmartArray")
@js.native
class SmartArray[T] protected ()
  extends babylonjsLib.BABYLONNs.SmartArray[T] {
  /**
    * Instantiates a Smart Array.
    * @param capacity defines the default capacity of the array.
    */
  def this(capacity: scala.Double) = this()
}

/* static members */
@JSImport("babylonjs", "SmartArray")
@js.native
object SmartArray extends js.Object {
  var _GlobalId: js.Any = js.native
}

