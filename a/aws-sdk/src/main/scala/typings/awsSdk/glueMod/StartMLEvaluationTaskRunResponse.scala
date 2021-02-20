package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartMLEvaluationTaskRunResponse extends StObject {
  
  /**
    * The unique identifier associated with this run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.native
}
object StartMLEvaluationTaskRunResponse {
  
  @scala.inline
  def apply(): StartMLEvaluationTaskRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartMLEvaluationTaskRunResponse]
  }
  
  @scala.inline
  implicit class StartMLEvaluationTaskRunResponseMutableBuilder[Self <: StartMLEvaluationTaskRunResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskRunId(value: HashString): Self = StObject.set(x, "TaskRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskRunIdUndefined: Self = StObject.set(x, "TaskRunId", js.undefined)
  }
}
