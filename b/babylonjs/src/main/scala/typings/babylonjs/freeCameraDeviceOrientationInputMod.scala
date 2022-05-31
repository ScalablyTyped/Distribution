package typings.babylonjs

import typings.babylonjs.cameraInputsManagerMod.ICameraInput
import typings.babylonjs.freeCameraMod.FreeCamera
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object freeCameraDeviceOrientationInputMod {
  
  @JSImport("babylonjs/Cameras/Inputs/freeCameraDeviceOrientationInput", "FreeCameraDeviceOrientationInput")
  @js.native
  /**
    * Instantiates a new input
    * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
    */
  class FreeCameraDeviceOrientationInput ()
    extends StObject
       with ICameraInput[FreeCamera] {
    
    /* private */ var _alpha: js.Any = js.native
    
    /* private */ var _beta: js.Any = js.native
    
    /* private */ var _camera: js.Any = js.native
    
    /* private */ var _constantTranform: js.Any = js.native
    
    /* private */ var _deviceOrientation: js.Any = js.native
    
    /* private */ var _gamma: js.Any = js.native
    
    /**
      * @hidden
      */
    var _onDeviceOrientationChangedObservable: Observable[Unit] = js.native
    
    /* private */ var _orientationChanged: js.Any = js.native
    
    /* private */ var _screenOrientationAngle: js.Any = js.native
    
    /* private */ var _screenQuaternion: js.Any = js.native
    
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
    
    @JSImport("babylonjs/Cameras/Inputs/freeCameraDeviceOrientationInput", "FreeCameraDeviceOrientationInput")
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
  
  /* augmented module */
  object babylonjsCamerasFreeCameraInputsManagerAugmentingMod {
    
    trait FreeCameraInputsManager extends StObject {
      
      /**
        * @hidden
        */
      var _deviceOrientationInput: Nullable[FreeCameraDeviceOrientationInput]
      
      /**
        * Add orientation input support to the input manager.
        * @returns the current input manager
        */
      def addDeviceOrientation(): FreeCameraInputsManager
    }
    object FreeCameraInputsManager {
      
      inline def apply(addDeviceOrientation: () => FreeCameraInputsManager): FreeCameraInputsManager = {
        val __obj = js.Dynamic.literal(addDeviceOrientation = js.Any.fromFunction0(addDeviceOrientation), _deviceOrientationInput = null)
        __obj.asInstanceOf[FreeCameraInputsManager]
      }
      
      extension [Self <: FreeCameraInputsManager](x: Self) {
        
        inline def setAddDeviceOrientation(value: () => FreeCameraInputsManager): Self = StObject.set(x, "addDeviceOrientation", js.Any.fromFunction0(value))
        
        inline def set_deviceOrientationInput(value: Nullable[FreeCameraDeviceOrientationInput]): Self = StObject.set(x, "_deviceOrientationInput", value.asInstanceOf[js.Any])
        
        inline def set_deviceOrientationInputNull: Self = StObject.set(x, "_deviceOrientationInput", null)
      }
    }
  }
}
