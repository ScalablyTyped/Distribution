package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FollowCameraKeyboardMoveInput
  extends StObject
     with ICameraInput[FollowCamera] {
  
  /* private */ var _altPressed: Any = js.native
  
  /* private */ var _ctrlPressed: Any = js.native
  
  /* private */ var _engine: Any = js.native
  
  /* private */ var _keys: Any = js.native
  
  /**
    * Check if the pressed modifier keys (Alt/Ctrl/Shift) match those configured to
    * allow modification of the heightOffset value.
    */
  /* private */ var _modifierHeightOffset: Any = js.native
  
  /**
    * Check if the pressed modifier keys (Alt/Ctrl/Shift) match those configured to
    * allow modification of the radius value.
    */
  /* private */ var _modifierRadius: Any = js.native
  
  /**
    * Check if the pressed modifier keys (Alt/Ctrl/Shift) match those configured to
    * allow modification of the rotationOffset value.
    */
  /* private */ var _modifierRotationOffset: Any = js.native
  
  /* private */ var _onCanvasBlurObserver: Any = js.native
  
  /* private */ var _onKeyboardObserver: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _shiftPressed: Any = js.native
  
  /**
    * Defines the camera the input is attached to.
    */
  @JSName("camera")
  var camera_FollowCameraKeyboardMoveInput: FollowCamera = js.native
  
  /**
    * Update the current camera state depending on the inputs that have been used this frame.
    * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
    */
  @JSName("checkInputs")
  def checkInputs_MFollowCameraKeyboardMoveInput(): Unit = js.native
  
  /**
    * Defines the rate of change of heightOffset.
    */
  var heightSensibility: Double = js.native
  
  /**
    * Defines the list of key codes associated with the down action (decrease heightOffset)
    */
  var keysHeightOffsetDecr: js.Array[Double] = js.native
  
  /**
    * Defines the list of key codes associated with the up action (increase heightOffset)
    */
  var keysHeightOffsetIncr: js.Array[Double] = js.native
  
  /**
    * Defines whether the Alt modifier key is required to move up/down (alter heightOffset)
    */
  var keysHeightOffsetModifierAlt: Boolean = js.native
  
  /**
    * Defines whether the Ctrl modifier key is required to move up/down (alter heightOffset)
    */
  var keysHeightOffsetModifierCtrl: Boolean = js.native
  
  /**
    * Defines whether the Shift modifier key is required to move up/down (alter heightOffset)
    */
  var keysHeightOffsetModifierShift: Boolean = js.native
  
  /**
    * Defines the list of key codes associated with the zoom-out action (increase radius)
    */
  var keysRadiusDecr: js.Array[Double] = js.native
  
  /**
    * Defines the list of key codes associated with the zoom-in action (decrease radius)
    */
  var keysRadiusIncr: js.Array[Double] = js.native
  
  /**
    * Defines whether the Alt modifier key is required to zoom in/out (alter radius value)
    */
  var keysRadiusModifierAlt: Boolean = js.native
  
  /**
    * Defines whether the Ctrl modifier key is required to zoom in/out (alter radius value)
    */
  var keysRadiusModifierCtrl: Boolean = js.native
  
  /**
    * Defines whether the Shift modifier key is required to zoom in/out (alter radius value)
    */
  var keysRadiusModifierShift: Boolean = js.native
  
  /**
    * Defines the list of key codes associated with the right action (decrease rotationOffset)
    */
  var keysRotationOffsetDecr: js.Array[Double] = js.native
  
  /**
    * Defines the list of key codes associated with the left action (increase rotationOffset)
    */
  var keysRotationOffsetIncr: js.Array[Double] = js.native
  
  /**
    * Defines whether the Alt modifier key is required to move left/right (alter rotationOffset)
    */
  var keysRotationOffsetModifierAlt: Boolean = js.native
  
  /**
    * Defines whether the Ctrl modifier key is required to move left/right (alter rotationOffset)
    */
  var keysRotationOffsetModifierCtrl: Boolean = js.native
  
  /**
    * Defines whether the Shift modifier key is required to move left/right (alter rotationOffset)
    */
  var keysRotationOffsetModifierShift: Boolean = js.native
  
  /**
    * Defines the rate of change of radius.
    */
  var radiusSensibility: Double = js.native
  
  /**
    * Defines the rate of change of rotationOffset.
    */
  var rotationSensibility: Double = js.native
}
