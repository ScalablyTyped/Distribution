package typings.babylonjs

import typings.babylonjs.gamepadsControllersPoseEnabledControllerMod.ExtendedGamepadButton
import typings.babylonjs.gamepadsControllersWebVRControllerMod.WebVRController
import typings.babylonjs.miscObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gamepadsControllersViveControllerMod {
  
  @JSImport("babylonjs/Gamepads/Controllers/viveController", "ViveController")
  @js.native
  open class ViveController protected () extends WebVRController {
    /**
      * Creates a new ViveController from a gamepad
      * @param vrGamepad the gamepad that the controller should be created from
      */
    def this(vrGamepad: Any) = this()
    
    /**
      * Called once for each button that changed state since the last frame
      * Vive mapping:
      * 0: touchpad
      * 1: trigger
      * 2: left AND right buttons
      * 3: menu button
      * @param buttonIdx Which button index changed
      * @param state New state of the button
      */
    /* protected */ def _handleButtonChange(buttonIdx: Double, state: ExtendedGamepadButton): Unit = js.native
    
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
  object ViveController {
    
    @JSImport("babylonjs/Gamepads/Controllers/viveController", "ViveController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Base Url for the controller model.
      */
    @JSImport("babylonjs/Gamepads/Controllers/viveController", "ViveController.MODEL_BASE_URL")
    @js.native
    def MODEL_BASE_URL: String = js.native
    inline def MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_BASE_URL")(x.asInstanceOf[js.Any])
    
    /**
      * File name for the controller model.
      */
    @JSImport("babylonjs/Gamepads/Controllers/viveController", "ViveController.MODEL_FILENAME")
    @js.native
    def MODEL_FILENAME: String = js.native
    inline def MODEL_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_FILENAME")(x.asInstanceOf[js.Any])
  }
}
