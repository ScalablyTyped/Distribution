package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.GamePadFactory
import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PoseEnabledControllerHelper")
@js.native
class PoseEnabledControllerHelper ()
  extends typings.babylonjs.BABYLON.PoseEnabledControllerHelper

/* static members */
@JSGlobal("BABYLON.PoseEnabledControllerHelper")
@js.native
object PoseEnabledControllerHelper extends js.Object {
  /** @hidden */
  var _ControllerFactories: js.Array[GamePadFactory] = js.native
  /** @hidden */
  var _DefaultControllerFactory: Nullable[js.Function1[/* gamepadInfo */ _, typings.babylonjs.BABYLON.Gamepad]] = js.native
  /**
    * Initializes a gamepad as the controller type it is specified as (eg. windows mixed reality controller)
    * @param vrGamepad the gamepad to initialized
    * @returns a vr controller of the type the gamepad identified as
    */
  def InitiateController(vrGamepad: js.Any): typings.babylonjs.BABYLON.Gamepad = js.native
}

