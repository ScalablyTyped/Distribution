package typings.babylonjs

import typings.babylonjs.cameraInputsManagerMod.CameraInputsManager
import typings.babylonjs.followCameraMod.FollowCamera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object followCameraInputsManagerMod {
  
  @JSImport("babylonjs/Cameras/followCameraInputsManager", "FollowCameraInputsManager")
  @js.native
  class FollowCameraInputsManager protected () extends CameraInputsManager[FollowCamera] {
    /**
      * Instantiates a new FollowCameraInputsManager.
      * @param camera Defines the camera the inputs belong to
      */
    def this(camera: FollowCamera) = this()
    
    /**
      * Add keyboard input support to the input manager.
      * @returns the current input manager
      */
    def addKeyboard(): FollowCameraInputsManager = js.native
    
    /**
      * Add mouse wheel input support to the input manager.
      * @returns the current input manager
      */
    def addMouseWheel(): FollowCameraInputsManager = js.native
    
    /**
      * Add pointers input support to the input manager.
      * @returns the current input manager
      */
    def addPointers(): FollowCameraInputsManager = js.native
    
    /**
      * Add orientation input support to the input manager.
      * @returns the current input manager
      */
    def addVRDeviceOrientation(): FollowCameraInputsManager = js.native
  }
}
