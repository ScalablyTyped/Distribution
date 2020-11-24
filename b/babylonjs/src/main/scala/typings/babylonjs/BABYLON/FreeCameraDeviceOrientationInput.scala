package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreeCameraDeviceOrientationInput extends ICameraInput[FreeCamera] {
  
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
  def camera_MFreeCameraDeviceOrientationInput: FreeCamera = js.native
  
  /**
    * Update the current camera state depending on the inputs that have been used this frame.
    * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
    */
  @JSName("checkInputs")
  def checkInputs_MFreeCameraDeviceOrientationInput(): Unit = js.native
}
