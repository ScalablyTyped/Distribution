package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreeCameraKeyboardMoveInput
  extends StObject
     with ICameraInput[FreeCamera] {
  
  /* private */ var _engine: js.Any = js.native
  
  /* private */ var _keys: js.Any = js.native
  
  /* private */ var _onCanvasBlurObserver: js.Any = js.native
  
  /* private */ var _onKeyboardObserver: js.Any = js.native
  
  /** @hidden */
  def _onLostFocus(): Unit = js.native
  
  /* private */ var _scene: js.Any = js.native
  
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
    * Gets or Set the list of keyboard keys used to control the forward move of the camera.
    */
  var keysUp: js.Array[Double] = js.native
  
  /**
    * Gets or Set the list of keyboard keys used to control the upward move of the camera.
    */
  var keysUpward: js.Array[Double] = js.native
}
