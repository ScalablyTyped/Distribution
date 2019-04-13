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
  sealed trait MIDDLE_DOUBLE_CLICK
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
  sealed trait RIGHT_DOUBLE_CLICK
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
  
  val LEFT_CLICK: LEFT_CLICK with java.lang.String = js.native
  val LEFT_DOUBLE_CLICK: LEFT_DOUBLE_CLICK with java.lang.String = js.native
  val LEFT_DOWN: LEFT_DOWN with java.lang.String = js.native
  val LEFT_UP: LEFT_UP with java.lang.String = js.native
  val MIDDLE_CLICK: MIDDLE_CLICK with java.lang.String = js.native
  val MIDDLE_DOUBLE_CLICK: MIDDLE_DOUBLE_CLICK with java.lang.String = js.native
  val MIDDLE_DOWN: MIDDLE_DOWN with java.lang.String = js.native
  val MIDDLE_UP: MIDDLE_UP with java.lang.String = js.native
  val MOUSE_MOVE: MOUSE_MOVE with java.lang.String = js.native
  val PINCH_END: PINCH_END with java.lang.String = js.native
  val PINCH_MOVE: PINCH_MOVE with java.lang.String = js.native
  val PINCH_START: PINCH_START with java.lang.String = js.native
  val RIGHT_CLICK: RIGHT_CLICK with java.lang.String = js.native
  val RIGHT_DOUBLE_CLICK: RIGHT_DOUBLE_CLICK with java.lang.String = js.native
  val RIGHT_DOWN: RIGHT_DOWN with java.lang.String = js.native
  val RIGHT_UP: RIGHT_UP with java.lang.String = js.native
  val WHEEL: WHEEL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.ScreenSpaceEventType with java.lang.String] = js.native
}

