package typings.babylonjs

import typings.babylonjs.cameraInputsManagerMod.CameraInputsManager
import typings.babylonjs.flyCameraMod.FlyCamera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flyCameraInputsManagerMod {
  
  @JSImport("babylonjs/Cameras/flyCameraInputsManager", "FlyCameraInputsManager")
  @js.native
  open class FlyCameraInputsManager protected () extends CameraInputsManager[FlyCamera] {
    /**
      * Instantiates a new FlyCameraInputsManager.
      * @param camera Defines the camera the inputs belong to.
      */
    def this(camera: FlyCamera) = this()
    
    /**
      * Add keyboard input support to the input manager.
      * @returns the new FlyCameraKeyboardMoveInput().
      */
    def addKeyboard(): FlyCameraInputsManager = js.native
    
    /**
      * Add mouse input support to the input manager.
      * @returns the new FlyCameraMouseInput().
      */
    def addMouse(): FlyCameraInputsManager = js.native
  }
}
