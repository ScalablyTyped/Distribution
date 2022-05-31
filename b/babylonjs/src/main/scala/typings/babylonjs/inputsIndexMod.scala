package typings.babylonjs

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputsIndexMod {
  
  @JSImport("babylonjs/Cameras/Inputs/index", "ArcRotateCameraGamepadInput")
  @js.native
  class ArcRotateCameraGamepadInput ()
    extends typings.babylonjs.arcRotateCameraGamepadInputMod.ArcRotateCameraGamepadInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "ArcRotateCameraKeyboardMoveInput")
  @js.native
  class ArcRotateCameraKeyboardMoveInput ()
    extends typings.babylonjs.arcRotateCameraKeyboardMoveInputMod.ArcRotateCameraKeyboardMoveInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "ArcRotateCameraMouseWheelInput")
  @js.native
  class ArcRotateCameraMouseWheelInput ()
    extends typings.babylonjs.arcRotateCameraMouseWheelInputMod.ArcRotateCameraMouseWheelInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "ArcRotateCameraPointersInput")
  @js.native
  class ArcRotateCameraPointersInput ()
    extends typings.babylonjs.arcRotateCameraPointersInputMod.ArcRotateCameraPointersInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "ArcRotateCameraVRDeviceOrientationInput")
  @js.native
  /**
    * Instantiate a new ArcRotateCameraVRDeviceOrientationInput.
    */
  class ArcRotateCameraVRDeviceOrientationInput ()
    extends typings.babylonjs.arcRotateCameraVRDeviceOrientationInputMod.ArcRotateCameraVRDeviceOrientationInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FlyCameraKeyboardInput")
  @js.native
  class FlyCameraKeyboardInput ()
    extends typings.babylonjs.flyCameraKeyboardInputMod.FlyCameraKeyboardInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FlyCameraMouseInput")
  @js.native
  /**
    * Listen to mouse events to control the camera.
    * @param touchEnabled Define if touch is enabled. (Default is true.)
    * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
    */
  class FlyCameraMouseInput ()
    extends typings.babylonjs.flyCameraMouseInputMod.FlyCameraMouseInput {
    def this(touchEnabled: Boolean) = this()
  }
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FollowCameraKeyboardMoveInput")
  @js.native
  class FollowCameraKeyboardMoveInput ()
    extends typings.babylonjs.followCameraKeyboardMoveInputMod.FollowCameraKeyboardMoveInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FollowCameraMouseWheelInput")
  @js.native
  class FollowCameraMouseWheelInput ()
    extends typings.babylonjs.followCameraMouseWheelInputMod.FollowCameraMouseWheelInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FollowCameraPointersInput")
  @js.native
  class FollowCameraPointersInput ()
    extends typings.babylonjs.followCameraPointersInputMod.FollowCameraPointersInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraDeviceOrientationInput")
  @js.native
  /**
    * Instantiates a new input
    * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
    */
  class FreeCameraDeviceOrientationInput ()
    extends typings.babylonjs.freeCameraDeviceOrientationInputMod.FreeCameraDeviceOrientationInput
  /* static members */
  object FreeCameraDeviceOrientationInput {
    
    @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraDeviceOrientationInput")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Can be used to detect if a device orientation sensor is available on a device
      * @param timeout amount of time in milliseconds to wait for a response from the sensor (default: infinite)
      * @returns a promise that will resolve on orientation change
      */
    inline def WaitForOrientationChangeAsync(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("WaitForOrientationChangeAsync")().asInstanceOf[js.Promise[js.Any]]
    inline def WaitForOrientationChangeAsync(timeout: Double): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("WaitForOrientationChangeAsync")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  }
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraGamepadInput")
  @js.native
  class FreeCameraGamepadInput ()
    extends typings.babylonjs.freeCameraGamepadInputMod.FreeCameraGamepadInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraKeyboardMoveInput")
  @js.native
  class FreeCameraKeyboardMoveInput ()
    extends typings.babylonjs.freeCameraKeyboardMoveInputMod.FreeCameraKeyboardMoveInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraMouseInput")
  @js.native
  /**
    * Manage the mouse inputs to control the movement of a free camera.
    * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
    * @param touchEnabled Defines if touch is enabled or not
    */
  class FreeCameraMouseInput ()
    extends typings.babylonjs.freeCameraMouseInputMod.FreeCameraMouseInput {
    def this(/**
      * Define if touch is enabled in the mouse input
      */
    touchEnabled: Boolean) = this()
  }
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraMouseWheelInput")
  @js.native
  class FreeCameraMouseWheelInput ()
    extends typings.babylonjs.freeCameraMouseWheelInputMod.FreeCameraMouseWheelInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraTouchInput")
  @js.native
  /**
    * Manage the touch inputs to control the movement of a free camera.
    * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
    * @param allowMouse Defines if mouse events can be treated as touch events
    */
  class FreeCameraTouchInput ()
    extends typings.babylonjs.freeCameraTouchInputMod.FreeCameraTouchInput {
    def this(/**
      * Define if mouse events can be treated as touch events
      */
    allowMouse: Boolean) = this()
  }
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraVirtualJoystickInput")
  @js.native
  class FreeCameraVirtualJoystickInput ()
    extends typings.babylonjs.freeCameraVirtualJoystickInputMod.FreeCameraVirtualJoystickInput
  
  /* augmented module */
  object babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod {
    
    trait ArcRotateCameraInputsManager extends StObject {
      
      /**
        * Add orientation input support to the input manager.
        * @returns the current input manager
        */
      def addVRDeviceOrientation(): typings.babylonjs.arcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
    }
    object ArcRotateCameraInputsManager {
      
      inline def apply(
        addVRDeviceOrientation: () => typings.babylonjs.arcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
      ): ArcRotateCameraInputsManager = {
        val __obj = js.Dynamic.literal(addVRDeviceOrientation = js.Any.fromFunction0(addVRDeviceOrientation))
        __obj.asInstanceOf[ArcRotateCameraInputsManager]
      }
      
      extension [Self <: ArcRotateCameraInputsManager](x: Self) {
        
        inline def setAddVRDeviceOrientation(
          value: () => typings.babylonjs.arcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
        ): Self = StObject.set(x, "addVRDeviceOrientation", js.Any.fromFunction0(value))
      }
    }
  }
  
  /* augmented module */
  object babylonjsCamerasFreeCameraInputsManagerAugmentingMod {
    
    trait FreeCameraInputsManager extends StObject {
      
      /**
        * @hidden
        */
      var _deviceOrientationInput: Nullable[
            typings.babylonjs.freeCameraDeviceOrientationInputMod.FreeCameraDeviceOrientationInput
          ]
      
      /**
        * Add orientation input support to the input manager.
        * @returns the current input manager
        */
      def addDeviceOrientation(): typings.babylonjs.freeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
      
      /**
        * Add virtual joystick input support to the input manager.
        * @returns the current input manager
        */
      def addVirtualJoystick(): typings.babylonjs.freeCameraVirtualJoystickInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
    }
    object FreeCameraInputsManager {
      
      inline def apply(
        addDeviceOrientation: () => typings.babylonjs.freeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager,
        addVirtualJoystick: () => typings.babylonjs.freeCameraVirtualJoystickInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
      ): FreeCameraInputsManager = {
        val __obj = js.Dynamic.literal(addDeviceOrientation = js.Any.fromFunction0(addDeviceOrientation), addVirtualJoystick = js.Any.fromFunction0(addVirtualJoystick), _deviceOrientationInput = null)
        __obj.asInstanceOf[FreeCameraInputsManager]
      }
      
      extension [Self <: FreeCameraInputsManager](x: Self) {
        
        inline def setAddDeviceOrientation(
          value: () => typings.babylonjs.freeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
        ): Self = StObject.set(x, "addDeviceOrientation", js.Any.fromFunction0(value))
        
        inline def setAddVirtualJoystick(
          value: () => typings.babylonjs.freeCameraVirtualJoystickInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager
        ): Self = StObject.set(x, "addVirtualJoystick", js.Any.fromFunction0(value))
        
        inline def set_deviceOrientationInput(
          value: Nullable[
                  typings.babylonjs.freeCameraDeviceOrientationInputMod.FreeCameraDeviceOrientationInput
                ]
        ): Self = StObject.set(x, "_deviceOrientationInput", value.asInstanceOf[js.Any])
        
        inline def set_deviceOrientationInputNull: Self = StObject.set(x, "_deviceOrientationInput", null)
      }
    }
  }
}
