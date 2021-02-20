package typings.babylonjs

import typings.babylonjs.webVRControllerMod.WebVRController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gearVRControllerMod {
  
  @JSImport("babylonjs/Gamepads/Controllers/gearVRController", "GearVRController")
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
  object GearVRController {
    
    @JSImport("babylonjs/Gamepads/Controllers/gearVRController", "GearVRController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gamepad Id prefix used to identify this controller.
      */
    @JSImport("babylonjs/Gamepads/Controllers/gearVRController", "GearVRController.GAMEPAD_ID_PREFIX")
    @js.native
    val GAMEPAD_ID_PREFIX: String = js.native
    
    /**
      * Base Url for the controller model.
      */
    @JSImport("babylonjs/Gamepads/Controllers/gearVRController", "GearVRController.MODEL_BASE_URL")
    @js.native
    def MODEL_BASE_URL: String = js.native
    @scala.inline
    def MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_BASE_URL")(x.asInstanceOf[js.Any])
    
    /**
      * File name for the controller model.
      */
    @JSImport("babylonjs/Gamepads/Controllers/gearVRController", "GearVRController.MODEL_FILENAME")
    @js.native
    def MODEL_FILENAME: String = js.native
    @scala.inline
    def MODEL_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_FILENAME")(x.asInstanceOf[js.Any])
  }
}
