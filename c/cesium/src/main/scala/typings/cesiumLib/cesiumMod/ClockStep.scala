package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClockStep extends js.Object

@JSImport("cesium", "ClockStep")
@js.native
object ClockStep extends js.Object {
  @js.native
  sealed trait SYSTEM_CLOCK
    extends cesiumLib.cesiumMod.ClockStep
  
  @js.native
  sealed trait SYSTEM_CLOCK_MULTIPLIER
    extends cesiumLib.cesiumMod.ClockStep
  
  @js.native
  sealed trait TICK_DEPENDENT
    extends cesiumLib.cesiumMod.ClockStep
  
  val SYSTEM_CLOCK: SYSTEM_CLOCK with java.lang.String = js.native
  val SYSTEM_CLOCK_MULTIPLIER: SYSTEM_CLOCK_MULTIPLIER with java.lang.String = js.native
  val TICK_DEPENDENT: TICK_DEPENDENT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.ClockStep with java.lang.String] = js.native
}

