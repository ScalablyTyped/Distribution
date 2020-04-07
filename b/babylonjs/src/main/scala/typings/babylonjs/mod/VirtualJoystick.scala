package typings.babylonjs.mod

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "VirtualJoystick")
@js.native
/**
  * Creates a new virtual joystick
  * @param leftJoystick defines that the joystick is for left hand (false by default)
  */
class VirtualJoystick ()
  extends typings.babylonjs.legacyMod.VirtualJoystick {
  def this(leftJoystick: Boolean) = this()
}

/* static members */
@JSImport("babylonjs", "VirtualJoystick")
@js.native
object VirtualJoystick extends js.Object {
  /**
    * Canvas the virtual joystick will render onto, default z-index of this is 5
    */
  var Canvas: Nullable[HTMLCanvasElement] = js.native
  var _globalJoystickIndex: js.Any = js.native
  var halfWidth: js.Any = js.native
  var vjCanvasContext: js.Any = js.native
  var vjCanvasHeight: js.Any = js.native
  var vjCanvasWidth: js.Any = js.native
}

