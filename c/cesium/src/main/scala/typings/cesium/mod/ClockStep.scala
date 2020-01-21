package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClockStep extends js.Object

@JSImport("cesium", "ClockStep")
@js.native
object ClockStep extends js.Object {
  @js.native
  sealed trait SYSTEM_CLOCK extends ClockStep
  
  @js.native
  sealed trait SYSTEM_CLOCK_MULTIPLIER extends ClockStep
  
  @js.native
  sealed trait TICK_DEPENDENT extends ClockStep
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClockStep with Double] = js.native
  /* 2 */ @js.native
  object SYSTEM_CLOCK extends TopLevel[SYSTEM_CLOCK with Double]
  
  /* 1 */ @js.native
  object SYSTEM_CLOCK_MULTIPLIER extends TopLevel[SYSTEM_CLOCK_MULTIPLIER with Double]
  
  /* 0 */ @js.native
  object TICK_DEPENDENT extends TopLevel[TICK_DEPENDENT with Double]
  
}

