package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebXRControllerComponent extends IDisposable {
  var _axes: js.Any
  var _axesIndices: js.Any
  var _buttonIndex: js.Any
  var _changes: js.Any
  var _currentValue: js.Any
  var _hasChanges: js.Any
  var _pressed: js.Any
  var _touched: js.Any
  /**
    * the id of this component
    */
  var id: String
  /**
    * If axes are available for this component (like a touchpad or thumbstick) the observers will be notified when
    * the axes data changes
    */
  var onAxisValueChangedObservable: Observable[Y]
  /**
    * Observers registered here will be triggered when the state of a button changes
    * State change is either pressed / touched / value
    */
  var onButtonStateChangedObservable: Observable[WebXRControllerComponent]
  /**
    * the type of the component
    */
  var `type`: MotionControllerComponentType
  /**
    * The current axes data. If this component has no axes it will still return an object { x: 0, y: 0 }
    */
  def axes: IWebXRMotionControllerAxesValue
  /**
    * Get the changes. Elements will be populated only if they changed with their previous and current value
    */
  def changes: IWebXRMotionControllerComponentChanges
  /**
    * Return whether or not the component changed the last frame
    */
  def hasChanges: Boolean
  /**
    * Are there axes correlating to this component
    * @return true is axes data is available
    */
  def isAxes(): Boolean
  /**
    * Is this component a button (hence - pressable)
    * @returns true if can be pressed
    */
  def isButton(): Boolean
  /**
    * is the button currently pressed
    */
  def pressed: Boolean
  /**
    * is the button currently touched
    */
  def touched: Boolean
  /**
    * update this component using the gamepad object it is in. Called on every frame
    * @param nativeController the native gamepad controller object
    */
  def update(nativeController: IMinimalMotionControllerObject): Unit
  /**
    * Get the current value of this component
    */
  def value: Double
}

object WebXRControllerComponent {
  @scala.inline
  def apply(
    _axes: js.Any,
    _axesIndices: js.Any,
    _buttonIndex: js.Any,
    _changes: js.Any,
    _currentValue: js.Any,
    _hasChanges: js.Any,
    _pressed: js.Any,
    _touched: js.Any,
    axes: () => IWebXRMotionControllerAxesValue,
    changes: () => IWebXRMotionControllerComponentChanges,
    dispose: () => Unit,
    hasChanges: () => Boolean,
    id: String,
    isAxes: () => Boolean,
    isButton: () => Boolean,
    onAxisValueChangedObservable: Observable[Y],
    onButtonStateChangedObservable: Observable[WebXRControllerComponent],
    pressed: () => Boolean,
    touched: () => Boolean,
    `type`: MotionControllerComponentType,
    update: IMinimalMotionControllerObject => Unit,
    value: () => Double
  ): WebXRControllerComponent = {
    val __obj = js.Dynamic.literal(_axes = _axes.asInstanceOf[js.Any], _axesIndices = _axesIndices.asInstanceOf[js.Any], _buttonIndex = _buttonIndex.asInstanceOf[js.Any], _changes = _changes.asInstanceOf[js.Any], _currentValue = _currentValue.asInstanceOf[js.Any], _hasChanges = _hasChanges.asInstanceOf[js.Any], _pressed = _pressed.asInstanceOf[js.Any], _touched = _touched.asInstanceOf[js.Any], axes = js.Any.fromFunction0(axes), changes = js.Any.fromFunction0(changes), dispose = js.Any.fromFunction0(dispose), hasChanges = js.Any.fromFunction0(hasChanges), id = id.asInstanceOf[js.Any], isAxes = js.Any.fromFunction0(isAxes), isButton = js.Any.fromFunction0(isButton), onAxisValueChangedObservable = onAxisValueChangedObservable.asInstanceOf[js.Any], onButtonStateChangedObservable = onButtonStateChangedObservable.asInstanceOf[js.Any], pressed = js.Any.fromFunction0(pressed), touched = js.Any.fromFunction0(touched), update = js.Any.fromFunction1(update), value = js.Any.fromFunction0(value))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebXRControllerComponent]
  }
}

