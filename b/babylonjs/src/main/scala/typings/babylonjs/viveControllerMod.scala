package typings.babylonjs

import typings.babylonjs.observableMod.Observable
import typings.babylonjs.poseEnabledControllerMod.ExtendedGamepadButton
import typings.babylonjs.webVRControllerMod.WebVRController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Gamepads/Controllers/viveController", JSImport.Namespace)
@js.native
object viveControllerMod extends js.Object {
  
  @js.native
  class ViveController protected () extends WebVRController {
    /**
      * Creates a new ViveController from a gamepad
      * @param vrGamepad the gamepad that the controller should be created from
      */
    def this(vrGamepad: js.Any) = this()
    
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
  /* static members */
  @js.native
  object ViveController extends js.Object {
    
    /**
      * Base Url for the controller model.
      */
    var MODEL_BASE_URL: String = js.native
    
    /**
      * File name for the controller model.
      */
    var MODEL_FILENAME: String = js.native
  }
}
