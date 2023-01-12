package typings.babylonjs

import typings.babylonjs.camerasArcRotateCameraMod.ArcRotateCamera
import typings.babylonjs.camerasCameraInputsManagerMod.ICameraInput
import typings.std.DeviceOrientationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasInputsArcRotateCameraVRDeviceOrientationInputMod {
  
  @JSImport("babylonjs/Cameras/Inputs/arcRotateCameraVRDeviceOrientationInput", "ArcRotateCameraVRDeviceOrientationInput")
  @js.native
  /**
    * Instantiate a new ArcRotateCameraVRDeviceOrientationInput.
    */
  open class ArcRotateCameraVRDeviceOrientationInput ()
    extends StObject
       with ICameraInput[ArcRotateCamera] {
    
    /* private */ var _alpha: Any = js.native
    
    /* private */ var _deviceOrientationHandler: Any = js.native
    
    /* private */ var _dirty: Any = js.native
    
    /* private */ var _gamma: Any = js.native
    
    /**
      * @internal
      */
    def _onOrientationEvent(evt: DeviceOrientationEvent): Unit = js.native
    
    /**
      * Defines a correction factor applied on the alpha value retrieved from the orientation events.
      */
    var alphaCorrection: Double = js.native
    
    /**
      * Defines the camera the input is attached to.
      */
    @JSName("camera")
    var camera_ArcRotateCameraVRDeviceOrientationInput: ArcRotateCamera = js.native
    
    /**
      * Update the current camera state depending on the inputs that have been used this frame.
      * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
      */
    @JSName("checkInputs")
    def checkInputs_MArcRotateCameraVRDeviceOrientationInput(): Unit = js.native
    
    /**
      * Defines a correction factor applied on the gamma value retrieved from the orientation events.
      */
    var gammaCorrection: Double = js.native
  }
  
  /* augmented module */
  object babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod {
    
    trait ArcRotateCameraInputsManager extends StObject {
      
      /**
        * Add orientation input support to the input manager.
        * @returns the current input manager
        */
      def addVRDeviceOrientation(): ArcRotateCameraInputsManager
    }
    object ArcRotateCameraInputsManager {
      
      inline def apply(addVRDeviceOrientation: () => ArcRotateCameraInputsManager): ArcRotateCameraInputsManager = {
        val __obj = js.Dynamic.literal(addVRDeviceOrientation = js.Any.fromFunction0(addVRDeviceOrientation))
        __obj.asInstanceOf[ArcRotateCameraInputsManager]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ArcRotateCameraInputsManager] (val x: Self) extends AnyVal {
        
        inline def setAddVRDeviceOrientation(value: () => ArcRotateCameraInputsManager): Self = StObject.set(x, "addVRDeviceOrientation", js.Any.fromFunction0(value))
      }
    }
  }
}
