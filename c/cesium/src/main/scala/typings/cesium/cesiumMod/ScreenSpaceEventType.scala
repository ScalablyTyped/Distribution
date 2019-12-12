package typings.cesium.cesiumMod

import org.scalablytyped.runtime.TopLevel
import typings.cesium.cesiumMod.ScreenSpaceEventType.LEFT_CLICK
import typings.cesium.cesiumMod.ScreenSpaceEventType.LEFT_DOUBLE_CLICK
import typings.cesium.cesiumMod.ScreenSpaceEventType.LEFT_DOWN
import typings.cesium.cesiumMod.ScreenSpaceEventType.LEFT_UP
import typings.cesium.cesiumMod.ScreenSpaceEventType.MIDDLE_CLICK
import typings.cesium.cesiumMod.ScreenSpaceEventType.MIDDLE_DOWN
import typings.cesium.cesiumMod.ScreenSpaceEventType.MIDDLE_UP
import typings.cesium.cesiumMod.ScreenSpaceEventType.MOUSE_MOVE
import typings.cesium.cesiumMod.ScreenSpaceEventType.PINCH_END
import typings.cesium.cesiumMod.ScreenSpaceEventType.PINCH_MOVE
import typings.cesium.cesiumMod.ScreenSpaceEventType.PINCH_START
import typings.cesium.cesiumMod.ScreenSpaceEventType.RIGHT_CLICK
import typings.cesium.cesiumMod.ScreenSpaceEventType.RIGHT_DOWN
import typings.cesium.cesiumMod.ScreenSpaceEventType.RIGHT_UP
import typings.cesium.cesiumMod.ScreenSpaceEventType.WHEEL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScreenSpaceEventType extends js.Object

@JSImport("cesium", "ScreenSpaceEventType")
@js.native
object ScreenSpaceEventType extends js.Object {
  @js.native
  sealed trait LEFT_CLICK extends ScreenSpaceEventType
  
  @js.native
  sealed trait LEFT_DOUBLE_CLICK extends ScreenSpaceEventType
  
  @js.native
  sealed trait LEFT_DOWN extends ScreenSpaceEventType
  
  @js.native
  sealed trait LEFT_UP extends ScreenSpaceEventType
  
  @js.native
  sealed trait MIDDLE_CLICK extends ScreenSpaceEventType
  
  @js.native
  sealed trait MIDDLE_DOWN extends ScreenSpaceEventType
  
  @js.native
  sealed trait MIDDLE_UP extends ScreenSpaceEventType
  
  @js.native
  sealed trait MOUSE_MOVE extends ScreenSpaceEventType
  
  @js.native
  sealed trait PINCH_END extends ScreenSpaceEventType
  
  @js.native
  sealed trait PINCH_MOVE extends ScreenSpaceEventType
  
  @js.native
  sealed trait PINCH_START extends ScreenSpaceEventType
  
  @js.native
  sealed trait RIGHT_CLICK extends ScreenSpaceEventType
  
  @js.native
  sealed trait RIGHT_DOWN extends ScreenSpaceEventType
  
  @js.native
  sealed trait RIGHT_UP extends ScreenSpaceEventType
  
  @js.native
  sealed trait WHEEL extends ScreenSpaceEventType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScreenSpaceEventType with Double] = js.native
  /* 2 */ @js.native
  object LEFT_CLICK extends TopLevel[LEFT_CLICK with Double]
  
  /* 3 */ @js.native
  object LEFT_DOUBLE_CLICK extends TopLevel[LEFT_DOUBLE_CLICK with Double]
  
  /* 0 */ @js.native
  object LEFT_DOWN extends TopLevel[LEFT_DOWN with Double]
  
  /* 1 */ @js.native
  object LEFT_UP extends TopLevel[LEFT_UP with Double]
  
  /* 12 */ @js.native
  object MIDDLE_CLICK extends TopLevel[MIDDLE_CLICK with Double]
  
  /* 10 */ @js.native
  object MIDDLE_DOWN extends TopLevel[MIDDLE_DOWN with Double]
  
  /* 11 */ @js.native
  object MIDDLE_UP extends TopLevel[MIDDLE_UP with Double]
  
  /* 15 */ @js.native
  object MOUSE_MOVE extends TopLevel[MOUSE_MOVE with Double]
  
  /* 18 */ @js.native
  object PINCH_END extends TopLevel[PINCH_END with Double]
  
  /* 19 */ @js.native
  object PINCH_MOVE extends TopLevel[PINCH_MOVE with Double]
  
  /* 17 */ @js.native
  object PINCH_START extends TopLevel[PINCH_START with Double]
  
  /* 7 */ @js.native
  object RIGHT_CLICK extends TopLevel[RIGHT_CLICK with Double]
  
  /* 5 */ @js.native
  object RIGHT_DOWN extends TopLevel[RIGHT_DOWN with Double]
  
  /* 6 */ @js.native
  object RIGHT_UP extends TopLevel[RIGHT_UP with Double]
  
  /* 16 */ @js.native
  object WHEEL extends TopLevel[WHEEL with Double]
  
}

