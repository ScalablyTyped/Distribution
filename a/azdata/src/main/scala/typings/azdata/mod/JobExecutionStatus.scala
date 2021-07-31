package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JobExecutionStatus extends StObject
@JSImport("azdata", "JobExecutionStatus")
@js.native
object JobExecutionStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JobExecutionStatus & Double] = js.native
  
  @js.native
  sealed trait BetweenRetries
    extends StObject
       with JobExecutionStatus
  /* 3 */ val BetweenRetries: typings.azdata.mod.JobExecutionStatus.BetweenRetries & Double = js.native
  
  @js.native
  sealed trait Executing
    extends StObject
       with JobExecutionStatus
  /* 1 */ val Executing: typings.azdata.mod.JobExecutionStatus.Executing & Double = js.native
  
  @js.native
  sealed trait Idle
    extends StObject
       with JobExecutionStatus
  /* 4 */ val Idle: typings.azdata.mod.JobExecutionStatus.Idle & Double = js.native
  
  @js.native
  sealed trait PerformingCompletionAction
    extends StObject
       with JobExecutionStatus
  /* 7 */ val PerformingCompletionAction: typings.azdata.mod.JobExecutionStatus.PerformingCompletionAction & Double = js.native
  
  @js.native
  sealed trait Suspended
    extends StObject
       with JobExecutionStatus
  /* 5 */ val Suspended: typings.azdata.mod.JobExecutionStatus.Suspended & Double = js.native
  
  @js.native
  sealed trait WaitingForStepToFinish
    extends StObject
       with JobExecutionStatus
  /* 6 */ val WaitingForStepToFinish: typings.azdata.mod.JobExecutionStatus.WaitingForStepToFinish & Double = js.native
  
  @js.native
  sealed trait WaitingForWorkerThread
    extends StObject
       with JobExecutionStatus
  /* 2 */ val WaitingForWorkerThread: typings.azdata.mod.JobExecutionStatus.WaitingForWorkerThread & Double = js.native
}
