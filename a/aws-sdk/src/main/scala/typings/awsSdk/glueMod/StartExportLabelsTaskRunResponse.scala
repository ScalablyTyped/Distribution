package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartExportLabelsTaskRunResponse extends StObject {
  
  /**
    * The unique identifier for the task run.
    */
  var TaskRunId: js.UndefOr[HashString] = js.native
}
object StartExportLabelsTaskRunResponse {
  
  @scala.inline
  def apply(): StartExportLabelsTaskRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartExportLabelsTaskRunResponse]
  }
  
  @scala.inline
  implicit class StartExportLabelsTaskRunResponseMutableBuilder[Self <: StartExportLabelsTaskRunResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskRunId(value: HashString): Self = StObject.set(x, "TaskRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskRunIdUndefined: Self = StObject.set(x, "TaskRunId", js.undefined)
  }
}
