package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMLTaskRunRequest extends js.Object {
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
}

