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
  @scala.inline
  implicit class EvaluateExpressionInputOps[Self <: EvaluateExpressionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpression(value: longString): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectId(value: id): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPipelineId(value: id): Self = this.set("pipelineId", value.asInstanceOf[js.Any])
  }
  
}

