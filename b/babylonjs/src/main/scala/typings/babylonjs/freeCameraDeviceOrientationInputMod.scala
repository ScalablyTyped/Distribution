package typings.babylonjs

import typings.babylonjs.cameraInputsManagerMod.ICameraInput
import typings.babylonjs.freeCameraMod.FreeCamera
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object freeCameraDeviceOrientationInputMod {
  
  @JSImport("babylonjs/Cameras/Inputs/freeCameraDeviceOrientationInput", "FreeCameraDeviceOrientationInput")
  @js.native
  /**
    * Instantiates a new input
    * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
    */
  class FreeCameraDeviceOrientationInput () extends ICameraInput[FreeCamera] {
    
    var _alpha: js.Any = js.native
    
    var _beta: js.Any = js.native
    
    var _camera: js.Any = js.native
    
    var _constantTranform: js.Any = js.native
    
    var _deviceOrientation: js.Any = js.native
    
    var _gamma: js.Any = js.native
    
    /**
      * @hidden
      */
    var _onDeviceOrientationChangedObservable: Observable[Unit] = js.native
    
    var _orientationChanged: js.Any = js.native
    
    var _screenOrientationAngle: js.Any = js.native
    
    var _screenQuaternion: js.Any = js.native
    
    /**
      * Define the camera controlled by the input.
      */
    @JSName("camera")
    def camera_MFreeCameraDeviceOrientationInput: FreeCamera = js.native
    
    /**
      * Update the current camera state depending on the inputs that have been used this frame.
      * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
      */
    @JSName("checkInputs")
    def checkInputs_MFreeCameraDeviceOrientationInput(): Unit = js.native
  }
  /* static members */
  object FreeCameraDeviceOrientationInput {
    
    /**
      * Can be used to detect if a device orientation sensor is available on a device
      * @param timeout amount of time in milliseconds to wait for a response from the sensor (default: infinite)
      * @returns a promise that will resolve on orientation change
      */
    @JSImport("babylonjs/Cameras/Inputs/freeCameraDeviceOrientationInput", "FreeCameraDeviceOrientationInput.WaitForOrientationChangeAsync")
    @js.native
    def WaitForOrientationChangeAsync(): js.Promise[_] = js.native
    @JSImport("babylonjs/Cameras/Inputs/freeCameraDeviceOrientationInput", "FreeCameraDeviceOrientationInput.WaitForOrientationChangeAsync")
    @js.native
    def WaitForOrientationChangeAsync(timeout: Double): js.Promise[_] = js.native
  }
  
  /* augmented module */
  object babylonjsCamerasFreeCameraInputsManagerAugmentingMod {
    
    @js.native
    trait FreeCameraInputsManager extends StObject {
      
      /**
        * @hidden
        */
      var _deviceOrientationInput: Nullable[FreeCameraDeviceOrientationInput] = js.native
      
      /**
        * Add orientation input support to the input manager.
        * @returns the current input manager
        */
      def addDeviceOrientation(): FreeCameraInputsManager = js.native
    }
    object FreeCameraInputsManager {
      
      @scala.inline
      def apply(addDeviceOrientation: () => FreeCameraInputsManager): FreeCameraInputsManager = {
        val __obj = js.Dynamic.literal(addDeviceOrientation = js.Any.fromFunction0(addDeviceOrientation))
        __obj.asInstanceOf[FreeCameraInputsManager]
      }
      
      @scala.inline
      implicit class FreeCameraInputsManagerMutableBuilder[Self <: FreeCameraInputsManager] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddDeviceOrientation(value: () => FreeCameraInputsManager): Self = StObject.set(x, "addDeviceOrientation", js.Any.fromFunction0(value))
        
        @scala.inline
        def set_deviceOrientationInput(value: Nullable[FreeCameraDeviceOrientationInput]): Self = StObject.set(x, "_deviceOrientationInput", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set_deviceOrientationInputNull: Self = StObject.set(x, "_deviceOrientationInput", null)
      }
    }
  }
}
