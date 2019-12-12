package typings.cesium.cesiumMod

import org.scalablytyped.runtime.TopLevel
import typings.cesium.cesiumMod.ClockRange.CLAMPED
import typings.cesium.cesiumMod.ClockRange.LOOP_STOP
import typings.cesium.cesiumMod.ClockRange.UNBOUNDED
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClockRange with Double] = js.native
  /* 1 */ @js.native
  object CLAMPED extends TopLevel[CLAMPED with Double]
  
  /* 2 */ @js.native
  object LOOP_STOP extends TopLevel[LOOP_STOP with Double]
  
  /* 0 */ @js.native
  object UNBOUNDED extends TopLevel[UNBOUNDED with Double]
  
}

