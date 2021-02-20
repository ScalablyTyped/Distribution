package typings.babylonjs

import typings.babylonjs.cameraInputsManagerMod.ICameraInput
import typings.babylonjs.flyCameraMod.FlyCamera
import typings.std.FocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flyCameraKeyboardInputMod {
  
  @JSImport("babylonjs/Cameras/Inputs/flyCameraKeyboardInput", "FlyCameraKeyboardInput")
  @js.native
  class FlyCameraKeyboardInput () extends ICameraInput[FlyCamera] {
    
    var _engine: js.Any = js.native
    
    var _keys: js.Any = js.native
    
    var _onCanvasBlurObserver: js.Any = js.native
    
    var _onKeyboardObserver: js.Any = js.native
    
    /** @hidden */
    def _onLostFocus(e: FocusEvent): Unit = js.native
    
    var _scene: js.Any = js.native
    
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
}
