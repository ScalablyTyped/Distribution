package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.gamepadMod.GamepadButtonChanges
import typings.babylonjs.gamepadMod.StickValues
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.poseEnabledControllerMod.ExtendedGamepadButton
import typings.babylonjs.poseEnabledControllerMod.MutableGamepadButton
import typings.babylonjs.poseEnabledControllerMod.PoseEnabledController
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Gamepads/Controllers/webVRController", JSImport.Namespace)
@js.native
object webVRControllerMod extends js.Object {
  
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
    var _defaultModel: Nullable[AbstractMesh] = js.native
    
    /**
      * Function to be called when a button is modified
      */
    /* protected */ def _handleButtonChange(buttonIdx: Double, value: ExtendedGamepadButton, changes: GamepadButtonChanges): Unit = js.native
    
    var _onButtonStateChange: js.Any = js.native
    
    var _setButtonValue: js.Any = js.native
    
    /**
      * The default controller model for the controller
      */
    def defaultModel: Nullable[AbstractMesh] = js.native
    
    /**
      * 'left' or 'right', see https://w3c.github.io/gamepad/extensions.html#gamepadhand-enum
      */
    var hand: String = js.native
    
    /**
      * Loads a mesh and attaches it to the controller
      * @param scene the scene the mesh should be added to
      * @param meshLoaded callback for when the mesh has been loaded
      */
    def initControllerMesh(scene: Scene): Unit = js.native
    def initControllerMesh(scene: Scene, meshLoaded: js.Function1[/* mesh */ AbstractMesh, Unit]): Unit = js.native
    
    /**
      * Fired when a controller button's state has changed
      * @param callback the callback containing the button that was modified
      */
    def onButtonStateChange(
      callback: js.Function3[
          /* controlledIndex */ Double, 
          /* buttonIndex */ Double, 
          /* state */ ExtendedGamepadButton, 
          Unit
        ]
    ): Unit = js.native
    
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
      * X and Y axis corresponding to the controllers joystick
      */
    var pad: StickValues = js.native
  }
}
