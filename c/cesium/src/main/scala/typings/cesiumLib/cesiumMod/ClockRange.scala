package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClockRange extends js.Object

@JSImport("cesium", "ClockRange")
@js.native
object ClockRange extends js.Object {
  @js.native
  sealed trait CLAMPED
    extends cesiumLib.cesiumMod.ClockRange
  
  @js.native
  sealed trait LOOP_STOP
    extends cesiumLib.cesiumMod.ClockRange
  
  @js.native
  sealed trait UNBOUNDED
    extends cesiumLib.cesiumMod.ClockRange
  
  /* 1 */ val CLAMPED: CLAMPED with scala.Double = js.native
  /* 2 */ val LOOP_STOP: LOOP_STOP with scala.Double = js.native
  /* 0 */ val UNBOUNDED: UNBOUNDED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[cesiumLib.cesiumMod.ClockRange with scala.Double] = js.native
}

