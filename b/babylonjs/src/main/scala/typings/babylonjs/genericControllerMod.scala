package typings.babylonjs

import typings.babylonjs.poseEnabledControllerMod.ExtendedGamepadButton
import typings.babylonjs.webVRControllerMod.WebVRController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object genericControllerMod {
  
  @JSImport("babylonjs/Gamepads/Controllers/genericController", "GenericController")
  @js.native
  open class GenericController protected () extends WebVRController {
    /**
      * Creates a new GenericController from a gamepad
      * @param vrGamepad the gamepad that the controller should be created from
      */
    def this(vrGamepad: Any) = this()
    
    /**
      * Called once for each button that changed state since the last frame
      * @param buttonIdx Which button index changed
      * @param state New state of the button
      */
    /* protected */ def _handleButtonChange(buttonIdx: Double, state: ExtendedGamepadButton): Unit = js.native
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
