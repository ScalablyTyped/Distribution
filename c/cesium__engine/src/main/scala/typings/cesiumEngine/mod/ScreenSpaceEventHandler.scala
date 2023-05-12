package typings.cesiumEngine.mod

import typings.cesiumEngine.mod.ScreenSpaceEventHandler.MotionEventCallback
import typings.cesiumEngine.mod.ScreenSpaceEventHandler.PositionedEventCallback
import typings.cesiumEngine.mod.ScreenSpaceEventHandler.TwoPointEventCallback
import typings.cesiumEngine.mod.ScreenSpaceEventHandler.TwoPointMotionEventCallback
import typings.cesiumEngine.mod.ScreenSpaceEventHandler.WheelEventCallback
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "ScreenSpaceEventHandler")
@js.native
open class ScreenSpaceEventHandler () extends StObject {
  def this(element: HTMLCanvasElement) = this()
  
  /**
    * Removes listeners held by this object.
    * <br /><br />
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * @example
    * handler = handler && handler.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns the function to be executed on an input event.
    * @param type - The ScreenSpaceEventType of input event.
    * @param [modifier] - A KeyboardEventModifier key that is held when a <code>type</code>
    * event occurs.
    * @returns The function to be executed on an input event.
    */
  def getInputAction(`type`: ScreenSpaceEventType): PositionedEventCallback | MotionEventCallback | WheelEventCallback | TwoPointEventCallback | TwoPointMotionEventCallback = js.native
  def getInputAction(`type`: ScreenSpaceEventType, modifier: KeyboardEventModifier): PositionedEventCallback | MotionEventCallback | WheelEventCallback | TwoPointEventCallback | TwoPointMotionEventCallback = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns <code>true</code> if this object was destroyed; otherwise, <code>false</code>.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Removes the function to be executed on an input event.
    * @param type - The ScreenSpaceEventType of input event.
    * @param [modifier] - A KeyboardEventModifier key that is held when a <code>type</code>
    * event occurs.
    */
  def removeInputAction(`type`: ScreenSpaceEventType): Unit = js.native
  def removeInputAction(`type`: ScreenSpaceEventType, modifier: KeyboardEventModifier): Unit = js.native
  
  /**
    * Set a function to be executed on an input event.
    * @param action - Function to be executed when the input event occurs.
    * @param type - The ScreenSpaceEventType of input event.
    * @param [modifier] - A KeyboardEventModifier key that is held when a <code>type</code>
    * event occurs.
    */
  def setInputAction(
    action: MotionEventCallback | PositionedEventCallback | TwoPointEventCallback | TwoPointMotionEventCallback | WheelEventCallback,
    `type`: ScreenSpaceEventType
  ): Unit = js.native
  def setInputAction(
    action: MotionEventCallback | PositionedEventCallback | TwoPointEventCallback | TwoPointMotionEventCallback | WheelEventCallback,
    `type`: ScreenSpaceEventType,
    modifier: KeyboardEventModifier
  ): Unit = js.native
}
/* static members */
object ScreenSpaceEventHandler {
  
  @JSImport("@cesium/engine", "ScreenSpaceEventHandler")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The amount of time, in milliseconds, that mouse events will be disabled after
    * receiving any touch events, such that any emulated mouse events will be ignored.
    */
  @JSImport("@cesium/engine", "ScreenSpaceEventHandler.mouseEmulationIgnoreMilliseconds")
  @js.native
  def mouseEmulationIgnoreMilliseconds: Double = js.native
  inline def mouseEmulationIgnoreMilliseconds_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseEmulationIgnoreMilliseconds")(x.asInstanceOf[js.Any])
  
  /**
    * The amount of time, in milliseconds, before a touch on the screen becomes a
    * touch and hold.
    */
  @JSImport("@cesium/engine", "ScreenSpaceEventHandler.touchHoldDelayMilliseconds")
  @js.native
  def touchHoldDelayMilliseconds: Double = js.native
  inline def touchHoldDelayMilliseconds_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touchHoldDelayMilliseconds")(x.asInstanceOf[js.Any])
  
  /**
    * An Event that starts at one position and ends at another.
    */
  trait MotionEvent extends StObject {
    
    var endPosition: Cartesian2
    
    var startPosition: Cartesian2
  }
  object MotionEvent {
    
    inline def apply(endPosition: Cartesian2, startPosition: Cartesian2): MotionEvent = {
      val __obj = js.Dynamic.literal(endPosition = endPosition.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[MotionEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MotionEvent] (val x: Self) extends AnyVal {
      
      inline def setEndPosition(value: Cartesian2): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
      
      inline def setStartPosition(value: Cartesian2): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @param event - The event which triggered the listener
    */
  type MotionEventCallback = js.Function1[/* event */ MotionEvent, Unit]
  
  /**
    * An Event that occurs at a single position on screen.
    */
  trait PositionedEvent extends StObject {
    
    var position: Cartesian2
  }
  object PositionedEvent {
    
    inline def apply(position: Cartesian2): PositionedEvent = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositionedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PositionedEvent] (val x: Self) extends AnyVal {
      
      inline def setPosition(value: Cartesian2): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @param event - The event which triggered the listener
    */
  type PositionedEventCallback = js.Function1[/* event */ PositionedEvent, Unit]
  
  /**
    * An Event that occurs at a two positions on screen.
    */
  trait TwoPointEvent extends StObject {
    
    var position1: Cartesian2
    
    var position2: Cartesian2
  }
  object TwoPointEvent {
    
    inline def apply(position1: Cartesian2, position2: Cartesian2): TwoPointEvent = {
      val __obj = js.Dynamic.literal(position1 = position1.asInstanceOf[js.Any], position2 = position2.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwoPointEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TwoPointEvent] (val x: Self) extends AnyVal {
      
      inline def setPosition1(value: Cartesian2): Self = StObject.set(x, "position1", value.asInstanceOf[js.Any])
      
      inline def setPosition2(value: Cartesian2): Self = StObject.set(x, "position2", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @param event - The event which triggered the listener
    */
  type TwoPointEventCallback = js.Function1[/* event */ TwoPointEvent, Unit]
  
  /**
    * An Event that starts at a two positions on screen and moves to two other positions.
    */
  trait TwoPointMotionEvent extends StObject {
    
    var position1: Cartesian2
    
    var position2: Cartesian2
    
    var previousPosition1: Cartesian2
    
    var previousPosition2: Cartesian2
  }
  object TwoPointMotionEvent {
    
    inline def apply(
      position1: Cartesian2,
      position2: Cartesian2,
      previousPosition1: Cartesian2,
      previousPosition2: Cartesian2
    ): TwoPointMotionEvent = {
      val __obj = js.Dynamic.literal(position1 = position1.asInstanceOf[js.Any], position2 = position2.asInstanceOf[js.Any], previousPosition1 = previousPosition1.asInstanceOf[js.Any], previousPosition2 = previousPosition2.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwoPointMotionEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TwoPointMotionEvent] (val x: Self) extends AnyVal {
      
      inline def setPosition1(value: Cartesian2): Self = StObject.set(x, "position1", value.asInstanceOf[js.Any])
      
      inline def setPosition2(value: Cartesian2): Self = StObject.set(x, "position2", value.asInstanceOf[js.Any])
      
      inline def setPreviousPosition1(value: Cartesian2): Self = StObject.set(x, "previousPosition1", value.asInstanceOf[js.Any])
      
      inline def setPreviousPosition2(value: Cartesian2): Self = StObject.set(x, "previousPosition2", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @param event - The event which triggered the listener
    */
  type TwoPointMotionEventCallback = js.Function1[/* event */ TwoPointMotionEvent, Unit]
  
  /**
    * @param delta - The amount that the mouse wheel moved
    */
  type WheelEventCallback = js.Function1[/* delta */ Double, Unit]
}
