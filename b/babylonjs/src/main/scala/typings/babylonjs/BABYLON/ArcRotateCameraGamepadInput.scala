package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ArcRotateCameraGamepadInput")
@js.native
class ArcRotateCameraGamepadInput () extends ICameraInput[ArcRotateCamera] {
  var _onGamepadConnectedObserver: js.Any = js.native
  var _onGamepadDisconnectedObserver: js.Any = js.native
  var _yAxisScale: js.Any = js.native
  /**
    * Defines the camera the input is attached to.
    */
  @JSName("camera")
  var camera_ArcRotateCameraGamepadInput: ArcRotateCamera = js.native
  /**
    * Defines the gamepad the input is gathering event from.
    */
  var gamepad: Nullable[Gamepad] = js.native
  /**
    * Defines the gamepad move sensiblity.
    * This is the threshold from when moving starts to be accounted for for to prevent jittering.
    */
  var gamepadMoveSensibility: Double = js.native
  /**
    * Defines the gamepad rotation sensiblity.
    * This is the threshold from when rotation starts to be accounted for to prevent jittering.
    */
  var gamepadRotationSensibility: Double = js.native
  /**
    * Update the current camera state depending on the inputs that have been used this frame.
    * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
    */
  @JSName("checkInputs")
  def checkInputs_MArcRotateCameraGamepadInput(): Unit = js.native
  /**
    * Gets or sets a boolean indicating that Yaxis (for right stick) should be inverted
    */
  def invertYAxis(): Boolean = js.native
  def invertYAxis(value: Boolean): js.Any = js.native
}

