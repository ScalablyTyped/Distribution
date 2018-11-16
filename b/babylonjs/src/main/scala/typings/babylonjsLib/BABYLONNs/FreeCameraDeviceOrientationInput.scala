package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Takes information about the orientation of the device as reported by the deviceorientation event to orient the camera.
     * Screen rotation is taken into account.
     * @see http://doc.babylonjs.com/how_to/customizing_camera_inputs
     */
@JSGlobal("BABYLON.FreeCameraDeviceOrientationInput")
@js.native
class FreeCameraDeviceOrientationInput () extends ICameraInput[FreeCamera] {
  var _alpha: js.Any = js.native
  var _beta: js.Any = js.native
  var _camera: js.Any = js.native
  var _constantTranform: js.Any = js.native
  var _deviceOrientation: js.Any = js.native
  var _gamma: js.Any = js.native
  var _orientationChanged: js.Any = js.native
  var _screenOrientationAngle: js.Any = js.native
  var _screenQuaternion: js.Any = js.native
  /**
           * Define the camera controlled by the input.
           */
  @JSName("camera")
  var camera_FreeCameraDeviceOrientationInput: FreeCamera = js.native
  /**
           * Update the current camera state depending on the inputs that have been used this frame.
           * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
           */
  @JSName("checkInputs")
  def checkInputs_MFreeCameraDeviceOrientationInput(): scala.Unit = js.native
}

