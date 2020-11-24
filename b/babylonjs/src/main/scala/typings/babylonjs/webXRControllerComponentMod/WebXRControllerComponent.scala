package typings.babylonjs.webXRControllerComponentMod

import typings.babylonjs.anon.Y
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.webXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typings.babylonjs.webXRAbstractMotionControllerMod.MotionControllerComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/motionController/webXRControllerComponent", "WebXRControllerComponent")
@js.native
class WebXRControllerComponent protected () extends IDisposable {
  /**
    * Creates a new component for a motion controller.
    * It is created by the motion controller itself
    *
    * @param id the id of this component
    * @param type the type of the component
    * @param _buttonIndex index in the buttons array of the gamepad
    * @param _axesIndices indices of the values in the axes array of the gamepad
    */
  def this(
    /**
    * the id of this component
    */
  id: String,
    /**
    * the type of the component
    */
  `type`: MotionControllerComponentType
  ) = this()
  def this(
    /**
    * the id of this component
    */
  id: String,
    /**
    * the type of the component
    */
  `type`: MotionControllerComponentType,
    _buttonIndex: Double
  ) = this()
  def this(
    /**
    * the id of this component
    */
  id: String,
    /**
    * the type of the component
    */
  `type`: MotionControllerComponentType,
    _buttonIndex: js.UndefOr[scala.Nothing],
    _axesIndices: js.Array[Double]
  ) = this()
  def this(
    /**
    * the id of this component
    */
  id: String,
    /**
    * the type of the component
    */
  `type`: MotionControllerComponentType,
    _buttonIndex: Double,
    _axesIndices: js.Array[Double]
  ) = this()
  
  var _axes: js.Any = js.native
  
  var _axesIndices: js.Any = js.native
  
  var _buttonIndex: js.Any = js.native
  
  var _changes: js.Any = js.native
  
  var _currentValue: js.Any = js.native
  
  var _hasChanges: js.Any = js.native
  
  var _pressed: js.Any = js.native
  
  var _touched: js.Any = js.native
  
  /**
    * The current axes data. If this component has no axes it will still return an object { x: 0, y: 0 }
    */
  def axes: IWebXRMotionControllerAxesValue = js.native
  
  /**
    * Get the changes. Elements will be populated only if they changed with their previous and current value
    */
  def changes: IWebXRMotionControllerComponentChanges = js.native
  
  /**
    * Return whether or not the component changed the last frame
    */
  def hasChanges: Boolean = js.native
  
  /**
    * the id of this component
    */
  var id: String = js.native
  
  /**
    * Are there axes correlating to this component
    * @return true is axes data is available
    */
  def isAxes(): Boolean = js.native
  
  /**
    * Is this component a button (hence - pressable)
    * @returns true if can be pressed
    */
  def isButton(): Boolean = js.native
  
  /**
    * If axes are available for this component (like a touchpad or thumbstick) the observers will be notified when
    * the axes data changes
    */
  var onAxisValueChangedObservable: Observable[Y] = js.native
  
  /**
    * Observers registered here will be triggered when the state of a button changes
    * State change is either pressed / touched / value
    */
  var onButtonStateChangedObservable: Observable[WebXRControllerComponent] = js.native
  
  /**
    * is the button currently pressed
    */
  def pressed: Boolean = js.native
  
  /**
    * is the button currently touched
    */
  def touched: Boolean = js.native
  
  /**
    * the type of the component
    */
  var `type`: MotionControllerComponentType = js.native
  
  /**
    * update this component using the gamepad object it is in. Called on every frame
    * @param nativeController the native gamepad controller object
    */
  def update(nativeController: IMinimalMotionControllerObject): Unit = js.native
  
  /**
    * Get the current value of this component
    */
  def value: Double = js.native
}
/* static members */
@JSImport("babylonjs/XR/motionController/webXRControllerComponent", "WebXRControllerComponent")
@js.native
object WebXRControllerComponent extends js.Object {
  
  /**
    * button component type
    */
  var BUTTON_TYPE: MotionControllerComponentType = js.native
  
  /**
    * squeeze component type
    */
  var SQUEEZE_TYPE: MotionControllerComponentType = js.native
  
  /**
    * Thumbstick component type
    */
  var THUMBSTICK_TYPE: MotionControllerComponentType = js.native
  
  /**
    * Touchpad component type
    */
  var TOUCHPAD_TYPE: MotionControllerComponentType = js.native
  
  /**
    * trigger component type
    */
  var TRIGGER_TYPE: MotionControllerComponentType = js.native
}
