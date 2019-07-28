package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClockRange extends js.Object

@JSImport("cesium", "ClockRange")
@js.native
object ClockRange extends js.Object {
  @js.native
  sealed trait CLAMPED extends ClockRange
  
  @js.native
  sealed trait LOOP_STOP extends ClockRange
  
  @js.native
  sealed trait UNBOUNDED extends ClockRange
  
  /* 1 */ val CLAMPED: typings.cesium.cesiumMod.ClockRange.CLAMPED with Double = js.native
  /* 2 */ val LOOP_STOP: typings.cesium.cesiumMod.ClockRange.LOOP_STOP with Double = js.native
  /* 0 */ val UNBOUNDED: typings.cesium.cesiumMod.ClockRange.UNBOUNDED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClockRange with Double] = js.native
}

