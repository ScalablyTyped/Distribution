package typings.babylonjs.poseEnabledControllerMod

import typings.babylonjs.gamepadMod.Gamepad
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Gamepads/Controllers/poseEnabledController", "PoseEnabledControllerHelper")
@js.native
class PoseEnabledControllerHelper () extends js.Object
/* static members */
@JSImport("babylonjs/Gamepads/Controllers/poseEnabledController", "PoseEnabledControllerHelper")
@js.native
object PoseEnabledControllerHelper extends js.Object {
  
  /**
    * Initializes a gamepad as the controller type it is specified as (eg. windows mixed reality controller)
    * @param vrGamepad the gamepad to initialized
    * @returns a vr controller of the type the gamepad identified as
    */
  def InitiateController(vrGamepad: js.Any): Gamepad = js.native
  
  /** @hidden */
  var _ControllerFactories: js.Array[GamePadFactory] = js.native
  
  /** @hidden */
  var _DefaultControllerFactory: Nullable[js.Function1[/* gamepadInfo */ _, Gamepad]] = js.native
}
