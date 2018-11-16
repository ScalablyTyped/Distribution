package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtrapolationType extends js.Object

@JSImport("cesium/Cesium", "ExtrapolationType")
@js.native
object ExtrapolationType extends js.Object {
  @js.native
  sealed trait EXTRAPOLATE
    extends cesiumLib.cesiumMod.CesiumNs.ExtrapolationType
  
  @js.native
  sealed trait HOLD
    extends cesiumLib.cesiumMod.CesiumNs.ExtrapolationType
  
  @js.native
  sealed trait NONE
    extends cesiumLib.cesiumMod.CesiumNs.ExtrapolationType
  
}

