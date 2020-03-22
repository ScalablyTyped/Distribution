package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JobExecutionStatus extends js.Object

@JSImport("azdata", "JobExecutionStatus")
@js.native
object JobExecutionStatus extends js.Object {
  @js.native
  sealed trait BetweenRetries extends JobExecutionStatus
  
  @js.native
  sealed trait Executing extends JobExecutionStatus
  
  @js.native
  sealed trait Idle extends JobExecutionStatus
  
  @js.native
  sealed trait PerformingCompletionAction extends JobExecutionStatus
  
  @js.native
  sealed trait Suspended extends JobExecutionStatus
  
  @js.native
  sealed trait WaitingForStepToFinish extends JobExecutionStatus
  
  @js.native
  sealed trait WaitingForWorkerThread extends JobExecutionStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JobExecutionStatus with Double] = js.native
  /* 3 */ @js.native
  object BetweenRetries extends TopLevel[BetweenRetries with Double]
  
  /* 1 */ @js.native
  object Executing extends TopLevel[Executing with Double]
  
  /* 4 */ @js.native
  object Idle extends TopLevel[Idle with Double]
  
  /* 7 */ @js.native
  object PerformingCompletionAction extends TopLevel[PerformingCompletionAction with Double]
  
  /* 5 */ @js.native
  object Suspended extends TopLevel[Suspended with Double]
  
  /* 6 */ @js.native
  object WaitingForStepToFinish extends TopLevel[WaitingForStepToFinish with Double]
  
  /* 2 */ @js.native
  object WaitingForWorkerThread extends TopLevel[WaitingForWorkerThread with Double]
  
}

