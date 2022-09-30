package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlyCameraKeyboardInput
  extends StObject
     with ICameraInput[FlyCamera] {
  
  /* private */ var _engine: Any = js.native
  
  /* private */ var _keys: Any = js.native
  
  /* private */ var _onCanvasBlurObserver: Any = js.native
  
  /* private */ var _onKeyboardObserver: Any = js.native
  
  /**
    * @internal
    */
  def _onLostFocus(): Unit = js.native
  
  /* private */ var _scene: Any = js.native
  
  /**
    * Defines the camera the input is attached to.
    */
  @JSName("camera")
  var camera_FlyCameraKeyboardInput: FlyCamera = js.native
  
  /**
    * Update the current camera state depending on the inputs that have been used this frame.
    * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
    */
  @JSName("checkInputs")
  def checkInputs_MFlyCameraKeyboardInput(): Unit = js.native
  
  /**
    * The list of keyboard keys used to control the backward move of the camera.
    */
  var keysBackward: js.Array[Double] = js.native
  
  /**
    * The list of keyboard keys used to control the backward move of the camera.
    */
  var keysDown: js.Array[Double] = js.native
  
  /**
    * The list of keyboard keys used to control the forward move of the camera.
    */
  var keysForward: js.Array[Double] = js.native
  
  /**
    * The list of keyboard keys used to control the left strafe move of the camera.
    */
  var keysLeft: js.Array[Double] = js.native
  
  /**
    * The list of keyboard keys used to control the right strafe move of the camera.
    */
  var keysRight: js.Array[Double] = js.native
  
  /**
    * The list of keyboard keys used to control the forward move of the camera.
    */
  var keysUp: js.Array[Double] = js.native
}
