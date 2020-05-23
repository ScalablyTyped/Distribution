package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OculusTouchController extends WebVRController {
  /**
    * Fired when the secondary trigger on this controller is modified
    */
  var onSecondaryTriggerStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
    * Fired when the thumb rest on this controller is modified
    */
  var onThumbRestChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
    * Fired when the A button on this controller is modified
    */
  def onAButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
    * Fired when the B button on this controller is modified
    */
  def onBButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
    * Fired when the X button on this controller is modified
    */
  def onXButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
    * Fired when the Y button on this controller is modified
    */
  def onYButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
}

