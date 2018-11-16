package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to define virtual joystick (used in touch mode)
     */
@JSGlobal("BABYLON.VirtualJoystick")
@js.native
class VirtualJoystick () extends js.Object {
  /**
           * Creates a new virtual joystick
           * @param leftJoystick defines that the joystick is for left hand (false by default)
           */
  def this(leftJoystick: scala.Boolean) = this()
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
  var pressed: scala.Boolean = js.native
  /**
           * Gets or sets a boolean indicating that left and right values must be inverted
           */
  var reverseLeftRight: scala.Boolean = js.native
  /**
           * Gets or sets a boolean indicating that up and down values must be inverted
           */
  var reverseUpDown: scala.Boolean = js.native
  /**
           * Release internal HTML canvas
           */
  def releaseCanvas(): scala.Unit = js.native
  /**
           * Defines a callback to call when the joystick is touched
           * @param action defines the callback
           */
  def setActionOnTouch(action: js.Function0[_]): scala.Unit = js.native
  /**
           * Defines which axis you'd like to control for left & right
           * @param axis defines the axis to use
           */
  def setAxisForLeftRight(axis: JoystickAxis): scala.Unit = js.native
  /**
           * Defines which axis you'd like to control for up & down
           * @param axis defines the axis to use
           */
  def setAxisForUpDown(axis: JoystickAxis): scala.Unit = js.native
  /**
          * Change the color of the virtual joystick
          * @param newColor a string that must be a CSS color value (like "red") or the hexa value (like "#FF0000")
          */
  def setJoystickColor(newColor: java.lang.String): scala.Unit = js.native
  /**
           * Defines joystick sensibility (ie. the ratio beteen a physical move and virtual joystick position change)
           * @param newJoystickSensibility defines the new sensibility
           */
  def setJoystickSensibility(newJoystickSensibility: scala.Double): scala.Unit = js.native
}

/**
     * Class used to define virtual joystick (used in touch mode)
     */
@JSGlobal("BABYLON.VirtualJoystick")
@js.native
object VirtualJoystick extends js.Object {
  var _globalJoystickIndex: js.Any = js.native
  var halfWidth: js.Any = js.native
  var vjCanvas: js.Any = js.native
  var vjCanvasContext: js.Any = js.native
  var vjCanvasHeight: js.Any = js.native
  var vjCanvasWidth: js.Any = js.native
}

