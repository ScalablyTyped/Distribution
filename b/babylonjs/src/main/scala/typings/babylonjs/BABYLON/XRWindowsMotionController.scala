package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.XRWindowsMotionController")
@js.native
class XRWindowsMotionController protected () extends WindowsMotionController {
  /**
    * Construct a new XR-Based windows motion controller
    *
    * @param gamepadInfo the gamepad object from the browser
    */
  def this(gamepadInfo: js.Any) = this()
  /**
    * Fired when the thumbstick on this controller is clicked
    */
  var onThumbstickStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
    * Fired when the thumbstick on this controller is modified
    */
  var onThumbstickValuesChangedObservable: Observable[StickValues] = js.native
  /**
    * holds the thumbstick values (X,Y)
    */
  var thumbstickValues: StickValues = js.native
}

