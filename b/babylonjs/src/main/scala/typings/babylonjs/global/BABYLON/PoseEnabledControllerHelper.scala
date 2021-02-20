package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.GamePadFactory
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PoseEnabledControllerHelper")
@js.native
class PoseEnabledControllerHelper ()
  extends typings.babylonjs.BABYLON.PoseEnabledControllerHelper
/* static members */
object PoseEnabledControllerHelper {
  
  @JSGlobal("BABYLON.PoseEnabledControllerHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Initializes a gamepad as the controller type it is specified as (eg. windows mixed reality controller)
    * @param vrGamepad the gamepad to initialized
    * @returns a vr controller of the type the gamepad identified as
    */
  @JSGlobal("BABYLON.PoseEnabledControllerHelper.InitiateController")
  @js.native
  def InitiateController(vrGamepad: js.Any): typings.babylonjs.BABYLON.Gamepad = js.native
  
  /** @hidden */
  @JSGlobal("BABYLON.PoseEnabledControllerHelper._ControllerFactories")
  @js.native
  def _ControllerFactories: js.Array[GamePadFactory] = js.native
  @scala.inline
  def _ControllerFactories_=(x: js.Array[GamePadFactory]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ControllerFactories")(x.asInstanceOf[js.Any])
  
  /** @hidden */
  @JSGlobal("BABYLON.PoseEnabledControllerHelper._DefaultControllerFactory")
  @js.native
  def _DefaultControllerFactory: Nullable[js.Function1[/* gamepadInfo */ js.Any, typings.babylonjs.BABYLON.Gamepad]] = js.native
  @scala.inline
  def _DefaultControllerFactory_=(x: Nullable[js.Function1[/* gamepadInfo */ js.Any, typings.babylonjs.BABYLON.Gamepad]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DefaultControllerFactory")(x.asInstanceOf[js.Any])
}
