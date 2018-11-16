package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClockRange extends js.Object

@JSImport("cesium/Cesium", "ClockRange")
@js.native
object ClockRange extends js.Object {
  @js.native
  sealed trait CLAMPED
    extends cesiumLib.cesiumMod.CesiumNs.ClockRange
  
  @js.native
  sealed trait LOOP_STOP
    extends cesiumLib.cesiumMod.CesiumNs.ClockRange
  
  @js.native
  sealed trait UNBOUNDED
    extends cesiumLib.cesiumMod.CesiumNs.ClockRange
  
}

