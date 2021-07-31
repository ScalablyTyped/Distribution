package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JobCompletionActionCondition extends StObject
@JSImport("azdata", "JobCompletionActionCondition")
@js.native
object JobCompletionActionCondition extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JobCompletionActionCondition & Double] = js.native
  
  @js.native
  sealed trait Always
    extends StObject
       with JobCompletionActionCondition
  /* 3 */ val Always: typings.azdata.mod.JobCompletionActionCondition.Always & Double = js.native
  
  @js.native
  sealed trait Never
    extends StObject
       with JobCompletionActionCondition
  /* 0 */ val Never: typings.azdata.mod.JobCompletionActionCondition.Never & Double = js.native
  
  @js.native
  sealed trait OnFailure
    extends StObject
       with JobCompletionActionCondition
  /* 2 */ val OnFailure: typings.azdata.mod.JobCompletionActionCondition.OnFailure & Double = js.native
  
  @js.native
  sealed trait OnSuccess
    extends StObject
       with JobCompletionActionCondition
  /* 1 */ val OnSuccess: typings.azdata.mod.JobCompletionActionCondition.OnSuccess & Double = js.native
}
