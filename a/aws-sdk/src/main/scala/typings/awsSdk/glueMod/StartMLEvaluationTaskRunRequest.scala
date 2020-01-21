package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMLEvaluationTaskRunRequest extends js.Object {
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString = js.native
}

object StartMLEvaluationTaskRunRequest {
  @scala.inline
  def apply(TransformId: HashString): StartMLEvaluationTaskRunRequest = {
    val __obj = js.Dynamic.literal(TransformId = TransformId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartMLEvaluationTaskRunRequest]
  }
}

