package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClockStep extends StObject
@JSImport("@cesium/engine", "ClockStep")
@js.native
object ClockStep extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClockStep & Double] = js.native
  
  /**
    * {@link Clock#tick} sets the clock to the current system time;
    * ignoring all other settings.
    */
  @js.native
  sealed trait SYSTEM_CLOCK
    extends StObject
       with ClockStep
  /* 2 */ val SYSTEM_CLOCK: typings.cesiumEngine.mod.ClockStep.SYSTEM_CLOCK & Double = js.native
  
  /**
    * {@link Clock#tick} advances the current time by the amount of system
    * time elapsed since the previous call multiplied by {@link Clock#multiplier}.
    */
  @js.native
  sealed trait SYSTEM_CLOCK_MULTIPLIER
    extends StObject
       with ClockStep
  /* 1 */ val SYSTEM_CLOCK_MULTIPLIER: typings.cesiumEngine.mod.ClockStep.SYSTEM_CLOCK_MULTIPLIER & Double = js.native
  
  /**
    * {@link Clock#tick} advances the current time by a fixed step,
    * which is the number of seconds specified by {@link Clock#multiplier}.
    */
  @js.native
  sealed trait TICK_DEPENDENT
    extends StObject
       with ClockStep
  /* 0 */ val TICK_DEPENDENT: typings.cesiumEngine.mod.ClockStep.TICK_DEPENDENT & Double = js.native
}
