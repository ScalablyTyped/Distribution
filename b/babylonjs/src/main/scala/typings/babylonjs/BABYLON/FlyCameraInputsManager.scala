package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlyCameraInputsManager extends CameraInputsManager[FlyCamera] {
  /**
    * Add keyboard input support to the input manager.
    * @returns the new FlyCameraKeyboardMoveInput().
    */
  def addKeyboard(): FlyCameraInputsManager = js.native
  /**
    * Add mouse input support to the input manager.
    * @param touchEnabled Enable touch screen support.
    * @returns the new FlyCameraMouseInput().
    */
  def addMouse(): FlyCameraInputsManager = js.native
  def addMouse(touchEnabled: Boolean): FlyCameraInputsManager = js.native
}

