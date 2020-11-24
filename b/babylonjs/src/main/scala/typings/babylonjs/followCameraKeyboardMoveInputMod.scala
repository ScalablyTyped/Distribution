package typings.babylonjs

import typings.babylonjs.cameraInputsManagerMod.ICameraInput
import typings.babylonjs.followCameraMod.FollowCamera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/Inputs/followCameraKeyboardMoveInput", JSImport.Namespace)
@js.native
object followCameraKeyboardMoveInputMod extends js.Object {
  
  @js.native
  class FollowCameraKeyboardMoveInput () extends ICameraInput[FollowCamera] {
    
    var _altPressed: js.Any = js.native
    
    var _ctrlPressed: js.Any = js.native
    
    var _engine: js.Any = js.native
    
    var _keys: js.Any = js.native
    
    /**
      * Check if the pressed modifier keys (Alt/Ctrl/Shift) match those configured to
      * allow modification of the heightOffset value.
      */
    var _modifierHeightOffset: js.Any = js.native
    
    /**
      * Check if the pressed modifier keys (Alt/Ctrl/Shift) match those configured to
      * allow modification of the radius value.
      */
    var _modifierRadius: js.Any = js.native
    
    /**
      * Check if the pressed modifier keys (Alt/Ctrl/Shift) match those configured to
      * allow modification of the rotationOffset value.
      */
    var _modifierRotationOffset: js.Any = js.native
    
    var _onCanvasBlurObserver: js.Any = js.native
    
    var _onKeyboardObserver: js.Any = js.native
    
    var _scene: js.Any = js.native
    
    var _shiftPressed: js.Any = js.native
    
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
}
