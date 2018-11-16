package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to define virtual joystick (used in touch mode)
     */
@JSImport("babylonjs", "VirtualJoystick")
@js.native
class VirtualJoystick ()
  extends babylonjsLib.BABYLONNs.VirtualJoystick {
  /**
           * Creates a new virtual joystick
           * @param leftJoystick defines that the joystick is for left hand (false by default)
           */
  def this(leftJoystick: scala.Boolean) = this()
}

/**
     * Class used to define virtual joystick (used in touch mode)
     */
@JSImport("babylonjs", "VirtualJoystick")
@js.native
object VirtualJoystick extends js.Object {
  var _globalJoystickIndex: js.Any = js.native
  var halfWidth: js.Any = js.native
  var vjCanvas: js.Any = js.native
  var vjCanvasContext: js.Any = js.native
  var vjCanvasHeight: js.Any = js.native
  var vjCanvasWidth: js.Any = js.native
}

