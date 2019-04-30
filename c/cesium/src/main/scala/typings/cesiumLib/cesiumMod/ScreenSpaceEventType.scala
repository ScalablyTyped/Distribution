package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScreenSpaceEventType extends js.Object

@JSImport("cesium", "ScreenSpaceEventType")
@js.native
object ScreenSpaceEventType extends js.Object {
  @js.native
  sealed trait LEFT_CLICK
    extends cesiumLib.cesiumMod.ScreenSpaceEventType
  
  @js.native
  sealed trait LEFT_DOUBLE_CLICK
    extends cesiumLib.cesiumMod.ScreenSpaceEventType
  
  @js.native
  sealed trait LEFT_DOWN
    extends cesiumLib.cesiumMod.ScreenSpaceEventType
  
  @js.native
  sealed trait LEFT_UP
    extends cesiumLib.cesiumMod.ScreenSpaceEventType
  
  @js.native
  sealed trait MIDDLE_CLICK
    extends cesiumLib.cesiumMod.ScreenSpaceEventType
  
  @js.native
  sealed trait MIDDLE_DOWN
    extends cesiumLib.cesiumMod.ScreenSpaceEventType
  
  @js.native
  sealed trait MIDDLE_UP
    extends cesiumLib.cesiumMod.ScreenSpaceEventType
  
  @js.native
  sealed trait MOUSE_MOVE
    extends cesiumLib.cesiumMod.ScreenSpaceEventType
  
  @js.native
  sealed trait PINCH_END
    extends cesiumLib.cesiumMod.ScreenSpaceEventType
  
  @js.native
  sealed trait PINCH_MOVE
    extends cesiumLib.cesiumMod.ScreenSpaceEventType
  
  @js.native
  sealed trait PINCH_START
    extends cesiumLib.cesiumMod.ScreenSpaceEventType
  
  @js.native
  sealed trait RIGHT_CLICK
    extends cesiumLib.cesiumMod.ScreenSpaceEventType
  
  @js.native
  sealed trait RIGHT_DOWN
    extends cesiumLib.cesiumMod.ScreenSpaceEventType
  
  @js.native
  sealed trait RIGHT_UP
    extends cesiumLib.cesiumMod.ScreenSpaceEventType
  
  @js.native
  sealed trait WHEEL
    extends cesiumLib.cesiumMod.ScreenSpaceEventType
  
  /* 2 */ val LEFT_CLICK: LEFT_CLICK with scala.Double = js.native
  /* 3 */ val LEFT_DOUBLE_CLICK: LEFT_DOUBLE_CLICK with scala.Double = js.native
  /* 0 */ val LEFT_DOWN: LEFT_DOWN with scala.Double = js.native
  /* 1 */ val LEFT_UP: LEFT_UP with scala.Double = js.native
  /* 12 */ val MIDDLE_CLICK: MIDDLE_CLICK with scala.Double = js.native
  /* 10 */ val MIDDLE_DOWN: MIDDLE_DOWN with scala.Double = js.native
  /* 11 */ val MIDDLE_UP: MIDDLE_UP with scala.Double = js.native
  /* 15 */ val MOUSE_MOVE: MOUSE_MOVE with scala.Double = js.native
  /* 18 */ val PINCH_END: PINCH_END with scala.Double = js.native
  /* 19 */ val PINCH_MOVE: PINCH_MOVE with scala.Double = js.native
  /* 17 */ val PINCH_START: PINCH_START with scala.Double = js.native
  /* 7 */ val RIGHT_CLICK: RIGHT_CLICK with scala.Double = js.native
  /* 5 */ val RIGHT_DOWN: RIGHT_DOWN with scala.Double = js.native
  /* 6 */ val RIGHT_UP: RIGHT_UP with scala.Double = js.native
  /* 16 */ val WHEEL: WHEEL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.ScreenSpaceEventType with scala.Double] = js.native
}

