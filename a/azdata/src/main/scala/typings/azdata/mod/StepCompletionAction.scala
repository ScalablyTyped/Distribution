package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StepCompletionAction extends js.Object

@JSImport("azdata", "StepCompletionAction")
@js.native
object StepCompletionAction extends js.Object {
  @js.native
  sealed trait GoToNextStep extends StepCompletionAction
  
  @js.native
  sealed trait GoToStep extends StepCompletionAction
  
  @js.native
  sealed trait QuitWithFailure extends StepCompletionAction
  
  @js.native
  sealed trait QuitWithSuccess extends StepCompletionAction
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StepCompletionAction with Double] = js.native
  /* 3 */ @js.native
  object GoToNextStep extends TopLevel[GoToNextStep with Double]
  
  /* 4 */ @js.native
  object GoToStep extends TopLevel[GoToStep with Double]
  
  /* 2 */ @js.native
  object QuitWithFailure extends TopLevel[QuitWithFailure with Double]
  
  /* 1 */ @js.native
  object QuitWithSuccess extends TopLevel[QuitWithSuccess with Double]
  
}

