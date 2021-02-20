package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClockRange extends StObject
@JSImport("cesium", "ClockRange")
@js.native
object ClockRange extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClockRange with Double] = js.native
  
  @js.native
  sealed trait CLAMPED extends ClockRange
  /* 1 */ val CLAMPED: typings.cesium.mod.ClockRange.CLAMPED with Double = js.native
  
  @js.native
  sealed trait LOOP_STOP extends ClockRange
  /* 2 */ val LOOP_STOP: typings.cesium.mod.ClockRange.LOOP_STOP with Double = js.native
  
  @js.native
  sealed trait UNBOUNDED extends ClockRange
  /* 0 */ val UNBOUNDED: typings.cesium.mod.ClockRange.UNBOUNDED with Double = js.native
}
