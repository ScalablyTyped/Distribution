package typings.babylonjs

import typings.babylonjs.gamepadsControllersPoseEnabledControllerMod.GamePadFactory
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gamepadsControllersIndexMod {
  
  @JSImport("babylonjs/Gamepads/Controllers/index", "DaydreamController")
  @js.native
  open class DaydreamController protected ()
    extends typings.babylonjs.gamepadsControllersDaydreamControllerMod.DaydreamController {
    /**
      * Creates a new DaydreamController from a gamepad
      * @param vrGamepad the gamepad that the controller should be created from
      */
    def this(vrGamepad: Any) = this()
  }
  /* static members */
  object DaydreamController {
    
    @JSImport("babylonjs/Gamepads/Controllers/index", "DaydreamController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gamepad Id prefix used to identify Daydream Controller.
      */
    @JSImport("babylonjs/Gamepads/Controllers/index", "DaydreamController.GAMEPAD_ID_PREFIX")
    @js.native
    val GAMEPAD_ID_PREFIX: String = js.native
    
    /**
      * Base Url for the controller model.
      */
    @JSImport("babylonjs/Gamepads/Controllers/index", "DaydreamController.MODEL_BASE_URL")
    @js.native
    def MODEL_BASE_URL: String = js.native
    inline def MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_BASE_URL")(x.asInstanceOf[js.Any])
    
    /**
      * File name for the controller model.
      */
    @JSImport("babylonjs/Gamepads/Controllers/index", "DaydreamController.MODEL_FILENAME")
    @js.native
    def MODEL_FILENAME: String = js.native
    inline def MODEL_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_FILENAME")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Gamepads/Controllers/index", "GearVRController")
  @js.native
  open class GearVRController protected ()
    extends typings.babylonjs.gamepadsControllersGearVRControllerMod.GearVRController {
    /**
      * Creates a new GearVRController from a gamepad
      * @param vrGamepad the gamepad that the controller should be created from
      */
    def this(vrGamepad: Any) = this()
  }
  /* static members */
  object GearVRController {
    
    @JSImport("babylonjs/Gamepads/Controllers/index", "GearVRController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gamepad Id prefix used to identify this controller.
      */
    @JSImport("babylonjs/Gamepads/Controllers/index", "GearVRController.GAMEPAD_ID_PREFIX")
    @js.native
    val GAMEPAD_ID_PREFIX: String = js.native
    
    /**
      * Base Url for the controller model.
      */
    @JSImport("babylonjs/Gamepads/Controllers/index", "GearVRController.MODEL_BASE_URL")
    @js.native
    def MODEL_BASE_URL: String = js.native
    inline def MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_BASE_URL")(x.asInstanceOf[js.Any])
    
    /**
      * File name for the controller model.
      */
    @JSImport("babylonjs/Gamepads/Controllers/index", "GearVRController.MODEL_FILENAME")
    @js.native
    def MODEL_FILENAME: String = js.native
    inline def MODEL_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_FILENAME")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Gamepads/Controllers/index", "GenericController")
  @js.native
  open class GenericController protected ()
    extends typings.babylonjs.gamepadsControllersGenericControllerMod.GenericController {
    /**
      * Creates a new GenericController from a gamepad
      * @param vrGamepad the gamepad that the controller should be created from
      */
    def this(vrGamepad: Any) = this()
  }
  /* static members */
  object GenericController {
    
    /**
      * Base Url for the controller model.
      */
    @JSImport("babylonjs/Gamepads/Controllers/index", "GenericController.MODEL_BASE_URL")
    @js.native
    val MODEL_BASE_URL: String = js.native
    
    /**
      * File name for the controller model.
      */
    @JSImport("babylonjs/Gamepads/Controllers/index", "GenericController.MODEL_FILENAME")
    @js.native
    val MODEL_FILENAME: String = js.native
  }
  
  @JSImport("babylonjs/Gamepads/Controllers/index", "OculusTouchController")
  @js.native
  open class OculusTouchController protected ()
    extends typings.babylonjs.gamepadsControllersOculusTouchControllerMod.OculusTouchController {
    /**
      * Creates a new OculusTouchController from a gamepad
      * @param vrGamepad the gamepad that the controller should be created from
      */
    def this(vrGamepad: Any) = this()
  }
  /* static members */
  object OculusTouchController {
    
    @JSImport("babylonjs/Gamepads/Controllers/index", "OculusTouchController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Base Url for the controller model.
      */
    @JSImport("babylonjs/Gamepads/Controllers/index", "OculusTouchController.MODEL_BASE_URL")
    @js.native
    def MODEL_BASE_URL: String = js.native
    inline def MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_BASE_URL")(x.asInstanceOf[js.Any])
    
    /**
      * File name for the left controller model.
      */
    @JSImport("babylonjs/Gamepads/Controllers/index", "OculusTouchController.MODEL_LEFT_FILENAME")
    @js.native
    def MODEL_LEFT_FILENAME: String = js.native
    inline def MODEL_LEFT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_LEFT_FILENAME")(x.asInstanceOf[js.Any])
    
    /**
      * File name for the right controller model.
      */
    @JSImport("babylonjs/Gamepads/Controllers/index", "OculusTouchController.MODEL_RIGHT_FILENAME")
    @js.native
    def MODEL_RIGHT_FILENAME: String = js.native
    inline def MODEL_RIGHT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_RIGHT_FILENAME")(x.asInstanceOf[js.Any])
    
    /**
      * Base Url for the Quest controller model.
      */
    @JSImport("babylonjs/Gamepads/Controllers/index", "OculusTouchController.QUEST_MODEL_BASE_URL")
    @js.native
    def QUEST_MODEL_BASE_URL: String = js.native
    inline def QUEST_MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUEST_MODEL_BASE_URL")(x.asInstanceOf[js.Any])
    
    /**
      * @internal
      * If the controllers are running on a device that needs the updated Quest controller models
      */
    @JSImport("babylonjs/Gamepads/Controllers/index", "OculusTouchController._IsQuest")
    @js.native
    def _IsQuest: Boolean = js.native
    inline def _IsQuest_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsQuest")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Gamepads/Controllers/index", "PoseEnabledController")
  @js.native
  open class PoseEnabledController protected ()
    extends typings.babylonjs.gamepadsControllersPoseEnabledControllerMod.PoseEnabledController {
    /**
      * Creates a new PoseEnabledController from a gamepad
      * @param browserGamepad the gamepad that the PoseEnabledController should be created from
      */
    def this(browserGamepad: Any) = this()
  }
  /* static members */
  object PoseEnabledController {
    
    /**
      * Name of the child mesh that can be used to cast a ray from the controller
      */
    @JSImport("babylonjs/Gamepads/Controllers/index", "PoseEnabledController.POINTING_POSE")
    @js.native
    val POINTING_POSE: String = js.native
  }
  
  @JSImport("babylonjs/Gamepads/Controllers/index", "PoseEnabledControllerHelper")
  @js.native
  open class PoseEnabledControllerHelper ()
    extends typings.babylonjs.gamepadsControllersPoseEnabledControllerMod.PoseEnabledControllerHelper
  /* static members */
  object PoseEnabledControllerHelper {
    
    @JSImport("babylonjs/Gamepads/Controllers/index", "PoseEnabledControllerHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Initializes a gamepad as the controller type it is specified as (eg. windows mixed reality controller)
      * @param vrGamepad the gamepad to initialized
      * @returns a vr controller of the type the gamepad identified as
      */
    inline def InitiateController(vrGamepad: Any): typings.babylonjs.gamepadsGamepadMod.Gamepad = ^.asInstanceOf[js.Dynamic].applyDynamic("InitiateController")(vrGamepad.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.gamepadsGamepadMod.Gamepad]
    
    /** @internal */
    @JSImport("babylonjs/Gamepads/Controllers/index", "PoseEnabledControllerHelper._ControllerFactories")
    @js.native
    def _ControllerFactories: js.Array[GamePadFactory] = js.native
    inline def _ControllerFactories_=(x: js.Array[GamePadFactory]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ControllerFactories")(x.asInstanceOf[js.Any])
    
    /** @internal */
    @JSImport("babylonjs/Gamepads/Controllers/index", "PoseEnabledControllerHelper._DefaultControllerFactory")
    @js.native
    def _DefaultControllerFactory: Nullable[
        js.Function1[/* gamepadInfo */ Any, typings.babylonjs.gamepadsGamepadMod.Gamepad]
      ] = js.native
    inline def _DefaultControllerFactory_=(
      x: Nullable[
          js.Function1[/* gamepadInfo */ Any, typings.babylonjs.gamepadsGamepadMod.Gamepad]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DefaultControllerFactory")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Gamepads/Controllers/index", "PoseEnabledControllerType")
  @js.native
  object PoseEnabledControllerType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.babylonjs.gamepadsControllersPoseEnabledControllerMod.PoseEnabledControllerType & Double
      ] = js.native
    
    /* 4 */ val DAYDREAM: typings.babylonjs.gamepadsControllersPoseEnabledControllerMod.PoseEnabledControllerType.DAYDREAM & Double = js.native
    
    /* 3 */ val GEAR_VR: typings.babylonjs.gamepadsControllersPoseEnabledControllerMod.PoseEnabledControllerType.GEAR_VR & Double = js.native
    
    /* 5 */ val GENERIC: typings.babylonjs.gamepadsControllersPoseEnabledControllerMod.PoseEnabledControllerType.GENERIC & Double = js.native
    
    /* 1 */ val OCULUS: typings.babylonjs.gamepadsControllersPoseEnabledControllerMod.PoseEnabledControllerType.OCULUS & Double = js.native
    
    /* 0 */ val VIVE: typings.babylonjs.gamepadsControllersPoseEnabledControllerMod.PoseEnabledControllerType.VIVE & Double = js.native
    
    /* 2 */ val WINDOWS: typings.babylonjs.gamepadsControllersPoseEnabledControllerMod.PoseEnabledControllerType.WINDOWS & Double = js.native
  }
  
  @JSImport("babylonjs/Gamepads/Controllers/index", "ViveController")
  @js.native
  open class ViveController protected ()
    extends typings.babylonjs.gamepadsControllersViveControllerMod.ViveController {
    /**
      * Creates a new ViveController from a gamepad
      * @param vrGamepad the gamepad that the controller should be created from
      */
    def this(vrGamepad: Any) = this()
  }
  /* static members */
  object ViveController {
    
    @JSImport("babylonjs/Gamepads/Controllers/index", "ViveController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Base Url for the controller model.
      */
    @JSImport("babylonjs/Gamepads/Controllers/index", "ViveController.MODEL_BASE_URL")
    @js.native
    def MODEL_BASE_URL: String = js.native
    inline def MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_BASE_URL")(x.asInstanceOf[js.Any])
    
    /**
      * File name for the controller model.
      */
    @JSImport("babylonjs/Gamepads/Controllers/index", "ViveController.MODEL_FILENAME")
    @js.native
    def MODEL_FILENAME: String = js.native
    inline def MODEL_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_FILENAME")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSImport("babylonjs/Gamepads/Controllers/index", "WebVRController")
  @js.native
  open class WebVRController protected ()
    extends typings.babylonjs.gamepadsControllersWebVRControllerMod.WebVRController {
    /**
      * Creates a new WebVRController from a gamepad
      * @param vrGamepad the gamepad that the WebVRController should be created from
      */
    def this(vrGamepad: Any) = this()
  }
  
  @JSImport("babylonjs/Gamepads/Controllers/index", "WindowsMotionController")
  @js.native
  open class WindowsMotionController protected ()
    extends typings.babylonjs.gamepadsControllersWindowsMotionControllerMod.WindowsMotionController {
    /**
      * Creates a new WindowsMotionController from a gamepad
      * @param vrGamepad the gamepad that the controller should be created from
      */
    def this(vrGamepad: Any) = this()
  }
  /* static members */
  object WindowsMotionController {
    
    @JSImport("babylonjs/Gamepads/Controllers/index", "WindowsMotionController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The controller id pattern for this controller type
      */
    @JSImport("babylonjs/Gamepads/Controllers/index", "WindowsMotionController.GAMEPAD_ID_PATTERN")
    @js.native
    val GAMEPAD_ID_PATTERN: Any = js.native
    
    /**
      * The controller name prefix for this controller type
      */
    @JSImport("babylonjs/Gamepads/Controllers/index", "WindowsMotionController.GAMEPAD_ID_PREFIX")
    @js.native
    val GAMEPAD_ID_PREFIX: String = js.native
    
    /**
      * The base url used to load the left and right controller models
      */
    @JSImport("babylonjs/Gamepads/Controllers/index", "WindowsMotionController.MODEL_BASE_URL")
    @js.native
    def MODEL_BASE_URL: String = js.native
    inline def MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_BASE_URL")(x.asInstanceOf[js.Any])
    
    /**
      * The name of the left controller model file
      */
    @JSImport("babylonjs/Gamepads/Controllers/index", "WindowsMotionController.MODEL_LEFT_FILENAME")
    @js.native
    def MODEL_LEFT_FILENAME: String = js.native
    inline def MODEL_LEFT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_LEFT_FILENAME")(x.asInstanceOf[js.Any])
    
    /**
      * The name of the right controller model file
      */
    @JSImport("babylonjs/Gamepads/Controllers/index", "WindowsMotionController.MODEL_RIGHT_FILENAME")
    @js.native
    def MODEL_RIGHT_FILENAME: String = js.native
    inline def MODEL_RIGHT_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_RIGHT_FILENAME")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Gamepads/Controllers/index", "XRWindowsMotionController")
  @js.native
  open class XRWindowsMotionController protected ()
    extends typings.babylonjs.gamepadsControllersWindowsMotionControllerMod.XRWindowsMotionController {
    /**
      * Construct a new XR-Based windows motion controller
      *
      * @param gamepadInfo the gamepad object from the browser
      */
    def this(gamepadInfo: Any) = this()
  }
}
