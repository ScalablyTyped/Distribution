package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StepCompletionAction extends StObject
@JSImport("azdata", "StepCompletionAction")
@js.native
object StepCompletionAction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StepCompletionAction with Double] = js.native
  
  @js.native
  sealed trait GoToNextStep extends StepCompletionAction
  /* 3 */ val GoToNextStep: typings.azdata.mod.StepCompletionAction.GoToNextStep with Double = js.native
  
  @js.native
  sealed trait GoToStep extends StepCompletionAction
  /* 4 */ val GoToStep: typings.azdata.mod.StepCompletionAction.GoToStep with Double = js.native
  
  @js.native
  sealed trait QuitWithFailure extends StepCompletionAction
  /* 2 */ val QuitWithFailure: typings.azdata.mod.StepCompletionAction.QuitWithFailure with Double = js.native
  
  @js.native
  sealed trait QuitWithSuccess extends StepCompletionAction
  /* 1 */ val QuitWithSuccess: typings.azdata.mod.StepCompletionAction.QuitWithSuccess with Double = js.native
}
