package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReferenceFrame extends js.Object

@JSImport("cesium/Cesium", "ReferenceFrame")
@js.native
object ReferenceFrame extends js.Object {
  @js.native
  sealed trait FIXED
    extends cesiumLib.cesiumMod.CesiumNs.ReferenceFrame
  
  @js.native
  sealed trait INERTIAL
    extends cesiumLib.cesiumMod.CesiumNs.ReferenceFrame
  
}

