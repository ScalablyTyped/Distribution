package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraEventType extends js.Object

@JSImport("cesium", "CameraEventType")
@js.native
object CameraEventType extends js.Object {
  @js.native
  sealed trait LEFT_DRAG
    extends cesiumLib.cesiumMod.CameraEventType
  
  @js.native
  sealed trait MIDDLE_DRAG
    extends cesiumLib.cesiumMod.CameraEventType
  
  @js.native
  sealed trait PINCH
    extends cesiumLib.cesiumMod.CameraEventType
  
  @js.native
  sealed trait RIGHT_DRAG
    extends cesiumLib.cesiumMod.CameraEventType
  
  @js.native
  sealed trait WHEEL
    extends cesiumLib.cesiumMod.CameraEventType
  
  /* 0 */ val LEFT_DRAG: LEFT_DRAG with scala.Double = js.native
  /* 2 */ val MIDDLE_DRAG: MIDDLE_DRAG with scala.Double = js.native
  /* 4 */ val PINCH: PINCH with scala.Double = js.native
  /* 1 */ val RIGHT_DRAG: RIGHT_DRAG with scala.Double = js.native
  /* 3 */ val WHEEL: WHEEL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.CameraEventType with scala.Double] = js.native
}

