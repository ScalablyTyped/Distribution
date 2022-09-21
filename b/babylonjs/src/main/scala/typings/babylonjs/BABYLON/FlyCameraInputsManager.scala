package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlyCameraInputsManager
  extends StObject
     with CameraInputsManager[FlyCamera] {
  
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
