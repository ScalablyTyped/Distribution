package typings.babylonjs

import typings.babylonjs.camerasCameraInputsManagerMod.ICameraInput
import typings.babylonjs.camerasFreeCameraMod.FreeCamera
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasInputsFreeCameraGamepadInputMod {
  
  @JSImport("babylonjs/Cameras/Inputs/freeCameraGamepadInput", "FreeCameraGamepadInput")
  @js.native
  open class FreeCameraGamepadInput ()
    extends StObject
       with ICameraInput[FreeCamera] {
    
    /* private */ var _cameraTransform: Any = js.native
    
    /* private */ var _deltaTransform: Any = js.native
    
    /* private */ var _onGamepadConnectedObserver: Any = js.native
    
    /* private */ var _onGamepadDisconnectedObserver: Any = js.native
    
    /* private */ var _vector2: Any = js.native
    
    /* private */ var _vector3: Any = js.native
    
    /* private */ var _yAxisScale: Any = js.native
    
    /**
      * Define the camera the input is attached to.
      */
    @JSName("camera")
    var camera_FreeCameraGamepadInput: FreeCamera = js.native
    
    /**
      * Update the current camera state depending on the inputs that have been used this frame.
      * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
      */
    @JSName("checkInputs")
    def checkInputs_MFreeCameraGamepadInput(): Unit = js.native
    
    /**
      * Defines the minimum value at which any analog stick input is ignored.
      * Note: This value should only be a value between 0 and 1.
      */
    var deadzoneDelta: Double = js.native
    
    /**
      * Define the Gamepad controlling the input
      */
    var gamepad: Nullable[typings.babylonjs.gamepadsGamepadMod.Gamepad] = js.native
    
    /**
      * Defines the gamepad rotation sensibility.
      * This is the threshold from when rotation starts to be accounted for to prevent jittering.
      */
    var gamepadAngularSensibility: Double = js.native
    
    /**
      * Defines the gamepad move sensibility.
      * This is the threshold from when moving starts to be accounted for for to prevent jittering.
      */
    var gamepadMoveSensibility: Double = js.native
    
    /**
      * Gets or sets a boolean indicating that Yaxis (for right stick) should be inverted
      */
    def invertYAxis: Boolean = js.native
    def invertYAxis_=(value: Boolean): Unit = js.native
  }
}
