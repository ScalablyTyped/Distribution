package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Visibility extends js.Object

@JSImport("cesium/Cesium", "Visibility")
@js.native
object Visibility extends js.Object {
  @js.native
  sealed trait FULL
    extends cesiumLib.cesiumMod.CesiumNs.Visibility
  
  @js.native
  sealed trait NONE
    extends cesiumLib.cesiumMod.CesiumNs.Visibility
  
  @js.native
  sealed trait PARTIAL
    extends cesiumLib.cesiumMod.CesiumNs.Visibility
  
}

