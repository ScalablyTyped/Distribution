package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.FreeCameraDeviceOrientationInput")
@js.native
/**
  * Instantiates a new input
  * @see http://doc.babylonjs.com/how_to/customizing_camera_inputs
  */
class FreeCameraDeviceOrientationInput () extends ICameraInput[FreeCamera] {
  var _alpha: js.Any = js.native
  var _beta: js.Any = js.native
  var _camera: js.Any = js.native
  var _constantTranform: js.Any = js.native
  var _deviceOrientation: js.Any = js.native
  var _gamma: js.Any = js.native
  /**
    * @hidden
    */
  var _onDeviceOrientationChangedObservable: Observable[Unit] = js.native
  var _orientationChanged: js.Any = js.native
  var _screenOrientationAngle: js.Any = js.native
  var _screenQuaternion: js.Any = js.native
  /**
    * Define the camera controlled by the input.
    */
  @JSName("camera")
  def camera_MFreeCameraDeviceOrientationInput(): FreeCamera = js.native
  @JSName("camera")
  def camera_MFreeCameraDeviceOrientationInput(camera: FreeCamera): js.Any = js.native
  /**
    * Update the current camera state depending on the inputs that have been used this frame.
    * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
    */
  @JSName("checkInputs")
  def checkInputs_MFreeCameraDeviceOrientationInput(): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.FreeCameraDeviceOrientationInput")
@js.native
object FreeCameraDeviceOrientationInput extends js.Object {
  /**
    * Can be used to detect if a device orientation sensor is available on a device
    * @param timeout amount of time in milliseconds to wait for a response from the sensor (default: infinite)
    * @returns a promise that will resolve on orientation change
    */
  def WaitForOrientationChangeAsync(): js.Promise[_] = js.native
  def WaitForOrientationChangeAsync(timeout: Double): js.Promise[_] = js.native
}

