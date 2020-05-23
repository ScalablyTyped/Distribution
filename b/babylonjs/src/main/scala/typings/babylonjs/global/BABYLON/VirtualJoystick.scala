package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
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
class VirtualJoystick ()
  extends typings.babylonjs.BABYLON.VirtualJoystick {
  def this(leftJoystick: Boolean) = this()
  /* CompleteClass */
  override var _action: js.Any = js.native
  /* CompleteClass */
  override var _axisTargetedByLeftAndRight: js.Any = js.native
  /* CompleteClass */
  override var _axisTargetedByUpAndDown: js.Any = js.native
  /* CompleteClass */
  override var _deltaJoystickVector: js.Any = js.native
  /* CompleteClass */
  override var _drawVirtualJoystick: js.Any = js.native
  /* CompleteClass */
  override var _inversedSensibility: js.Any = js.native
  /* CompleteClass */
  override var _joystickColor: js.Any = js.native
  /* CompleteClass */
  override var _joystickPointerID: js.Any = js.native
  /* CompleteClass */
  override var _joystickPointerPos: js.Any = js.native
  /* CompleteClass */
  override var _joystickPointerStartPos: js.Any = js.native
  /* CompleteClass */
  override var _joystickPreviousPointerPos: js.Any = js.native
  /* CompleteClass */
  override var _joystickSensibility: js.Any = js.native
  /* CompleteClass */
  override var _leftJoystick: js.Any = js.native
  /* CompleteClass */
  override var _onPointerDown: js.Any = js.native
  /* CompleteClass */
  override var _onPointerDownHandlerRef: js.Any = js.native
  /* CompleteClass */
  override var _onPointerMove: js.Any = js.native
  /* CompleteClass */
  override var _onPointerMoveHandlerRef: js.Any = js.native
  /* CompleteClass */
  override var _onPointerUp: js.Any = js.native
  /* CompleteClass */
  override var _onPointerUpHandlerRef: js.Any = js.native
  /* CompleteClass */
  override var _onResize: js.Any = js.native
  /* CompleteClass */
  override var _touches: js.Any = js.native
  /**
    * Gets the offset value for the position (ie. the change of the position value)
    */
  /* CompleteClass */
  override var deltaPosition: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * Gets a boolean indicating if the virtual joystick was pressed
    */
  /* CompleteClass */
  override var pressed: Boolean = js.native
  /**
    * Gets or sets a boolean indicating that left and right values must be inverted
    */
  /* CompleteClass */
  override var reverseLeftRight: Boolean = js.native
  /**
    * Gets or sets a boolean indicating that up and down values must be inverted
    */
  /* CompleteClass */
  override var reverseUpDown: Boolean = js.native
  /**
    * Release internal HTML canvas
    */
  /* CompleteClass */
  override def releaseCanvas(): Unit = js.native
  /**
    * Defines a callback to call when the joystick is touched
    * @param action defines the callback
    */
  /* CompleteClass */
  override def setActionOnTouch(action: js.Function0[_]): Unit = js.native
  /**
    * Defines which axis you'd like to control for left & right
    * @param axis defines the axis to use
    */
  /* CompleteClass */
  override def setAxisForLeftRight(axis: typings.babylonjs.BABYLON.JoystickAxis): Unit = js.native
  /**
    * Defines which axis you'd like to control for up & down
    * @param axis defines the axis to use
    */
  /* CompleteClass */
  override def setAxisForUpDown(axis: typings.babylonjs.BABYLON.JoystickAxis): Unit = js.native
  /**
    * Change the color of the virtual joystick
    * @param newColor a string that must be a CSS color value (like "red") or the hexa value (like "#FF0000")
    */
  /* CompleteClass */
  override def setJoystickColor(newColor: String): Unit = js.native
  /**
    * Defines joystick sensibility (ie. the ratio beteen a physical move and virtual joystick position change)
    * @param newJoystickSensibility defines the new sensibility
    */
  /* CompleteClass */
  override def setJoystickSensibility(newJoystickSensibility: Double): Unit = js.native
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

