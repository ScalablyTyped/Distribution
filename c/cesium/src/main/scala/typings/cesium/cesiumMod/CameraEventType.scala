package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraEventType extends js.Object

@JSImport("cesium", "CameraEventType")
@js.native
object CameraEventType extends js.Object {
  @js.native
  sealed trait LEFT_DRAG extends CameraEventType
  
  @js.native
  sealed trait MIDDLE_DRAG extends CameraEventType
  
  @js.native
  sealed trait PINCH extends CameraEventType
  
  @js.native
  sealed trait RIGHT_DRAG extends CameraEventType
  
  @js.native
  sealed trait WHEEL extends CameraEventType
  
  /* 0 */ val LEFT_DRAG: typings.cesium.cesiumMod.CameraEventType.LEFT_DRAG with Double = js.native
  /* 2 */ val MIDDLE_DRAG: typings.cesium.cesiumMod.CameraEventType.MIDDLE_DRAG with Double = js.native
  /* 4 */ val PINCH: typings.cesium.cesiumMod.CameraEventType.PINCH with Double = js.native
  /* 1 */ val RIGHT_DRAG: typings.cesium.cesiumMod.CameraEventType.RIGHT_DRAG with Double = js.native
  /* 3 */ val WHEEL: typings.cesium.cesiumMod.CameraEventType.WHEEL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraEventType with Double] = js.native
}

