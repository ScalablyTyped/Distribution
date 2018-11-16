package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraEventType extends js.Object

@JSImport("cesium/Cesium", "CameraEventType")
@js.native
object CameraEventType extends js.Object {
  @js.native
  sealed trait LEFT_DRAG
    extends cesiumLib.cesiumMod.CesiumNs.CameraEventType
  
  @js.native
  sealed trait MIDDLE_DRAG
    extends cesiumLib.cesiumMod.CesiumNs.CameraEventType
  
  @js.native
  sealed trait PINCH
    extends cesiumLib.cesiumMod.CesiumNs.CameraEventType
  
  @js.native
  sealed trait RIGHT_DRAG
    extends cesiumLib.cesiumMod.CesiumNs.CameraEventType
  
  @js.native
  sealed trait WHEEL
    extends cesiumLib.cesiumMod.CesiumNs.CameraEventType
  
}

