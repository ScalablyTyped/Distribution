package typings.babylonjs.gamepadsIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Gamepads/index", "Xbox360Pad")
@js.native
class Xbox360Pad protected ()
  extends typings.babylonjs.xboxGamepadMod.Xbox360Pad {
  /**
    * Creates a new XBox360 gamepad object
    * @param id defines the id of this gamepad
    * @param index defines its index
    * @param gamepad defines the internal HTML gamepad object
    * @param xboxOne defines if it is a XBox One gamepad
    */
  def this(id: String, index: Double, gamepad: js.Any) = this()
  def this(id: String, index: Double, gamepad: js.Any, xboxOne: Boolean) = this()
}

