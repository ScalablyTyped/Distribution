package typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PerformanceEventStatus extends StObject
@JSImport("@azure/msal-common/dist/telemetry/performance/PerformanceEvent", "PerformanceEventStatus")
@js.native
object PerformanceEventStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PerformanceEventStatus & Double] = js.native
  
  @js.native
  sealed trait Completed
    extends StObject
       with PerformanceEventStatus
  /* 2 */ val Completed: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEventStatus.Completed & Double = js.native
  
  @js.native
  sealed trait InProgress
    extends StObject
       with PerformanceEventStatus
  /* 1 */ val InProgress: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEventStatus.InProgress & Double = js.native
  
  @js.native
  sealed trait NotStarted
    extends StObject
       with PerformanceEventStatus
  /* 0 */ val NotStarted: typings.azureMsalCommon.distTelemetryPerformancePerformanceEventMod.PerformanceEventStatus.NotStarted & Double = js.native
}
