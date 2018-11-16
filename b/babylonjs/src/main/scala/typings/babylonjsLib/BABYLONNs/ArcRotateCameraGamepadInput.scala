package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Manage the gamepad inputs to control an arc rotate camera.
     * @see http://doc.babylonjs.com/how_to/customizing_camera_inputs
     */
@JSGlobal("BABYLON.ArcRotateCameraGamepadInput")
@js.native
class ArcRotateCameraGamepadInput () extends ICameraInput[ArcRotateCamera] {
  var _onGamepadConnectedObserver: js.Any = js.native
  var _onGamepadDisconnectedObserver: js.Any = js.native
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
  var gamepadMoveSensibility: scala.Double = js.native
  /**
           * Defines the gamepad rotation sensiblity.
           * This is the threshold from when rotation starts to be accounted for to prevent jittering.
           */
  var gamepadRotationSensibility: scala.Double = js.native
  /**
           * Update the current camera state depending on the inputs that have been used this frame.
           * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
           */
  @JSName("checkInputs")
  def checkInputs_MArcRotateCameraGamepadInput(): scala.Unit = js.native
}

