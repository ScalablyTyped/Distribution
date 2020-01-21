package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluateExpressionInput extends js.Object {
  /**
    * The expression to evaluate.
    */
  var expression: longString = js.native
  /**
    * The ID of the object.
    */
  var objectId: id = js.native
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id = js.native
}

object EvaluateExpressionInput {
  @scala.inline
  def apply(expression: longString, objectId: id, pipelineId: id): EvaluateExpressionInput = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], pipelineId = pipelineId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EvaluateExpressionInput]
  }
}

