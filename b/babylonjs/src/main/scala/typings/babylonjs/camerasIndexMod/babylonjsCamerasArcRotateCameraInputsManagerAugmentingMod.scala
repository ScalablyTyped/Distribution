package typings.babylonjs.camerasIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    ): typings.babylonjs.camerasIndexMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager = {
      val __obj = js.Dynamic.literal(addVRDeviceOrientation = js.Any.fromFunction0(addVRDeviceOrientation))
      __obj.asInstanceOf[typings.babylonjs.camerasIndexMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager]
    }
    
    extension [Self <: typings.babylonjs.camerasIndexMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager](x: Self) {
      
      inline def setAddVRDeviceOrientation(
        value: () => typings.babylonjs.camerasInputsArcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
      ): Self = StObject.set(x, "addVRDeviceOrientation", js.Any.fromFunction0(value))
    }
  }
}
