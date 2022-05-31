package typings.babylonjs

import typings.babylonjs.arcRotateCameraMod.ArcRotateCamera
import typings.babylonjs.cameraInputsManagerMod.CameraInputsManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arcRotateCameraInputsManagerMod {
  
  /**
    * Interface representing an arc rotate camera inputs manager
    */
  @JSImport("babylonjs/Cameras/arcRotateCameraInputsManager", "ArcRotateCameraInputsManager")
  @js.native
  class ArcRotateCameraInputsManager protected () extends CameraInputsManager[ArcRotateCamera] {
    /**
      * Instantiates a new ArcRotateCameraInputsManager.
      * @param camera Defines the camera the inputs belong to
      */
    def this(camera: ArcRotateCamera) = this()
    
    /**
      * Adds gamepad input support to the ArcRotateCamera InputManager.
      * @returns the camera inputs manager
      */
    def addGamepad(): typings.babylonjs.gamepadSceneComponentMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager = js.native
    
    /**
      * Add keyboard input support to the input manager.
      * @returns the current input manager
      */
    def addKeyboard(): ArcRotateCameraInputsManager = js.native
    
    /**
      * Add mouse wheel input support to the input manager.
      * @returns the current input manager
      */
    def addMouseWheel(): ArcRotateCameraInputsManager = js.native
    
    /**
      * Add pointers input support to the input manager.
      * @returns the current input manager
      */
    def addPointers(): ArcRotateCameraInputsManager = js.native
    
    /**
      * Add orientation input support to the input manager.
      * @returns the current input manager
      */
    def addVRDeviceOrientation(): typings.babylonjs.arcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager = js.native
  }
}
