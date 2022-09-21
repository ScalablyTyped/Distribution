package typings.cesium.mod

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CameraEventAggregator")
@js.native
open class CameraEventAggregator () extends StObject {
  def this(canvas: HTMLCanvasElement) = this()
  
  /**
    * Gets whether any mouse button is down, a touch has started, or the wheel has been moved.
    */
  var anyButtonDown: Boolean = js.native
  
  /**
    * Gets the current mouse position.
    */
  var currentMousePosition: Cartesian2 = js.native
  
  /**
    * Removes mouse listeners held by this object.
    * <br /><br />
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * @example
    * handler = handler && handler.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets the time the button was pressed or the touch was started.
    * @param type - The camera event type.
    * @param [modifier] - The keyboard modifier.
    * @returns The time the button was pressed or the touch was started.
    */
  def getButtonPressTime(`type`: CameraEventType): js.Date = js.native
  def getButtonPressTime(`type`: CameraEventType, modifier: KeyboardEventModifier): js.Date = js.native
  
  /**
    * Gets the time the button was released or the touch was ended.
    * @param type - The camera event type.
    * @param [modifier] - The keyboard modifier.
    * @returns The time the button was released or the touch was ended.
    */
  def getButtonReleaseTime(`type`: CameraEventType): js.Date = js.native
  def getButtonReleaseTime(`type`: CameraEventType, modifier: KeyboardEventModifier): js.Date = js.native
  
  /**
    * Gets the start and end position of the last move event (not the aggregated event).
    * @param type - The camera event type.
    * @param [modifier] - The keyboard modifier.
    * @returns An object with two {@link Cartesian2} properties: <code>startPosition</code> and <code>endPosition</code> or <code>undefined</code>.
    */
  def getLastMovement(`type`: CameraEventType): js.UndefOr[Any] = js.native
  def getLastMovement(`type`: CameraEventType, modifier: KeyboardEventModifier): js.UndefOr[Any] = js.native
  
  /**
    * Gets the aggregated start and end position of the current event.
    * @param type - The camera event type.
    * @param [modifier] - The keyboard modifier.
    * @returns An object with two {@link Cartesian2} properties: <code>startPosition</code> and <code>endPosition</code>.
    */
  def getMovement(`type`: CameraEventType): Any = js.native
  def getMovement(`type`: CameraEventType, modifier: KeyboardEventModifier): Any = js.native
  
  /**
    * Gets the mouse position that started the aggregation.
    * @param type - The camera event type.
    * @param [modifier] - The keyboard modifier.
    * @returns The mouse position.
    */
  def getStartMousePosition(`type`: CameraEventType): Cartesian2 = js.native
  def getStartMousePosition(`type`: CameraEventType, modifier: KeyboardEventModifier): Cartesian2 = js.native
  
  /**
    * Gets whether the mouse button is down or a touch has started.
    * @param type - The camera event type.
    * @param [modifier] - The keyboard modifier.
    * @returns Whether the mouse button is down or a touch has started.
    */
  def isButtonDown(`type`: CameraEventType): Boolean = js.native
  def isButtonDown(`type`: CameraEventType, modifier: KeyboardEventModifier): Boolean = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns <code>true</code> if this object was destroyed; otherwise, <code>false</code>.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets if a mouse button down or touch has started and has been moved.
    * @param type - The camera event type.
    * @param [modifier] - The keyboard modifier.
    * @returns Returns <code>true</code> if a mouse button down or touch has started and has been moved; otherwise, <code>false</code>
    */
  def isMoving(`type`: CameraEventType): Boolean = js.native
  def isMoving(`type`: CameraEventType, modifier: KeyboardEventModifier): Boolean = js.native
  
  /**
    * Signals that all of the events have been handled and the aggregator should be reset to handle new events.
    */
  def reset(): Unit = js.native
}
