package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalOrigin extends js.Object

@JSImport("cesium/Cesium", "HorizontalOrigin")
@js.native
object HorizontalOrigin extends js.Object {
  @js.native
  sealed trait CENTER
    extends cesiumLib.cesiumMod.CesiumNs.HorizontalOrigin
  
  @js.native
  sealed trait LEFT
    extends cesiumLib.cesiumMod.CesiumNs.HorizontalOrigin
  
  @js.native
  sealed trait RIGHT
    extends cesiumLib.cesiumMod.CesiumNs.HorizontalOrigin
  
}

