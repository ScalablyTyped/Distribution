package typings.babylonjs.camerasIndexMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
