package typings.babylonjs

import typings.babylonjs.webVRControllerMod.WebVRController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object genericControllerMod {
  
  @JSImport("babylonjs/Gamepads/Controllers/genericController", "GenericController")
  @js.native
  class GenericController protected () extends WebVRController {
    /**
      * Creates a new GenericController from a gamepad
      * @param vrGamepad the gamepad that the controller should be created from
      */
    def this(vrGamepad: js.Any) = this()
  }
  /* static members */
  object GenericController {
    
    /**
      * Base Url for the controller model.
      */
    @JSImport("babylonjs/Gamepads/Controllers/genericController", "GenericController.MODEL_BASE_URL")
    @js.native
    val MODEL_BASE_URL: String = js.native
    
    /**
      * File name for the controller model.
      */
    @JSImport("babylonjs/Gamepads/Controllers/genericController", "GenericController.MODEL_FILENAME")
    @js.native
    val MODEL_FILENAME: String = js.native
  }
}
