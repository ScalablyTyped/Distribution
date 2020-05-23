package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViveController extends WebVRController {
  /**
    * Fired when the left button on this controller is modified
    */
  def onLeftButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
    * Fired when the menu button on this controller is modified
    */
  def onMenuButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
    * Fired when the right button on this controller is modified
    */
  def onRightButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
}

