package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Manage the gamepad inputs to control a free camera.
  * @see http://doc.babylonjs.com/how_to/customizing_camera_inputs
  */
@JSGlobal("BABYLON.FreeCameraGamepadInput")
@js.native
class FreeCameraGamepadInput () extends ICameraInput[FreeCamera] {
  var _cameraTransform: js.Any = js.native
  var _deltaTransform: js.Any = js.native
  var _onGamepadConnectedObserver: js.Any = js.native
  var _onGamepadDisconnectedObserver: js.Any = js.native
  var _vector2: js.Any = js.native
  var _vector3: js.Any = js.native
  /**
    * Define the camera the input is attached to.
    */
  @JSName("camera")
  var camera_FreeCameraGamepadInput: FreeCamera = js.native
  /**
    * Define the Gamepad controlling the input
    */
  var gamepad: Nullable[Gamepad] = js.native
  /**
    * Defines the gamepad rotation sensiblity.
    * This is the threshold from when rotation starts to be accounted for to prevent jittering.
    */
  var gamepadAngularSensibility: scala.Double = js.native
  /**
    * Defines the gamepad move sensiblity.
    * This is the threshold from when moving starts to be accounted for for to prevent jittering.
    */
  var gamepadMoveSensibility: scala.Double = js.native
  /**
    * Update the current camera state depending on the inputs that have been used this frame.
    * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
    */
  @JSName("checkInputs")
  def checkInputs_MFreeCameraGamepadInput(): scala.Unit = js.native
}

