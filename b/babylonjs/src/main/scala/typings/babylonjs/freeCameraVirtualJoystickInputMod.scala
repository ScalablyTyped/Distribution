package typings.babylonjs

import typings.babylonjs.cameraInputsManagerMod.ICameraInput
import typings.babylonjs.freeCameraMod.FreeCamera
import typings.babylonjs.virtualJoystickMod.VirtualJoystick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object freeCameraVirtualJoystickInputMod {
  
  @JSImport("babylonjs/Cameras/Inputs/freeCameraVirtualJoystickInput", "FreeCameraVirtualJoystickInput")
  @js.native
  class FreeCameraVirtualJoystickInput () extends ICameraInput[FreeCamera] {
    
    var _leftjoystick: js.Any = js.native
    
    var _rightjoystick: js.Any = js.native
    
    /**
      * Defines the camera the input is attached to.
      */
    @JSName("camera")
    var camera_FreeCameraVirtualJoystickInput: FreeCamera = js.native
    
    /**
      * Update the current camera state depending on the inputs that have been used this frame.
      * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
      */
    @JSName("checkInputs")
    def checkInputs_MFreeCameraVirtualJoystickInput(): Unit = js.native
    
    /**
      * Gets the left stick of the virtual joystick.
      * @returns The virtual Joystick
      */
    def getLeftJoystick(): VirtualJoystick = js.native
    
    /**
      * Gets the right stick of the virtual joystick.
      * @returns The virtual Joystick
      */
    def getRightJoystick(): VirtualJoystick = js.native
  }
  
  /* augmented module */
  object babylonjsCamerasFreeCameraInputsManagerAugmentingMod {
    
    @js.native
    trait FreeCameraInputsManager extends StObject {
      
      /**
        * Add virtual joystick input support to the input manager.
        * @returns the current input manager
        */
      def addVirtualJoystick(): FreeCameraInputsManager = js.native
    }
    object FreeCameraInputsManager {
      
      @scala.inline
      def apply(addVirtualJoystick: () => FreeCameraInputsManager): FreeCameraInputsManager = {
        val __obj = js.Dynamic.literal(addVirtualJoystick = js.Any.fromFunction0(addVirtualJoystick))
        __obj.asInstanceOf[FreeCameraInputsManager]
      }
      
      @scala.inline
      implicit class FreeCameraInputsManagerMutableBuilder[Self <: FreeCameraInputsManager] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddVirtualJoystick(value: () => FreeCameraInputsManager): Self = StObject.set(x, "addVirtualJoystick", js.Any.fromFunction0(value))
      }
    }
  }
}
