package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Manage the keyboard inputs to control the movement of an arc rotate camera.
  * @see http://doc.babylonjs.com/how_to/customizing_camera_inputs
  */
@JSGlobal("BABYLON.ArcRotateCameraKeyboardMoveInput")
@js.native
class ArcRotateCameraKeyboardMoveInput () extends ICameraInput[ArcRotateCamera] {
  var _altPressed: js.Any = js.native
  var _ctrlPressed: js.Any = js.native
  var _engine: js.Any = js.native
  var _keys: js.Any = js.native
  var _onCanvasBlurObserver: js.Any = js.native
  var _onKeyboardObserver: js.Any = js.native
  var _scene: js.Any = js.native
  /**
    * Rotation speed of the camera
    */
  var angularSpeed: scala.Double = js.native
  /**
    * Defines the camera the input is attached to.
    */
  @JSName("camera")
  var camera_ArcRotateCameraKeyboardMoveInput: ArcRotateCamera = js.native
  /**
    * Defines the list of key codes associated with the down action (decrease alpha)
    */
  var keysDown: js.Array[scala.Double] = js.native
  /**
    * Defines the list of key codes associated with the left action (increase beta)
    */
  var keysLeft: js.Array[scala.Double] = js.native
  /**
    * Defines the list of key codes associated with the reset action.
    * Those keys reset the camera to its last stored state (with the method camera.storeState())
    */
  var keysReset: js.Array[scala.Double] = js.native
  /**
    * Defines the list of key codes associated with the right action (decrease beta)
    */
  var keysRight: js.Array[scala.Double] = js.native
  /**
    * Defines the list of key codes associated with the up action (increase alpha)
    */
  var keysUp: js.Array[scala.Double] = js.native
  /**
    * Defines the panning sensibility of the inputs.
    * (How fast is the camera paning)
    */
  var panningSensibility: scala.Double = js.native
  /**
    * Defines wether maintaining the alt key down switch the movement mode from
    * orientation to zoom.
    */
  var useAltToZoom: scala.Boolean = js.native
  /**
    * Defines the zooming sensibility of the inputs.
    * (How fast is the camera zooming)
    */
  var zoomingSensibility: scala.Double = js.native
  /**
    * Update the current camera state depending on the inputs that have been used this frame.
    * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
    */
  @JSName("checkInputs")
  def checkInputs_MArcRotateCameraKeyboardMoveInput(): scala.Unit = js.native
}

