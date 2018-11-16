package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Manage the keyboard inputs to control the movement of a free camera.
     * @see http://doc.babylonjs.com/how_to/customizing_camera_inputs
     */
@JSGlobal("BABYLON.FreeCameraKeyboardMoveInput")
@js.native
class FreeCameraKeyboardMoveInput () extends ICameraInput[FreeCamera] {
  var _engine: js.Any = js.native
  var _keys: js.Any = js.native
  var _onCanvasBlurObserver: js.Any = js.native
  var _onKeyboardObserver: js.Any = js.native
  var _scene: js.Any = js.native
  /**
           * Defines the camera the input is attached to.
           */
  @JSName("camera")
  var camera_FreeCameraKeyboardMoveInput: FreeCamera = js.native
  /**
           * Gets or Set the list of keyboard keys used to control the backward move of the camera.
           */
  var keysDown: js.Array[scala.Double] = js.native
  /**
           * Gets or Set the list of keyboard keys used to control the left strafe move of the camera.
           */
  var keysLeft: js.Array[scala.Double] = js.native
  /**
           * Gets or Set the list of keyboard keys used to control the right strafe move of the camera.
           */
  var keysRight: js.Array[scala.Double] = js.native
  /**
           * Gets or Set the list of keyboard keys used to control the forward move of the camera.
           */
  var keysUp: js.Array[scala.Double] = js.native
  /** @hidden */
  def _onLostFocus(e: stdLib.FocusEvent): scala.Unit = js.native
  /**
           * Update the current camera state depending on the inputs that have been used this frame.
           * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
           */
  @JSName("checkInputs")
  def checkInputs_MFreeCameraKeyboardMoveInput(): scala.Unit = js.native
}

