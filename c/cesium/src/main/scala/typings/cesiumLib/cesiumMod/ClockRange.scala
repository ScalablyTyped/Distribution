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
  
  val CLAMPED: CLAMPED with java.lang.String = js.native
  val LOOP_STOP: LOOP_STOP with java.lang.String = js.native
  val UNBOUNDED: UNBOUNDED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[cesiumLib.cesiumMod.ClockRange with java.lang.String] = js.native
}

