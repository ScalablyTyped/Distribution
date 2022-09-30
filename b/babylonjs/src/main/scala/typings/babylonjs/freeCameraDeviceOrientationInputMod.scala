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
  open class FreeCameraDeviceOrientationInput ()
    extends StObject
       with ICameraInput[FreeCamera] {
    
    /* private */ var _alpha: Any = js.native
    
    /* private */ var _beta: Any = js.native
    
    /* private */ var _camera: Any = js.native
    
    /* private */ var _constantTranform: Any = js.native
    
    /* private */ var _deviceOrientation: Any = js.native
    
    /* private */ var _gamma: Any = js.native
    
    /**
      * @internal
      */
    var _onDeviceOrientationChangedObservable: Observable[Unit] = js.native
    
    /* private */ var _orientationChanged: Any = js.native
    
    /* private */ var _screenOrientationAngle: Any = js.native
    
    /* private */ var _screenQuaternion: Any = js.native
    
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
    
    /** alpha+beta+gamma smoothing. 0: no smoothing, 1: new data ignored, 0.9 recommended for smoothing */
    var smoothFactor: Double = js.native
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
    inline def WaitForOrientationChangeAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("WaitForOrientationChangeAsync")().asInstanceOf[js.Promise[Unit]]
    inline def WaitForOrientationChangeAsync(timeout: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("WaitForOrientationChangeAsync")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  }
  
  /* augmented module */
  object babylonjsCamerasFreeCameraInputsManagerAugmentingMod {
    
    @js.native
    trait FreeCameraInputsManager extends StObject {
      
      /**
        * @internal
        */
      var _deviceOrientationInput: Nullable[FreeCameraDeviceOrientationInput] = js.native
      
      /**
        * Add orientation input support to the input manager.
        * @param smoothFactor deviceOrientation smoothing. 0: no smoothing, 1: new data ignored, 0.9 recommended for smoothing
        * @returns the current input manager
        */
      def addDeviceOrientation(): FreeCameraInputsManager = js.native
      def addDeviceOrientation(smoothFactor: Double): FreeCameraInputsManager = js.native
    }
  }
}
