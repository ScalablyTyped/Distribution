package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMLTaskRunRequest extends StObject {
  
  /**
    * The unique identifier of the task run.
    */
  var TaskRunId: HashString = js.native
  
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString = js.native
}
object GetMLTaskRunRequest {
  
  @scala.inline
  def apply(TaskRunId: HashString, TransformId: HashString): GetMLTaskRunRequest = {
    val __obj = js.Dynamic.literal(TaskRunId = TaskRunId.asInstanceOf[js.Any], TransformId = TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMLTaskRunRequest]
  }
  
  @scala.inline
  implicit class GetMLTaskRunRequestMutableBuilder[Self <: GetMLTaskRunRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskRunId(value: HashString): Self = StObject.set(x, "TaskRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformId(value: HashString): Self = StObject.set(x, "TransformId", value.asInstanceOf[js.Any])
  }
}
