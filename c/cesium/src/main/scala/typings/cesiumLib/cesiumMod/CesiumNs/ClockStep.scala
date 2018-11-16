package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClockStep extends js.Object

@JSImport("cesium/Cesium", "ClockStep")
@js.native
object ClockStep extends js.Object {
  @js.native
  sealed trait SYSTEM_CLOCK
    extends cesiumLib.cesiumMod.CesiumNs.ClockStep
  
  @js.native
  sealed trait SYSTEM_CLOCK_MULTIPLIER
    extends cesiumLib.cesiumMod.CesiumNs.ClockStep
  
  @js.native
  sealed trait TICK_DEPENDENT
    extends cesiumLib.cesiumMod.CesiumNs.ClockStep
  
}

