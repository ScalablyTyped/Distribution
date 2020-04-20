package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.gamepadMod.StickValues
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.poseEnabledControllerMod.ExtendedGamepadButton
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.webVRControllerMod.WebVRController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Gamepads/Controllers/windowsMotionController", JSImport.Namespace)
@js.native
object windowsMotionControllerMod extends js.Object {
  @js.native
  class WindowsMotionController protected () extends WebVRController {
    /**
      * Creates a new WindowsMotionController from a gamepad
      * @param vrGamepad the gamepad that the controller should be created from
      */
    def this(vrGamepad: js.Any) = this()
    var _loadedMeshInfo: js.Any = js.native
    val _mapping: AnonAxisMeshNames = js.native
    var createMeshInfo: js.Any = js.native
    /**
      * Fired when the trackpad on this controller is clicked
      */
    var onTrackpadChangedObservable: Observable[ExtendedGamepadButton] = js.native
    /**
      * Fired when the trackpad on this controller is modified
      */
    var onTrackpadValuesChangedObservable: Observable[StickValues] = js.native
    /**
      * Takes a list of meshes (as loaded from the glTF file) and finds the root node, as well as nodes that
      * can be transformed by button presses and axes values, based on this._mapping.
      *
      * @param scene scene in which the meshes exist
      * @param meshes list of meshes that make up the controller model to process
      * @return structured view of the given meshes, with mapping of buttons and axes to meshes that can be transformed.
      */
    var processModel: js.Any = js.native
    /**
      * The current x and y values of this controller's trackpad
      */
    var trackpad: StickValues = js.native
    /**
      * Moves the axis on the controller mesh based on its current state
      * @param axis the index of the axis
      * @param axisValue the value of the axis which determines the meshes new position
      * @hidden
      */
    /* protected */ def _lerpAxisTransform(axis: Double, axisValue: Double): Unit = js.native
    /**
      * Moves the buttons on the controller mesh based on their current state
      * @param buttonName the name of the button to move
      * @param buttonValue the value of the button which determines the buttons new position
      */
    /* protected */ def _lerpButtonTransform(buttonName: String, buttonValue: Double): Unit = js.native
    /* protected */ def _updateTrackpad(): Unit = js.native
    def initControllerMesh(scene: Scene, meshLoaded: js.Function1[/* mesh */ AbstractMesh, Unit], forceDefault: Boolean): Unit = js.native
    /**
      * Fired when the grip button on this controller is modified
      */
    def onGripButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
    /**
      * Fired when the menu button on this controller is modified
      */
    def onMenuButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
    /**
      * Fired when the thumbstick button on this controller is modified
      */
    def onThumbstickButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
    /**
      * Fired when the touchpad button on this controller is modified
      */
    def onTouchpadButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
    /**
      * Fired when the touchpad values on this controller are modified
      */
    def onTouchpadValuesChangedObservable: Observable[StickValues] = js.native
    /**
      * Fired when the trigger on this controller is modified
      */
    def onTriggerButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  }
  
  @js.native
  class XRWindowsMotionController protected () extends WindowsMotionController {
    /**
      * Construct a new XR-Based windows motion controller
      *
      * @param gamepadInfo the gamepad object from the browser
      */
    def this(gamepadInfo: js.Any) = this()
    /**
      * Fired when the thumbstick on this controller is clicked
      */
    var onThumbstickStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
    /**
      * Fired when the thumbstick on this controller is modified
      */
    var onThumbstickValuesChangedObservable: Observable[StickValues] = js.native
    /**
      * holds the thumbstick values (X,Y)
      */
    var thumbstickValues: StickValues = js.native
  }
  
  /* static members */
  @js.native
  object WindowsMotionController extends js.Object {
    /**
      * The controller id pattern for this controller type
      */
    val GAMEPAD_ID_PATTERN: js.Any = js.native
    /**
      * The controller name prefix for this controller type
      */
    val GAMEPAD_ID_PREFIX: String = js.native
    /**
      * The base url used to load the left and right controller models
      */
    var MODEL_BASE_URL: String = js.native
    /**
      * The name of the left controller model file
      */
    var MODEL_LEFT_FILENAME: String = js.native
    /**
      * The name of the right controller model file
      */
    var MODEL_RIGHT_FILENAME: String = js.native
  }
  
}

