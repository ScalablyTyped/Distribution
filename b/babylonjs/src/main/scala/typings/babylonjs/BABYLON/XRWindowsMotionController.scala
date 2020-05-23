package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XRWindowsMotionController extends WindowsMotionController {
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

