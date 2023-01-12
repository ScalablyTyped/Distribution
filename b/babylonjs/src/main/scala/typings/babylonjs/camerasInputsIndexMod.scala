package typings.babylonjs

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasInputsIndexMod {
  
  @JSImport("babylonjs/Cameras/Inputs/index", "ArcRotateCameraGamepadInput")
  @js.native
  open class ArcRotateCameraGamepadInput ()
    extends typings.babylonjs.camerasInputsArcRotateCameraGamepadInputMod.ArcRotateCameraGamepadInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "ArcRotateCameraKeyboardMoveInput")
  @js.native
  open class ArcRotateCameraKeyboardMoveInput ()
    extends typings.babylonjs.camerasInputsArcRotateCameraKeyboardMoveInputMod.ArcRotateCameraKeyboardMoveInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "ArcRotateCameraMouseWheelInput")
  @js.native
  open class ArcRotateCameraMouseWheelInput ()
    extends typings.babylonjs.camerasInputsArcRotateCameraMouseWheelInputMod.ArcRotateCameraMouseWheelInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "ArcRotateCameraPointersInput")
  @js.native
  open class ArcRotateCameraPointersInput ()
    extends typings.babylonjs.camerasInputsArcRotateCameraPointersInputMod.ArcRotateCameraPointersInput
  /* static members */
  object ArcRotateCameraPointersInput {
    
    @JSImport("babylonjs/Cameras/Inputs/index", "ArcRotateCameraPointersInput")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The minimum radius used for pinch, to avoid radius lock at 0
      */
    @JSImport("babylonjs/Cameras/Inputs/index", "ArcRotateCameraPointersInput.MinimumRadiusForPinch")
    @js.native
    def MinimumRadiusForPinch: Double = js.native
    inline def MinimumRadiusForPinch_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MinimumRadiusForPinch")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Cameras/Inputs/index", "ArcRotateCameraVRDeviceOrientationInput")
  @js.native
  /**
    * Instantiate a new ArcRotateCameraVRDeviceOrientationInput.
    */
  open class ArcRotateCameraVRDeviceOrientationInput ()
    extends typings.babylonjs.camerasInputsArcRotateCameraVRDeviceOrientationInputMod.ArcRotateCameraVRDeviceOrientationInput
  
  /* note: abstract class */ @JSImport("babylonjs/Cameras/Inputs/index", "BaseCameraMouseWheelInput")
  @js.native
  open class BaseCameraMouseWheelInput ()
    extends typings.babylonjs.camerasInputsBaseCameraMouseWheelInputMod.BaseCameraMouseWheelInput
  
  /* note: abstract class */ @JSImport("babylonjs/Cameras/Inputs/index", "BaseCameraPointersInput")
  @js.native
  open class BaseCameraPointersInput ()
    extends typings.babylonjs.camerasInputsBaseCameraPointersInputMod.BaseCameraPointersInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FlyCameraKeyboardInput")
  @js.native
  open class FlyCameraKeyboardInput ()
    extends typings.babylonjs.camerasInputsFlyCameraKeyboardInputMod.FlyCameraKeyboardInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FlyCameraMouseInput")
  @js.native
  /**
    * Listen to mouse events to control the camera.
    * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
    */
  open class FlyCameraMouseInput ()
    extends typings.babylonjs.camerasInputsFlyCameraMouseInputMod.FlyCameraMouseInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FollowCameraKeyboardMoveInput")
  @js.native
  open class FollowCameraKeyboardMoveInput ()
    extends typings.babylonjs.camerasInputsFollowCameraKeyboardMoveInputMod.FollowCameraKeyboardMoveInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FollowCameraMouseWheelInput")
  @js.native
  open class FollowCameraMouseWheelInput ()
    extends typings.babylonjs.camerasInputsFollowCameraMouseWheelInputMod.FollowCameraMouseWheelInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FollowCameraPointersInput")
  @js.native
  open class FollowCameraPointersInput ()
    extends typings.babylonjs.camerasInputsFollowCameraPointersInputMod.FollowCameraPointersInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraDeviceOrientationInput")
  @js.native
  /**
    * Instantiates a new input
    * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
    */
  open class FreeCameraDeviceOrientationInput ()
    extends typings.babylonjs.camerasInputsFreeCameraDeviceOrientationInputMod.FreeCameraDeviceOrientationInput
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
    inline def WaitForOrientationChangeAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("WaitForOrientationChangeAsync")().asInstanceOf[js.Promise[Unit]]
    inline def WaitForOrientationChangeAsync(timeout: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("WaitForOrientationChangeAsync")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  }
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraGamepadInput")
  @js.native
  open class FreeCameraGamepadInput ()
    extends typings.babylonjs.camerasInputsFreeCameraGamepadInputMod.FreeCameraGamepadInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraKeyboardMoveInput")
  @js.native
  open class FreeCameraKeyboardMoveInput ()
    extends typings.babylonjs.camerasInputsFreeCameraKeyboardMoveInputMod.FreeCameraKeyboardMoveInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraMouseInput")
  @js.native
  /**
    * Manage the mouse inputs to control the movement of a free camera.
    * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
    * @param touchEnabled Defines if touch is enabled or not
    */
  open class FreeCameraMouseInput ()
    extends typings.babylonjs.camerasInputsFreeCameraMouseInputMod.FreeCameraMouseInput {
    def this(/**
      * Define if touch is enabled in the mouse input
      */
    touchEnabled: Boolean) = this()
  }
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraMouseWheelInput")
  @js.native
  open class FreeCameraMouseWheelInput ()
    extends typings.babylonjs.camerasInputsFreeCameraMouseWheelInputMod.FreeCameraMouseWheelInput
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraTouchInput")
  @js.native
  /**
    * Manage the touch inputs to control the movement of a free camera.
    * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
    * @param allowMouse Defines if mouse events can be treated as touch events
    */
  open class FreeCameraTouchInput ()
    extends typings.babylonjs.camerasInputsFreeCameraTouchInputMod.FreeCameraTouchInput {
    def this(/**
      * Define if mouse events can be treated as touch events
      */
    allowMouse: Boolean) = this()
  }
  
  @JSImport("babylonjs/Cameras/Inputs/index", "FreeCameraVirtualJoystickInput")
  @js.native
  open class FreeCameraVirtualJoystickInput ()
    extends typings.babylonjs.camerasInputsFreeCameraVirtualJoystickInputMod.FreeCameraVirtualJoystickInput
  
  /* augmented module */
  object babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod {
    
    trait ArcRotateCameraInputsManager extends StObject {
      
      /**
        * Add orientation input support to the input manager.
        * @returns the current input manager
        */
      def addVRDeviceOrientation(): typings.babylonjs.camerasInputsArcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
    }
    object ArcRotateCameraInputsManager {
      
      inline def apply(
        addVRDeviceOrientation: () => typings.babylonjs.camerasInputsArcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
      ): ArcRotateCameraInputsManager = {
        val __obj = js.Dynamic.literal(addVRDeviceOrientation = js.Any.fromFunction0(addVRDeviceOrientation))
        __obj.asInstanceOf[ArcRotateCameraInputsManager]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ArcRotateCameraInputsManager] (val x: Self) extends AnyVal {
        
        inline def setAddVRDeviceOrientation(
          value: () => typings.babylonjs.camerasInputsArcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
        ): Self = StObject.set(x, "addVRDeviceOrientation", js.Any.fromFunction0(value))
      }
    }
  }
  
  /* augmented module */
  object babylonjsCamerasFreeCameraInputsManagerAugmentingMod {
    
    @js.native
    trait FreeCameraInputsManager extends StObject {
      
      /**
        * @internal
        */
      var _deviceOrientationInput: Nullable[
            typings.babylonjs.camerasInputsFreeCameraDeviceOrientationInputMod.FreeCameraDeviceOrientationInput
          ] = js.native
      
      /**
        * Add orientation input support to the input manager.
        * @param smoothFactor deviceOrientation smoothing. 0: no smoothing, 1: new data ignored, 0.9 recommended for smoothing
        * @returns the current input manager
        */
      def addDeviceOrientation(): typings.babylonjs.camerasInputsFreeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager = js.native
      def addDeviceOrientation(smoothFactor: Double): typings.babylonjs.camerasInputsFreeCameraDeviceOrientationInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager = js.native
      
      /**
        * Add virtual joystick input support to the input manager.
        * @returns the current input manager
        */
      def addVirtualJoystick(): typings.babylonjs.camerasInputsFreeCameraVirtualJoystickInputMod.babylonjsCamerasFreeCameraInputsManagerAugmentingMod.FreeCameraInputsManager = js.native
    }
  }
}
