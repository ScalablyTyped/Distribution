package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScreenSpaceEventType extends js.Object
@JSImport("cesium", "ScreenSpaceEventType")
@js.native
object ScreenSpaceEventType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScreenSpaceEventType with Double] = js.native
  
  @js.native
  sealed trait LEFT_CLICK extends ScreenSpaceEventType
  /* 2 */ @js.native
  object LEFT_CLICK extends TopLevel[LEFT_CLICK with Double]
  
  @js.native
  sealed trait LEFT_DOUBLE_CLICK extends ScreenSpaceEventType
  /* 3 */ @js.native
  object LEFT_DOUBLE_CLICK extends TopLevel[LEFT_DOUBLE_CLICK with Double]
  
  @js.native
  sealed trait LEFT_DOWN extends ScreenSpaceEventType
  /* 0 */ @js.native
  object LEFT_DOWN extends TopLevel[LEFT_DOWN with Double]
  
  @js.native
  sealed trait LEFT_UP extends ScreenSpaceEventType
  /* 1 */ @js.native
  object LEFT_UP extends TopLevel[LEFT_UP with Double]
  
  @js.native
  sealed trait MIDDLE_CLICK extends ScreenSpaceEventType
  /* 12 */ @js.native
  object MIDDLE_CLICK extends TopLevel[MIDDLE_CLICK with Double]
  
  @js.native
  sealed trait MIDDLE_DOWN extends ScreenSpaceEventType
  /* 10 */ @js.native
  object MIDDLE_DOWN extends TopLevel[MIDDLE_DOWN with Double]
  
  @js.native
  sealed trait MIDDLE_UP extends ScreenSpaceEventType
  /* 11 */ @js.native
  object MIDDLE_UP extends TopLevel[MIDDLE_UP with Double]
  
  @js.native
  sealed trait MOUSE_MOVE extends ScreenSpaceEventType
  /* 15 */ @js.native
  object MOUSE_MOVE extends TopLevel[MOUSE_MOVE with Double]
  
  @js.native
  sealed trait PINCH_END extends ScreenSpaceEventType
  /* 18 */ @js.native
  object PINCH_END extends TopLevel[PINCH_END with Double]
  
  @js.native
  sealed trait PINCH_MOVE extends ScreenSpaceEventType
  /* 19 */ @js.native
  object PINCH_MOVE extends TopLevel[PINCH_MOVE with Double]
  
  @js.native
  sealed trait PINCH_START extends ScreenSpaceEventType
  /* 17 */ @js.native
  object PINCH_START extends TopLevel[PINCH_START with Double]
  
  @js.native
  sealed trait RIGHT_CLICK extends ScreenSpaceEventType
  /* 7 */ @js.native
  object RIGHT_CLICK extends TopLevel[RIGHT_CLICK with Double]
  
  @js.native
  sealed trait RIGHT_DOWN extends ScreenSpaceEventType
  /* 5 */ @js.native
  object RIGHT_DOWN extends TopLevel[RIGHT_DOWN with Double]
  
  @js.native
  sealed trait RIGHT_UP extends ScreenSpaceEventType
  /* 6 */ @js.native
  object RIGHT_UP extends TopLevel[RIGHT_UP with Double]
  
  @js.native
  sealed trait WHEEL extends ScreenSpaceEventType
  /* 16 */ @js.native
  object WHEEL extends TopLevel[WHEEL with Double]
}
