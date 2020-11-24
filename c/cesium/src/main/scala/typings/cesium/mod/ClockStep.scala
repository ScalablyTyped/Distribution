package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClockStep extends js.Object
@JSImport("cesium", "ClockStep")
@js.native
object ClockStep extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClockStep with Double] = js.native
  
  @js.native
  sealed trait SYSTEM_CLOCK extends ClockStep
  /* 2 */ @js.native
  object SYSTEM_CLOCK extends TopLevel[SYSTEM_CLOCK with Double]
  
  @js.native
  sealed trait SYSTEM_CLOCK_MULTIPLIER extends ClockStep
  /* 1 */ @js.native
  object SYSTEM_CLOCK_MULTIPLIER extends TopLevel[SYSTEM_CLOCK_MULTIPLIER with Double]
  
  @js.native
  sealed trait TICK_DEPENDENT extends ClockStep
  /* 0 */ @js.native
  object TICK_DEPENDENT extends TopLevel[TICK_DEPENDENT with Double]
}
