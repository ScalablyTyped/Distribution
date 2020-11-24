package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClockRange extends js.Object
@JSImport("cesium", "ClockRange")
@js.native
object ClockRange extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClockRange with Double] = js.native
  
  @js.native
  sealed trait CLAMPED extends ClockRange
  /* 1 */ @js.native
  object CLAMPED extends TopLevel[CLAMPED with Double]
  
  @js.native
  sealed trait LOOP_STOP extends ClockRange
  /* 2 */ @js.native
  object LOOP_STOP extends TopLevel[LOOP_STOP with Double]
  
  @js.native
  sealed trait UNBOUNDED extends ClockRange
  /* 0 */ @js.native
  object UNBOUNDED extends TopLevel[UNBOUNDED with Double]
}
