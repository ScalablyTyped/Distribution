package typings.babylonjs

import typings.babylonjs.observableMod.Observable
import typings.babylonjs.poseEnabledControllerMod.ExtendedGamepadButton
import typings.babylonjs.webVRControllerMod.WebVRController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oculusTouchControllerMod {
  
  @JSImport("babylonjs/Gamepads/Controllers/oculusTouchController", "OculusTouchController")
  @js.native
  class OculusTouchController protected () extends WebVRController {
    /**
      * Creates a new OculusTouchController from a gamepad
      * @param vrGamepad the gamepad that the controller should be created from
      */
    def this(vrGamepad: js.Any) = this()
    
    /**
      * Fired when the A button on this controller is modified
      */
    def onAButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
    
    /**
      * Fired when the B button on this controller is modified
      */
    def onBButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
    
    /**
      * Fired when the secondary trigger on this controller is modified
      */
    var onSecondaryTriggerStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
    
    /**
      * Fired when the thumb rest on this controller is modified
      */
    var onThumbRestChangedObservable: Observable[ExtendedGamepadButton] = js.native
    
    /**
      * Fired when the X button on this controller is modified
      */
    def onXButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
    
    /**
      * Fired when the Y button on this controller is modified
      */
    def onYButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  }
  /* static members */
  object OculusTouchController {
    
    @JSImport("babylonjs/Gamepads/Controllers/oculusTouchController", "OculusTouchController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Base Url for the controller model.
      */
    @JSImport("babylonjs/Gamepads/Controllers/oculusTouchController", "OculusTouchController.MODEL_BASE_URL")
    @js.native
    def MODEL_BASE_URL: String = js.native
    @scala.inline
    def MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_BASE_URL")(x.asInstanceOf[js.Any])
    
    /**
      * File name for the left controller model.
      */
    @JSImport("babylonjs/Gamepads/Controllers/oculusTouchController", "OculusTouchController.MODEL_LEFT_FILENAME")
    @js.native
    def MODEL_LEFT_FILENAME: String = js.native
    @scala.inline
    def MODEL_LEFT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_LEFT_FILENAME")(x.asInstanceOf[js.Any])
    
    /**
      * File name for the right controller model.
      */
    @JSImport("babylonjs/Gamepads/Controllers/oculusTouchController", "OculusTouchController.MODEL_RIGHT_FILENAME")
    @js.native
    def MODEL_RIGHT_FILENAME: String = js.native
    @scala.inline
    def MODEL_RIGHT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_RIGHT_FILENAME")(x.asInstanceOf[js.Any])
    
    /**
      * Base Url for the Quest controller model.
      */
    @JSImport("babylonjs/Gamepads/Controllers/oculusTouchController", "OculusTouchController.QUEST_MODEL_BASE_URL")
    @js.native
    def QUEST_MODEL_BASE_URL: String = js.native
    @scala.inline
    def QUEST_MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUEST_MODEL_BASE_URL")(x.asInstanceOf[js.Any])
    
    /**
      * @hidden
      * If the controllers are running on a device that needs the updated Quest controller models
      */
    @JSImport("babylonjs/Gamepads/Controllers/oculusTouchController", "OculusTouchController._IsQuest")
    @js.native
    def _IsQuest: Boolean = js.native
    @scala.inline
    def _IsQuest_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsQuest")(x.asInstanceOf[js.Any])
  }
}
