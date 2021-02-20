package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScreenSpaceEventType extends StObject
@JSImport("cesium", "ScreenSpaceEventType")
@js.native
object ScreenSpaceEventType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScreenSpaceEventType with Double] = js.native
  
  @js.native
  sealed trait LEFT_CLICK extends ScreenSpaceEventType
  /* 2 */ val LEFT_CLICK: typings.cesium.mod.ScreenSpaceEventType.LEFT_CLICK with Double = js.native
  
  @js.native
  sealed trait LEFT_DOUBLE_CLICK extends ScreenSpaceEventType
  /* 3 */ val LEFT_DOUBLE_CLICK: typings.cesium.mod.ScreenSpaceEventType.LEFT_DOUBLE_CLICK with Double = js.native
  
  @js.native
  sealed trait LEFT_DOWN extends ScreenSpaceEventType
  /* 0 */ val LEFT_DOWN: typings.cesium.mod.ScreenSpaceEventType.LEFT_DOWN with Double = js.native
  
  @js.native
  sealed trait LEFT_UP extends ScreenSpaceEventType
  /* 1 */ val LEFT_UP: typings.cesium.mod.ScreenSpaceEventType.LEFT_UP with Double = js.native
  
  @js.native
  sealed trait MIDDLE_CLICK extends ScreenSpaceEventType
  /* 12 */ val MIDDLE_CLICK: typings.cesium.mod.ScreenSpaceEventType.MIDDLE_CLICK with Double = js.native
  
  @js.native
  sealed trait MIDDLE_DOWN extends ScreenSpaceEventType
  /* 10 */ val MIDDLE_DOWN: typings.cesium.mod.ScreenSpaceEventType.MIDDLE_DOWN with Double = js.native
  
  @js.native
  sealed trait MIDDLE_UP extends ScreenSpaceEventType
  /* 11 */ val MIDDLE_UP: typings.cesium.mod.ScreenSpaceEventType.MIDDLE_UP with Double = js.native
  
  @js.native
  sealed trait MOUSE_MOVE extends ScreenSpaceEventType
  /* 15 */ val MOUSE_MOVE: typings.cesium.mod.ScreenSpaceEventType.MOUSE_MOVE with Double = js.native
  
  @js.native
  sealed trait PINCH_END extends ScreenSpaceEventType
  /* 18 */ val PINCH_END: typings.cesium.mod.ScreenSpaceEventType.PINCH_END with Double = js.native
  
  @js.native
  sealed trait PINCH_MOVE extends ScreenSpaceEventType
  /* 19 */ val PINCH_MOVE: typings.cesium.mod.ScreenSpaceEventType.PINCH_MOVE with Double = js.native
  
  @js.native
  sealed trait PINCH_START extends ScreenSpaceEventType
  /* 17 */ val PINCH_START: typings.cesium.mod.ScreenSpaceEventType.PINCH_START with Double = js.native
  
  @js.native
  sealed trait RIGHT_CLICK extends ScreenSpaceEventType
  /* 7 */ val RIGHT_CLICK: typings.cesium.mod.ScreenSpaceEventType.RIGHT_CLICK with Double = js.native
  
  @js.native
  sealed trait RIGHT_DOWN extends ScreenSpaceEventType
  /* 5 */ val RIGHT_DOWN: typings.cesium.mod.ScreenSpaceEventType.RIGHT_DOWN with Double = js.native
  
  @js.native
  sealed trait RIGHT_UP extends ScreenSpaceEventType
  /* 6 */ val RIGHT_UP: typings.cesium.mod.ScreenSpaceEventType.RIGHT_UP with Double = js.native
  
  @js.native
  sealed trait WHEEL extends ScreenSpaceEventType
  /* 16 */ val WHEEL: typings.cesium.mod.ScreenSpaceEventType.WHEEL with Double = js.native
}
