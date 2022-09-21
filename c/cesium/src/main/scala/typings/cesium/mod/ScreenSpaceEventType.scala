package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScreenSpaceEventType extends StObject
@JSImport("cesium", "ScreenSpaceEventType")
@js.native
object ScreenSpaceEventType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScreenSpaceEventType & Double] = js.native
  
  /**
    * Represents a mouse left click event.
    */
  @js.native
  sealed trait LEFT_CLICK
    extends StObject
       with ScreenSpaceEventType
  /* 2 */ val LEFT_CLICK: typings.cesium.mod.ScreenSpaceEventType.LEFT_CLICK & Double = js.native
  
  /**
    * Represents a mouse left double click event.
    */
  @js.native
  sealed trait LEFT_DOUBLE_CLICK
    extends StObject
       with ScreenSpaceEventType
  /* 3 */ val LEFT_DOUBLE_CLICK: typings.cesium.mod.ScreenSpaceEventType.LEFT_DOUBLE_CLICK & Double = js.native
  
  /**
    * Represents a mouse left button down event.
    */
  @js.native
  sealed trait LEFT_DOWN
    extends StObject
       with ScreenSpaceEventType
  /* 0 */ val LEFT_DOWN: typings.cesium.mod.ScreenSpaceEventType.LEFT_DOWN & Double = js.native
  
  /**
    * Represents a mouse left button up event.
    */
  @js.native
  sealed trait LEFT_UP
    extends StObject
       with ScreenSpaceEventType
  /* 1 */ val LEFT_UP: typings.cesium.mod.ScreenSpaceEventType.LEFT_UP & Double = js.native
  
  /**
    * Represents a mouse middle click event.
    */
  @js.native
  sealed trait MIDDLE_CLICK
    extends StObject
       with ScreenSpaceEventType
  /* 12 */ val MIDDLE_CLICK: typings.cesium.mod.ScreenSpaceEventType.MIDDLE_CLICK & Double = js.native
  
  /**
    * Represents a mouse middle button down event.
    */
  @js.native
  sealed trait MIDDLE_DOWN
    extends StObject
       with ScreenSpaceEventType
  /* 10 */ val MIDDLE_DOWN: typings.cesium.mod.ScreenSpaceEventType.MIDDLE_DOWN & Double = js.native
  
  /**
    * Represents a mouse middle button up event.
    */
  @js.native
  sealed trait MIDDLE_UP
    extends StObject
       with ScreenSpaceEventType
  /* 11 */ val MIDDLE_UP: typings.cesium.mod.ScreenSpaceEventType.MIDDLE_UP & Double = js.native
  
  /**
    * Represents a mouse move event.
    */
  @js.native
  sealed trait MOUSE_MOVE
    extends StObject
       with ScreenSpaceEventType
  /* 15 */ val MOUSE_MOVE: typings.cesium.mod.ScreenSpaceEventType.MOUSE_MOVE & Double = js.native
  
  /**
    * Represents the end of a two-finger event on a touch surface.
    */
  @js.native
  sealed trait PINCH_END
    extends StObject
       with ScreenSpaceEventType
  /* 18 */ val PINCH_END: typings.cesium.mod.ScreenSpaceEventType.PINCH_END & Double = js.native
  
  /**
    * Represents a change of a two-finger event on a touch surface.
    */
  @js.native
  sealed trait PINCH_MOVE
    extends StObject
       with ScreenSpaceEventType
  /* 19 */ val PINCH_MOVE: typings.cesium.mod.ScreenSpaceEventType.PINCH_MOVE & Double = js.native
  
  /**
    * Represents the start of a two-finger event on a touch surface.
    */
  @js.native
  sealed trait PINCH_START
    extends StObject
       with ScreenSpaceEventType
  /* 17 */ val PINCH_START: typings.cesium.mod.ScreenSpaceEventType.PINCH_START & Double = js.native
  
  /**
    * Represents a mouse right click event.
    */
  @js.native
  sealed trait RIGHT_CLICK
    extends StObject
       with ScreenSpaceEventType
  /* 7 */ val RIGHT_CLICK: typings.cesium.mod.ScreenSpaceEventType.RIGHT_CLICK & Double = js.native
  
  /**
    * Represents a mouse left button down event.
    */
  @js.native
  sealed trait RIGHT_DOWN
    extends StObject
       with ScreenSpaceEventType
  /* 5 */ val RIGHT_DOWN: typings.cesium.mod.ScreenSpaceEventType.RIGHT_DOWN & Double = js.native
  
  /**
    * Represents a mouse right button up event.
    */
  @js.native
  sealed trait RIGHT_UP
    extends StObject
       with ScreenSpaceEventType
  /* 6 */ val RIGHT_UP: typings.cesium.mod.ScreenSpaceEventType.RIGHT_UP & Double = js.native
  
  /**
    * Represents a mouse wheel event.
    */
  @js.native
  sealed trait WHEEL
    extends StObject
       with ScreenSpaceEventType
  /* 16 */ val WHEEL: typings.cesium.mod.ScreenSpaceEventType.WHEEL & Double = js.native
}
