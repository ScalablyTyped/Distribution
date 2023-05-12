package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClockRange extends StObject
@JSImport("@cesium/engine", "ClockRange")
@js.native
object ClockRange extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClockRange & Double] = js.native
  
  /**
    * When {@link Clock#startTime} or {@link Clock#stopTime} is reached,
    * {@link Clock#tick} will not advance {@link Clock#currentTime} any further.
    */
  @js.native
  sealed trait CLAMPED
    extends StObject
       with ClockRange
  /* 1 */ val CLAMPED: typings.cesiumEngine.mod.ClockRange.CLAMPED & Double = js.native
  
  /**
    * When {@link Clock#stopTime} is reached, {@link Clock#tick} will advance
    * {@link Clock#currentTime} to the opposite end of the interval.  When
    * time is moving backwards, {@link Clock#tick} will not advance past
    * {@link Clock#startTime}
    */
  @js.native
  sealed trait LOOP_STOP
    extends StObject
       with ClockRange
  /* 2 */ val LOOP_STOP: typings.cesiumEngine.mod.ClockRange.LOOP_STOP & Double = js.native
  
  /**
    * {@link Clock#tick} will always advances the clock in its current direction.
    */
  @js.native
  sealed trait UNBOUNDED
    extends StObject
       with ClockRange
  /* 0 */ val UNBOUNDED: typings.cesiumEngine.mod.ClockRange.UNBOUNDED & Double = js.native
}
