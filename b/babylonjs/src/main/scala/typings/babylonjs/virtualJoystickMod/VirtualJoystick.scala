package typings.babylonjs.virtualJoystickMod

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.anon.PartialVirtualJoystickCus
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/virtualJoystick", "VirtualJoystick")
@js.native
/**
  * Creates a new virtual joystick
  * @param leftJoystick defines that the joystick is for left hand (false by default)
  * @param customizations Defines the options we want to customize the VirtualJoystick
  */
class VirtualJoystick () extends js.Object {
  def this(leftJoystick: Boolean) = this()
  def this(leftJoystick: js.UndefOr[scala.Nothing], customizations: PartialVirtualJoystickCus) = this()
  def this(leftJoystick: Boolean, customizations: PartialVirtualJoystickCus) = this()
  
  var _action: js.Any = js.native
  
  var _alwaysVisible: js.Any = js.native
  
  var _axisTargetedByLeftAndRight: js.Any = js.native
  
  var _axisTargetedByUpAndDown: js.Any = js.native
  
  var _clearContainerSize: js.Any = js.native
  
  var _clearContainerSizeOffset: js.Any = js.native
  
  /**
    * Clears the canvas from the previous puck / container draw
    */
  var _clearPreviousDraw: js.Any = js.native
  
  var _clearPuckSize: js.Any = js.native
  
  var _clearPuckSizeOffset: js.Any = js.native
  
  var _containerImage: js.Any = js.native
  
  var _deltaJoystickVector: js.Any = js.native
  
  /**
    * Draws the Virtual Joystick's container
    */
  var _drawContainer: js.Any = js.native
  
  /**
    * Draws the Virtual Joystick's puck
    */
  var _drawPuck: js.Any = js.native
  
  var _drawVirtualJoystick: js.Any = js.native
  
  var _inversedSensibility: js.Any = js.native
  
  var _joystickColor: js.Any = js.native
  
  var _joystickContainerSize: js.Any = js.native
  
  var _joystickPointerID: js.Any = js.native
  
  var _joystickPointerPos: js.Any = js.native
  
  var _joystickPointerStartPos: js.Any = js.native
  
  var _joystickPosition: js.Any = js.native
  
  var _joystickPreviousPointerPos: js.Any = js.native
  
  var _joystickPuckSize: js.Any = js.native
  
  var _joystickSensibility: js.Any = js.native
  
  var _leftJoystick: js.Any = js.native
  
  var _onPointerDown: js.Any = js.native
  
  var _onPointerDownHandlerRef: js.Any = js.native
  
  var _onPointerMove: js.Any = js.native
  
  var _onPointerMoveHandlerRef: js.Any = js.native
  
  var _onPointerUp: js.Any = js.native
  
  var _onPointerUpHandlerRef: js.Any = js.native
  
  var _onResize: js.Any = js.native
  
  var _puckImage: js.Any = js.native
  
  var _touches: js.Any = js.native
  
  def alwaysVisible: Boolean = js.native
  /**
    * Defines whether or not the joystick container is always visible
    */
  def alwaysVisible_=(value: Boolean): Unit = js.native
  
  /**
    * Clears the set position of the joystick
    */
  def clearPosition(): Unit = js.native
  
  def containerSize: Double = js.native
  /**
    * Size of the joystick's container
    */
  def containerSize_=(newSize: Double): Unit = js.native
  
  /**
    * Gets the offset value for the position (ie. the change of the position value)
    */
  var deltaPosition: Vector3 = js.native
  
  /**
    * boolean indicating whether or not the joystick's puck's movement should be limited to the joystick's container area
    */
  var limitToContainer: Boolean = js.native
  
  /**
    * Gets a boolean indicating if the virtual joystick was pressed
    */
  var pressed: Boolean = js.native
  
  def puckSize: Double = js.native
  /**
    * Size of the joystick's puck
    */
  def puckSize_=(newSize: Double): Unit = js.native
  
  /**
    * Release internal HTML canvas
    */
  def releaseCanvas(): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating that left and right values must be inverted
    */
  var reverseLeftRight: Boolean = js.native
  
  /**
    * Gets or sets a boolean indicating that up and down values must be inverted
    */
  var reverseUpDown: Boolean = js.native
  
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
    * Loads `urlPath` to be used for the container's image
    * @param urlPath defines the urlPath of an image to use
    */
  def setContainerImage(urlPath: String): Unit = js.native
  
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
  
  /**
    * Sets the constant position of the Joystick container
    * @param x X axis coordinate
    * @param y Y axis coordinate
    */
  def setPosition(x: Double, y: Double): Unit = js.native
  
  /**
    * Loads `urlPath` to be used for the puck's image
    * @param urlPath defines the urlPath of an image to use
    */
  def setPuckImage(urlPath: String): Unit = js.native
}
/* static members */
@JSImport("babylonjs/Misc/virtualJoystick", "VirtualJoystick")
@js.native
object VirtualJoystick extends js.Object {
  
  /**
    * Canvas the virtual joystick will render onto, default z-index of this is 5
    */
  var Canvas: Nullable[HTMLCanvasElement] = js.native
  
  var _GetDefaultOptions: js.Any = js.native
  
  var _alwaysVisibleSticks: js.Any = js.native
  
  var _globalJoystickIndex: js.Any = js.native
  
  var halfWidth: js.Any = js.native
  
  var vjCanvasContext: js.Any = js.native
  
  var vjCanvasHeight: js.Any = js.native
  
  var vjCanvasWidth: js.Any = js.native
}
