package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CornerType extends js.Object

@JSImport("cesium/Cesium", "CornerType")
@js.native
object CornerType extends js.Object {
  @js.native
  sealed trait BEVELED
    extends cesiumLib.cesiumMod.CesiumNs.CornerType
  
  @js.native
  sealed trait MITERED
    extends cesiumLib.cesiumMod.CesiumNs.CornerType
  
  @js.native
  sealed trait ROUNDED
    extends cesiumLib.cesiumMod.CesiumNs.CornerType
  
}

