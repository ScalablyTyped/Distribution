package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClockRange extends StObject
@JSImport("cesium", "ClockRange")
@js.native
object ClockRange extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClockRange & Double] = js.native
  
  @js.native
  sealed trait CLAMPED
    extends StObject
       with ClockRange
  /* 1 */ val CLAMPED: typings.cesium.mod.ClockRange.CLAMPED & Double = js.native
  
  @js.native
  sealed trait LOOP_STOP
    extends StObject
       with ClockRange
  /* 2 */ val LOOP_STOP: typings.cesium.mod.ClockRange.LOOP_STOP & Double = js.native
  
  @js.native
  sealed trait UNBOUNDED
    extends StObject
       with ClockRange
  /* 0 */ val UNBOUNDED: typings.cesium.mod.ClockRange.UNBOUNDED & Double = js.native
}
