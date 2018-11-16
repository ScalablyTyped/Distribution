package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines the WindowsMotionController object that the state of the windows motion controller
     */
@JSGlobal("BABYLON.WindowsMotionController")
@js.native
class WindowsMotionController protected () extends WebVRController {
  /**
           * Creates a new WindowsMotionController from a gamepad
           * @param vrGamepad the gamepad that the controller should be created from
           */
  def this(vrGamepad: js.Any) = this()
  var _loadedMeshInfo: js.Any = js.native
  val _mapping: js.Any = js.native
  var _updateTrackpad: js.Any = js.native
  var createMeshInfo: js.Any = js.native
  /**
           * Fired when the grip button on this controller is modified
           */
  val onGripButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
           * Fired when the menu button on this controller is modified
           */
  val onMenuButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
           * Fired when the thumbstick button on this controller is modified
           */
  val onThumbstickButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
           * Fired when the touchpad button on this controller is modified
           */
  val onTouchpadButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
           * Fired when the touchpad values on this controller are modified
           */
  val onTouchpadValuesChangedObservable: Observable[StickValues] = js.native
  /**
           * Fired when the trackpad on this controller is clicked
           */
  var onTrackpadChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
           * Fired when the trackpad on this controller is modified
           */
  var onTrackpadValuesChangedObservable: Observable[StickValues] = js.native
  /**
           * Fired when the trigger on this controller is modified
           */
  val onTriggerButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
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
  /* protected */ def _lerpAxisTransform(axis: scala.Double, axisValue: scala.Double): scala.Unit = js.native
  /**
           * Moves the buttons on the controller mesh based on their current state
           * @param buttonName the name of the button to move
           * @param buttonValue the value of the button which determines the buttons new position
           */
  /* protected */ def _lerpButtonTransform(buttonName: java.lang.String, buttonValue: scala.Double): scala.Unit = js.native
  /**
           * Implements abstract method on WebVRController class, loading controller meshes and calling this.attachToMesh if successful.
           * @param scene scene in which to add meshes
           * @param meshLoaded optional callback function that will be called if the mesh loads successfully.
           */
  def initControllerMesh(
    scene: Scene,
    meshLoaded: js.Function1[/* mesh */ AbstractMesh, scala.Unit],
    forceDefault: scala.Boolean
  ): scala.Unit = js.native
}

/**
     * Defines the WindowsMotionController object that the state of the windows motion controller
     */
@JSGlobal("BABYLON.WindowsMotionController")
@js.native
object WindowsMotionController extends js.Object {
  /**
           * The controller id pattern for this controller type
           */
  val GAMEPAD_ID_PATTERN: js.Any = js.native
  /**
           * The controller name prefix for this controller type
           */
  val GAMEPAD_ID_PREFIX: java.lang.String = js.native
  /**
           * The base url used to load the left and right controller models
           */
  var MODEL_BASE_URL: java.lang.String = js.native
  /**
           * The name of the left controller model file
           */
  var MODEL_LEFT_FILENAME: java.lang.String = js.native
  /**
           * The name of the right controller model file
           */
  var MODEL_RIGHT_FILENAME: java.lang.String = js.native
}

