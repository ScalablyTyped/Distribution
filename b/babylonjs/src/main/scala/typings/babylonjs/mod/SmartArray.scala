package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "SmartArray")
@js.native
class SmartArray[T] protected ()
  extends typings.babylonjs.legacyMod.SmartArray[T] {
  /**
    * Instantiates a Smart Array.
    * @param capacity defines the default capacity of the array.
    */
  def this(capacity: Double) = this()
}

/* static members */
@JSImport("babylonjs", "SmartArray")
@js.native
object SmartArray extends js.Object {
  var _GlobalId: js.Any = js.native
}

