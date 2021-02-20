package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartMLLabelingSetGenerationTaskRunResponse extends StObject {
  
  /**
    * The unique run identifier that is associated with this task run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.native
}
object StartMLLabelingSetGenerationTaskRunResponse {
  
  @scala.inline
  def apply(): StartMLLabelingSetGenerationTaskRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartMLLabelingSetGenerationTaskRunResponse]
  }
  
  @scala.inline
  implicit class StartMLLabelingSetGenerationTaskRunResponseMutableBuilder[Self <: StartMLLabelingSetGenerationTaskRunResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskRunId(value: HashString): Self = StObject.set(x, "TaskRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskRunIdUndefined: Self = StObject.set(x, "TaskRunId", js.undefined)
  }
}
