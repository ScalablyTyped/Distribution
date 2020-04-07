package typings.babylonjs.indexMod

import typings.babylonjs.poseEnabledControllerMod.GamePadFactory
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "PoseEnabledControllerHelper")
@js.native
class PoseEnabledControllerHelper ()
  extends typings.babylonjs.gamepadsIndexMod.PoseEnabledControllerHelper

/* static members */
@JSImport("babylonjs/index", "PoseEnabledControllerHelper")
@js.native
object PoseEnabledControllerHelper extends js.Object {
  /** @hidden */
  var _ControllerFactories: js.Array[GamePadFactory] = js.native
  /** @hidden */
  var _DefaultControllerFactory: Nullable[js.Function1[/* gamepadInfo */ _, typings.babylonjs.gamepadMod.Gamepad]] = js.native
  /**
    * Initializes a gamepad as the controller type it is specified as (eg. windows mixed reality controller)
    * @param vrGamepad the gamepad to initialized
    * @returns a vr controller of the type the gamepad identified as
    */
  def InitiateController(vrGamepad: js.Any): typings.babylonjs.gamepadMod.Gamepad = js.native
}

