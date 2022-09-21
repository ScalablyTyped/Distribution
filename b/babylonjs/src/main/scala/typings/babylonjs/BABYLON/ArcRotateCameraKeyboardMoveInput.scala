package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArcRotateCameraKeyboardMoveInput
  extends StObject
     with ICameraInput[ArcRotateCamera] {
  
  /* private */ var _altPressed: Any = js.native
  
  /* private */ var _ctrlPressed: Any = js.native
  
  /* private */ var _engine: Any = js.native
  
  /* private */ var _keys: Any = js.native
  
  /* private */ var _onCanvasBlurObserver: Any = js.native
  
  /* private */ var _onKeyboardObserver: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /**
    * Rotation speed of the camera
    */
  var angularSpeed: Double = js.native
  
  /**
    * Defines the camera the input is attached to.
    */
  @JSName("camera")
  var camera_ArcRotateCameraKeyboardMoveInput: ArcRotateCamera = js.native
  
  /**
    * Update the current camera state depending on the inputs that have been used this frame.
    * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
    */
  @JSName("checkInputs")
  def checkInputs_MArcRotateCameraKeyboardMoveInput(): Unit = js.native
  
  /**
    * Defines the list of key codes associated with the down action (decrease alpha)
    */
  var keysDown: js.Array[Double] = js.native
  
  /**
    * Defines the list of key codes associated with the left action (increase beta)
    */
  var keysLeft: js.Array[Double] = js.native
  
  /**
    * Defines the list of key codes associated with the reset action.
    * Those keys reset the camera to its last stored state (with the method camera.storeState())
    */
  var keysReset: js.Array[Double] = js.native
  
  /**
    * Defines the list of key codes associated with the right action (decrease beta)
    */
  var keysRight: js.Array[Double] = js.native
  
  /**
    * Defines the list of key codes associated with the up action (increase alpha)
    */
  var keysUp: js.Array[Double] = js.native
  
  /**
    * Defines the panning sensibility of the inputs.
    * (How fast is the camera panning)
    */
  var panningSensibility: Double = js.native
  
  /**
    * Defines whether maintaining the alt key down switch the movement mode from
    * orientation to zoom.
    */
  var useAltToZoom: Boolean = js.native
  
  /**
    * Defines the zooming sensibility of the inputs.
    * (How fast is the camera zooming)
    */
  var zoomingSensibility: Double = js.native
}
