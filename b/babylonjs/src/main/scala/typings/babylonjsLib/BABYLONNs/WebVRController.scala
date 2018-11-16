package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines the WebVRController object that represents controllers tracked in 3D space
     */
@JSGlobal("BABYLON.WebVRController")
@js.native
abstract class WebVRController protected () extends PoseEnabledController {
  /**
           * Creates a new WebVRController from a gamepad
           * @param vrGamepad the gamepad that the WebVRController should be created from
           */
  def this(vrGamepad: js.Any) = this()
  /**
           * Array of button availible on the controller
           */
  var _buttons: js.Array[MutableGamepadButton] = js.native
  var _changes: js.Any = js.native
  var _checkChanges: js.Any = js.native
  /**
           * Internal, the default controller model for the controller
           */
  var _defaultModel: AbstractMesh = js.native
  var _onButtonStateChange: js.Any = js.native
  var _setButtonValue: js.Any = js.native
  /**
           * The default controller model for the controller
           */
  val defaultModel: AbstractMesh = js.native
  /**
           * 'left' or 'right', see https://w3c.github.io/gamepad/extensions.html#gamepadhand-enum
           */
  var hand: java.lang.String = js.native
  /**
           * Fired when the main button state has changed
           */
  var onMainButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
           * Fired when the pad state has changed
           */
  var onPadStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
           * Fired when controllers stick values have changed
           */
  var onPadValuesChangedObservable: Observable[StickValues] = js.native
  /**
           * Fired when the secondary button state has changed
           */
  var onSecondaryButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
           * Fired when the trigger state has changed
           */
  var onTriggerStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  /**
           * X and Y axis corrisponding to the controllers joystick
           */
  var pad: StickValues = js.native
  /**
           * Function to be called when a button is modified
           */
  /* protected */ def _handleButtonChange(buttonIdx: scala.Double, value: ExtendedGamepadButton, changes: GamepadButtonChanges): scala.Unit = js.native
  /**
           * Loads a mesh and attaches it to the controller
           * @param scene the scene the mesh should be added to
           * @param meshLoaded callback for when the mesh has been loaded
           */
  def initControllerMesh(scene: Scene): scala.Unit = js.native
  /**
           * Loads a mesh and attaches it to the controller
           * @param scene the scene the mesh should be added to
           * @param meshLoaded callback for when the mesh has been loaded
           */
  def initControllerMesh(scene: Scene, meshLoaded: js.Function1[/* mesh */ AbstractMesh, scala.Unit]): scala.Unit = js.native
  /**
           * Fired when a controller button's state has changed
           * @param callback the callback containing the button that was modified
           */
  def onButtonStateChange(
    callback: js.Function3[
      /* controlledIndex */ scala.Double, 
      /* buttonIndex */ scala.Double, 
      /* state */ ExtendedGamepadButton, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

