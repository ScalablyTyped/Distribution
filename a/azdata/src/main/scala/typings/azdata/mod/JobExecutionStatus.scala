package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JobExecutionStatus extends StObject
@JSImport("azdata", "JobExecutionStatus")
@js.native
object JobExecutionStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JobExecutionStatus with Double] = js.native
  
  @js.native
  sealed trait BetweenRetries extends JobExecutionStatus
  /* 3 */ val BetweenRetries: typings.azdata.mod.JobExecutionStatus.BetweenRetries with Double = js.native
  
  @js.native
  sealed trait Executing extends JobExecutionStatus
  /* 1 */ val Executing: typings.azdata.mod.JobExecutionStatus.Executing with Double = js.native
  
  @js.native
  sealed trait Idle extends JobExecutionStatus
  /* 4 */ val Idle: typings.azdata.mod.JobExecutionStatus.Idle with Double = js.native
  
  @js.native
  sealed trait PerformingCompletionAction extends JobExecutionStatus
  /* 7 */ val PerformingCompletionAction: typings.azdata.mod.JobExecutionStatus.PerformingCompletionAction with Double = js.native
  
  @js.native
  sealed trait Suspended extends JobExecutionStatus
  /* 5 */ val Suspended: typings.azdata.mod.JobExecutionStatus.Suspended with Double = js.native
  
  @js.native
  sealed trait WaitingForStepToFinish extends JobExecutionStatus
  /* 6 */ val WaitingForStepToFinish: typings.azdata.mod.JobExecutionStatus.WaitingForStepToFinish with Double = js.native
  
  @js.native
  sealed trait WaitingForWorkerThread extends JobExecutionStatus
  /* 2 */ val WaitingForWorkerThread: typings.azdata.mod.JobExecutionStatus.WaitingForWorkerThread with Double = js.native
}
