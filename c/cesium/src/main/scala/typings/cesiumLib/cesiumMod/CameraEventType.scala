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
  
  val LEFT_DRAG: LEFT_DRAG with java.lang.String = js.native
  val MIDDLE_DRAG: MIDDLE_DRAG with java.lang.String = js.native
  val PINCH: PINCH with java.lang.String = js.native
  val RIGHT_DRAG: RIGHT_DRAG with java.lang.String = js.native
  val WHEEL: WHEEL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.CameraEventType with java.lang.String] = js.native
}

