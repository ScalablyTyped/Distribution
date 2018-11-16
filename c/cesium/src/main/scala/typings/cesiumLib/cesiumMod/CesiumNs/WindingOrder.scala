package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WindingOrder extends js.Object

@JSImport("cesium/Cesium", "WindingOrder")
@js.native
object WindingOrder extends js.Object {
  @js.native
  sealed trait CLOCKWISE
    extends cesiumLib.cesiumMod.CesiumNs.WindingOrder
  
  @js.native
  sealed trait COUNTER_CLOCKWISE
    extends cesiumLib.cesiumMod.CesiumNs.WindingOrder
  
}

