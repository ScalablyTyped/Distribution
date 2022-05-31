package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualJoystick extends StObject {
  
  /* private */ var _action: js.Any = js.native
  
  /* private */ var _alwaysVisible: js.Any = js.native
  
  /* private */ var _axisTargetedByLeftAndRight: js.Any = js.native
  
  /* private */ var _axisTargetedByUpAndDown: js.Any = js.native
  
  /* private */ var _clearContainerSize: js.Any = js.native
  
  /* private */ var _clearContainerSizeOffset: js.Any = js.native
  
  /**
    * Clears the canvas from the previous puck / container draw
    */
  /* private */ var _clearPreviousDraw: js.Any = js.native
  
  /* private */ var _clearPuckSize: js.Any = js.native
  
  /* private */ var _clearPuckSizeOffset: js.Any = js.native
  
  /* private */ var _containerImage: js.Any = js.native
  
  /* private */ var _deltaJoystickVector: js.Any = js.native
  
  /**
    * Draws the Virtual Joystick's container
    */
  /* private */ var _drawContainer: js.Any = js.native
  
  /**
    * Draws the Virtual Joystick's puck
    */
  /* private */ var _drawPuck: js.Any = js.native
  
  /* private */ var _drawVirtualJoystick: js.Any = js.native
  
  /* private */ var _inversedSensibility: js.Any = js.native
  
  /* private */ var _joystickColor: js.Any = js.native
  
  /* private */ var _joystickContainerSize: js.Any = js.native
  
  /* private */ var _joystickPointerID: js.Any = js.native
  
  /* private */ var _joystickPointerPos: js.Any = js.native
  
  /* private */ var _joystickPointerStartPos: js.Any = js.native
  
  /* private */ var _joystickPosition: js.Any = js.native
  
  /* private */ var _joystickPreviousPointerPos: js.Any = js.native
  
  /* private */ var _joystickPuckSize: js.Any = js.native
  
  /* private */ var _joystickSensibility: js.Any = js.native
  
  /* private */ var _leftJoystick: js.Any = js.native
  
  /* private */ var _onPointerDown: js.Any = js.native
  
  /* private */ var _onPointerDownHandlerRef: js.Any = js.native
  
  /* private */ var _onPointerMove: js.Any = js.native
  
  /* private */ var _onPointerMoveHandlerRef: js.Any = js.native
  
  /* private */ var _onPointerUp: js.Any = js.native
  
  /* private */ var _onPointerUpHandlerRef: js.Any = js.native
  
  /* private */ var _onResize: js.Any = js.native
  
  /* private */ var _puckImage: js.Any = js.native
  
  /* private */ var _touches: js.Any = js.native
  
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
  def setActionOnTouch(action: js.Function0[js.Any]): Unit = js.native
  
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
