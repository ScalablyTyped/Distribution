package typings.babylonjs

import typings.babylonjs.webVRControllerMod.WebVRController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Gamepads/Controllers/genericController", JSImport.Namespace)
@js.native
object genericControllerMod extends js.Object {
  
  @js.native
  class GenericController protected () extends WebVRController {
    /**
      * Creates a new GenericController from a gamepad
      * @param vrGamepad the gamepad that the controller should be created from
      */
    def this(vrGamepad: js.Any) = this()
  }
  /* static members */
  @js.native
  object GenericController extends js.Object {
    
    /**
      * Base Url for the controller model.
      */
    val MODEL_BASE_URL: String = js.native
    
    /**
      * File name for the controller model.
      */
    val MODEL_FILENAME: String = js.native
  }
}
