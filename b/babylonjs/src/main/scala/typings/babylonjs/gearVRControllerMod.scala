package typings.babylonjs

import typings.babylonjs.webVRControllerMod.WebVRController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Gamepads/Controllers/gearVRController", JSImport.Namespace)
@js.native
object gearVRControllerMod extends js.Object {
  
  @js.native
  class GearVRController protected () extends WebVRController {
    /**
      * Creates a new GearVRController from a gamepad
      * @param vrGamepad the gamepad that the controller should be created from
      */
    def this(vrGamepad: js.Any) = this()
    
    val _buttonIndexToObservableNameMap: js.Any = js.native
  }
  /* static members */
  @js.native
  object GearVRController extends js.Object {
    
    /**
      * Gamepad Id prefix used to identify this controller.
      */
    val GAMEPAD_ID_PREFIX: String = js.native
    
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
