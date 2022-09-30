package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreeCameraKeyboardMoveInput
  extends StObject
     with ICameraInput[FreeCamera] {
  
  /* private */ var _engine: Any = js.native
  
  /* private */ var _getLocalRotation: Any = js.native
  
  /* private */ var _keys: Any = js.native
  
  /* private */ var _onCanvasBlurObserver: Any = js.native
  
  /* private */ var _onKeyboardObserver: Any = js.native
  
  /** @internal */
  def _onLostFocus(): Unit = js.native
  
  /* private */ var _scene: Any = js.native
  
  /**
    * Defines the camera the input is attached to.
    */
  @JSName("camera")
  var camera_FreeCameraKeyboardMoveInput: FreeCamera = js.native
  
  /**
    * Update the current camera state depending on the inputs that have been used this frame.
    * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
    */
  @JSName("checkInputs")
  def checkInputs_MFreeCameraKeyboardMoveInput(): Unit = js.native
  
  /**
    * Gets or Set the list of keyboard keys used to control the backward move of the camera.
    */
  var keysDown: js.Array[Double] = js.native
  
  /**
    * Gets or Set the list of keyboard keys used to control the downward move of the camera.
    */
  var keysDownward: js.Array[Double] = js.native
  
  /**
    * Gets or Set the list of keyboard keys used to control the left strafe move of the camera.
    */
  var keysLeft: js.Array[Double] = js.native
  
  /**
    * Gets or Set the list of keyboard keys used to control the right strafe move of the camera.
    */
  var keysRight: js.Array[Double] = js.native
  
  /**
    * Gets or Set the list of keyboard keys used to control the left rotation move of the camera.
    */
  var keysRotateLeft: js.Array[Double] = js.native
  
  /**
    * Gets or Set the list of keyboard keys used to control the right rotation move of the camera.
    */
  var keysRotateRight: js.Array[Double] = js.native
  
  /**
    * Gets or Set the list of keyboard keys used to control the forward move of the camera.
    */
  var keysUp: js.Array[Double] = js.native
  
  /**
    * Gets or Set the list of keyboard keys used to control the upward move of the camera.
    */
  var keysUpward: js.Array[Double] = js.native
  
  /**
    * Defines the pointer angular sensibility  along the X and Y axis or how fast is the camera rotating.
    */
  var rotationSpeed: Double = js.native
}
