package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClockStep extends StObject
@JSImport("cesium", "ClockStep")
@js.native
object ClockStep extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClockStep & Double] = js.native
  
  @js.native
  sealed trait SYSTEM_CLOCK
    extends StObject
       with ClockStep
  /* 2 */ val SYSTEM_CLOCK: typings.cesium.mod.ClockStep.SYSTEM_CLOCK & Double = js.native
  
  @js.native
  sealed trait SYSTEM_CLOCK_MULTIPLIER
    extends StObject
       with ClockStep
  /* 1 */ val SYSTEM_CLOCK_MULTIPLIER: typings.cesium.mod.ClockStep.SYSTEM_CLOCK_MULTIPLIER & Double = js.native
  
  @js.native
  sealed trait TICK_DEPENDENT
    extends StObject
       with ClockStep
  /* 0 */ val TICK_DEPENDENT: typings.cesium.mod.ClockStep.TICK_DEPENDENT & Double = js.native
}
