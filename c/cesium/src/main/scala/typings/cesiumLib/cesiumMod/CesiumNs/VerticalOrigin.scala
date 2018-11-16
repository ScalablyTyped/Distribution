package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalOrigin extends js.Object

@JSImport("cesium/Cesium", "VerticalOrigin")
@js.native
object VerticalOrigin extends js.Object {
  @js.native
  sealed trait BOTTOM
    extends cesiumLib.cesiumMod.CesiumNs.VerticalOrigin
  
  @js.native
  sealed trait CENTER
    extends cesiumLib.cesiumMod.CesiumNs.VerticalOrigin
  
  @js.native
  sealed trait TOP
    extends cesiumLib.cesiumMod.CesiumNs.VerticalOrigin
  
}

