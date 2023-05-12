package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualJoystick extends StObject {
  
  /* private */ var _action: Any = js.native
  
  /* private */ var _alwaysVisible: Any = js.native
  
  /* private */ var _axisTargetedByLeftAndRight: Any = js.native
  
  /* private */ var _axisTargetedByUpAndDown: Any = js.native
  
  /* private */ var _clearContainerSize: Any = js.native
  
  /* private */ var _clearContainerSizeOffset: Any = js.native
  
  /**
    * Clears the canvas from the previous puck / container draw
    */
  /* private */ var _clearPreviousDraw: Any = js.native
  
  /* private */ var _clearPuckSize: Any = js.native
  
  /* private */ var _clearPuckSizeOffset: Any = js.native
  
  /* private */ var _containerImage: Any = js.native
  
  /* private */ var _deltaJoystickVector: Any = js.native
  
  /**
    * Draws the Virtual Joystick's container
    */
  /* private */ var _drawContainer: Any = js.native
  
  /**
    * Draws the Virtual Joystick's puck
    */
  /* private */ var _drawPuck: Any = js.native
  
  /* private */ var _drawVirtualJoystick: Any = js.native
  
  /* private */ var _inversedSensibility: Any = js.native
  
  /* private */ var _joystickColor: Any = js.native
  
  /* private */ var _joystickContainerSize: Any = js.native
  
  /* private */ var _joystickPointerId: Any = js.native
  
  /* private */ var _joystickPointerPos: Any = js.native
  
  /* private */ var _joystickPointerStartPos: Any = js.native
  
  /* private */ var _joystickPosition: Any = js.native
  
  /* private */ var _joystickPreviousPointerPos: Any = js.native
  
  /* private */ var _joystickPuckSize: Any = js.native
  
  /* private */ var _joystickSensibility: Any = js.native
  
  /* private */ var _leftJoystick: Any = js.native
  
  /* private */ var _onPointerDown: Any = js.native
  
  /* private */ var _onPointerDownHandlerRef: Any = js.native
  
  /* private */ var _onPointerMove: Any = js.native
  
  /* private */ var _onPointerMoveHandlerRef: Any = js.native
  
  /* private */ var _onPointerUp: Any = js.native
  
  /* private */ var _onPointerUpHandlerRef: Any = js.native
  
  /* private */ var _onResize: Any = js.native
  
  /* private */ var _puckImage: Any = js.native
  
  /* private */ var _released: Any = js.native
  
  /* private */ var _touches: Any = js.native
  
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
  def setActionOnTouch(action: js.Function0[Any]): Unit = js.native
  
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
    * Defines joystick sensibility (ie. the ratio between a physical move and virtual joystick position change)
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
