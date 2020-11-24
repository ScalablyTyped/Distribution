package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JobExecutionStatus extends js.Object
@JSImport("azdata", "JobExecutionStatus")
@js.native
object JobExecutionStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JobExecutionStatus with Double] = js.native
  
  @js.native
  sealed trait BetweenRetries extends JobExecutionStatus
  /* 3 */ @js.native
  object BetweenRetries extends TopLevel[BetweenRetries with Double]
  
  @js.native
  sealed trait Executing extends JobExecutionStatus
  /* 1 */ @js.native
  object Executing extends TopLevel[Executing with Double]
  
  @js.native
  sealed trait Idle extends JobExecutionStatus
  /* 4 */ @js.native
  object Idle extends TopLevel[Idle with Double]
  
  @js.native
  sealed trait PerformingCompletionAction extends JobExecutionStatus
  /* 7 */ @js.native
  object PerformingCompletionAction extends TopLevel[PerformingCompletionAction with Double]
  
  @js.native
  sealed trait Suspended extends JobExecutionStatus
  /* 5 */ @js.native
  object Suspended extends TopLevel[Suspended with Double]
  
  @js.native
  sealed trait WaitingForStepToFinish extends JobExecutionStatus
  /* 6 */ @js.native
  object WaitingForStepToFinish extends TopLevel[WaitingForStepToFinish with Double]
  
  @js.native
  sealed trait WaitingForWorkerThread extends JobExecutionStatus
  /* 2 */ @js.native
  object WaitingForWorkerThread extends TopLevel[WaitingForWorkerThread with Double]
}
