package typings.babylonjs

import typings.babylonjs.poseEnabledControllerMod.ExtendedGamepadButton
import typings.babylonjs.webVRControllerMod.WebVRController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object daydreamControllerMod {
  
  @JSImport("babylonjs/Gamepads/Controllers/daydreamController", "DaydreamController")
  @js.native
  open class DaydreamController protected () extends WebVRController {
    /**
      * Creates a new DaydreamController from a gamepad
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
  object DaydreamController {
    
    @JSImport("babylonjs/Gamepads/Controllers/daydreamController", "DaydreamController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gamepad Id prefix used to identify Daydream Controller.
      */
    @JSImport("babylonjs/Gamepads/Controllers/daydreamController", "DaydreamController.GAMEPAD_ID_PREFIX")
    @js.native
    val GAMEPAD_ID_PREFIX: String = js.native
    
    /**
      * Base Url for the controller model.
      */
    @JSImport("babylonjs/Gamepads/Controllers/daydreamController", "DaydreamController.MODEL_BASE_URL")
    @js.native
    def MODEL_BASE_URL: String = js.native
    inline def MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_BASE_URL")(x.asInstanceOf[js.Any])
    
    /**
      * File name for the controller model.
      */
    @JSImport("babylonjs/Gamepads/Controllers/daydreamController", "DaydreamController.MODEL_FILENAME")
    @js.native
    def MODEL_FILENAME: String = js.native
    inline def MODEL_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_FILENAME")(x.asInstanceOf[js.Any])
  }
}
