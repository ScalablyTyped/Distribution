package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Manage the mouse inputs to control the movement of a free camera.
     * @see http://doc.babylonjs.com/how_to/customizing_camera_inputs
     */
@JSGlobal("BABYLON.FreeCameraMouseInput")
@js.native
class FreeCameraMouseInput () extends ICameraInput[FreeCamera] {
  /**
           * Manage the mouse inputs to control the movement of a free camera.
           * @see http://doc.babylonjs.com/how_to/customizing_camera_inputs
           * @param touchEnabled Defines if touch is enabled or not
           */
  def this(/**
           * Define if touch is enabled in the mouse input
           */
  touchEnabled: scala.Boolean) = this()
  var _observer: js.Any = js.native
  var _onMouseMove: js.Any = js.native
  var _pointerInput: js.Any = js.native
  /**
           * Defines the pointer angular sensibility  along the X and Y axis or how fast is the camera rotating.
           */
  var angularSensibility: scala.Double = js.native
  /**
           * Defines the buttons associated with the input to handle camera move.
           */
  var buttons: js.Array[scala.Double] = js.native
  /**
           * Defines the camera the input is attached to.
           */
  @JSName("camera")
  var camera_FreeCameraMouseInput: FreeCamera = js.native
  var previousPosition: js.Any = js.native
  /**
           * Define if touch is enabled in the mouse input
           */
  var touchEnabled: scala.Boolean = js.native
}

