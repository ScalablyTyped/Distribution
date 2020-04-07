package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "DualShockPad")
@js.native
class DualShockPad protected ()
  extends typings.babylonjs.legacyMod.DualShockPad {
  /**
    * Creates a new DualShock gamepad object
    * @param id defines the id of this gamepad
    * @param index defines its index
    * @param gamepad defines the internal HTML gamepad object
    */
  def this(id: String, index: Double, gamepad: js.Any) = this()
}

