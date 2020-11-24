package typings.azdata.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JobCompletionActionCondition extends js.Object
@JSImport("azdata", "JobCompletionActionCondition")
@js.native
object JobCompletionActionCondition extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JobCompletionActionCondition with Double] = js.native
  
  @js.native
  sealed trait Always extends JobCompletionActionCondition
  /* 3 */ @js.native
  object Always extends TopLevel[Always with Double]
  
  @js.native
  sealed trait Never extends JobCompletionActionCondition
  /* 0 */ @js.native
  object Never extends TopLevel[Never with Double]
  
  @js.native
  sealed trait OnFailure extends JobCompletionActionCondition
  /* 2 */ @js.native
  object OnFailure extends TopLevel[OnFailure with Double]
  
  @js.native
  sealed trait OnSuccess extends JobCompletionActionCondition
  /* 1 */ @js.native
  object OnSuccess extends TopLevel[OnSuccess with Double]
}
