package typings.babylonjs.miscIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Misc/index", "SmartArray")
@js.native
class SmartArray[T] protected ()
  extends typings.babylonjs.smartArrayMod.SmartArray[T] {
  /**
    * Instantiates a Smart Array.
    * @param capacity defines the default capacity of the array.
    */
  def this(capacity: Double) = this()
}

/* static members */
@JSImport("babylonjs/Misc/index", "SmartArray")
@js.native
object SmartArray extends js.Object {
  var _GlobalId: js.Any = js.native
}

