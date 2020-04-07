package typings.babylonjs.BABYLON

import typings.babylonjs.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.VirtualJoystick")
@js.native
/**
  * Creates a new virtual joystick
  * @param leftJoystick defines that the joystick is for left hand (false by default)
  */
class VirtualJoystick () extends js.Object {
  def this(leftJoystick: Boolean) = this()
  var _action: js.Any = js.native
  var _axisTargetedByLeftAndRight: js.Any = js.native
  var _axisTargetedByUpAndDown: js.Any = js.native
  var _deltaJoystickVector: js.Any = js.native
  var _drawVirtualJoystick: js.Any = js.native
  var _inversedSensibility: js.Any = js.native
  var _joystickColor: js.Any = js.native
  var _joystickPointerID: js.Any = js.native
  var _joystickPointerPos: js.Any = js.native
  var _joystickPointerStartPos: js.Any = js.native
  var _joystickPreviousPointerPos: js.Any = js.native
  var _joystickSensibility: js.Any = js.native
  var _leftJoystick: js.Any = js.native
  var _onPointerDown: js.Any = js.native
  var _onPointerDownHandlerRef: js.Any = js.native
  var _onPointerMove: js.Any = js.native
  var _onPointerMoveHandlerRef: js.Any = js.native
  var _onPointerUp: js.Any = js.native
  var _onPointerUpHandlerRef: js.Any = js.native
  var _onResize: js.Any = js.native
  var _touches: js.Any = js.native
  /**
    * Gets the offset value for the position (ie. the change of the position value)
    */
  var deltaPosition: Vector3 = js.native
  /**
    * Gets a boolean indicating if the virtual joystick was pressed
    */
  var pressed: Boolean = js.native
  /**
    * Gets or sets a boolean indicating that left and right values must be inverted
    */
  var reverseLeftRight: Boolean = js.native
  /**
    * Gets or sets a boolean indicating that up and down values must be inverted
    */
  var reverseUpDown: Boolean = js.native
  /**
    * Release internal HTML canvas
    */
  def releaseCanvas(): Unit = js.native
  /**
    * Defines a callback to call when the joystick is touched
    * @param action defines the callback
    */
  def setActionOnTouch(action: js.Function0[_]): Unit = js.native
  /**
    * Defines which axis you'd like to control for left & right
    * @param axis defines the axis to use
    */
  def setAxisForLeftRight(axis: JoystickAxis): Unit = js.native
  /**
    * Defines which axis you'd like to control for up & down
    * @param axis defines the axis to use
    */
  def setAxisForUpDown(axis: JoystickAxis): Unit = js.native
  /**
    * Change the color of the virtual joystick
    * @param newColor a string that must be a CSS color value (like "red") or the hexa value (like "#FF0000")
    */
  def setJoystickColor(newColor: String): Unit = js.native
  /**
    * Defines joystick sensibility (ie. the ratio beteen a physical move and virtual joystick position change)
    * @param newJoystickSensibility defines the new sensibility
    */
  def setJoystickSensibility(newJoystickSensibility: Double): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.VirtualJoystick")
@js.native
object VirtualJoystick extends js.Object {
  /**
    * Canvas the virtual joystick will render onto, default z-index of this is 5
    */
  var Canvas: Nullable[HTMLCanvasElement] = js.native
  var _globalJoystickIndex: js.Any = js.native
  var halfWidth: js.Any = js.native
  var vjCanvasContext: js.Any = js.native
  var vjCanvasHeight: js.Any = js.native
  var vjCanvasWidth: js.Any = js.native
}

