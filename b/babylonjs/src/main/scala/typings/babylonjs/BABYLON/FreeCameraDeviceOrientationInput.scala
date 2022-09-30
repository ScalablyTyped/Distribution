package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreeCameraDeviceOrientationInput
  extends StObject
     with ICameraInput[FreeCamera] {
  
  /* private */ var _alpha: Any = js.native
  
  /* private */ var _beta: Any = js.native
  
  /* private */ var _camera: Any = js.native
  
  /* private */ var _constantTranform: Any = js.native
  
  /* private */ var _deviceOrientation: Any = js.native
  
  /* private */ var _gamma: Any = js.native
  
  /**
    * @internal
    */
  var _onDeviceOrientationChangedObservable: Observable[Unit] = js.native
  
  /* private */ var _orientationChanged: Any = js.native
  
  /* private */ var _screenOrientationAngle: Any = js.native
  
  /* private */ var _screenQuaternion: Any = js.native
  
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
  
  /** alpha+beta+gamma smoothing. 0: no smoothing, 1: new data ignored, 0.9 recommended for smoothing */
  var smoothFactor: Double = js.native
}
