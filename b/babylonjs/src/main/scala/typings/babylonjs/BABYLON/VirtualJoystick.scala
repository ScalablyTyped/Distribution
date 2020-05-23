package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualJoystick extends js.Object {
  var _action: js.Any
  var _axisTargetedByLeftAndRight: js.Any
  var _axisTargetedByUpAndDown: js.Any
  var _deltaJoystickVector: js.Any
  var _drawVirtualJoystick: js.Any
  var _inversedSensibility: js.Any
  var _joystickColor: js.Any
  var _joystickPointerID: js.Any
  var _joystickPointerPos: js.Any
  var _joystickPointerStartPos: js.Any
  var _joystickPreviousPointerPos: js.Any
  var _joystickSensibility: js.Any
  var _leftJoystick: js.Any
  var _onPointerDown: js.Any
  var _onPointerDownHandlerRef: js.Any
  var _onPointerMove: js.Any
  var _onPointerMoveHandlerRef: js.Any
  var _onPointerUp: js.Any
  var _onPointerUpHandlerRef: js.Any
  var _onResize: js.Any
  var _touches: js.Any
  /**
    * Gets the offset value for the position (ie. the change of the position value)
    */
  var deltaPosition: Vector3
  /**
    * Gets a boolean indicating if the virtual joystick was pressed
    */
  var pressed: Boolean
  /**
    * Gets or sets a boolean indicating that left and right values must be inverted
    */
  var reverseLeftRight: Boolean
  /**
    * Gets or sets a boolean indicating that up and down values must be inverted
    */
  var reverseUpDown: Boolean
  /**
    * Release internal HTML canvas
    */
  def releaseCanvas(): Unit
  /**
    * Defines a callback to call when the joystick is touched
    * @param action defines the callback
    */
  def setActionOnTouch(action: js.Function0[_]): Unit
  /**
    * Defines which axis you'd like to control for left & right
    * @param axis defines the axis to use
    */
  def setAxisForLeftRight(axis: JoystickAxis): Unit
  /**
    * Defines which axis you'd like to control for up & down
    * @param axis defines the axis to use
    */
  def setAxisForUpDown(axis: JoystickAxis): Unit
  /**
    * Change the color of the virtual joystick
    * @param newColor a string that must be a CSS color value (like "red") or the hexa value (like "#FF0000")
    */
  def setJoystickColor(newColor: String): Unit
  /**
    * Defines joystick sensibility (ie. the ratio beteen a physical move and virtual joystick position change)
    * @param newJoystickSensibility defines the new sensibility
    */
  def setJoystickSensibility(newJoystickSensibility: Double): Unit
}

object VirtualJoystick {
  @scala.inline
  def apply(
    _action: js.Any,
    _axisTargetedByLeftAndRight: js.Any,
    _axisTargetedByUpAndDown: js.Any,
    _deltaJoystickVector: js.Any,
    _drawVirtualJoystick: js.Any,
    _inversedSensibility: js.Any,
    _joystickColor: js.Any,
    _joystickPointerID: js.Any,
    _joystickPointerPos: js.Any,
    _joystickPointerStartPos: js.Any,
    _joystickPreviousPointerPos: js.Any,
    _joystickSensibility: js.Any,
    _leftJoystick: js.Any,
    _onPointerDown: js.Any,
    _onPointerDownHandlerRef: js.Any,
    _onPointerMove: js.Any,
    _onPointerMoveHandlerRef: js.Any,
    _onPointerUp: js.Any,
    _onPointerUpHandlerRef: js.Any,
    _onResize: js.Any,
    _touches: js.Any,
    deltaPosition: Vector3,
    pressed: Boolean,
    releaseCanvas: () => Unit,
    reverseLeftRight: Boolean,
    reverseUpDown: Boolean,
    setActionOnTouch: js.Function0[_] => Unit,
    setAxisForLeftRight: JoystickAxis => Unit,
    setAxisForUpDown: JoystickAxis => Unit,
    setJoystickColor: String => Unit,
    setJoystickSensibility: Double => Unit
  ): VirtualJoystick = {
    val __obj = js.Dynamic.literal(_action = _action.asInstanceOf[js.Any], _axisTargetedByLeftAndRight = _axisTargetedByLeftAndRight.asInstanceOf[js.Any], _axisTargetedByUpAndDown = _axisTargetedByUpAndDown.asInstanceOf[js.Any], _deltaJoystickVector = _deltaJoystickVector.asInstanceOf[js.Any], _drawVirtualJoystick = _drawVirtualJoystick.asInstanceOf[js.Any], _inversedSensibility = _inversedSensibility.asInstanceOf[js.Any], _joystickColor = _joystickColor.asInstanceOf[js.Any], _joystickPointerID = _joystickPointerID.asInstanceOf[js.Any], _joystickPointerPos = _joystickPointerPos.asInstanceOf[js.Any], _joystickPointerStartPos = _joystickPointerStartPos.asInstanceOf[js.Any], _joystickPreviousPointerPos = _joystickPreviousPointerPos.asInstanceOf[js.Any], _joystickSensibility = _joystickSensibility.asInstanceOf[js.Any], _leftJoystick = _leftJoystick.asInstanceOf[js.Any], _onPointerDown = _onPointerDown.asInstanceOf[js.Any], _onPointerDownHandlerRef = _onPointerDownHandlerRef.asInstanceOf[js.Any], _onPointerMove = _onPointerMove.asInstanceOf[js.Any], _onPointerMoveHandlerRef = _onPointerMoveHandlerRef.asInstanceOf[js.Any], _onPointerUp = _onPointerUp.asInstanceOf[js.Any], _onPointerUpHandlerRef = _onPointerUpHandlerRef.asInstanceOf[js.Any], _onResize = _onResize.asInstanceOf[js.Any], _touches = _touches.asInstanceOf[js.Any], deltaPosition = deltaPosition.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any], releaseCanvas = js.Any.fromFunction0(releaseCanvas), reverseLeftRight = reverseLeftRight.asInstanceOf[js.Any], reverseUpDown = reverseUpDown.asInstanceOf[js.Any], setActionOnTouch = js.Any.fromFunction1(setActionOnTouch), setAxisForLeftRight = js.Any.fromFunction1(setAxisForLeftRight), setAxisForUpDown = js.Any.fromFunction1(setAxisForUpDown), setJoystickColor = js.Any.fromFunction1(setJoystickColor), setJoystickSensibility = js.Any.fromFunction1(setJoystickSensibility))
    __obj.asInstanceOf[VirtualJoystick]
  }
}

